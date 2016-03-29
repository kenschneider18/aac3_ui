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
import javax.sound.sampled.AudioFileFormat;
import javax.sound.sampled.AudioFileFormat.Type;

/**
 *
 * @author aaron
 */
public class CreateSpeech {
    
    public void convertText(String text){
         ArrayList textList = new ArrayList();
         ArrayList emotionList = new ArrayList();
         String list[] = text.split(" ");        
         for (int i = 0; i < list.length; i++){
             if(list[i].equals("<a>") || list[i].equals("<f>") || list[i].equals("<d>") || list[i].equals("<s>") || list[i].equals("<j>")){
                 emotionList.add(list[i]);
                 String line = "";
                 for (i = i+1; !list[i].startsWith("</"); i++)
                     line += list[i] + " ";
                 textList.add(line);
             }
             else{
                 emotionList.add("None");
                 String line = "";
                 for (i = i; !list[i].startsWith("<"); i++)
                     line += list[i] + " ";
                 textList.add(line);
                 i--;
             }
         }
         
         for (int i = 0; i < textList.size(); i++)
            convertSpeech(textList.get(i).toString(), emotionList.get(i).toString(), "VoicePt"+i);
         
         
    }
   
        static void convertSpeech(String text, String emotion, String name){
        
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
   
}
