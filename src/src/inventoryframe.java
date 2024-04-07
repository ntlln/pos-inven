package src;

import db.connect;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Allen Caingcoy
 */
public class inventoryframe extends javax.swing.JFrame {

    public static boolean dataUpdate = true;

    public inventoryframe() {
        initComponents();
        retrieveData();
    }

    void retrieveData() {
        DefaultTableModel retrievemodel = (DefaultTableModel) inventoryList.getModel();
        retrievemodel.setRowCount(0);

        String url = connect.url;
        String user = connect.user;
        String password = connect.password;

        try (Connection connection = DriverManager.getConnection(url, user, password)) {
            String query = "SELECT * FROM invenTable";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                int id = resultSet.getInt("ID");
                String product = resultSet.getString("Product");
                String developer = resultSet.getString("Developer");
                int quantity = resultSet.getInt("Quantity");
                double price = resultSet.getDouble("Price");

                retrievemodel.addRow(new Object[]{id, product, developer, quantity, price});
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    void deleteData(int productId) {
        String url = connect.url;
        String user = connect.user;
        String password = connect.password;

        try (Connection connection = DriverManager.getConnection(url, user, password)) {
            String checkQuery = "SELECT ID FROM invenTable WHERE ID = ?";
            PreparedStatement checkStatement = connection.prepareStatement(checkQuery);
            checkStatement.setInt(1, productId);
            ResultSet checkResultSet = checkStatement.executeQuery();

            if (checkResultSet.next()) {
                String deleteQuery = "DELETE FROM invenTable WHERE ID = ?";
                PreparedStatement deleteStatement = connection.prepareStatement(deleteQuery);
                deleteStatement.setInt(1, productId);
                deleteStatement.executeUpdate();

                System.out.println("Product data deleted successfully.");

                String updateQuery = "UPDATE invenTable SET ID = ID - 1 WHERE ID > ?";
                PreparedStatement updateStatement = connection.prepareStatement(updateQuery);
                updateStatement.setInt(1, productId);
                updateStatement.executeUpdate();

                System.out.println("Product IDs updated successfully.");
            } else {
                System.out.println("Product ID does not exist.");
            }
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
        inventorylabel = new javax.swing.JLabel();
        productnamelabel = new javax.swing.JLabel();
        productfield = new javax.swing.JTextField();
        pricelabel = new javax.swing.JLabel();
        pricefield = new javax.swing.JTextField();
        manufacturerlabal = new javax.swing.JLabel();
        manufacturerfield = new javax.swing.JTextField();
        quantitylabel = new javax.swing.JLabel();
        minusincrementbutton = new javax.swing.JButton();
        quantityfield = new javax.swing.JTextField();
        addincrementbutton = new javax.swing.JButton();
        savebutton = new javax.swing.JButton();
        updatebutton = new javax.swing.JButton();
        deletebutton = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        inventoryList = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1080, 620));
        setMinimumSize(new java.awt.Dimension(1080, 620));
        setPreferredSize(new java.awt.Dimension(1080, 620));
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(0, 255, 255));

        gamego.setFont(new java.awt.Font("Monaco", 0, 48)); // NOI18N
        gamego.setForeground(new java.awt.Color(51, 51, 51));
        gamego.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        gamego.setText("GameGo");

        dashboardbutton.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        dashboardbutton.setForeground(new java.awt.Color(51, 51, 51));
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
        inventorybutton.setForeground(new java.awt.Color(51, 51, 51));
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
        solditemsbutton.setForeground(new java.awt.Color(51, 51, 51));
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
        outofstockbutton.setForeground(new java.awt.Color(51, 51, 51));
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
        logoutbutton.setForeground(new java.awt.Color(51, 51, 51));
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

        inventorylabel.setFont(new java.awt.Font("Monaco", 0, 24)); // NOI18N
        inventorylabel.setForeground(new java.awt.Color(0, 255, 255));
        inventorylabel.setText("Inventory");

        productnamelabel.setFont(new java.awt.Font("Monaco", 0, 14)); // NOI18N
        productnamelabel.setForeground(new java.awt.Color(0, 255, 255));
        productnamelabel.setText("Product Name:");

        productfield.setBackground(new java.awt.Color(51, 51, 51));
        productfield.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        productfield.setForeground(new java.awt.Color(0, 255, 255));
        productfield.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 255)));

        pricelabel.setFont(new java.awt.Font("Monaco", 0, 14)); // NOI18N
        pricelabel.setForeground(new java.awt.Color(0, 255, 255));
        pricelabel.setText("Price:");

        pricefield.setBackground(new java.awt.Color(51, 51, 51));
        pricefield.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        pricefield.setForeground(new java.awt.Color(0, 255, 255));
        pricefield.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 255)));

        manufacturerlabal.setFont(new java.awt.Font("Monaco", 0, 14)); // NOI18N
        manufacturerlabal.setForeground(new java.awt.Color(0, 255, 255));
        manufacturerlabal.setText("Developer:");

        manufacturerfield.setBackground(new java.awt.Color(51, 51, 51));
        manufacturerfield.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        manufacturerfield.setForeground(new java.awt.Color(0, 255, 255));
        manufacturerfield.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 255)));

        quantitylabel.setFont(new java.awt.Font("Monaco", 0, 14)); // NOI18N
        quantitylabel.setForeground(new java.awt.Color(0, 255, 255));
        quantitylabel.setText("Quantity:");

        minusincrementbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rsc/itemsubtract.png"))); // NOI18N
        minusincrementbutton.setBorderPainted(false);
        minusincrementbutton.setContentAreaFilled(false);
        minusincrementbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minusincrementbuttonActionPerformed(evt);
            }
        });

        quantityfield.setBackground(new java.awt.Color(51, 51, 51));
        quantityfield.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        quantityfield.setForeground(new java.awt.Color(0, 255, 255));
        quantityfield.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        quantityfield.setText("0");
        quantityfield.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 255)));

        addincrementbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rsc/itemadd.png"))); // NOI18N
        addincrementbutton.setBorderPainted(false);
        addincrementbutton.setContentAreaFilled(false);
        addincrementbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addincrementbuttonActionPerformed(evt);
            }
        });

        savebutton.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        savebutton.setForeground(new java.awt.Color(0, 255, 255));
        savebutton.setText("ADD");
        savebutton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 255)));
        savebutton.setContentAreaFilled(false);
        savebutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                savebuttonActionPerformed(evt);
            }
        });

        updatebutton.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        updatebutton.setForeground(new java.awt.Color(0, 255, 255));
        updatebutton.setText("UPDATE");
        updatebutton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 255)));
        updatebutton.setContentAreaFilled(false);
        updatebutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatebuttonActionPerformed(evt);
            }
        });

        deletebutton.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        deletebutton.setForeground(new java.awt.Color(255, 0, 0));
        deletebutton.setText("DELETE");
        deletebutton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));
        deletebutton.setContentAreaFilled(false);
        deletebutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletebuttonActionPerformed(evt);
            }
        });

        jTextField1.setBackground(new java.awt.Color(51, 51, 51));
        jTextField1.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(0, 255, 255));
        jTextField1.setText("Search...");
        jTextField1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 255)));
        jTextField1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField1FocusGained(evt);
            }
        });
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField1KeyReleased(evt);
            }
        });

        inventoryList.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        inventoryList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Product", "Developer", "Quantity", "Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        inventoryList.setRowHeight(30);
        jScrollPane1.setViewportView(inventoryList);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(inventorylabel, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(productnamelabel, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(productfield, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pricelabel, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pricefield, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(75, 75, 75)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(manufacturerlabal, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(manufacturerfield, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(quantitylabel, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(minusincrementbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(6, 6, 6)
                                        .addComponent(quantityfield, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(addincrementbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 132, Short.MAX_VALUE)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(savebutton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deletebutton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(updatebutton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(inventorylabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)
                        .addComponent(productnamelabel, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)
                        .addComponent(productfield, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(pricelabel, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(pricefield, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(savebutton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(updatebutton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField1)
                            .addComponent(deletebutton, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(manufacturerlabal, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)
                        .addComponent(manufacturerfield, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(quantitylabel, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(minusincrementbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addincrementbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(quantityfield, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 437, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(jPanel2);
        jPanel2.setBounds(200, 0, 880, 620);

        setSize(new java.awt.Dimension(1080, 648));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void dashboardbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dashboardbuttonActionPerformed
        dispose();
        dashboardframe dashboard = new dashboardframe();
        dashboardframe.inventorybutton.setEnabled(true);
        dashboardframe.accountsbutton.setEnabled(true);
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

    private void minusincrementbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minusincrementbuttonActionPerformed
        String currentText = quantityfield.getText();
        if (!currentText.isEmpty()) {
            try {
                int currentValue = Integer.parseInt(currentText);
                int newValue = currentValue - 1;

                quantityfield.setText(String.valueOf(newValue));

            } catch (NumberFormatException e) {
                e.printStackTrace();
            }
        } else {
        }
    }//GEN-LAST:event_minusincrementbuttonActionPerformed

    private void addincrementbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addincrementbuttonActionPerformed
        String currentText = quantityfield.getText();
        if (!currentText.isEmpty()) {
            try {
                int currentValue = Integer.parseInt(currentText);
                int newValue = currentValue + 1;

                quantityfield.setText(String.valueOf(newValue));

            } catch (NumberFormatException e) {
                e.printStackTrace();
            }
        } else {
        }
    }//GEN-LAST:event_addincrementbuttonActionPerformed

    private void savebuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_savebuttonActionPerformed
        DefaultTableModel model = (DefaultTableModel) inventoryList.getModel();

        String productName = productfield.getText();
        String developer = manufacturerfield.getText();
        String quantity = quantityfield.getText();
        Double price = Double.parseDouble(pricefield.getText());

        int nextID;
        int rowCount = model.getRowCount();
        if (rowCount == 0) {
            nextID = 1;
        } else {
            int lastID = (int) model.getValueAt(rowCount - 1, 0);
            nextID = lastID + 1;
        }

        Object[] rowData = {nextID, productName, developer, quantity, price};

        model.addRow(rowData);

        productfield.setText("");
        manufacturerfield.setText("");
        pricefield.setText("");
        quantityfield.setText("0");

        String url = connect.url;
        String user = connect.user;
        String password = connect.password;

        try (Connection connection = DriverManager.getConnection(url, user, password)) {
            String insertQuery = "INSERT INTO invenTable (ID, Product, Developer, Quantity, Price) VALUES (?, ?, ?, ?, ?)";
            PreparedStatement insertStatement = connection.prepareStatement(insertQuery);
            insertStatement.setInt(1, nextID);
            insertStatement.setString(2, productName);
            insertStatement.setString(3, developer);
            insertStatement.setInt(4, Integer.parseInt(quantity));
            insertStatement.setDouble(5, price);
            insertStatement.executeUpdate();

            System.out.println("Data saved to the database.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_savebuttonActionPerformed

    private void updatebuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatebuttonActionPerformed
        int selectedRow = inventoryList.getSelectedRow();
        if (selectedRow == -1) {
            return;
        }

        int productId = (int) inventoryList.getValueAt(selectedRow, 0);

        if (dataUpdate) {
            String url = connect.url;
            String user = connect.user;
            String password = connect.password;

            try (Connection connection = DriverManager.getConnection(url, user, password)) {
                String query = "SELECT * FROM invenTable WHERE ID = ?";

                PreparedStatement preparedStatement = connection.prepareStatement(query);
                preparedStatement.setInt(1, productId);

                ResultSet resultSet = preparedStatement.executeQuery();
                if (resultSet.next()) {
                    String productName = resultSet.getString("Product");
                    String developer = resultSet.getString("Developer");
                    String quantity = resultSet.getString("Quantity");
                    double price = resultSet.getDouble("Price");

                    productfield.setText(productName);
                    manufacturerfield.setText(developer);
                    quantityfield.setText(quantity);
                    pricefield.setText(String.valueOf(price));

                    dataUpdate = false;
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        } else {
            String updatedProductName = productfield.getText();
            String updatedDeveloper = manufacturerfield.getText();
            String updatedQuantity = quantityfield.getText();
            double updatedPrice = Double.parseDouble(pricefield.getText());

            String url = connect.url;
            String user = connect.user;
            String password = connect.password;

            try (Connection connection = DriverManager.getConnection(url, user, password)) {
                String updateQuery = "UPDATE invenTable SET Product = ?, Developer = ?, Quantity = ?, Price = ? WHERE ID = ?";

                PreparedStatement updateStatement = connection.prepareStatement(updateQuery);
                updateStatement.setString(1, updatedProductName);
                updateStatement.setString(2, updatedDeveloper);
                updateStatement.setString(3, updatedQuantity);
                updateStatement.setDouble(4, updatedPrice);
                updateStatement.setInt(5, productId);
                updateStatement.executeUpdate();
                dataUpdate = true;
                retrieveData();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            productfield.setText("");
            manufacturerfield.setText("");
            quantityfield.setText("0");
            pricefield.setText("");
        }
    }//GEN-LAST:event_updatebuttonActionPerformed

    private void deletebuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletebuttonActionPerformed
        int selectedRow = inventoryList.getSelectedRow();
        if (selectedRow >= 0) {
            int confirmDialogResult = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete this item?", "Confirm Deletion", JOptionPane.YES_NO_OPTION);
            if (confirmDialogResult == JOptionPane.YES_OPTION) {
                DefaultTableModel delmodel = (DefaultTableModel) inventoryList.getModel();
                int patientId = (int) delmodel.getValueAt(selectedRow, 0);
                delmodel.removeRow(selectedRow);
                deleteData(patientId);
                retrieveData();
            }
        }
    }//GEN-LAST:event_deletebuttonActionPerformed

    private void jTextField1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField1FocusGained
        jTextField1.setText("");
    }//GEN-LAST:event_jTextField1FocusGained

    private void jTextField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            DefaultTableModel retrievemodel = (DefaultTableModel) inventoryList.getModel();
            retrievemodel.setRowCount(0);

            String url = connect.url;
            String user = connect.user;
            String password = connect.password;

            try (Connection connection = DriverManager.getConnection(url, user, password)) {
                String searchTerm = jTextField1.getText().trim();

                String query = "SELECT * FROM invenTable WHERE Product LIKE ?";
                PreparedStatement preparedStatement = connection.prepareStatement(query);
                preparedStatement.setString(1, "%" + searchTerm + "%");
                ResultSet resultSet = preparedStatement.executeQuery();

                if (resultSet.next()) {
                    do {
                        int id = resultSet.getInt("ID");
                        String product = resultSet.getString("Product");
                        String developer = resultSet.getString("Developer");
                        int quantity = resultSet.getInt("Quantity");
                        double price = resultSet.getDouble("Price");

                        retrievemodel.addRow(new Object[]{id, product, developer, quantity, price});
                    } while (resultSet.next());
                } else {
                    JOptionPane.showMessageDialog(null, "No Product Exists", "ERROR!", JOptionPane.INFORMATION_MESSAGE);
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_jTextField1KeyReleased

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new inventoryframe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addincrementbutton;
    private javax.swing.JButton dashboardbutton;
    private javax.swing.JButton deletebutton;
    private javax.swing.JLabel gamego;
    private javax.swing.JTable inventoryList;
    private javax.swing.JButton inventorybutton;
    private javax.swing.JLabel inventorylabel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton logoutbutton;
    private javax.swing.JTextField manufacturerfield;
    private javax.swing.JLabel manufacturerlabal;
    private javax.swing.JButton minusincrementbutton;
    private javax.swing.JButton outofstockbutton;
    private javax.swing.JTextField pricefield;
    private javax.swing.JLabel pricelabel;
    private javax.swing.JTextField productfield;
    private javax.swing.JLabel productnamelabel;
    private javax.swing.JTextField quantityfield;
    private javax.swing.JLabel quantitylabel;
    private javax.swing.JButton savebutton;
    private javax.swing.JButton shopbutton;
    private javax.swing.JButton solditemsbutton;
    private javax.swing.JButton updatebutton;
    // End of variables declaration//GEN-END:variables
}
