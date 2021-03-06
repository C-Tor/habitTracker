/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.ctor.habittracker;

import static java.lang.Integer.parseInt;

/**
 *
 * @author C-Tor
 */
public class GUI extends javax.swing.JFrame {

    
    Habittracker app;
    
    /**
     * Creates new form GUI
     */
    public GUI() {
        initComponents();
        
        app = new Habittracker(this);
        //updateScreen();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ParentPanel = new javax.swing.JPanel();
        createHabitPanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        createHabitName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        createHabitStreak = new javax.swing.JTextField();
        createHabitButton = new javax.swing.JButton();
        habitPagePanel = new javax.swing.JPanel();
        trackButton = new javax.swing.JButton();
        trackerCount = new javax.swing.JLabel();
        habitTitle = new javax.swing.JLabel();
        warningLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Habit Tracker");
        setResizable(false);

        ParentPanel.setLayout(new java.awt.CardLayout());

        createHabitPanel.setLayout(null);

        jLabel2.setText("Habit Name:");
        createHabitPanel.add(jLabel2);
        jLabel2.setBounds(27, 44, 82, 16);

        createHabitName.setToolTipText("");
        createHabitPanel.add(createHabitName);
        createHabitName.setBounds(27, 72, 178, 22);

        jLabel3.setText("How many days are you into this habit so far?");
        createHabitPanel.add(jLabel3);
        jLabel3.setBounds(27, 137, 240, 16);

        createHabitStreak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createHabitStreakActionPerformed(evt);
            }
        });
        createHabitPanel.add(createHabitStreak);
        createHabitStreak.setBounds(27, 165, 64, 22);

        createHabitButton.setText("Create habit");
        createHabitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createHabitButtonActionPerformed(evt);
            }
        });
        createHabitPanel.add(createHabitButton);
        createHabitButton.setBounds(100, 250, 130, 55);

        ParentPanel.add(createHabitPanel, "createPage");

        habitPagePanel.setLayout(null);

        trackButton.setText("Track");
        trackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                trackButtonActionPerformed(evt);
            }
        });
        habitPagePanel.add(trackButton);
        trackButton.setBounds(40, 258, 234, 70);

        trackerCount.setFont(new java.awt.Font("Segoe UI", 0, 32)); // NOI18N
        trackerCount.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        trackerCount.setText("0");
        habitPagePanel.add(trackerCount);
        trackerCount.setBounds(6, 109, 309, 98);
        trackerCount.getAccessibleContext().setAccessibleName("TrackedDays");

        habitTitle.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        habitTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        habitTitle.setText("Habit Name");
        habitPagePanel.add(habitTitle);
        habitTitle.setBounds(6, 54, 309, 49);

        warningLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        warningLabel.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        habitPagePanel.add(warningLabel);
        warningLabel.setBounds(20, 334, 277, 38);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Days");
        jLabel1.setToolTipText("");
        habitPagePanel.add(jLabel1);
        jLabel1.setBounds(120, 210, 76, 16);

        ParentPanel.add(habitPagePanel, "habitPage");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ParentPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(ParentPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void trackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_trackButtonActionPerformed
        updateScreen();
        if(!app.attemptTrack()) {
            warningLabel.setText("Habit already tracked for today, good job!");
            updateScreen();
        } else
        {
            warningLabel.setText("Habit tracked, keep it up!");
            updateScreen();
        }
    }//GEN-LAST:event_trackButtonActionPerformed

    private void createHabitStreakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createHabitStreakActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_createHabitStreakActionPerformed

    private void createHabitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createHabitButtonActionPerformed
        
        int streak;
        if (createHabitStreak.getText() == "") {
            streak = 0;
        } else {
            streak = parseInt(createHabitStreak.getText());
        }
        app.createHabit(createHabitName.getText(), parseInt(createHabitStreak.getText()));
        app.initHabits();
        updateScreen();
        createHabitPanel.setVisible(false);
        habitPagePanel.setVisible(true);
    }//GEN-LAST:event_createHabitButtonActionPerformed

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
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new GUI().setVisible(true);
            }
        });
    }
    
    private void updateScreen() {
        habitTitle.setText(app.getHabitName());
        trackerCount.setText(String.valueOf(app.getHabitStreak()));
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ParentPanel;
    private javax.swing.JButton createHabitButton;
    private javax.swing.JTextField createHabitName;
    private javax.swing.JPanel createHabitPanel;
    private javax.swing.JTextField createHabitStreak;
    private javax.swing.JPanel habitPagePanel;
    private javax.swing.JLabel habitTitle;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton trackButton;
    private javax.swing.JLabel trackerCount;
    private javax.swing.JLabel warningLabel;
    // End of variables declaration//GEN-END:variables
}
