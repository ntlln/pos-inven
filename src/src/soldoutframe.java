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
public class soldoutframe extends javax.swing.JFrame {

    public static boolean dataUpdate = true;

    public soldoutframe() {
        initComponents();
        retrieveSoldout();
    }

    void retrieveSoldout() {
        DefaultTableModel model = (DefaultTableModel) inventoryList.getModel();
        model.setRowCount(0);

        String url = connect.url;
        String user = connect.user;
        String password = connect.password;

        try (Connection connection = DriverManager.getConnection(url, user, password)) {
            String query = "SELECT * FROM invenTable WHERE Quantity = 0";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            ResultSet resultSet = preparedStatement.executeQuery();

            DecimalFormat decimalFormat = new DecimalFormat("#,##0.00");

            while (resultSet.next()) {
                int id = resultSet.getInt("ID");
                String product = resultSet.getString("Product");
                String developer = resultSet.getString("Developer");
                int quantity = resultSet.getInt("Quantity");
                double price = resultSet.getDouble("Price");

                String formattedPrice = decimalFormat.format(price);

                model.addRow(new Object[]{id, product, developer, quantity, formattedPrice});
            }

            inventoryList.setModel(model);
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
        soldoutlabel = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        inventoryList = new javax.swing.JTable();

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

        soldoutlabel.setFont(new java.awt.Font("Monaco", 0, 24)); // NOI18N
        soldoutlabel.setForeground(new java.awt.Color(0, 255, 255));
        soldoutlabel.setText("Sold Out");

        inventoryList.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        inventoryList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
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
        jScrollPane2.setViewportView(inventoryList);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(soldoutlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 866, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(soldoutlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 570, Short.MAX_VALUE)
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

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new soldoutframe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton dashboardbutton;
    private javax.swing.JLabel gamego;
    private javax.swing.JTable inventoryList;
    private javax.swing.JButton inventorybutton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton logoutbutton;
    private javax.swing.JButton outofstockbutton;
    private javax.swing.JButton shopbutton;
    private javax.swing.JButton solditemsbutton;
    private javax.swing.JLabel soldoutlabel;
    // End of variables declaration//GEN-END:variables
}
