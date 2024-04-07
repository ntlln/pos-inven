package src;

import db.connect;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Allen Caingcoy
 */
public class soldframe extends javax.swing.JFrame {

    public static boolean dataUpdate = true;

    public soldframe() {
        initComponents();
        retrieveData();
        retrieveRefundData();
        retrieveReturnData();
    }

    void retrieveData() {
        DefaultTableModel model = (DefaultTableModel) soldList.getModel();
        model.setRowCount(0);

        String url = connect.url;
        String user = connect.user;
        String password = connect.password;

        double totalSales = 0.0;
        String formattedPrice = "";

        try (Connection connection = DriverManager.getConnection(url, user, password)) {
            String query = "SELECT * FROM salesTable";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            ResultSet resultSet = preparedStatement.executeQuery();

            DecimalFormat decimalFormat = new DecimalFormat("#,##0.00");

            while (resultSet.next()) {
                int id = resultSet.getInt("ID");
                String product = resultSet.getString("Product");
                String developer = resultSet.getString("Developer");
                int quantity = resultSet.getInt("Quantity");
                double price = resultSet.getDouble("Sold");
                String doats = resultSet.getString("Date and Time Sold");

                String formattedPriceRow = "₱" + decimalFormat.format(price);

                if (quantity > 0) {
                    model.addRow(new Object[]{id, product, developer, quantity, formattedPriceRow, doats});
                }

                totalSales += price;
            }

            formattedPrice = "₱" + decimalFormat.format(totalSales);
            soldList.setModel(model);
            totalsaleslabel.setText(formattedPrice);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    void retrieveRefundData() {
        DefaultTableModel model = (DefaultTableModel) refundList.getModel();
        model.setRowCount(0);

        String url = connect.url;
        String user = connect.user;
        String password = connect.password;

        try (Connection connection = DriverManager.getConnection(url, user, password)) {
            String query = "SELECT * FROM actionTable WHERE Action = 'Refunded'";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                int id = resultSet.getInt("ID");
                String product = resultSet.getString("Product");
                String developer = resultSet.getString("Developer");
                int quantity = resultSet.getInt("Quantity");
                double price = resultSet.getDouble("Price");
                String datetime = resultSet.getString("Date and Time Sold");

                if (quantity > 0) {
                    model.addRow(new Object[]{id, product, developer, quantity, price, datetime});
                }
            }

            refundList.setModel(model);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    void retrieveReturnData() {
        DefaultTableModel model = (DefaultTableModel) returnList.getModel();
        model.setRowCount(0);

        String url = connect.url;
        String user = connect.user;
        String password = connect.password;

        try (Connection connection = DriverManager.getConnection(url, user, password)) {
            String query = "SELECT * FROM actionTable WHERE Action = 'Returned'";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                int id = resultSet.getInt("ID");
                String product = resultSet.getString("Product");
                String developer = resultSet.getString("Developer");
                int quantity = resultSet.getInt("Quantity");
                double price = resultSet.getDouble("Price");
                String datetime = resultSet.getString("Date and Time Sold");

                if (quantity > 0) {
                    model.addRow(new Object[]{id, product, developer, quantity, price, datetime});
                }
            }

            returnList.setModel(model);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        gamego = new javax.swing.JLabel();
        dashboardbutton = new javax.swing.JButton();
        inventorybutton = new javax.swing.JButton();
        shopbutton = new javax.swing.JButton();
        solditemsbutton = new javax.swing.JButton();
        outofstockbutton = new javax.swing.JButton();
        logoutbutton = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        totalsaleslabel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        soldList = new javax.swing.JTable();
        returnbutton = new javax.swing.JButton();
        refundbutton = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        returnList = new javax.swing.JTable();
        returndelete = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        refundList = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1080, 620));
        setMinimumSize(new java.awt.Dimension(1080, 620));
        setPreferredSize(new java.awt.Dimension(1080, 620));
        setResizable(false);
        setSize(new java.awt.Dimension(1080, 620));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(0, 255, 255));
        jPanel1.setMaximumSize(new java.awt.Dimension(200, 620));
        jPanel1.setMinimumSize(new java.awt.Dimension(200, 620));
        jPanel1.setPreferredSize(new java.awt.Dimension(200, 620));
        jPanel1.setSize(new java.awt.Dimension(200, 620));

        gamego.setFont(new java.awt.Font("Monaco", 0, 48)); // NOI18N
        gamego.setForeground(new java.awt.Color(51, 51, 51));
        gamego.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        gamego.setText("GameGo");

        dashboardbutton.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        dashboardbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rsc/dashboard.png"))); // NOI18N
        dashboardbutton.setText("Dashboard");
        dashboardbutton.setContentAreaFilled(false);
        dashboardbutton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        dashboardbutton.setIconTextGap(15);
        dashboardbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dashboardbuttonActionPerformed(evt);
            }
        });

        inventorybutton.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        inventorybutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rsc/inventory x32.png"))); // NOI18N
        inventorybutton.setText("Inventory");
        inventorybutton.setContentAreaFilled(false);
        inventorybutton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        inventorybutton.setIconTextGap(15);
        inventorybutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inventorybuttonActionPerformed(evt);
            }
        });

        shopbutton.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        shopbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rsc/shop x32.png"))); // NOI18N
        shopbutton.setText("Shop");
        shopbutton.setContentAreaFilled(false);
        shopbutton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        shopbutton.setIconTextGap(15);
        shopbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                shopbuttonActionPerformed(evt);
            }
        });

        solditemsbutton.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        solditemsbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rsc/sold x32.png"))); // NOI18N
        solditemsbutton.setText("Sold Items");
        solditemsbutton.setContentAreaFilled(false);
        solditemsbutton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        solditemsbutton.setIconTextGap(15);
        solditemsbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                solditemsbuttonActionPerformed(evt);
            }
        });

        outofstockbutton.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        outofstockbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rsc/soldout x32.png"))); // NOI18N
        outofstockbutton.setText("Out of Stock");
        outofstockbutton.setContentAreaFilled(false);
        outofstockbutton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        outofstockbutton.setIconTextGap(15);
        outofstockbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                outofstockbuttonActionPerformed(evt);
            }
        });

        logoutbutton.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        logoutbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rsc/logout x32.png"))); // NOI18N
        logoutbutton.setText("Logout");
        logoutbutton.setContentAreaFilled(false);
        logoutbutton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        logoutbutton.setIconTextGap(15);
        logoutbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutbuttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(gamego, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                    .addComponent(dashboardbutton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(inventorybutton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(shopbutton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(solditemsbutton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(outofstockbutton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(logoutbutton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(gamego, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(dashboardbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(inventorybutton, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(shopbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(solditemsbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(outofstockbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(logoutbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 200, 620);

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 255)));
        jPanel2.setMaximumSize(new java.awt.Dimension(1080, 620));
        jPanel2.setPreferredSize(new java.awt.Dimension(1080, 620));

        jPanel3.setBackground(new java.awt.Color(51, 51, 51));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 255)), "Sold", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Helvetica Neue", 0, 18), new java.awt.Color(0, 255, 255))); // NOI18N

        totalsaleslabel.setFont(new java.awt.Font("Monaco", 0, 18)); // NOI18N
        totalsaleslabel.setForeground(new java.awt.Color(0, 255, 255));
        totalsaleslabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        jLabel2.setFont(new java.awt.Font("Monaco", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Total Sales:");

        soldList.setAutoCreateRowSorter(true);
        soldList.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        soldList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Product", "Developer", "Quantity", "Sold", "Date and Time Sold"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        soldList.setRowHeight(30);
        soldList.setSelectionBackground(new java.awt.Color(0, 255, 255));
        jScrollPane1.setViewportView(soldList);

        returnbutton.setFont(new java.awt.Font("Monaco", 0, 14)); // NOI18N
        returnbutton.setForeground(new java.awt.Color(0, 255, 255));
        returnbutton.setText("Return");
        returnbutton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 255)));
        returnbutton.setContentAreaFilled(false);
        returnbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returnbuttonActionPerformed(evt);
            }
        });

        refundbutton.setFont(new java.awt.Font("Monaco", 0, 14)); // NOI18N
        refundbutton.setForeground(new java.awt.Color(0, 255, 255));
        refundbutton.setText("Refund");
        refundbutton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 255)));
        refundbutton.setContentAreaFilled(false);
        refundbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refundbuttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(295, Short.MAX_VALUE)
                .addComponent(refundbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(returnbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(totalsaleslabel, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addComponent(jScrollPane1)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(totalsaleslabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(returnbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(refundbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 521, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Sold", jPanel3);

        jPanel4.setBackground(new java.awt.Color(51, 51, 51));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 255)), "Returns", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Helvetica Neue", 0, 18), new java.awt.Color(0, 255, 255))); // NOI18N

        returnList.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        returnList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Product", "Developer", "Quantity", "Sold", "Date and Time Sold"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        returnList.setRowHeight(30);
        returnList.setSelectionBackground(new java.awt.Color(0, 255, 255));
        jScrollPane2.setViewportView(returnList);

        returndelete.setFont(new java.awt.Font("Monaco", 0, 14)); // NOI18N
        returndelete.setForeground(new java.awt.Color(255, 0, 0));
        returndelete.setText("DELETE");
        returndelete.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));
        returndelete.setContentAreaFilled(false);
        returndelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returndeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 868, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(returndelete, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addComponent(returndelete, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 521, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Return", jPanel4);

        jPanel5.setBackground(new java.awt.Color(51, 51, 51));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 255)), "Refunds", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Helvetica Neue", 0, 18), new java.awt.Color(0, 255, 255))); // NOI18N

        refundList.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        refundList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Product", "Developer", "Quantity", "Sold", "Date and TIme Sold"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        refundList.setRowHeight(30);
        refundList.setSelectionBackground(new java.awt.Color(0, 255, 255));
        jScrollPane3.setViewportView(refundList);

        jButton1.setFont(new java.awt.Font("Monaco", 0, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 0, 0));
        jButton1.setText("DELETE");
        jButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 868, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 515, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Refund", jPanel5);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        getContentPane().add(jPanel2);
        jPanel2.setBounds(200, 0, 880, 620);

        setSize(new java.awt.Dimension(1080, 648));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void dashboardbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dashboardbuttonActionPerformed
        dispose();
        dashboardframe dashboard = new dashboardframe();
        dashboard.setVisible(true);
    }//GEN-LAST:event_dashboardbuttonActionPerformed

    private void inventorybuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inventorybuttonActionPerformed
        dispose();
        inventoryframe inventory = new inventoryframe();
        inventory.setVisible(true);
    }//GEN-LAST:event_inventorybuttonActionPerformed

    private void shopbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_shopbuttonActionPerformed
        dispose();
        posframe pos = new posframe();
        pos.setVisible(true);
    }//GEN-LAST:event_shopbuttonActionPerformed

    private void solditemsbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_solditemsbuttonActionPerformed
        dispose();
        soldframe sold = new soldframe();
        sold.setVisible(true);
    }//GEN-LAST:event_solditemsbuttonActionPerformed

    private void outofstockbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_outofstockbuttonActionPerformed
        dispose();
        soldoutframe soldout = new soldoutframe();
        soldout.setVisible(true);
    }//GEN-LAST:event_outofstockbuttonActionPerformed

    private void logoutbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutbuttonActionPerformed
        int result = JOptionPane.showConfirmDialog(null, "Are you sure you want to logout? This will bring you back to login", "WARNING!", JOptionPane.YES_NO_OPTION);

        if (result == JOptionPane.YES_OPTION) {
            dispose();
            loginframe login = new loginframe();
            login.setVisible(true);
        } else {
        }
    }//GEN-LAST:event_logoutbuttonActionPerformed

    private void returnbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnbuttonActionPerformed
        int selectedRowIndex = soldList.getSelectedRow();

        String insertQuery = "INSERT INTO actionTable (ID, Product, Developer, Quantity, Price, `Date and Time Sold`, Action) VALUES (?, ?, ?, ?, ?, ?, ?)";
        try (PreparedStatement insertStatement = connect.getConnection().prepareStatement(insertQuery)) {
            int productID = (int) soldList.getValueAt(selectedRowIndex, 0);
            String productName = (String) soldList.getValueAt(selectedRowIndex, 1);
            String developer = (String) soldList.getValueAt(selectedRowIndex, 2);
            int quantityBought = (int) soldList.getValueAt(selectedRowIndex, 3);
            String totalSoldString = (String) soldList.getValueAt(selectedRowIndex, 4);
            String datetime = (String) soldList.getValueAt(selectedRowIndex, 5);

            String cleanedTotalSoldString = totalSoldString.replace(",", "").replace("₱", "");

            double totalSold = Double.parseDouble(cleanedTotalSoldString);

            insertStatement.setInt(1, productID);
            insertStatement.setString(2, productName);
            insertStatement.setString(3, developer);
            insertStatement.setInt(4, quantityBought);
            insertStatement.setDouble(5, totalSold);
            insertStatement.setString(6, datetime);
            insertStatement.setString(7, "Returned");

            insertStatement.executeUpdate();
            System.out.println("Return recorded");

            String deleteQuery = "DELETE FROM salesTable WHERE ID = ? AND Product = ? AND Developer = ? AND Quantity = ? AND Sold = ? AND `Date and Time Sold` = ?";
            try (PreparedStatement deleteStatement = connect.getConnection().prepareStatement(deleteQuery)) {
                deleteStatement.setInt(1, productID);
                deleteStatement.setString(2, productName);
                deleteStatement.setString(3, developer);
                deleteStatement.setInt(4, quantityBought);
                deleteStatement.setDouble(5, totalSold);
                deleteStatement.setString(6, datetime);
                deleteStatement.executeUpdate();
                System.out.println("Row deleted from the database");
            } catch (SQLException ex) {
                System.out.println("Error occurred while deleting row from the database: " + ex.getMessage());
                ex.printStackTrace();
            }
            DefaultTableModel tableModel = (DefaultTableModel) soldList.getModel();
            tableModel.removeRow(selectedRowIndex);

        } catch (SQLException e) {
            System.out.println("Error occurred while inserting refund data: " + e.getMessage());
            e.printStackTrace();
        }
    }//GEN-LAST:event_returnbuttonActionPerformed

    private void refundbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refundbuttonActionPerformed
        int selectedRowIndex = soldList.getSelectedRow();

        String insertQuery = "INSERT INTO actionTable (ID, Product, Developer, Quantity, Price, `Date and Time Sold`, Action) VALUES (?, ?, ?, ?, ?, ?, ?)";
        try (PreparedStatement insertStatement = connect.getConnection().prepareStatement(insertQuery)) {
            int productID = (int) soldList.getValueAt(selectedRowIndex, 0);
            String productName = (String) soldList.getValueAt(selectedRowIndex, 1);
            String developer = (String) soldList.getValueAt(selectedRowIndex, 2);
            int quantityBought = (int) soldList.getValueAt(selectedRowIndex, 3);
            String totalSoldString = (String) soldList.getValueAt(selectedRowIndex, 4);
            String datetime = (String) soldList.getValueAt(selectedRowIndex, 5);

            String cleanedTotalSoldString = totalSoldString.replace(",", "").replace("₱", "");

            double totalSold = Double.parseDouble(cleanedTotalSoldString);

            insertStatement.setInt(1, productID);
            insertStatement.setString(2, productName);
            insertStatement.setString(3, developer);
            insertStatement.setInt(4, quantityBought);
            insertStatement.setDouble(5, totalSold);
            insertStatement.setString(6, datetime);
            insertStatement.setString(7, "Refunded");

            insertStatement.executeUpdate();
            System.out.println("Refund recorded");

            String deleteQuery = "DELETE FROM salesTable WHERE ID = ? AND Product = ? AND Developer = ? AND Quantity = ? AND Price = ? AND `Date and Time Sold` = ?";
            try (PreparedStatement deleteStatement = connect.getConnection().prepareStatement(deleteQuery)) {
                deleteStatement.setInt(1, productID);
                deleteStatement.setString(2, productName);
                deleteStatement.setString(3, developer);
                deleteStatement.setInt(4, quantityBought);
                deleteStatement.setDouble(5, totalSold);
                deleteStatement.setString(6, datetime);
                deleteStatement.executeUpdate();
                System.out.println("Row deleted from the database");
            } catch (SQLException ex) {
                System.out.println("Error occurred while deleting row from the database: " + ex.getMessage());
                ex.printStackTrace();
            }

            DefaultTableModel tableModel = (DefaultTableModel) soldList.getModel();
            tableModel.removeRow(selectedRowIndex);

        } catch (SQLException e) {
            System.out.println("Error occurred while inserting refund data: " + e.getMessage());
            e.printStackTrace();
        }
    }//GEN-LAST:event_refundbuttonActionPerformed

    private void returndeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returndeleteActionPerformed
        int selectedRowIndex = returnList.getSelectedRow();

        if (selectedRowIndex != -1) {
            int selectedID = (int) returnList.getValueAt(selectedRowIndex, 0);
            String selectedProduct = (String) returnList.getValueAt(selectedRowIndex, 1);
            String selectedDeveloper = (String) returnList.getValueAt(selectedRowIndex, 2);
            int selectedQuantity = (int) returnList.getValueAt(selectedRowIndex, 3);
            double selectedPrice = (double) returnList.getValueAt(selectedRowIndex, 4);
            String selectedDateTime = (String) returnList.getValueAt(selectedRowIndex, 5);
            String selectedAction = (String) returnList.getValueAt(selectedRowIndex, 6);

            String deleteQuery = "DELETE FROM actionTable WHERE ID = ? AND Product = ? AND Developer = ? AND Quantity = ? AND Price = ? AND `Date and Time Sold` = ? AND Action = ?";
            try (PreparedStatement deleteStatement = connect.getConnection().prepareStatement(deleteQuery)) {
                deleteStatement.setInt(1, selectedID);
                deleteStatement.setString(2, selectedProduct);
                deleteStatement.setString(3, selectedDeveloper);
                deleteStatement.setInt(4, selectedQuantity);
                deleteStatement.setDouble(5, selectedPrice);
                deleteStatement.setString(6, selectedDateTime);
                deleteStatement.setString(7, selectedAction);

                deleteStatement.executeUpdate();
                System.out.println("Row deleted from the database.");

                DefaultTableModel tableModel = (DefaultTableModel) returnList.getModel();
                tableModel.removeRow(selectedRowIndex);
                System.out.println("Row deleted from the returnList table.");
            } catch (SQLException e) {
                System.out.println("Error occurred while deleting row: " + e.getMessage());
                e.printStackTrace();
            }
        } else {
            System.out.println("No row selected.");
        }
    }//GEN-LAST:event_returndeleteActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int selectedRowIndex = refundList.getSelectedRow();

        if (selectedRowIndex != -1) {
            int selectedID = (int) refundList.getValueAt(selectedRowIndex, 0);
            String selectedProduct = (String) refundList.getValueAt(selectedRowIndex, 1);
            String selectedDeveloper = (String) refundList.getValueAt(selectedRowIndex, 2);
            int selectedQuantity = (int) refundList.getValueAt(selectedRowIndex, 3);
            double selectedPrice = (double) refundList.getValueAt(selectedRowIndex, 4);
            String selectedDateTime = (String) refundList.getValueAt(selectedRowIndex, 5);
            String selectedAction = (String) refundList.getValueAt(selectedRowIndex, 6);

            String deleteQuery = "DELETE FROM actionTable WHERE ID = ? AND Product = ? AND Developer = ? AND Quantity = ? AND Price = ? AND `Date and Time Sold` = ? AND Action = ?";
            try (PreparedStatement deleteStatement = connect.getConnection().prepareStatement(deleteQuery)) {
                deleteStatement.setInt(1, selectedID);
                deleteStatement.setString(2, selectedProduct);
                deleteStatement.setString(3, selectedDeveloper);
                deleteStatement.setInt(4, selectedQuantity);
                deleteStatement.setDouble(5, selectedPrice);
                deleteStatement.setString(6, selectedDateTime);
                deleteStatement.setString(7, selectedAction);

                deleteStatement.executeUpdate();
                System.out.println("Row deleted from the database.");

                DefaultTableModel tableModel = (DefaultTableModel) refundList.getModel();
                tableModel.removeRow(selectedRowIndex);
                System.out.println("Row deleted from the returnList table.");
            } catch (SQLException e) {
                System.out.println("Error occurred while deleting row: " + e.getMessage());
                e.printStackTrace();
            }
        } else {
            System.out.println("No row selected.");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new soldframe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton dashboardbutton;
    private javax.swing.JLabel gamego;
    private javax.swing.JButton inventorybutton;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JButton logoutbutton;
    private javax.swing.JButton outofstockbutton;
    private javax.swing.JTable refundList;
    private javax.swing.JButton refundbutton;
    private javax.swing.JTable returnList;
    private javax.swing.JButton returnbutton;
    private javax.swing.JButton returndelete;
    private javax.swing.JButton shopbutton;
    private javax.swing.JTable soldList;
    private javax.swing.JButton solditemsbutton;
    private javax.swing.JLabel totalsaleslabel;
    // End of variables declaration//GEN-END:variables
}
