/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package speechgenerator;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

/**
 *
 * @author kjs31894
 */
public class SpeechGenerator extends javax.swing.JFrame {

    /**
     * Creates new form SpeechGenerator
     */
    public SpeechGenerator() {
        initComponents();
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        sadnessButton.setText("Sadness");

        angerButton.setText("Anger");

        fearButton.setText("Fear");

        disgustButton.setText("Disgust");

        joyButton.setText("Joy");

        textScrollPane.setViewportView(textPane);

        divideButton.setText("Divide");

        outputButton.setText("Send to File...");

        speakButton.setText("Speak");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(textScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 776, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(outputButton, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(speakButton, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13)))
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
                            .addComponent(speakButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
                            disgustButton.setEnabled(false);
                            fearButton.setEnabled(false);
                            joyButton.setEnabled(false);
                            sadnessButton.setEnabled(false);
                            textPane.setText(textPane.getText() + "<a>");
                            textPane.requestFocus();
                        } else {
                            textPane.setText(textPane.getText() + "</a>");
                            disgustButton.setEnabled(true);
                            fearButton.setEnabled(true);
                            joyButton.setEnabled(true);
                            sadnessButton.setEnabled(true);
                            textPane.requestFocus();
                        }
                    }
                });
        disgustButton.addItemListener(
                new ItemListener() {
                    @Override
                    public void itemStateChanged(ItemEvent e) {
                        if (e.getStateChange() == ItemEvent.SELECTED) {
                            angerButton.setEnabled(false);
                            fearButton.setEnabled(false);
                            joyButton.setEnabled(false);
                            sadnessButton.setEnabled(false);
                            textPane.setText(textPane.getText() + "<d>");
                            textPane.requestFocus();
                        } else {
                            textPane.setText(textPane.getText() + "</d>");
                            angerButton.setEnabled(true);
                            fearButton.setEnabled(true);
                            joyButton.setEnabled(true);
                            sadnessButton.setEnabled(true);
                            textPane.requestFocus();
                        }
                    }
                });
        sadnessButton.addItemListener(
                new ItemListener() {
                    @Override
                    public void itemStateChanged(ItemEvent e) {
                        if (e.getStateChange() == ItemEvent.SELECTED) {
                            disgustButton.setEnabled(false);
                            fearButton.setEnabled(false);
                            joyButton.setEnabled(false);
                            angerButton.setEnabled(false);
                            textPane.setText(textPane.getText() + "<s>");
                            textPane.requestFocus();
                        } else {
                            textPane.setText(textPane.getText() + "</s>");
                            disgustButton.setEnabled(true);
                            fearButton.setEnabled(true);
                            joyButton.setEnabled(true);
                            angerButton.setEnabled(true);
                            textPane.requestFocus();
                        }
                    }
                });
        fearButton.addItemListener(
                new ItemListener() {
                    @Override
                    public void itemStateChanged(ItemEvent e) {
                        if (e.getStateChange() == ItemEvent.SELECTED) {
                            disgustButton.setEnabled(false);
                            angerButton.setEnabled(false);
                            joyButton.setEnabled(false);
                            sadnessButton.setEnabled(false);
                            textPane.setText(textPane.getText() + "<f>");
                            textPane.requestFocus();
                        } else {
                            textPane.setText(textPane.getText() + "</f>");
                            disgustButton.setEnabled(true);
                            angerButton.setEnabled(true);
                            joyButton.setEnabled(true);
                            sadnessButton.setEnabled(true);
                            textPane.requestFocus();
                        }
                    }
                });
        joyButton.addItemListener(
                new ItemListener() {
                    @Override
                    public void itemStateChanged(ItemEvent e) {
                        if (e.getStateChange() == ItemEvent.SELECTED) {
                            disgustButton.setEnabled(false);
                            fearButton.setEnabled(false);
                            angerButton.setEnabled(false);
                            sadnessButton.setEnabled(false);
                            textPane.setText(textPane.getText() + "<j>");
                            textPane.requestFocus();
                        } else {
                            textPane.setText(textPane.getText() + "</j>");
                            disgustButton.setEnabled(true);
                            fearButton.setEnabled(true);
                            angerButton.setEnabled(true);
                            sadnessButton.setEnabled(true);
                            textPane.requestFocus();
                        }
                    }
                });
    }
}
