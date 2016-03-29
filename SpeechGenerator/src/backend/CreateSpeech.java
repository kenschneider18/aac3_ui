/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backend;

import java.util.ArrayList;
//import com.sun.speech.freetts.FreeTTS;
//import com.sun.speech.freetts.Voice;
//import com.sun.speech.freetts.VoiceManager;
//import com.sun.speech.freetts.audio.AudioPlayer;
//import com.sun.speech.freetts.audio.SingleFileAudioPlayer;
//import javax.sound.sampled.AudioFileFormat.Type;

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
         
         
         
    }
   
   
}
