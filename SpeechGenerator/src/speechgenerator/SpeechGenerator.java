/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package speechgenerator;

import java.awt.Color;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.text.BadLocationException;
import javax.swing.text.Style;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyleContext;
import javax.swing.text.StyledDocument;

import backend.CreateSpeech;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

/**
 *
 * @author kjs31894
 */
public class SpeechGenerator extends javax.swing.JFrame {
    
    public File inputFile;
    /**
     * Creates new form SpeechGenerator
     */
    public SpeechGenerator() {
        initComponents();
        initStyles();
        addToggleListeners();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sadnessButton = new javax.swing.JToggleButton();
        angerButton = new javax.swing.JToggleButton();
        fearButton = new javax.swing.JToggleButton();
        disgustButton = new javax.swing.JToggleButton();
        joyButton = new javax.swing.JToggleButton();
        textScrollPane = new javax.swing.JScrollPane();
        textPane = new javax.swing.JTextPane();
        divideButton = new javax.swing.JButton();
        outputButton = new javax.swing.JButton();
        speakButton = new javax.swing.JButton();
        chooseFileButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        sadnessButton.setText("Sadness");

        angerButton.setText("Anger");

        fearButton.setText("Fear");

        disgustButton.setText("Disgust");

        joyButton.setText("Joy");

        textScrollPane.setViewportView(textPane);

        divideButton.setText("Divide");
        divideButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                divideButtonActionPerformed(evt);
            }
        });

        outputButton.setText("Send to File...");
        outputButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                outputButtonActionPerformed(evt);
            }
        });

        speakButton.setText("Speak");
        speakButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                speakButtonActionPerformed(evt);
            }
        });

        chooseFileButton.setText("Choose File...");
        chooseFileButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chooseFileButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(chooseFileButton, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(outputButton, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(speakButton, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(textScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 776, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(joyButton, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                    .addComponent(sadnessButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(angerButton, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                    .addComponent(fearButton, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                    .addComponent(disgustButton, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                    .addComponent(divideButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(angerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sadnessButton, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(disgustButton, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(joyButton, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(divideButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(textScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 556, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(outputButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(speakButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(chooseFileButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void outputButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_outputButtonActionPerformed
        // TODO add your handling code here:
        try{
            //String text = textPane.getText();
            String[] outputStrings = textPane.getText().split("<div>");
            
            // Counter to modify out file names
            int i=1;
            for (String s : outputStrings) {
                File file = new File("text" + i + ".txt");
                file.createNewFile();
                FileWriter fw = new FileWriter(file.getAbsoluteFile());
                BufferedWriter bw = new BufferedWriter(fw);
                bw.write(s);
                bw.close();
                i++;
            }
        }
        catch(IOException e){
            e.printStackTrace();
        }  
    }//GEN-LAST:event_outputButtonActionPerformed

    private void divideButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_divideButtonActionPerformed
        try {
            document.insertString(document.getLength(), "<div>", invisible);
            document.insertString(document.getLength(), " ", black);
            document.insertString(document.getLength(), " ", regular);
        } catch (BadLocationException ex) {
            Logger.getLogger(SpeechGenerator.class.getName()).log(Level.SEVERE, null, ex);
        }
        textPane.requestFocus();
    }//GEN-LAST:event_divideButtonActionPerformed

    private void chooseFileButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chooseFileButtonActionPerformed
        JFileChooser fc = new JFileChooser();
        int returnVal = fc.showOpenDialog(SpeechGenerator.this); // Open file chooser
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            inputFile = fc.getSelectedFile(); // Set ipAddresses file to point to selected file
        }

        try {
            FileReader fr = new FileReader(inputFile);
            BufferedReader br = new BufferedReader(fr);
            textPane.read(br, "textPane");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(SpeechGenerator.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(SpeechGenerator.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_chooseFileButtonActionPerformed

    private void speakButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_speakButtonActionPerformed
        try {
            CreateSpeech.convertText(textPane.getText(), "VoiceOutput");
        } catch (IOException ex) {
            Logger.getLogger(SpeechGenerator.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedAudioFileException ex) {
            Logger.getLogger(SpeechGenerator.class.getName()).log(Level.SEVERE, null, ex);
        } catch (LineUnavailableException ex) {
            Logger.getLogger(SpeechGenerator.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_speakButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SpeechGenerator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SpeechGenerator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SpeechGenerator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SpeechGenerator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SpeechGenerator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton angerButton;
    private javax.swing.JButton chooseFileButton;
    private javax.swing.JToggleButton disgustButton;
    private javax.swing.JButton divideButton;
    private javax.swing.JToggleButton fearButton;
    private javax.swing.JToggleButton joyButton;
    private javax.swing.JButton outputButton;
    private javax.swing.JToggleButton sadnessButton;
    private javax.swing.JButton speakButton;
    private javax.swing.JTextPane textPane;
    private javax.swing.JScrollPane textScrollPane;
    // End of variables declaration//GEN-END:variables

    // Global variables for the styles so that
    // they must only be defined one, but may be used in multiple places
    private final Style regular = StyleContext.getDefaultStyleContext().getStyle(StyleContext.DEFAULT_STYLE);
    private StyledDocument document;
    private Style invisible;
    private Style angryHighlight;
    private Style disgustHighlight;
    private Style sadHighlight;
    private Style fearHighlight;
    private Style joyHighlight;
    private Style black;
    
    /**
     * This method takes the globally defined document style variables
     * and intializes the styles. The fucntion will be called by main
     * before any stylization code is called.
     */
    private void initStyles() {
        document = textPane.getStyledDocument();
        
        invisible = textPane.getStyledDocument().addStyle("invisible", regular);
        angryHighlight = document.addStyle("angryHighlight", regular);
        disgustHighlight = document.addStyle("disgustHighlight", regular);
        sadHighlight = document.addStyle("sadHighlight", regular);
        fearHighlight = document.addStyle("fearHighlight", regular);
        joyHighlight = document.addStyle("joyHighlight", regular);
        black = document.addStyle("black", regular);
        
        // create invisible style
        StyleConstants.setFontSize(invisible, 0);
        StyleConstants.setForeground(invisible, textPane.getBackground());

        // create highlight styles
        StyleConstants.setBackground(angryHighlight, Color.red);
        StyleConstants.setBackground(disgustHighlight, Color.green);
        StyleConstants.setBackground(sadHighlight, Color.cyan);
        StyleConstants.setBackground(fearHighlight, Color.magenta);
        StyleConstants.setBackground(joyHighlight, Color.pink);
        StyleConstants.setBackground(black, Color.black);
        }
    
    /**
     * This method adds listeners to all of the toggle switches and performs the
     * appropriate actions when they are selected or unselected
     */
    private void addToggleListeners() {        
        angerButton.addItemListener(
                new ItemListener() {
                    @Override
                    public void itemStateChanged(ItemEvent e) {
                        if (e.getStateChange() == ItemEvent.SELECTED) {
                            try {
                                disgustButton.setEnabled(false);
                                fearButton.setEnabled(false);
                                joyButton.setEnabled(false);
                                sadnessButton.setEnabled(false);
                                // Test tag invisibility
                                document.insertString(document.getLength(), " <a>", invisible);
                                document.insertString(document.getLength(), " ", angryHighlight);
                                textPane.requestFocus();
                            } catch (BadLocationException ex) {
                                Logger.getLogger(SpeechGenerator.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        } else {
                            try {
                                document.insertString(document.getLength(), " </a>", invisible);
                                document.insertString(document.getLength(), " ", regular);
                                disgustButton.setEnabled(true);
                                fearButton.setEnabled(true);
                                joyButton.setEnabled(true);
                                sadnessButton.setEnabled(true);
                                textPane.requestFocus();
                            } catch (BadLocationException ex) {
                                Logger.getLogger(SpeechGenerator.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        }
                    }
                });
        disgustButton.addItemListener(
                new ItemListener() {
                    @Override
                    public void itemStateChanged(ItemEvent e) {
                        if (e.getStateChange() == ItemEvent.SELECTED) {
                            try {
                                angerButton.setEnabled(false);
                                fearButton.setEnabled(false);
                                joyButton.setEnabled(false);
                                sadnessButton.setEnabled(false);
                                document.insertString(document.getLength(), " <d>", invisible);
                                document.insertString(document.getLength(), " ", disgustHighlight);
                                textPane.requestFocus();
                            } catch (BadLocationException ex) {
                                Logger.getLogger(SpeechGenerator.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        } else {
                            try {
                                document.insertString(document.getLength(), " </d>", invisible);
                                document.insertString(document.getLength(), " ", regular);
                                angerButton.setEnabled(true);
                                fearButton.setEnabled(true);
                                joyButton.setEnabled(true);
                                sadnessButton.setEnabled(true);
                                textPane.requestFocus();
                            } catch (BadLocationException ex) {
                                Logger.getLogger(SpeechGenerator.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        }
                    }
                });
        // Comment
        sadnessButton.addItemListener(
                new ItemListener() {
                    @Override
                    public void itemStateChanged(ItemEvent e) {
                        if (e.getStateChange() == ItemEvent.SELECTED) {
                            try {
                                disgustButton.setEnabled(false);
                                fearButton.setEnabled(false);
                                joyButton.setEnabled(false);
                                angerButton.setEnabled(false);
                                document.insertString(document.getLength(), " <s>", invisible);
                                document.insertString(document.getLength(), " ", sadHighlight);
                                textPane.requestFocus();
                            } catch (BadLocationException ex) {
                                Logger.getLogger(SpeechGenerator.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        } else {
                            try {
                                document.insertString(document.getLength(), " </s>", invisible);
                                document.insertString(document.getLength(), " ", regular);
                                disgustButton.setEnabled(true);
                                fearButton.setEnabled(true);
                                joyButton.setEnabled(true);
                                angerButton.setEnabled(true);
                                textPane.requestFocus();
                            } catch (BadLocationException ex) {
                                Logger.getLogger(SpeechGenerator.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        }
                    }
                });
        fearButton.addItemListener(
                new ItemListener() {
                    @Override
                    public void itemStateChanged(ItemEvent e) {
                        if (e.getStateChange() == ItemEvent.SELECTED) {
                            try {
                                disgustButton.setEnabled(false);
                                angerButton.setEnabled(false);
                                joyButton.setEnabled(false);
                                sadnessButton.setEnabled(false);
                                document.insertString(document.getLength(), " <f>", invisible);
                                document.insertString(document.getLength(), " ", fearHighlight);
                                textPane.requestFocus();
                            } catch (BadLocationException ex) {
                                Logger.getLogger(SpeechGenerator.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        } else {
                            try {
                                document.insertString(document.getLength(), " </f>", invisible);
                                document.insertString(document.getLength(), " ", regular);
                                disgustButton.setEnabled(true);
                                angerButton.setEnabled(true);
                                joyButton.setEnabled(true);
                                sadnessButton.setEnabled(true);
                                textPane.requestFocus();
                            } catch (BadLocationException ex) {
                                Logger.getLogger(SpeechGenerator.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        }
                    }
                });
        joyButton.addItemListener(
                new ItemListener() {
                    @Override
                    public void itemStateChanged(ItemEvent e) {
                        if (e.getStateChange() == ItemEvent.SELECTED) {
                            try {
                                disgustButton.setEnabled(false);
                                fearButton.setEnabled(false);
                                angerButton.setEnabled(false);
                                sadnessButton.setEnabled(false);
                                document.insertString(document.getLength(), " <j>", invisible);
                                document.insertString(document.getLength(), " ", joyHighlight);
                                textPane.requestFocus();
                            } catch (BadLocationException ex) {
                                Logger.getLogger(SpeechGenerator.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        } else {
                            try {
                                document.insertString(document.getLength(), " </j>", invisible);
                                document.insertString(document.getLength(), " ", regular);
                                disgustButton.setEnabled(true);
                                fearButton.setEnabled(true);
                                angerButton.setEnabled(true);
                                sadnessButton.setEnabled(true);
                                textPane.requestFocus();
                            } catch (BadLocationException ex) {
                                Logger.getLogger(SpeechGenerator.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        }
                    }
                });
    }
    
    /**
     * Function takes in a text file chosen with a button
     * then stylizes the text and displays it in the main
     * text panel.
     * @param textFile 
     */
    private void parseTextFile(String textFile) {
        String startTags[] = {"<a>", "<s>", "<f>", "<d>", "<j>"};
        String endTags[] = {"</a>", "</s>", "</f>", "</d>", "</j>"};
        Style highlights[] = {angryHighlight, sadHighlight, fearHighlight, disgustHighlight, joyHighlight};
        
        // Clear out the text in the text pane
        textPane.setText("");
        
        for (String tag : startTags) {
            // iterate over endTags and highlights based
            // on which start tag is selected
            int i = 0;
            int beginIndex = 0;
            int lastIndex = 0;
            int endTagIndex = -1;
            while (lastIndex != -1) {
                try {
                    lastIndex = textFile.indexOf(tag, lastIndex);
                    
                    // Insert everything in between tags
                    document.insertString(document.getLength(), textFile.substring(beginIndex, lastIndex), regular);
                    
                    // Insert start tag
                    document.insertString(document.getLength(), textFile.substring(lastIndex, lastIndex+tag.length()), invisible);
                    
                    // Insert highlighted text
                    lastIndex += tag.length();
                    endTagIndex = textFile.indexOf(endTags[i], lastIndex);
                    document.insertString(document.getLength(), textFile.substring(lastIndex, endTagIndex), highlights[i]);
                    
                    // Insert end tag
                    
                    beginIndex = lastIndex;
                    i++;
                } catch (BadLocationException ex) {
                    Logger.getLogger(SpeechGenerator.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
}
