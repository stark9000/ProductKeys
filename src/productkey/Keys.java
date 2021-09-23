/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package productkey;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.swing.JOptionPane;
import ibxm.IBXM;
import ibxm.Module;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Random;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;

/**
 *
 * @author xyberwise
 */
public class Keys extends javax.swing.JFrame {

    private Pattern REGEXPATTERN;
    private Matcher REGMATCHER;
    private String GEN_USERNAME = "";
    private String GEN_EMAIL = "";
    private String VAL_USERNAME = "";
    private String VAL_EMAIL = "";

    private String S_1 = "";
    private String S_2 = "";
    private String S_3 = "";
    private String S_4 = "";
    private String S_5 = "";
    private String S_6 = "";
    private String S_7 = "";
    private String S_8 = "";
    private String S_9 = "";
    private String S_10 = "";
    private String S_11 = "";
    private String S_12 = "";
    private String S_13 = "";

    private static final int SAMPLE_RATE = 48000;
    private Module MODULE;
    private IBXM IBXM;
    private volatile boolean PLAYING;
    private Thread PLAYTHREAD;

    public Keys() {
        initComponents();
        initx();
    }

    private void initx() {
        LoadMoDFile();
        BTN_MUSIC.setSelected(true);
        BTN_MUSIC.setText("playing");
        playMusic();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        GEN_USERNAME_TXT = new javax.swing.JTextField();
        GEN_EMAIL_TXT = new javax.swing.JTextField();
        BTN_GEN_PK = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        GEN_KEY = new javax.swing.JTextField();
        BTN_GEN_R_UN = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        VAL_USERNAME_TXT = new javax.swing.JTextField();
        VAL_EMAIL_TXT = new javax.swing.JTextField();
        VAL_KEY = new javax.swing.JTextField();
        VAL_PK = new javax.swing.JButton();
        BTN_VAL_R_UN = new javax.swing.JButton();
        JP = new javax.swing.JPanel();
        BTN_MUSIC = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Product Keys Generator.");
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Generate"));

        jLabel2.setText("E-mail :");

        jLabel1.setText("Name :");

        GEN_EMAIL_TXT.setText("@gmail.com");

        BTN_GEN_PK.setText("Generate Product Key");
        BTN_GEN_PK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_GEN_PKActionPerformed(evt);
            }
        });

        jLabel6.setText("Key :");

        BTN_GEN_R_UN.setText("Randomiz");
        BTN_GEN_R_UN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_GEN_R_UNActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel6)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(GEN_KEY, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(GEN_EMAIL_TXT, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(BTN_GEN_PK, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(GEN_USERNAME_TXT, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BTN_GEN_R_UN)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(GEN_USERNAME_TXT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BTN_GEN_R_UN)
                    .addComponent(jLabel1))
                .addGap(7, 7, 7)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(GEN_EMAIL_TXT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(7, 7, 7)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(GEN_KEY, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BTN_GEN_PK)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Validate"));

        jLabel4.setText("Name :");

        jLabel5.setText("E-mail :");

        VAL_EMAIL_TXT.setText("@gmail.com");

        VAL_PK.setText("Validate Product Key");
        VAL_PK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VAL_PKActionPerformed(evt);
            }
        });

        BTN_VAL_R_UN.setText("Randomiz");
        BTN_VAL_R_UN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_VAL_R_UNActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(VAL_USERNAME_TXT, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BTN_VAL_R_UN))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(VAL_KEY)
                            .addComponent(VAL_EMAIL_TXT)
                            .addComponent(VAL_PK, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(VAL_USERNAME_TXT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BTN_VAL_R_UN)
                    .addComponent(jLabel4))
                .addGap(7, 7, 7)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(VAL_EMAIL_TXT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(14, 14, 14)
                .addComponent(VAL_KEY, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addComponent(VAL_PK)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        JP.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        BTN_MUSIC.setText(">");
        BTN_MUSIC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_MUSICActionPerformed(evt);
            }
        });
        JP.add(BTN_MUSIC);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addComponent(JP, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 160, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BTN_GEN_PKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_GEN_PKActionPerformed
        if (GEN_USERNAME_TXT.getText().isEmpty() || GEN_EMAIL_TXT.getText().isEmpty()) {
            return;
        }
        String MD5_UN = "";
        String MD5_EM = "";
        GEN_USERNAME = GEN_USERNAME_TXT.getText().trim();
        GEN_EMAIL = GEN_EMAIL_TXT.getText().trim();
        GEN_USERNAME = GEN_USERNAME.replace(".", "E");
        GEN_EMAIL = GEN_EMAIL.replace(".", "E");
        try {
            MD5_UN = getMD5Hex(GEN_USERNAME);
            MD5_EM = getMD5Hex(GEN_EMAIL);
        } catch (NoSuchAlgorithmException e) {
        }
        MD5_UN = MD5_UN.toUpperCase();
        MD5_EM = MD5_EM.toUpperCase();
        char[] MD5_UN_CH = MD5_UN.toCharArray();
        char[] MD5_EM_CH = MD5_EM.toCharArray();
        for (int i = 0; i < 16; i++) {
            S_1 = S_1 + String.valueOf(MD5_UN_CH[i]);
            S_2 = S_2 + String.valueOf(MD5_EM_CH[i]);
        }
        char[] MD5_UN_M = S_1.toCharArray();
        char[] MD5_EM_M = S_2.toCharArray();
        for (int i = 0; i < 8; i++) {
            S_3 = S_3 + String.valueOf(MD5_UN_M[i]);
            S_4 = S_4 + String.valueOf(MD5_EM_M[i]);
        }
        S_5 = S_3 + S_4;
        GEN_KEY.setText(generateKey(S_5));
        VAL_KEY.setText(generateKey(S_5));
        GEN_USERNAME = "";
        GEN_EMAIL = "";
        S_1 = "";
        S_2 = "";
        S_3 = "";
        S_4 = "";
        S_5 = "";
        S_6 = "";
        S_7 = "";
        S_8 = "";
        S_9 = "";
        S_10 = "";
        S_11 = "";
        S_12 = "";
        S_13 = "";
    }//GEN-LAST:event_BTN_GEN_PKActionPerformed

    private void VAL_PKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VAL_PKActionPerformed
        VAL_USERNAME = "";
        VAL_EMAIL = "";
        S_1 = "";
        S_2 = "";
        S_3 = "";
        S_4 = "";
        S_5 = "";
        S_6 = "";
        S_7 = "";
        S_8 = "";
        S_9 = "";
        S_10 = "";
        S_11 = "";
        S_12 = "";
        S_13 = "";
        String MD5_UN = "";
        String MD5_EM = "";
        if (VAL_USERNAME_TXT.getText().isEmpty() || VAL_EMAIL_TXT.getText().isEmpty() || VAL_KEY.getText().isEmpty()) {
            return;
        }
        if (VAL_KEY.getText().length() != 19) {
            JOptionPane.showMessageDialog(this, "key is not entered correctly !");
            return;
        }
        if (isValidEmailAddress(VAL_EMAIL_TXT.getText()) == false) {
            JOptionPane.showMessageDialog(this, "enter email correctly !");
            return;
        }
        String ueh = VAL_KEY.getText().replace("-", "").trim();
        MD5_UN = "";
        MD5_EM = "";
        VAL_USERNAME = VAL_USERNAME_TXT.getText().trim();
        VAL_EMAIL = VAL_EMAIL_TXT.getText().trim();
        VAL_USERNAME = VAL_USERNAME.replace(".", "E");
        VAL_EMAIL = VAL_EMAIL.replace(".", "E");
        try {
            MD5_UN = getMD5Hex(VAL_USERNAME);
            MD5_EM = getMD5Hex(VAL_EMAIL);
        } catch (NoSuchAlgorithmException e) {
        }
        MD5_UN = MD5_UN.toUpperCase();
        MD5_EM = MD5_EM.toUpperCase();
        char[] MD5_UN_M = MD5_UN.toCharArray();
        char[] MD5_EM_M = MD5_EM.toCharArray();
        for (int i = 8; i < 32; i++) {
            S_7 = S_7 + String.valueOf(MD5_UN_M[i]);
            S_8 = S_8 + String.valueOf(MD5_EM_M[i]);
        }
        S_9 = getKey(ueh);
        char[] re = S_9.toCharArray();
        for (int i = 0; i < 8; i++) {
            S_10 = S_10 + String.valueOf(re[i]);
        }
        for (int i = 8; i < 16; i++) {
            S_11 = S_11 + String.valueOf(re[i]);
        }
        S_12 = S_10 + S_7;
        S_13 = S_11 + S_8;
        if (S_12.equals(MD5_UN) && S_13.equals(MD5_EM)) {
            JOptionPane.showMessageDialog(this, "valid key !");
        } else {
            JOptionPane.showMessageDialog(this, "in-valid key !");
        }
    }//GEN-LAST:event_VAL_PKActionPerformed

    private void BTN_MUSICActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_MUSICActionPerformed
        if (BTN_MUSIC.isSelected()) {
            playMusic();
            BTN_MUSIC.setText("playing");
        } else {
            stopMusic();
            BTN_MUSIC.setText("stoped");
        }
    }//GEN-LAST:event_BTN_MUSICActionPerformed

    private void BTN_GEN_R_UNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_GEN_R_UNActionPerformed
        String str = getRandomString();
        GEN_USERNAME_TXT.setText(str);
        GEN_EMAIL_TXT.setText(str + "@gmail.com");
    }//GEN-LAST:event_BTN_GEN_R_UNActionPerformed

    private void BTN_VAL_R_UNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_VAL_R_UNActionPerformed
        String str = getRandomString();
        VAL_USERNAME_TXT.setText(str);
        VAL_EMAIL_TXT.setText(str + "@gmail.com");
    }//GEN-LAST:event_BTN_VAL_R_UNActionPerformed
    public static String getMD5Hex(final String inputString) throws NoSuchAlgorithmException {
        MessageDigest md = MessageDigest.getInstance("MD5");
        md.update(inputString.getBytes());
        byte[] digest = md.digest();
        return convertByteToHex(digest);
    }

    private static String convertByteToHex(byte[] byteData) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < byteData.length; i++) {
            sb.append(Integer.toString((byteData[i] & 0xff) + 0x100, 16).substring(1));
        }

        return sb.toString();
    }

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Keys.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Keys().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTN_GEN_PK;
    private javax.swing.JButton BTN_GEN_R_UN;
    private javax.swing.JToggleButton BTN_MUSIC;
    private javax.swing.JButton BTN_VAL_R_UN;
    private javax.swing.JTextField GEN_EMAIL_TXT;
    private javax.swing.JTextField GEN_KEY;
    private javax.swing.JTextField GEN_USERNAME_TXT;
    private javax.swing.JPanel JP;
    private javax.swing.JTextField VAL_EMAIL_TXT;
    private javax.swing.JTextField VAL_KEY;
    private javax.swing.JButton VAL_PK;
    private javax.swing.JTextField VAL_USERNAME_TXT;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables

    private String generateKey(String data) {
        byte[] bytes = data.getBytes();
        String KEY = "";
        KEY += new String(new byte[]{(byte) bytes[15]});
        KEY += new String(new byte[]{(byte) bytes[14]});
        KEY += new String(new byte[]{(byte) bytes[8]});
        KEY += new String(new byte[]{(byte) bytes[9]});
        KEY += "-";
        KEY += new String(new byte[]{(byte) bytes[6]});
        KEY += new String(new byte[]{(byte) bytes[11]});
        KEY += new String(new byte[]{(byte) bytes[4]});
        KEY += new String(new byte[]{(byte) bytes[12]});
        KEY += "-";
        KEY += new String(new byte[]{(byte) bytes[2]});
        KEY += new String(new byte[]{(byte) bytes[3]});
        KEY += new String(new byte[]{(byte) bytes[13]});
        KEY += new String(new byte[]{(byte) bytes[5]});
        KEY += "-";
        KEY += new String(new byte[]{(byte) bytes[7]});
        KEY += new String(new byte[]{(byte) bytes[10]});
        KEY += new String(new byte[]{(byte) bytes[1]});
        KEY += new String(new byte[]{(byte) bytes[0]});
        return KEY;
    }

    private String getKey(String Product_Key) {
        String replaceAll = Product_Key.replaceAll("[\\s\\-()]", "");
        byte[] bytes = replaceAll.getBytes();
        String KEY = "";
        KEY += new String(new byte[]{(byte) bytes[15]});
        KEY += new String(new byte[]{(byte) bytes[14]});
        KEY += new String(new byte[]{(byte) bytes[8]});
        KEY += new String(new byte[]{(byte) bytes[9]});
        KEY += new String(new byte[]{(byte) bytes[6]});
        KEY += new String(new byte[]{(byte) bytes[11]});
        KEY += new String(new byte[]{(byte) bytes[4]});
        KEY += new String(new byte[]{(byte) bytes[12]});
        KEY += new String(new byte[]{(byte) bytes[2]});
        KEY += new String(new byte[]{(byte) bytes[3]});
        KEY += new String(new byte[]{(byte) bytes[13]});
        KEY += new String(new byte[]{(byte) bytes[5]});
        KEY += new String(new byte[]{(byte) bytes[7]});
        KEY += new String(new byte[]{(byte) bytes[10]});
        KEY += new String(new byte[]{(byte) bytes[1]});
        KEY += new String(new byte[]{(byte) bytes[0]});
        return KEY;
    }

    public boolean validateEmailAddress(String emailAddress) {
        REGEXPATTERN = Pattern.compile("^[(a-zA-Z-0-9-\\_\\+\\.)]+@[(a-z-A-z)]+\\.[(a-zA-z)]{2,3}$");
        REGMATCHER = REGEXPATTERN.matcher(emailAddress);
        return REGMATCHER.matches();
    }

    public boolean isValidEmailAddress(String email) {
        boolean result = true;
        try {
            InternetAddress emailAddr = new InternetAddress(email);
            emailAddr.validate();
        } catch (AddressException ex) {
            result = false;
        }
        return result;
    }

    private synchronized void stopMusic() {
        PLAYING = false;
        try {
            if (PLAYTHREAD != null) {
                PLAYTHREAD.join();
            }
        } catch (InterruptedException e) {
        }
    }

    private synchronized int getAudio(int[] mixBuf) {
        int count = IBXM.getAudio(mixBuf);
        return count;
    }

    private synchronized void playMusic() {
        if (IBXM != null) {
            PLAYING = true;
            PLAYTHREAD = new Thread(() -> {
                int[] mixBuf = new int[IBXM.getMixBufferLength()];
                byte[] outBuf = new byte[mixBuf.length * 4];
                AudioFormat audioFormat = null;
                SourceDataLine audioLine = null;
                try {
                    audioFormat = new AudioFormat(SAMPLE_RATE, 16, 2, true, true);
                    audioLine = AudioSystem.getSourceDataLine(audioFormat);
                    audioLine.open();
                    audioLine.start();
                    while (PLAYING) {
                        int count = getAudio(mixBuf);
                        int outIdx = 0;
                        for (int mixIdx = 0, mixEnd = count * 2; mixIdx < mixEnd; mixIdx++) {
                            int ampl = mixBuf[mixIdx];
                            if (ampl > 32767) {
                                ampl = 32767;
                            }
                            if (ampl < -32768) {
                                ampl = -32768;
                            }
                            outBuf[outIdx++] = (byte) (ampl >> 8);
                            outBuf[outIdx++] = (byte) ampl;
                        }
                        audioLine.write(outBuf, 0, outIdx);
                    }
                    audioLine.drain();
                } catch (LineUnavailableException e) {
                } finally {
                    if (audioLine != null && audioLine.isOpen()) {
                        audioLine.close();
                    }
                }
            });
            PLAYTHREAD.start();
        }
    }

    public void LoadMoDFile() {
        URL filep = Keys.class.getResource("/productkey/res/_za_zz.xm");
        try {
            File music = new File(filep.toURI());
            loadModule(music);
        } catch (URISyntaxException | IOException ex) {
        }
    }

    private synchronized void loadModule(File modFile) throws IOException {
        byte[] moduleData = new byte[(int) modFile.length()];
        try (FileInputStream inputStream = new FileInputStream(modFile)) {
            int offset = 0;
            while (offset < moduleData.length) {
                int len = inputStream.read(moduleData, offset, moduleData.length - offset);
                if (len < 0) {
                    throw new IOException("Unexpected end of file.");
                }
                offset += len;
            }
        }
        MODULE = new Module(moduleData);
        IBXM = new IBXM(MODULE, SAMPLE_RATE);
    }

    protected String getRandomString() {
        String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        StringBuilder strb = new StringBuilder();
        Random rnd = new Random();
        while (strb.length() < 8) {
            int index = (int) (rnd.nextFloat() * chars.length());
            strb.append(chars.charAt(index));
        }
        String rstr = strb.toString();
        return rstr;
    }
}
