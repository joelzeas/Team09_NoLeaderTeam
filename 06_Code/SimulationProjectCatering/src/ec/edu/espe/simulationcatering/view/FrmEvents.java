package ec.edu.espe.simulationcatering.view;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.result.DeleteResult;
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
public class FrmEvents extends javax.swing.JFrame {

    //ArrayList<Event>events;
    //static int code=1;
    //DefaultTableModel table;
    MongoCollection<Document> Event = new MongoConnection().obtenerDB().getCollection("Event");
    DefaultTableModel table = new DefaultTableModel() {

        @Override
        public boolean isCellEditable(int row, int column) {
            return false;
        }

    };

    /**
     * Creates new form FrmEvents
     */
    public FrmEvents() {
        initComponents();
        //events=new ArrayList();
        //table=new DefaultTableModel();

        table.addColumn("Code");
        table.addColumn("ID");
        table.addColumn("Date");
        table.addColumn("Place");
        table.addColumn("Hour");
        table.addColumn("Guests");

        tblEvents.setModel(table);
        toProject();
    }

    public void toProject() {
        MongoCursor<Document> query = Event.find().iterator();

        int total = table.getRowCount();
        for (int i = 0; i < total; i++) {
            table.removeRow(0);
        }
        while (query.hasNext()) {
            ArrayList<Object> doc = new ArrayList<Object>(query.next().values());
            table.addRow(doc.toArray());
            /* table.setNumRows(events.size());
        for (int i = 0; i <events.size(); i++) {
            table.setValueAt(events.get(i).getID(), i, 0);
            table.setValueAt(events.get(i).getDate(), i, 1);
            table.setValueAt(events.get(i).getPlace(), i, 2);
            table.setValueAt(events.get(i).getHour(), i, 3);
            table.setValueAt(events.get(i).getGuests(), i, 4);

        }
        tblEvents.setModel(table);*/
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtDate = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtPlace = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtHour = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtGuests = new javax.swing.JTextField();
        btnCancelE = new javax.swing.JButton();
        btnRemoveE = new javax.swing.JButton();
        btnAddE = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblEvents = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        txtIDEvents = new javax.swing.JTextField();
        btnUpdateE = new javax.swing.JButton();

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
        setBackground(new java.awt.Color(0, 102, 102));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("EVENTS");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Date");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Place");

        txtPlace.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPlaceKeyTyped(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Hour");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Guests");

        txtGuests.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtGuestsKeyTyped(evt);
            }
        });

        btnCancelE.setBackground(new java.awt.Color(204, 0, 0));
        btnCancelE.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnCancelE.setText("Cancel");
        btnCancelE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelEActionPerformed(evt);
            }
        });

        btnRemoveE.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnRemoveE.setText("Remove");
        btnRemoveE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveEActionPerformed(evt);
            }
        });

        btnAddE.setBackground(new java.awt.Color(102, 204, 0));
        btnAddE.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnAddE.setText("Add");
        btnAddE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddEActionPerformed(evt);
            }
        });

        tblEvents.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(tblEvents);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("ID");

        txtIDEvents.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIDEventsKeyTyped(evt);
            }
        });

        btnUpdateE.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnUpdateE.setText("Update");
        btnUpdateE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateEActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(21, 21, 21)
                            .addComponent(txtIDEvents))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(txtHour))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(txtPlace))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(txtDate))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(btnAddE)
                                    .addGap(54, 54, 54)
                                    .addComponent(btnUpdateE)
                                    .addGap(39, 39, 39)
                                    .addComponent(btnRemoveE)
                                    .addGap(42, 42, 42)
                                    .addComponent(btnCancelE))
                                .addComponent(txtGuests, javax.swing.GroupLayout.PREFERRED_SIZE, 399, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(21, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(232, 232, 232))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtIDEvents, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtPlace, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtHour, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtGuests, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAddE)
                    .addComponent(btnRemoveE)
                    .addComponent(btnCancelE)
                    .addComponent(btnUpdateE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelEActionPerformed
        FrmPrincipalCatering frmCateringPlanner = new FrmPrincipalCatering();
        frmCateringPlanner.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnCancelEActionPerformed

    private void btnAddEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddEActionPerformed
        /*if (!txtID.getText().equals("") && !txtDate.getText().equals("") && !txtPlace.getText().equals("") && !txtHour.getText().equals("") && !txtGuests.getText().equals("")) {
            Event event = new Event();
            event.setID(txtID.getText());
            event.setDate(txtDate.getText());
            event.setPlace(txtPlace.getText());
            event.setHour(txtHour.getText());
            event.setGuests(txtGuests.getText());
            events.add(event);
            txtID.setText("");
            txtDate.setText("");
            txtPlace.setText("");
            txtHour.setText("");
            txtGuests.setText("");
            toProject();

        } else {
            JOptionPane.showMessageDialog(null, "");
        }*/
        try {
            Document data;
            data = new Document() {
            };

            data.put("ID", txtIDEvents.getText());
            data.put("Date", txtDate.getText());
            data.put("Place", txtPlace.getText());
            data.put("Hour", txtHour.getText());
            data.put("Guests", txtGuests.getText());

            Event.insertOne(data);
            JOptionPane.showMessageDialog(this, "Event Added");

        } catch (Exception err) {
            JOptionPane.showMessageDialog(this, "Error: " + err.getMessage());
        }
    }//GEN-LAST:event_btnAddEActionPerformed

    private void btnRemoveEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveEActionPerformed
        /*if (tblEvents.getSelectedRow() < 0) {
            JOptionPane.showMessageDialog(null, "Select record to delete");
        } else {
            events.remove(tblEvents.getSelectedRow());
            toProject();
        }*/
        int renglon = tblEvents.getSelectedRow();
        if (renglon == -1) {
            JOptionPane.showMessageDialog(this, "Error ");
            return;
        }
        String idRemove = tblEvents.getValueAt(renglon, 0).toString();
        int respuesta = JOptionPane.showConfirmDialog(this, "Remove ID" + idRemove);
        if (respuesta == JOptionPane.OK_OPTION) {
            boolean answerDelete = Delete(idRemove);
            if (answerDelete == true) {
                JOptionPane.showMessageDialog(this, "Correct Delete");
            } else {
                JOptionPane.showMessageDialog(this, "No Delete");

            }
        }
    }//GEN-LAST:event_btnRemoveEActionPerformed

    private void btnUpdateEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateEActionPerformed
        // TODO add your handling code here:
        MongoCursor<Document> query = Event.find().iterator();

        int total = table.getRowCount();
        for (int i = 0; i < total; i++) {
            table.removeRow(0);
        }
        while (query.hasNext()) {
            ArrayList<Object> doc = new ArrayList<Object>(query.next().values());
            table.addRow(doc.toArray());
        }
    }//GEN-LAST:event_btnUpdateEActionPerformed

    private void txtIDEventsKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIDEventsKeyTyped
        if (evt.getKeyChar() >= '0' && evt.getKeyChar() <= '9') {

        } else {

            JOptionPane.showMessageDialog(this, "This field must be only filled with numbers, enter again");
            String space = "";
            char blankSpace = space.charAt(0);
            evt.setKeyChar(blankSpace);
        }
    }//GEN-LAST:event_txtIDEventsKeyTyped

    private void txtPlaceKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPlaceKeyTyped
        // TODO add your handling code here:
        if (evt.getKeyChar() >= '0' && evt.getKeyChar() <= '9') {
            JOptionPane.showMessageDialog(this, "This field must be only filled with letters, enter again");
            String space = "";
            char blankSpace = space.charAt(0);
            evt.setKeyChar(blankSpace);
        } else if (evt.getKeyChar() == '.' || evt.getKeyChar() == '/' || evt.getKeyChar() == ',' || evt.getKeyChar() == '-' || evt.getKeyChar() == '!' || evt.getKeyChar() == '#' || evt.getKeyChar() == '$' || evt.getKeyChar() == '$' || evt.getKeyChar() == '%' || evt.getKeyChar() == '&' || evt.getKeyChar() == '_' || evt.getKeyChar() == ':' || evt.getKeyChar() == ';' || evt.getKeyChar() == '?' || evt.getKeyChar() == '¿' || evt.getKeyChar() == '(' || evt.getKeyChar() == ')' || evt.getKeyChar() == '=') {
            JOptionPane.showMessageDialog(this, "This field must be only filled with letters, enter again");
            String space = "";
            char blankSpace = space.charAt(0);
            evt.setKeyChar(blankSpace);

        } else {

            // do nothing
        }
    }//GEN-LAST:event_txtPlaceKeyTyped

    private void txtGuestsKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtGuestsKeyTyped
        if (evt.getKeyChar() >= '0' && evt.getKeyChar() <= '9') {

        } else {

            JOptionPane.showMessageDialog(this, "This field must be only filled with numbers, enter again");
            String space = "";
            char blankSpace = space.charAt(0);
            evt.setKeyChar(blankSpace);
        }
    }//GEN-LAST:event_txtGuestsKeyTyped

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
            java.util.logging.Logger.getLogger(FrmEvents.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmEvents.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmEvents.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmEvents.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmEvents().setVisible(true);
            }
        });
    }

    public boolean Delete(String id) {
        DeleteResult answer = Event.deleteOne(new Document("_id", new ObjectId(id)));
        if (answer.getDeletedCount() == 1) {
            return true;
        }
        return false;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddE;
    private javax.swing.JButton btnCancelE;
    private javax.swing.JButton btnRemoveE;
    private javax.swing.JButton btnUpdateE;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable tblEvents;
    private javax.swing.JTextField txtDate;
    private javax.swing.JTextField txtGuests;
    private javax.swing.JTextField txtHour;
    private javax.swing.JTextField txtIDEvents;
    private javax.swing.JTextField txtPlace;
    // End of variables declaration//GEN-END:variables
}
