/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ec.edu.espe.simulationcatering.view;

/**
 *
 * @author LENOVO
 */
public class FrmCateringPlanner extends javax.swing.JFrame {

    /**
     * Creates new form FrmCateringPlanner
     */
    public FrmCateringPlanner() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        MenuCateringPlanner = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        itmAbout = new javax.swing.JMenuItem();
        itmExit = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        itmReservations = new javax.swing.JMenuItem();
        itmTransport = new javax.swing.JMenuItem();
        itmEvents = new javax.swing.JMenuItem();
        itmCookware = new javax.swing.JMenu();
        itmCookware1 = new javax.swing.JMenuItem();
        itmIngredient = new javax.swing.JMenuItem();
        itmWorker = new javax.swing.JMenuItem();

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        jMenuItem1.setText("jMenuItem1");

        jMenuItem2.setText("jMenuItem2");

        jMenu3.setText("File");
        jMenuBar1.add(jMenu3);

        jMenu4.setText("Edit");
        jMenuBar1.add(jMenu4);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Welcome to your Catering Planner");

        jLabel2.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 0, 51));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("What do you need to do today?");

        jMenu1.setBorder(null);
        jMenu1.setText("Catering Planner");

        itmAbout.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        itmAbout.setText("About");
        itmAbout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmAboutActionPerformed(evt);
            }
        });
        jMenu1.add(itmAbout);

        itmExit.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        itmExit.setText("Exit");
        itmExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmExitActionPerformed(evt);
            }
        });
        jMenu1.add(itmExit);

        MenuCateringPlanner.add(jMenu1);

        jMenu2.setBorder(null);
        jMenu2.setText("New");

        itmReservations.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        itmReservations.setText("Reservations");
        itmReservations.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmReservationsActionPerformed(evt);
            }
        });
        jMenu2.add(itmReservations);

        itmTransport.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_T, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        itmTransport.setText("Transport");
        itmTransport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmTransportActionPerformed(evt);
            }
        });
        jMenu2.add(itmTransport);

        itmEvents.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        itmEvents.setText("Events");
        itmEvents.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmEventsActionPerformed(evt);
            }
        });
        jMenu2.add(itmEvents);

        MenuCateringPlanner.add(jMenu2);

        itmCookware.setBorder(null);
        itmCookware.setText("Resources");

        itmCookware1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        itmCookware1.setText("Cookware");
        itmCookware1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmCookware1ActionPerformed(evt);
            }
        });
        itmCookware.add(itmCookware1);

        itmIngredient.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_I, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        itmIngredient.setText("Ingredient");
        itmIngredient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmIngredientActionPerformed(evt);
            }
        });
        itmCookware.add(itmIngredient);

        itmWorker.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_W, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        itmWorker.setText("Worker");
        itmWorker.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmWorkerActionPerformed(evt);
            }
        });
        itmCookware.add(itmWorker);

        MenuCateringPlanner.add(itmCookware);

        setJMenuBar(MenuCateringPlanner);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(66, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(78, 78, 78))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void itmAboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmAboutActionPerformed
        FrmAbout frmAbout = new FrmAbout();
        frmAbout.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_itmAboutActionPerformed

    private void itmReservationsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmReservationsActionPerformed
        // TODO add your handling code here:
        FrmReservations frmReservation = new FrmReservations();
        frmReservation.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_itmReservationsActionPerformed

    private void itmExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmExitActionPerformed
        // TODO add your handling code here:
        if(this.isDisplayable()){
            boolean alreadyDisposed = true;
            this.dispose();
        }
    }//GEN-LAST:event_itmExitActionPerformed

    private void itmEventsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmEventsActionPerformed
         FrmEvents frmEvents = new FrmEvents();
        frmEvents.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_itmEventsActionPerformed

    private void itmTransportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmTransportActionPerformed
        FrmTransport frmTransport = new FrmTransport();
        frmTransport.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_itmTransportActionPerformed

    private void itmIngredientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmIngredientActionPerformed
        FrmIngredients frmIngredients = new FrmIngredients();
        frmIngredients.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_itmIngredientActionPerformed

    private void itmCookware1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmCookware1ActionPerformed
        FrmCookware frmCookware = new FrmCookware();
        frmCookware.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_itmCookware1ActionPerformed

    private void itmWorkerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmWorkerActionPerformed
        FrmWorker frmWorker = new FrmWorker();
        frmWorker.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_itmWorkerActionPerformed

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
            java.util.logging.Logger.getLogger(FrmCateringPlanner.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmCateringPlanner.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmCateringPlanner.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmCateringPlanner.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmCateringPlanner().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar MenuCateringPlanner;
    private javax.swing.JMenuItem itmAbout;
    private javax.swing.JMenu itmCookware;
    private javax.swing.JMenuItem itmCookware1;
    private javax.swing.JMenuItem itmEvents;
    private javax.swing.JMenuItem itmExit;
    private javax.swing.JMenuItem itmIngredient;
    private javax.swing.JMenuItem itmReservations;
    private javax.swing.JMenuItem itmTransport;
    private javax.swing.JMenuItem itmWorker;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    // End of variables declaration//GEN-END:variables
}
