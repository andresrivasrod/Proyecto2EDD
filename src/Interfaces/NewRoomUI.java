/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interfaces;
import java.awt.geom.RoundRectangle2D;
import javax.swing.DefaultListModel;
import Clases.Funciones;
/**
 *
 * @author Admin
 */
public class NewRoomUI extends javax.swing.JFrame {
    public Funciones f=new Funciones();
    /**
     * Creates new form NewRoomUI
     */
    public NewRoomUI() {
        Funciones f=new Funciones();
        initComponents();
        setLocationRelativeTo(null);
        setShape(new RoundRectangle2D.Double(0,0,700, 420,20,20));
        //DefaultListModel<String> modelo = new DefaultListModel<String>();
        //Room_list.setModel(modelo);
        //modelo.addElement("Elemento 1");  
        //f.ReservasUI(Room_list);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Background = new javax.swing.JLabel();
        Salir = new javax.swing.JButton();
        RoomWindow = new javax.swing.JButton();
        UserWindow = new javax.swing.JButton();
        BackgroundMenu = new javax.swing.JLabel();
        UserIcon = new javax.swing.JLabel();
        Historial = new javax.swing.JButton();
        IntHab = new javax.swing.JTextField();
        Buscar = new javax.swing.JButton();
        Cedula = new javax.swing.JTextField();
        Alojado2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Historico = new javax.swing.JTextArea();
        Background1 = new javax.swing.JLabel();

        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/NewUI/Backgrounds/Background.png"))); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setSize(new java.awt.Dimension(700, 420));
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

        UserIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/NewUI/Icons/BedIcon.png"))); // NOI18N
        getContentPane().add(UserIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 140, 140));

        Historial.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/NewUI/Buttons/Historial.png"))); // NOI18N
        Historial.setBorderPainted(false);
        Historial.setContentAreaFilled(false);
        Historial.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Historial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HistorialActionPerformed(evt);
            }
        });
        getContentPane().add(Historial, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, 140, 50));

        IntHab.setBackground(new java.awt.Color(32, 32, 33));
        IntHab.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        IntHab.setForeground(new java.awt.Color(255, 255, 255));
        IntHab.setText("NumHabitación");
        IntHab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IntHabActionPerformed(evt);
            }
        });
        getContentPane().add(IntHab, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 140, 40));

        Buscar.setBackground(new java.awt.Color(32, 32, 33));
        Buscar.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        Buscar.setForeground(new java.awt.Color(255, 255, 255));
        Buscar.setText("Buscar");
        Buscar.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Buscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Buscar.setFocusable(false);
        Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarActionPerformed(evt);
            }
        });
        getContentPane().add(Buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 20, 120, 50));

        Cedula.setBackground(new java.awt.Color(32, 32, 33));
        Cedula.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        Cedula.setForeground(new java.awt.Color(255, 255, 255));
        Cedula.setText("Cedula");
        Cedula.setToolTipText("");
        Cedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CedulaActionPerformed(evt);
            }
        });
        getContentPane().add(Cedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 40, 120, 30));

        Alojado2.setBackground(new java.awt.Color(32, 32, 33));
        Alojado2.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        Alojado2.setForeground(new java.awt.Color(255, 255, 255));
        Alojado2.setText("Reservaciones");
        getContentPane().add(Alojado2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, 130, -1));

        Historico.setColumns(20);
        Historico.setRows(5);
        jScrollPane1.setViewportView(Historico);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 80, 500, 310));

        Background1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/NewUI/Backgrounds/Background.png"))); // NOI18N
        getContentPane().add(Background1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 420));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_SalirActionPerformed

    private void RoomWindowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RoomWindowActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RoomWindowActionPerformed

    private void UserWindowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UserWindowActionPerformed
        NewClientUI ClientUI= new NewClientUI();
        ClientUI.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_UserWindowActionPerformed

    private void IntHabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IntHabActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IntHabActionPerformed

    private void HistorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HistorialActionPerformed
        try{
            String historico = f.historicoHabitacion(Integer.parseInt(IntHab.getText()));
            Historico.setText(historico);
        } catch(Exception e){
            ErrorWindow Error=new ErrorWindow();
            Error.setVisible(true);
            System.out.println(e);
    }
        
    }//GEN-LAST:event_HistorialActionPerformed

    private void BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarActionPerformed
        try{
            f.buscarReservasUI2(Integer.parseInt(Cedula.getText()));
            this.dispose();
        } catch(Exception e){
            ErrorWindow Error=new ErrorWindow();
            Error.setVisible(true);
    }
        
    }//GEN-LAST:event_BuscarActionPerformed

    private void CedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CedulaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CedulaActionPerformed

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
            java.util.logging.Logger.getLogger(NewRoomUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewRoomUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewRoomUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewRoomUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewRoomUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Alojado2;
    private javax.swing.JLabel Background;
    private javax.swing.JLabel Background1;
    private javax.swing.JLabel BackgroundMenu;
    private javax.swing.JButton Buscar;
    private javax.swing.JTextField Cedula;
    private javax.swing.JButton Historial;
    private javax.swing.JTextArea Historico;
    private javax.swing.JTextField IntHab;
    private javax.swing.JButton RoomWindow;
    private javax.swing.JButton Salir;
    private javax.swing.JLabel UserIcon;
    private javax.swing.JButton UserWindow;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
