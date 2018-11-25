
import com.mysql.jdbc.exceptions.MySQLIntegrityConstraintViolationException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class mainScreen extends javax.swing.JFrame {

    private static DB db = new DB();
    private static TableRowSorter sorterOrder;
    private static TableRowSorter sorterCustomer;

    public mainScreen() {
        initComponents();
        refreshCustomerTable();
        refreshOrderTable();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnAddC = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableCustomers = new javax.swing.JTable();
        btnEditC = new javax.swing.JButton();
        btnDeleteC = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableOrders = new javax.swing.JTable();
        btnAddOrder = new javax.swing.JButton();
        btnOnTheWay = new javax.swing.JButton();
        btnDone = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        comboBoxOrders = new javax.swing.JComboBox<>();
        jPanel5 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        textSearchName = new javax.swing.JTextField();
        textSearchSurname = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("CUSTOMERS"));

        btnAddC.setText("ADD");
        btnAddC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddCActionPerformed(evt);
            }
        });

        tableCustomers.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tableCustomers);

        btnEditC.setText("EDIT");
        btnEditC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditCActionPerformed(evt);
            }
        });

        btnDeleteC.setText("DELETE");
        btnDeleteC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteCActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnAddC)
                        .addGap(87, 87, 87)
                        .addComponent(btnEditC)
                        .addGap(76, 76, 76)
                        .addComponent(btnDeleteC))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAddC)
                    .addComponent(btnEditC)
                    .addComponent(btnDeleteC))
                .addGap(55, 55, 55))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("ORDERS"));

        tableOrders.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(tableOrders);
        if (tableOrders.getColumnModel().getColumnCount() > 0) {
            tableOrders.getColumnModel().getColumn(0).setMaxWidth(10);
            tableOrders.getColumnModel().getColumn(1).setMaxWidth(20);
        }

        btnAddOrder.setText("ADD ORDER");
        btnAddOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddOrderActionPerformed(evt);
            }
        });

        btnOnTheWay.setText("ON THE WAY");
        btnOnTheWay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOnTheWayActionPerformed(evt);
            }
        });

        btnDone.setText("DONE");
        btnDone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDoneActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnAddOrder)
                        .addGap(88, 88, 88)
                        .addComponent(btnOnTheWay)
                        .addGap(94, 94, 94)
                        .addComponent(btnDone)
                        .addGap(0, 98, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAddOrder)
                    .addComponent(btnOnTheWay)
                    .addComponent(btnDone))
                .addContainerGap(61, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Table Operations"));

        jButton1.setText("Delete Selected");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Delete Finished Orders");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        comboBoxOrders.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "All Orders", "Todays Orders", "Open Orders", "Finished Orders" }));
        comboBoxOrders.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxOrdersActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jButton1)
                .addGap(24, 24, 24)
                .addComponent(jButton2)
                .addGap(55, 55, 55)
                .addComponent(comboBoxOrders, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(comboBoxOrders, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Search"));

        jButton3.setText("Search");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(textSearchName)
                .addGap(36, 36, 36)
                .addComponent(textSearchSurname)
                .addGap(18, 18, 18)
                .addComponent(jButton3)
                .addGap(76, 76, 76))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textSearchName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addComponent(textSearchSurname, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public static void refreshCustomerTable() {
        DefaultTableModel dtm = new DefaultTableModel();
        dtm.addColumn("ID");
        dtm.addColumn("NAME");
        dtm.addColumn("SURNAME");
        dtm.addColumn("TEL.");
        dtm.addColumn("ADRES");

        try {
            String query = "select *from customers";
            ResultSet rs = db.connect().executeQuery(query);
            while (rs.next()) {
                String id = rs.getString("id");
                String name = rs.getString("name");
                String surname = rs.getString("surname");
                String telephone = rs.getString("telephone");
                String adres = rs.getString("adres");

                dtm.addRow(new String[]{id, name, surname, telephone, adres});

            }
            tableCustomers.setModel(dtm);
            sorterCustomer = new TableRowSorter<DefaultTableModel>(dtm);
            tableCustomers.setRowSorter(sorterCustomer);
        } catch (Exception e) {
            System.err.println("Data Getirme Hatası : " + e);
        }
    }

    public static void refreshOrderTable() {
        DefaultTableModel dtm1 = new DefaultTableModel();
        dtm1.addColumn("ID");
        dtm1.addColumn("NAME");
        dtm1.addColumn("SURNAME");
        dtm1.addColumn("ADRES");
        dtm1.addColumn("AMOUNT");
        dtm1.addColumn("STATUS");
        dtm1.addColumn("ORDER DATE");

        try {
            String query = "SELECT orders.id, customers.name, customers.surname, customers.adres, orders.amount, orders.status, date(orders.createdAt) as createdAt FROM susatis.orders JOIN customers ON orders.cid = customers.id";
            ResultSet rs = db.connect().executeQuery(query);
            while (rs.next()) {
                String id = rs.getString("id");
                String name = rs.getString("name");
                String surname = rs.getString("surname");
                String adres = rs.getString("adres");
                String amount = rs.getString("amount");
                String status = rs.getString("status");
                String createdAt = rs.getString("createdAt");

                dtm1.addRow(new String[]{id, name, surname, adres, amount, status, createdAt});

            }
            tableOrders.setModel(dtm1);
            sorterOrder = new TableRowSorter<DefaultTableModel>(dtm1);
            tableOrders.setRowSorter(sorterOrder);
        } catch (Exception e) {
            System.err.println("Data Error : " + e);
        }

    }

    private void btnAddCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddCActionPerformed

        CustomerView add = new CustomerView();
        add.setVisible(true);

    }//GEN-LAST:event_btnAddCActionPerformed
    String id = "";
    private void btnDeleteCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteCActionPerformed
        int row = tableCustomers.getSelectedRow();
        if (row == -1) {
            JOptionPane.showMessageDialog(rootPane, "Please select a customer");
        } else {
            int result = JOptionPane.showConfirmDialog(rootPane, "Are you sure", "Delete Customer", JOptionPane.YES_NO_OPTION);
            if (result == JOptionPane.YES_OPTION) {
                String id = (String) tableCustomers.getValueAt(row, 0);
                try {
                    String query = "DELETE FROM `customers` WHERE `customers`.`id` = " + id + "";
                    int sonuc = db.connect().executeUpdate(query);
                    if (sonuc > 0) {
                        refreshCustomerTable();
                        id = "";
                    }
                } catch (SQLException e) {
                    System.out.println("Delete Error : " + e);
                    JOptionPane.showMessageDialog(rootPane, "Customer has order. You can not delete", "Delete Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
    }//GEN-LAST:event_btnDeleteCActionPerformed

    private void btnEditCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditCActionPerformed
        int row = tableCustomers.getSelectedRow();
        if (row == -1) {
            JOptionPane.showMessageDialog(rootPane, "Please select a customer");
        } else {
            String id = (String) tableCustomers.getValueAt(row, 0);
            String name = (String) tableCustomers.getValueAt(row, 1);
            String surname = (String) tableCustomers.getValueAt(row, 2);
            String telephone = (String) tableCustomers.getValueAt(row, 3);
            String adres = (String) tableCustomers.getValueAt(row, 4);

            CustomerView add = new CustomerView(id, name, surname, telephone, adres);
            add.setVisible(true);
        }
    }//GEN-LAST:event_btnEditCActionPerformed

    private void btnAddOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddOrderActionPerformed
        int row = tableCustomers.getSelectedRow();
        if (row == -1) {
            JOptionPane.showMessageDialog(rootPane, "Please select a customer");
        } else {
            String id = (String) tableCustomers.getValueAt(row, 0);
            String name = (String) tableCustomers.getValueAt(row, 1);
            String surname = (String) tableCustomers.getValueAt(row, 2);
            String adres = (String) tableCustomers.getValueAt(row, 4);

            OrderView addOrder = new OrderView(id, name, surname, adres);
            addOrder.setVisible(true);
        }


    }//GEN-LAST:event_btnAddOrderActionPerformed

    private void btnOnTheWayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOnTheWayActionPerformed
        int row = tableOrders.getSelectedRow();
        if (row == -1) {
            JOptionPane.showMessageDialog(rootPane, "Please select a order");
        } else {
            String id = (String) tableOrders.getValueAt(row, 0);
            try {
                String query = String.format("update orders Set status = '%s' where id = %s", "On The Way", id);
                int result = db.connect().executeUpdate(query);
                if (result <= 0) {
                    JOptionPane.showMessageDialog(rootPane, "Failure");
                }

            } catch (Exception e) {
                System.out.println("Update Error : " + e);
            }
        }
        refreshOrderTable();
    }//GEN-LAST:event_btnOnTheWayActionPerformed

    private void btnDoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDoneActionPerformed
        int row = tableOrders.getSelectedRow();
        if (row == -1) {
            JOptionPane.showMessageDialog(rootPane, "Please select a order");
        } else {
            String id = (String) tableOrders.getValueAt(row, 0);
            try {
                String query = String.format("update orders Set status = '%s' where id = %s", "Done", id);
                int result = db.connect().executeUpdate(query);
                if (result <= 0) {
                    JOptionPane.showMessageDialog(rootPane, "Failure");
                }

            } catch (Exception e) {
                System.out.println("Update Error : " + e);
            }
        }
        refreshOrderTable();

    }//GEN-LAST:event_btnDoneActionPerformed

    private void comboBoxOrdersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxOrdersActionPerformed

        String orderFilter = String.valueOf(comboBoxOrders.getSelectedItem());

        if (orderFilter.equals("Finished Orders")) {

            RowFilter<DefaultTableModel, Object> rf = RowFilter.regexFilter("Done", 5);
            sorterOrder.setRowFilter(rf);

        } else if (orderFilter.equals("Open Orders")) {
            RowFilter<DefaultTableModel, Object> rf = RowFilter.regexFilter("Preparing|On The Way", 5);
            sorterOrder.setRowFilter(rf);

        } else if (orderFilter.equals("All Orders")) {
            sorterOrder.setRowFilter(null);

        } else if (orderFilter.equals("Todays Orders")) {
            Date date = new Date();
            String today = new SimpleDateFormat("yyyy-MM-dd").format(date);
            RowFilter<DefaultTableModel, Object> rf = RowFilter.regexFilter(today, 6);
            sorterOrder.setRowFilter(rf);
        }
    }//GEN-LAST:event_comboBoxOrdersActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        int result = JOptionPane.showConfirmDialog(rootPane, "Are you sure", "Delete All Order", JOptionPane.YES_NO_OPTION);
        if (result == JOptionPane.YES_OPTION) {
            try {
                String query = "DELETE FROM `orders` where status = 'Done'";
                int dbResult = db.connect().executeUpdate(query);
                refreshOrderTable();

            } catch (SQLException e) {
                System.out.println("Delete Error : " + e);
            }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int row = tableOrders.getSelectedRow();
        if (row == -1) {
            JOptionPane.showMessageDialog(rootPane, "Please select a order");
        } else {
            int result = JOptionPane.showConfirmDialog(rootPane, "Are you sure", "Delete Order", JOptionPane.YES_NO_OPTION);
            if (result == JOptionPane.YES_OPTION) {
                String id = (String) tableOrders.getValueAt(row, 0);
                try {
                    String query = "DELETE FROM `orders` WHERE `orders`.`id` = " + id + "";
                    int sonuc = db.connect().executeUpdate(query);
                    refreshOrderTable();
                } catch (SQLException e) {
                    System.out.println("Delete Error : " + e);
                    JOptionPane.showMessageDialog(rootPane, "Customer has order. You can not delete", "Delete Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
            String searchName = textSearchName.getText().trim();
            String searchSurname = textSearchSurname.getText().trim();

            RowFilter<DefaultTableModel, Object> rf1 = RowFilter.regexFilter(searchName, 1);
            RowFilter<DefaultTableModel, Object> rf2 = RowFilter.regexFilter(searchSurname, 2);
            
            ArrayList<RowFilter<DefaultTableModel, Object>> filters = new ArrayList<RowFilter<DefaultTableModel, Object>>();
            filters.add(rf1);
            filters.add(rf2);
            
            RowFilter<DefaultTableModel, Object> rf = RowFilter.andFilter(filters);
            
            sorterCustomer.setRowFilter(rf);
        
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(mainScreen.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mainScreen.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mainScreen.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mainScreen.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mainScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddC;
    private javax.swing.JButton btnAddOrder;
    private javax.swing.JButton btnDeleteC;
    private javax.swing.JButton btnDone;
    private javax.swing.JButton btnEditC;
    private javax.swing.JButton btnOnTheWay;
    private javax.swing.JComboBox<String> comboBoxOrders;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private static javax.swing.JTable tableCustomers;
    private static javax.swing.JTable tableOrders;
    private javax.swing.JTextField textSearchName;
    private javax.swing.JTextField textSearchSurname;
    // End of variables declaration//GEN-END:variables
}
