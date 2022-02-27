package ec.edu.espe.simulationcatering.view;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.result.DeleteResult;
import ec.edu.espe.simulationcatering.model.Transport;
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
public class FrmTransport extends javax.swing.JFrame {

    MongoCollection<Document> Transport = new MongoConnection().obtenerDB().getCollection("Transport");
    DefaultTableModel table = new DefaultTableModel() {

        @Override
        public boolean isCellEditable(int row, int column) {
            return false;
        }

    };

    public FrmTransport() {
        initComponents();
        //transports=new ArrayList();
        //table=new DefaultTableModel();

        table.addColumn("Code");
        table.addColumn("ID");
        table.addColumn("Enrollment");
        table.addColumn("Driver Name");
        table.addColumn("Type");
        table.addColumn("Freight Capacity");
        table.addColumn("Destination");
        table.addColumn("Travel Time");
        table.addColumn("Gallons Gasoline");

        tblTransport.setModel(table);
        toProject();
    }

    private void toProject() {
        MongoCursor<Document> query = Transport.find().iterator();

        int total = table.getRowCount();
        for (int i = 0; i < total; i++) {
            table.removeRow(0);
        }
        while (query.hasNext()) {
            ArrayList<Object> doc = new ArrayList<Object>(query.next().values());
            table.addRow(doc.toArray());
            /*table.setNumRows(transports.size());
        for (int i = 0; i <transports.size(); i++) {
            table.setValueAt(transports.get(i).getID(), i, 0);
            table.setValueAt(transports.get(i).getEnrollment(), i, 1);
            table.setValueAt(transports.get(i).getDrivername(), i, 2);
            table.setValueAt(transports.get(i).getTypeTransport(), i, 3);
            table.setValueAt(transports.get(i).getFreightCapacity(), i, 4);
            table.setValueAt(transports.get(i).getDestination(), i, 5);
            table.setValueAt(transports.get(i).getTravelTime(), i, 6);
            table.setValueAt(transports.get(i).getGallonsgasoline(), i, 7);

        }
        tblTransport.setModel(table);*/
        }
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtDriverName = new javax.swing.JTextField();
        txtEnrollment = new javax.swing.JTextField();
        txtType = new javax.swing.JTextField();
        txtCapacity = new javax.swing.JTextField();
        txtDestination = new javax.swing.JTextField();
        txtTravelTime = new javax.swing.JTextField();
        txtGallonsGasoline = new javax.swing.JTextField();
        btnAddT = new javax.swing.JButton();
        btnCancelT = new javax.swing.JButton();
        btnRemoveR = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblTransport = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        btnUpdateT = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("TRANSPORT");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Driver Name: ");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Enrollment:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Type: ");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Freight Capacity: ");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Destination: ");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Travel Time:");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("Gallons of Gasoline:");

        txtDriverName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDriverNameActionPerformed(evt);
            }
        });
        txtDriverName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDriverNameKeyTyped(evt);
            }
        });

        txtDestination.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDestinationKeyTyped(evt);
            }
        });

        txtGallonsGasoline.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtGallonsGasolineKeyTyped(evt);
            }
        });

        btnAddT.setBackground(new java.awt.Color(102, 204, 0));
        btnAddT.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnAddT.setText("Add");
        btnAddT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddTActionPerformed(evt);
            }
        });

        btnCancelT.setBackground(new java.awt.Color(153, 0, 0));
        btnCancelT.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnCancelT.setText("Cancel");
        btnCancelT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelTActionPerformed(evt);
            }
        });

        btnRemoveR.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnRemoveR.setText("Remove");
        btnRemoveR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveRActionPerformed(evt);
            }
        });

        tblTransport.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tblTransport);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("ID");

        txtID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIDKeyTyped(evt);
            }
        });

        btnUpdateT.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnUpdateT.setText("Update");
        btnUpdateT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateTActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtType, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(39, 39, 39)
                                        .addComponent(jLabel5))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel2)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtEnrollment)
                            .addComponent(txtCapacity)
                            .addComponent(txtDriverName)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtDestination))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnUpdateT)
                                        .addGap(77, 77, 77)
                                        .addComponent(btnAddT))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtTravelTime, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(11, 11, 11)
                                        .addComponent(jLabel8)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtGallonsGasoline)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(89, 89, 89)
                                        .addComponent(btnRemoveR)
                                        .addGap(84, 84, 84)
                                        .addComponent(btnCancelT)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 88, Short.MAX_VALUE))))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(192, 192, 192)))
                .addGap(31, 31, 31))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtEnrollment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDriverName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCapacity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(txtType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDestination, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtTravelTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(txtGallonsGasoline, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAddT)
                    .addComponent(btnRemoveR)
                    .addComponent(btnCancelT)
                    .addComponent(btnUpdateT))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(46, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtDriverNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDriverNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDriverNameActionPerformed

    private void btnCancelTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelTActionPerformed
        FrmPrincipalCatering frmCateringPlanner = new FrmPrincipalCatering();
        frmCateringPlanner.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnCancelTActionPerformed

    private void btnRemoveRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveRActionPerformed
        int renglon = tblTransport.getSelectedRow();
        if (renglon == -1) {
            JOptionPane.showMessageDialog(this, "Error ");
            return;
        }
        String idRemove = tblTransport.getValueAt(renglon, 0).toString();
        int respuesta = JOptionPane.showConfirmDialog(this, "Remove ID" + idRemove);
        if (respuesta == JOptionPane.OK_OPTION) {
            boolean answerDelete = Delete(idRemove);
            if (answerDelete == true) {
                JOptionPane.showMessageDialog(this, "Correct Delete");
            } else {
                JOptionPane.showMessageDialog(this, "No Delete");

            }
        }
    }//GEN-LAST:event_btnRemoveRActionPerformed

    private void btnAddTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddTActionPerformed
        try {
            Document data;
            data = new Document() {
            };

            data.put("ID", txtID.getText());
            data.put("Enrollment", txtEnrollment.getText());
            data.put("Driver Name", txtDriverName.getText());
            data.put("Type", txtType.getText());
            data.put("Freight Capacity", txtCapacity.getText());
            data.put("Destination", txtDestination.getText());
            data.put("Travel Time", txtTravelTime.getText());
            data.put("Gallons Gasoline", txtGallonsGasoline.getText());

            Transport.insertOne(data);
            JOptionPane.showMessageDialog(this, "Transports Added");

            int gallonsGasoline = Integer.parseInt(txtGallonsGasoline.getText());
            float priceOfGasoline = (float) ((2.55) * gallonsGasoline);
            JOptionPane.showMessageDialog(this, "The price of " + txtGallonsGasoline.getText() + " gallons of gasoline is approximately $ " + priceOfGasoline);

        } catch (Exception err) {
            JOptionPane.showMessageDialog(this, "Error: " + err.getMessage());
        }
    }//GEN-LAST:event_btnAddTActionPerformed

    private void btnUpdateTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateTActionPerformed
        // TODO add your handling code here:
        MongoCursor<Document> query = Transport.find().iterator();

        int total = table.getRowCount();
        for (int i = 0; i < total; i++) {
            table.removeRow(0);
        }
        while (query.hasNext()) {
            ArrayList<Object> doc = new ArrayList<Object>(query.next().values());
            table.addRow(doc.toArray());
        }
    }//GEN-LAST:event_btnUpdateTActionPerformed

    private void txtIDKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIDKeyTyped
        if (evt.getKeyChar() >= '0' && evt.getKeyChar() <= '9') {

        } else {

            JOptionPane.showMessageDialog(this, "This field must be only filled with numbers, enter again");
            String space = "";
            char blankSpace = space.charAt(0);
            evt.setKeyChar(blankSpace);
        }
    }//GEN-LAST:event_txtIDKeyTyped

    private void txtDestinationKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDestinationKeyTyped
        // TODO add your handling code here:
        String space = "";
        char blankSpace = space.charAt(0);
        if (evt.getKeyChar() >= '0' && evt.getKeyChar() <= '9') {
            JOptionPane.showMessageDialog(this, "This field must be only filled with letters, enter again");
            evt.setKeyChar(blankSpace);
        } else if (evt.getKeyChar() == '.' || evt.getKeyChar() == '/' || evt.getKeyChar() == ',' || evt.getKeyChar() == '-' || evt.getKeyChar() == '!' || evt.getKeyChar() == '#' || evt.getKeyChar() == '$' || evt.getKeyChar() == '$' || evt.getKeyChar() == '%' || evt.getKeyChar() == '&' || evt.getKeyChar() == '_' || evt.getKeyChar() == ':' || evt.getKeyChar() == ';' || evt.getKeyChar() == '?' || evt.getKeyChar() == '¿' || evt.getKeyChar() == '(' || evt.getKeyChar() == ')' || evt.getKeyChar() == '=') {
            JOptionPane.showMessageDialog(this, "This field must be only filled with letters, enter again");
            evt.setKeyChar(blankSpace);

        } else {

            // do nothing
        }
    }//GEN-LAST:event_txtDestinationKeyTyped

    private void txtGallonsGasolineKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtGallonsGasolineKeyTyped
        // TODO add your handling code here:
        if (evt.getKeyChar() >= '0' && evt.getKeyChar() <= '9') {

        } else {

            JOptionPane.showMessageDialog(this, "This field must be only filled with numbers, enter again");
            String space = "";
            char blankSpace = space.charAt(0);
            evt.setKeyChar(blankSpace);
        }
    }//GEN-LAST:event_txtGallonsGasolineKeyTyped

    private void txtDriverNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDriverNameKeyTyped
        String space = "";
        char blankSpace = space.charAt(0);
        if (evt.getKeyChar() >= '0' && evt.getKeyChar() <= '9') {
            JOptionPane.showMessageDialog(this, "This field must be only filled with letters, enter again");
            evt.setKeyChar(blankSpace);
        } else if (evt.getKeyChar() == '.' || evt.getKeyChar() == '/' || evt.getKeyChar() == ',' || evt.getKeyChar() == '-' || evt.getKeyChar() == '!' || evt.getKeyChar() == '#' || evt.getKeyChar() == '$' || evt.getKeyChar() == '$' || evt.getKeyChar() == '%' || evt.getKeyChar() == '&' || evt.getKeyChar() == '_' || evt.getKeyChar() == ':' || evt.getKeyChar() == ';' || evt.getKeyChar() == '?' || evt.getKeyChar() == '¿' || evt.getKeyChar() == '(' || evt.getKeyChar() == ')' || evt.getKeyChar() == '=') {
            JOptionPane.showMessageDialog(this, "This field must be only filled with letters, enter again");
            evt.setKeyChar(blankSpace);

        } else {

            // do nothing
        }
    }//GEN-LAST:event_txtDriverNameKeyTyped

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
            java.util.logging.Logger.getLogger(FrmTransport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmTransport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmTransport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmTransport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmTransport().setVisible(true);
            }
        });
    }

    public boolean Delete(String id) {
        DeleteResult answer = Transport.deleteOne(new Document("_id", new ObjectId(id)));
        if (answer.getDeletedCount() == 1) {
            return true;
        }
        return false;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddT;
    private javax.swing.JButton btnCancelT;
    private javax.swing.JButton btnRemoveR;
    private javax.swing.JButton btnUpdateT;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblTransport;
    private javax.swing.JTextField txtCapacity;
    private javax.swing.JTextField txtDestination;
    private javax.swing.JTextField txtDriverName;
    private javax.swing.JTextField txtEnrollment;
    private javax.swing.JTextField txtGallonsGasoline;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtTravelTime;
    private javax.swing.JTextField txtType;
    // End of variables declaration//GEN-END:variables

}
