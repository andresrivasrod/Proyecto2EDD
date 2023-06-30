/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interfaces;

import Clases.Funciones;
import java.awt.geom.RoundRectangle2D;

/**
 *
 * @author Admin
 */
public class NewClientUI extends javax.swing.JFrame {

    public Funciones f = new Funciones();

    /**
     * Creates new form NewClientUI
     */
    public NewClientUI() {
        initComponents();
        setLocationRelativeTo(null);
        setShape(new RoundRectangle2D.Double(0, 0, 700, 420, 20, 20));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Salir = new javax.swing.JButton();
        RoomWindow = new javax.swing.JButton();
        UserWindow = new javax.swing.JButton();
        BackgroundMenu = new javax.swing.JLabel();
        UserIcon = new javax.swing.JLabel();
        CheckOutText = new javax.swing.JLabel();
        CheckInText = new javax.swing.JLabel();
        Apellido = new javax.swing.JTextField();
        Nombre = new javax.swing.JTextField();
        Check_In = new javax.swing.JButton();
        NumHab = new javax.swing.JButton();
        Alojado1 = new javax.swing.JLabel();
        Alojado = new javax.swing.JLabel();
        Check_Out = new javax.swing.JButton();
        Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/NewUI/Buttons/Salir.png"))); // NOI18N
        Salir.setContentAreaFilled(false);
        Salir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });
        getContentPane().add(Salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 10, 30, 30));

        RoomWindow.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/NewUI/Buttons/Bed.png"))); // NOI18N
        RoomWindow.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        RoomWindow.setContentAreaFilled(false);
        RoomWindow.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        RoomWindow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RoomWindowActionPerformed(evt);
            }
        });
        getContentPane().add(RoomWindow, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 40, 40));

        UserWindow.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/NewUI/Buttons/User.png"))); // NOI18N
        UserWindow.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        UserWindow.setContentAreaFilled(false);
        UserWindow.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        UserWindow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UserWindowActionPerformed(evt);
            }
        });
        getContentPane().add(UserWindow, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 40, 40));

        BackgroundMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/NewUI/Backgrounds/BackgroundOptions.png"))); // NOI18N
        getContentPane().add(BackgroundMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 130, 60));

        UserIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/NewUI/Icons/UserIcon.png"))); // NOI18N
        getContentPane().add(UserIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 70, 140, 140));

        CheckOutText.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/NewUI/Texts/Check_Out_Text.png"))); // NOI18N
        getContentPane().add(CheckOutText, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 190, 190, 60));

        CheckInText.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/NewUI/Texts/Check_In_Text.png"))); // NOI18N
        getContentPane().add(CheckInText, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 100, 190, 60));

        Apellido.setBackground(new java.awt.Color(32, 32, 33));
        Apellido.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        Apellido.setForeground(new java.awt.Color(255, 255, 255));
        Apellido.setText("Apellido");
        Apellido.setToolTipText("");
        Apellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ApellidoActionPerformed(evt);
            }
        });
        getContentPane().add(Apellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 260, 120, 30));

        Nombre.setBackground(new java.awt.Color(32, 32, 33));
        Nombre.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        Nombre.setForeground(new java.awt.Color(255, 255, 255));
        Nombre.setText("Nombre");
        Nombre.setToolTipText("");
        Nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NombreActionPerformed(evt);
            }
        });
        getContentPane().add(Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 110, 30));

        Check_In.setBackground(new java.awt.Color(32, 32, 33));
        Check_In.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        Check_In.setForeground(new java.awt.Color(255, 255, 255));
        Check_In.setText("Check In");
        Check_In.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Check_In.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Check_In.setFocusable(false);
        Check_In.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Check_InActionPerformed(evt);
            }
        });
        getContentPane().add(Check_In, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 100, 130, 50));

        NumHab.setBackground(new java.awt.Color(32, 32, 33));
        NumHab.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        NumHab.setForeground(new java.awt.Color(255, 255, 255));
        NumHab.setText("Buscar");
        NumHab.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        NumHab.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        NumHab.setFocusable(false);
        NumHab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NumHabActionPerformed(evt);
            }
        });
        getContentPane().add(NumHab, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 300, 120, 50));

        Alojado1.setBackground(new java.awt.Color(32, 32, 33));
        Alojado1.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        Alojado1.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(Alojado1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 230, 20, 30));

        Alojado.setBackground(new java.awt.Color(32, 32, 33));
        Alojado.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        Alojado.setForeground(new java.awt.Color(255, 255, 255));
        Alojado.setText("Número de Habitación:");
        getContentPane().add(Alojado, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, -1, -1));

        Check_Out.setBackground(new java.awt.Color(32, 32, 33));
        Check_Out.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        Check_Out.setForeground(new java.awt.Color(255, 255, 255));
        Check_Out.setText("Check Out");
        Check_Out.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Check_Out.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Check_Out.setFocusable(false);
        Check_Out.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Check_OutActionPerformed(evt);
            }
        });
        getContentPane().add(Check_Out, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 190, 130, 50));

        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/NewUI/Backgrounds/Background.png"))); // NOI18N
        getContentPane().add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 420));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public void setAlojado1(String string) {
        Alojado1.setText(string);
    }
    private void RoomWindowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RoomWindowActionPerformed
        NewRoomUI RoomUI = new NewRoomUI();
        RoomUI.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_RoomWindowActionPerformed

    private void UserWindowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UserWindowActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UserWindowActionPerformed

    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_SalirActionPerformed

    private void Check_InActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Check_InActionPerformed
        Buscar_cliente_In Option = new Buscar_cliente_In();
        Option.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_Check_InActionPerformed

    private void NumHabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NumHabActionPerformed
        try {
            setAlojado1(f.conseguirHabitacion(Nombre.getText(), Apellido.getText()));
        } catch (Exception e) {
            ErrorWindow Error = new ErrorWindow();
            Error.setVisible(true);
        }
    }//GEN-LAST:event_NumHabActionPerformed

    private void ApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ApellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ApellidoActionPerformed

    private void NombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NombreActionPerformed

    private void Check_OutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Check_OutActionPerformed
        Buscar_cliente_Out Option = new Buscar_cliente_Out();
        Option.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_Check_OutActionPerformed

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
            java.util.logging.Logger.getLogger(NewClientUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewClientUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewClientUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewClientUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewClientUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Alojado;
    private javax.swing.JLabel Alojado1;
    private javax.swing.JTextField Apellido;
    private javax.swing.JLabel Background;
    private javax.swing.JLabel BackgroundMenu;
    private javax.swing.JLabel CheckInText;
    private javax.swing.JLabel CheckOutText;
    private javax.swing.JButton Check_In;
    private javax.swing.JButton Check_Out;
    private javax.swing.JTextField Nombre;
    private javax.swing.JButton NumHab;
    private javax.swing.JButton RoomWindow;
    private javax.swing.JButton Salir;
    private javax.swing.JLabel UserIcon;
    private javax.swing.JButton UserWindow;
    // End of variables declaration//GEN-END:variables
}
