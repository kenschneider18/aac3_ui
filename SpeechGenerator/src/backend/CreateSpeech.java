/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backend;

import java.util.ArrayList;
import com.sun.speech.freetts.FreeTTS;
import com.sun.speech.freetts.Voice;
import com.sun.speech.freetts.VoiceManager;
import com.sun.speech.freetts.audio.AudioPlayer;
import com.sun.speech.freetts.audio.SingleFileAudioPlayer;
import java.io.File;
import java.io.IOException;
import java.io.SequenceInputStream;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import javax.sound.sampled.AudioFileFormat;
import javax.sound.sampled.AudioFileFormat.Type;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.UnsupportedAudioFileException;

/**
 *
 * @author aaron
 */
public class CreateSpeech {
    
    public static void convertText(String text) throws IOException, UnsupportedAudioFileException, LineUnavailableException{
         text = text+ " <end>";
         ArrayList textList = new ArrayList();
         ArrayList emotionList = new ArrayList();
         String list[] = text.split(" ");        
         for (int i = 0; i < list.length-1; i++){
             if(list[i].equals("<a>") || list[i].equals("<f>") || list[i].equals("<d>") || list[i].equals("<s>") || list[i].equals("<j>")){
                 emotionList.add(list[i]);
                 String line = "";
                 for (i = i+1; !list[i].startsWith("</"); i++)
                     line += list[i] + " ";
                 textList.add(line);
             }
             else if(list[i].equals("")); 
             
             else{
                 emotionList.add("None");
                 String line = "";
                 for (i = i; !list[i].startsWith("<") && !list[i].equals("<end>"); i++)
                     line += list[i] + " ";
                 textList.add(line);
                 i--;
             }
         }
         
         ArrayList paths = new ArrayList();
         for (int i = 0; i < textList.size(); i++){
            convertSpeech(textList.get(i).toString(), emotionList.get(i).toString(), "VoicePt"+i);
            paths.add("VoicePt"+i+".wav");
         }
         
        combineWav(paths);
        playSound("combined.wav");
       
//        System.gc();
//        for(int i = 0; i < paths.size(); i++){ 
//            File file = new File(paths.get(i).toString());
//            Path path = FileSystems.getDefault().getPath(paths.get(i).toString());
//            Files.delete(path);
//        }
         
    }
   
    private static void convertSpeech(String text, String emotion, String name){
        
        FreeTTS freetts;
        AudioPlayer audioPlayer = null;
        System.setProperty("freetts.voices",
    "com.sun.speech.freetts.en.us.cmu_us_kal.KevinVoiceDirectory");
        String voiceName = "kevin16";

       
        System.out.println("Using voice: " + voiceName);

        /* The VoiceManager manages all the voices for FreeTTS.
         */
        VoiceManager voiceManager = VoiceManager.getInstance();
   

        Voice speechVoice = voiceManager.getVoice(voiceName);

        if (speechVoice == null) {
            System.err.println(
                "Cannot find a voice named "
                + voiceName + ".  Please specify a different voice.");
            System.exit(1);
        }

        //Allocates the resources for the voice.

        speechVoice.allocate();

        // Synthesize speech.

        //create a audioplayer to dump the output file
        audioPlayer = new SingleFileAudioPlayer(System.getProperty("user.dir")+"\\" + name,AudioFileFormat.Type.WAVE);
        //attach the audioplayer 
        speechVoice.setAudioPlayer(audioPlayer);
        speechVoice.speak(text);

        //Clean up and leave.
        speechVoice.deallocate();
        //Close the audioplayer otherwise file will not be saved
        audioPlayer.close();
    }
   
    private static void combineWav(ArrayList paths) throws IOException, UnsupportedAudioFileException, LineUnavailableException{
        
        AudioInputStream clip1 = null;
        for(int i = 0; i < paths.size(); i++)
        {
            String path = paths.get(i).toString();
            if(clip1 == null)
            {
                clip1 = AudioSystem.getAudioInputStream(new File(path));
                continue;
            }
            AudioInputStream clip2 = AudioSystem.getAudioInputStream(new File(path));
            
            AudioInputStream appendedFiles = new AudioInputStream(
                    new SequenceInputStream(clip1, clip2),     
                    clip1.getFormat(), 
                    clip1.getFrameLength() + clip2.getFrameLength());
            clip1 = appendedFiles;
            
            
        }
        AudioSystem.write(clip1, AudioFileFormat.Type.WAVE, new File("combined.wav"));
        
        
       
    }

    
    
    private static void playSound(String filename) throws UnsupportedAudioFileException, IOException, LineUnavailableException{
        final int BUFFER_SIZE = 128000;
        
        AudioFormat audioFormat;
        SourceDataLine sourceLine;
        String strFilename = filename;

            File soundFile = new File(strFilename);
     
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(soundFile);
        

         audioFormat = audioStream.getFormat();

        DataLine.Info info = new DataLine.Info(SourceDataLine.class, audioFormat);
        sourceLine = (SourceDataLine) AudioSystem.getLine(info);
        sourceLine.open(audioFormat);
     

        sourceLine.start();

        int nBytesRead = 0;
        byte[] abData = new byte[BUFFER_SIZE];
        while (nBytesRead != -1) {
            try {
                nBytesRead = audioStream.read(abData, 0, abData.length);
            } catch (IOException e) {
                e.printStackTrace();
            }
            if (nBytesRead >= 0) {
                @SuppressWarnings("unused")
                int nBytesWritten = sourceLine.write(abData, 0, nBytesRead);
            }
        }

        sourceLine.drain();
        sourceLine.close();
    }
}
