
package ec.edu.espe.simulationcatering.view;


import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.result.DeleteResult;
import ec.edu.espe.simulationcatering.model.Reservation;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.bson.Document;
import org.bson.types.ObjectId;
import utils.MongoConnection;

/**
 *
 * @author Salma Villegas
 */
public class FrmReservations1 extends javax.swing.JFrame {
     MongoCollection<Document> Reservation = new MongoConnection().obtenerDB().getCollection("Reservation");
    DefaultTableModel table = new DefaultTableModel() {

        @Override
        public boolean isCellEditable(int row, int column) {
            return false;
        }

    };

    /**
     * Creates new form FrmReservations
     */
    public FrmReservations1() {
        initComponents();
        //reservations=new ArrayList();
        //table=new DefaultTableModel();
        
        table.addColumn("Code");
        table.addColumn("ID");
        table.addColumn("Client Name");
        table.addColumn("Phone");
        table.addColumn("Event Name");
        table.addColumn("Date");
        table.addColumn("Payment Method");
        table.addColumn("Specs");
        
        tblReservations.setModel(table);
        toProject();
    }

      private void toProject() {
          MongoCursor<Document> query = Reservation.find().iterator();

        int total = table.getRowCount();
        for (int i = 0; i < total; i++) {
            table.removeRow(0);
        }
        while (query.hasNext()) {
            ArrayList<Object> doc = new ArrayList<Object>(query.next().values());
            table.addRow(doc.toArray());
        /*table.setNumRows(reservations.size());
        for (int i = 0; i <reservations.size(); i++) {
            table.setValueAt(reservations.get(i).getID(), i, 0);
            table.setValueAt(reservations.get(i).getClientName(), i, 1);
            table.setValueAt(reservations.get(i).getPhone(), i, 2);
            table.setValueAt(reservations.get(i).getEventName(), i, 3);
            table.setValueAt(reservations.get(i).getDate(), i, 4);
            table.setValueAt(reservations.get(i).getPaymentMethod(), i, 5);
            table.setValueAt(reservations.get(i).getSpecs(), i, 6);
        }
        tblReservations.setModel(table);*/
      }
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtSpecs = new javax.swing.JTextField();
        txtClientName = new javax.swing.JTextField();
        txtPhone = new javax.swing.JTextField();
        txtEventName = new javax.swing.JTextField();
        txtDate = new javax.swing.JTextField();
        txtPayment = new javax.swing.JTextField();
        btnAddR = new javax.swing.JButton();
        btnCancelR = new javax.swing.JButton();
        btnRemoveR = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblReservations = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        btnUpdateR = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("RESERVATIONS");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Client Name: ");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Phone: ");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Event Name: ");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Date:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Payment Method: ");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Specs: ");

        txtPhone.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPhoneKeyTyped(evt);
            }
        });

        txtEventName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtEventNameKeyTyped(evt);
            }
        });

        txtDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDateActionPerformed(evt);
            }
        });

        txtPayment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPaymentActionPerformed(evt);
            }
        });

        btnAddR.setBackground(new java.awt.Color(51, 153, 0));
        btnAddR.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnAddR.setText("Add");
        btnAddR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddRActionPerformed(evt);
            }
        });

        btnCancelR.setBackground(new java.awt.Color(204, 0, 0));
        btnCancelR.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnCancelR.setText("Cancel");
        btnCancelR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelRActionPerformed(evt);
            }
        });

        btnRemoveR.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnRemoveR.setText("Remove");
        btnRemoveR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveRActionPerformed(evt);
            }
        });

        tblReservations.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(tblReservations);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("ID");

        txtID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIDKeyTyped(evt);
            }
        });

        btnUpdateR.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnUpdateR.setText("Update");
        btnUpdateR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateRActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 711, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 12, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtSpecs))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(txtEventName))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(txtPayment, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(49, 49, 49)
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtClientName, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnAddR, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnUpdateR))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnRemoveR, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnCancelR, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(45, 45, 45))))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(190, 190, 190))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(txtClientName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3)
                        .addComponent(jLabel8)
                        .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtEventName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPayment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAddR)
                    .addComponent(btnRemoveR))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtSpecs, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnCancelR)
                        .addComponent(btnUpdateR)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDateActionPerformed

    private void txtPaymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPaymentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPaymentActionPerformed

    private void btnCancelRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelRActionPerformed
        FrmPrincipalCatering frmCateringPlanner = new FrmPrincipalCatering();
        frmCateringPlanner.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnCancelRActionPerformed

    private void btnRemoveRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveRActionPerformed
        /*if (tblReservations.getSelectedRow() < 0) {
            JOptionPane.showMessageDialog(null, "Select record to delete");
        } else {
            reservations.remove(tblReservations.getSelectedRow());
            toProject();
        }*/
                int renglon = tblReservations.getSelectedRow();
        if(renglon == -1){
            JOptionPane.showMessageDialog(this, "Error ");
            return;
        }
        String idRemove = tblReservations.getValueAt(renglon, 0).toString();
        int respuesta = JOptionPane.showConfirmDialog(this, "Remove ID"+ idRemove);
        if(respuesta == JOptionPane.OK_OPTION){
            boolean answerDelete = Delete(idRemove);
            if(answerDelete==true){
                JOptionPane.showMessageDialog(this, "Correct Delete");
            }else{
                JOptionPane.showMessageDialog(this, "No Delete");

            }
        }
        
    }//GEN-LAST:event_btnRemoveRActionPerformed

    private void btnAddRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddRActionPerformed
        /*if (!txtID.getText().equals("") && !txtClientName.getText().equals("") && !txtPhone.getText().equals("") && !txtEventName.getText().equals("") && !txtDate.getText().equals("") && !txtPayment.getText().equals("") && !txtSpecs.getText().equals("")) {
            Reservation reservation = new Reservation();
            reservation.setID(txtID.getText());
            reservation.setClientName(txtClientName.getText());
            reservation.setPhone(txtPhone.getText());
            reservation.setEventName(txtEventName.getText());
            reservation.setDate(txtDate.getText());
            reservation.setPaymentMethod(txtPayment.getText());
            reservation.setSpecs(txtSpecs.getText());
            reservations.add(reservation);
            txtID.setText("");
            txtClientName.setText("");
            txtPhone.setText("");
            txtEventName.setText("");
            txtDate.setText("");
            txtPayment.setText("");
            txtSpecs.setText("");
            toProject();

        } else {
            JOptionPane.showMessageDialog(null, "");
        }*/
                try {
            Document data;
            data = new Document() {};

            data.put("ID", txtID.getText());
            data.put("Client Name", txtClientName.getText());
            data.put("Phone",txtPhone.getText());
            data.put("Event Name", txtEventName.getText());
            data.put("Date", txtDate.getText());
            data.put("Payment Method", txtPayment.getText());
            data.put("Specs", txtSpecs.getText());

            Reservation.insertOne(data);
            JOptionPane.showMessageDialog(this,  "Reservations Added");

        } catch (Exception err) {
            JOptionPane.showMessageDialog(this, "Error: " + err.getMessage());
        }
    }//GEN-LAST:event_btnAddRActionPerformed

    private void btnUpdateRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateRActionPerformed
        // TODO add your handling code here:
         MongoCursor<Document> query = Reservation.find().iterator();
        
        int total = table.getRowCount();
        for(int i = 0; i<total; i++){
            table.removeRow(0);
        }
        while(query.hasNext()){
            ArrayList<Object> doc = new ArrayList<Object>(query.next().values());
            table.addRow(doc.toArray());
        }
    }//GEN-LAST:event_btnUpdateRActionPerformed

    private void txtPhoneKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPhoneKeyTyped
        // TODO add your handling code here:
                      if (evt.getKeyChar() >= 'a' && evt.getKeyChar() <= 'z') {
            JOptionPane.showMessageDialog(this, "This field must be only filled with numbers, enter again");
        } else if (evt.getKeyChar() == '.' || evt.getKeyChar() == '/' || evt.getKeyChar() == ',' || evt.getKeyChar() == '-'|| evt.getKeyChar() == '!'|| evt.getKeyChar() == '#'|| evt.getKeyChar() == '$'|| evt.getKeyChar() == '$'|| evt.getKeyChar() == '%'|| evt.getKeyChar() == '&'|| evt.getKeyChar() == '_'|| evt.getKeyChar() == ':'|| evt.getKeyChar() == ';'|| evt.getKeyChar() == '?'|| evt.getKeyChar() == '¿'|| evt.getKeyChar() == '('|| evt.getKeyChar() == ')'|| evt.getKeyChar() == '=') {
            JOptionPane.showMessageDialog(this, "This field must be only filled with numbers, enter again");

        } else{

            // do nothing
        }
    }//GEN-LAST:event_txtPhoneKeyTyped

    private void txtEventNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEventNameKeyTyped
        // TODO add your handling code here:
                      if (evt.getKeyChar() >= '0' && evt.getKeyChar() <= '9') {
            JOptionPane.showMessageDialog(this, "This field must be only filled with letters, enter again");
        } else if (evt.getKeyChar() == '.' || evt.getKeyChar() == '/' || evt.getKeyChar() == ',' || evt.getKeyChar() == '-'|| evt.getKeyChar() == '!'|| evt.getKeyChar() == '#'|| evt.getKeyChar() == '$'|| evt.getKeyChar() == '$'|| evt.getKeyChar() == '%'|| evt.getKeyChar() == '&'|| evt.getKeyChar() == '_'|| evt.getKeyChar() == ':'|| evt.getKeyChar() == ';'|| evt.getKeyChar() == '?'|| evt.getKeyChar() == '¿'|| evt.getKeyChar() == '('|| evt.getKeyChar() == ')'|| evt.getKeyChar() == '=') {
            JOptionPane.showMessageDialog(this, "This field must be only filled with letters, enter again");

        } else{

            // do nothing
        }
    }//GEN-LAST:event_txtEventNameKeyTyped

    private void txtIDKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIDKeyTyped
        // TODO add your handling code here:
                      if (evt.getKeyChar() >= 'a' && evt.getKeyChar() <= 'z') {
            JOptionPane.showMessageDialog(this, "This field must be only filled with numbers, enter again");
        } else if (evt.getKeyChar() == '.' || evt.getKeyChar() == '/' || evt.getKeyChar() == ',' || evt.getKeyChar() == '-'|| evt.getKeyChar() == '!'|| evt.getKeyChar() == '#'|| evt.getKeyChar() == '$'|| evt.getKeyChar() == '$'|| evt.getKeyChar() == '%'|| evt.getKeyChar() == '&'|| evt.getKeyChar() == '_'|| evt.getKeyChar() == ':'|| evt.getKeyChar() == ';'|| evt.getKeyChar() == '?'|| evt.getKeyChar() == '¿'|| evt.getKeyChar() == '('|| evt.getKeyChar() == ')'|| evt.getKeyChar() == '=') {
            JOptionPane.showMessageDialog(this, "This field must be only filled with numbers, enter again");

        } else{

            // do nothing
        }
    }//GEN-LAST:event_txtIDKeyTyped

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
            java.util.logging.Logger.getLogger(FrmReservations1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmReservations1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmReservations1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmReservations1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmReservations1().setVisible(true);
            }
        });
    }
    
        public boolean Delete(String id){
        DeleteResult answer = Reservation.deleteOne(new Document("_id", new ObjectId(id)));
        if(answer.getDeletedCount()==1){
            return true;
        }
        return false;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddR;
    private javax.swing.JButton btnCancelR;
    private javax.swing.JButton btnRemoveR;
    private javax.swing.JButton btnUpdateR;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable tblReservations;
    private javax.swing.JTextField txtClientName;
    private javax.swing.JTextField txtDate;
    private javax.swing.JTextField txtEventName;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtPayment;
    private javax.swing.JTextField txtPhone;
    private javax.swing.JTextField txtSpecs;
    // End of variables declaration//GEN-END:variables
}
  
