
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
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
        btnEditC = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableCustomers = new javax.swing.JTable();
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
        setTitle("SALES MANAGER TOOL");
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("CUSTOMERS"));

        btnAddC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/add.png"))); // NOI18N
        btnAddC.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnAddC.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAddC.setPreferredSize(new java.awt.Dimension(55, 55));
        btnAddC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddCActionPerformed(evt);
            }
        });

        btnEditC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/edit.png"))); // NOI18N
        btnEditC.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEditC.setMaximumSize(new java.awt.Dimension(51, 51));
        btnEditC.setMinimumSize(new java.awt.Dimension(51, 51));
        btnEditC.setPreferredSize(new java.awt.Dimension(55, 55));
        btnEditC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditCActionPerformed(evt);
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
        tableCustomers.setPreferredSize(null);
        jScrollPane1.setViewportView(tableCustomers);
        if (tableCustomers.getColumnModel().getColumnCount() > 0) {
            tableCustomers.getColumnModel().getColumn(0).setPreferredWidth(8);
        }

        btnDeleteC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/delete.png"))); // NOI18N
        btnDeleteC.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnDeleteC.setMaximumSize(new java.awt.Dimension(51, 51));
        btnDeleteC.setMinimumSize(new java.awt.Dimension(51, 51));
        btnDeleteC.setPreferredSize(new java.awt.Dimension(56, 56));
        btnDeleteC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteCActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(163, 163, 163)
                .addComponent(btnAddC, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEditC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDeleteC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jScrollPane1)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnAddC, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnDeleteC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnEditC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(1, 1, 1)))
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("ORDERS"));
        jPanel2.setPreferredSize(new java.awt.Dimension(465, 91));

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
        tableOrders.setPreferredSize(null);
        jScrollPane2.setViewportView(tableOrders);
        if (tableOrders.getColumnModel().getColumnCount() > 0) {
            tableOrders.getColumnModel().getColumn(0).setMaxWidth(10);
            tableOrders.getColumnModel().getColumn(1).setMaxWidth(20);
        }

        btnAddOrder.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/addorder.png"))); // NOI18N
        btnAddOrder.setMaximumSize(new java.awt.Dimension(51, 51));
        btnAddOrder.setMinimumSize(new java.awt.Dimension(51, 51));
        btnAddOrder.setPreferredSize(new java.awt.Dimension(55, 55));
        btnAddOrder.setRequestFocusEnabled(false);
        btnAddOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddOrderActionPerformed(evt);
            }
        });

        btnOnTheWay.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/ontheway.png"))); // NOI18N
        btnOnTheWay.setPreferredSize(new java.awt.Dimension(55, 55));
        btnOnTheWay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOnTheWayActionPerformed(evt);
            }
        });

        btnDone.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/finished.png"))); // NOI18N
        btnDone.setPreferredSize(new java.awt.Dimension(55, 55));
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
                .addGap(139, 139, 139)
                .addComponent(btnAddOrder, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnOnTheWay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAddOrder, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnOnTheWay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addComponent(jButton1)
                .addGap(53, 53, 53)
                .addComponent(jButton2)
                .addGap(52, 52, 52)
                .addComponent(comboBoxOrders, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(comboBoxOrders, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Search"));

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/search.png"))); // NOI18N
        jButton3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton3.setPreferredSize(new java.awt.Dimension(39, 39));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        textSearchName.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Name", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP));
        textSearchName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textSearchNameActionPerformed(evt);
            }
        });

        textSearchSurname.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Surname", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(textSearchName, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(textSearchSurname, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(textSearchName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(textSearchSurname, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 466, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 456, Short.MAX_VALUE)))
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
            System.err.println("Data Error : " + e);
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
    String id = "";
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
        refreshOrderTable();

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

        int result = JOptionPane.showConfirmDialog(rootPane, "Are you sure", "Delete Finished Orders", JOptionPane.YES_NO_OPTION);
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

    private void btnAddCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddCActionPerformed

        CustomerView add = new CustomerView();
        add.setVisible(true);
    }//GEN-LAST:event_btnAddCActionPerformed

    private void textSearchNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textSearchNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textSearchNameActionPerformed

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
