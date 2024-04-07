package src;

import db.connect;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Allen Caingcoy
 */
public class posframe extends javax.swing.JFrame {

    public posframe() {
        initComponents();
        retrieveData();
    }

    void retrieveData() {
        DefaultTableModel model = (DefaultTableModel) inventoryList.getModel();
        model.setRowCount(0);

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

                if (quantity > 0) {
                    model.addRow(new Object[]{id, product, developer, quantity, price});
                }
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
        jLabel8 = new javax.swing.JLabel();
        paybutton = new javax.swing.JButton();
        removebutton = new javax.swing.JButton();
        resetbutton = new javax.swing.JButton();
        exitbutton = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        mop = new javax.swing.JComboBox<>();
        discountfield = new javax.swing.JTextField();
        cashfield = new javax.swing.JTextField();
        changefield = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        inventoryList = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        overviewTable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        subtotaltext = new javax.swing.JLabel();
        taxtext = new javax.swing.JLabel();
        totaltext = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1080, 620));
        setMinimumSize(new java.awt.Dimension(1080, 620));
        setPreferredSize(new java.awt.Dimension(1080, 620));
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 255)));

        jLabel8.setFont(new java.awt.Font("Monaco", 0, 48)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rsc/logo.png"))); // NOI18N
        jLabel8.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel8.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        paybutton.setFont(new java.awt.Font("Monaco", 0, 14)); // NOI18N
        paybutton.setForeground(new java.awt.Color(0, 255, 255));
        paybutton.setText("PAY");
        paybutton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 255)));
        paybutton.setContentAreaFilled(false);
        paybutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paybuttonActionPerformed(evt);
            }
        });

        removebutton.setFont(new java.awt.Font("Monaco", 0, 14)); // NOI18N
        removebutton.setForeground(new java.awt.Color(0, 255, 255));
        removebutton.setText("REMOVE");
        removebutton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 255)));
        removebutton.setContentAreaFilled(false);
        removebutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removebuttonActionPerformed(evt);
            }
        });

        resetbutton.setFont(new java.awt.Font("Monaco", 0, 14)); // NOI18N
        resetbutton.setForeground(new java.awt.Color(0, 255, 255));
        resetbutton.setText("RESET");
        resetbutton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 255)));
        resetbutton.setContentAreaFilled(false);
        resetbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetbuttonActionPerformed(evt);
            }
        });

        exitbutton.setFont(new java.awt.Font("Monaco", 0, 14)); // NOI18N
        exitbutton.setForeground(new java.awt.Color(0, 255, 255));
        exitbutton.setText("EXIT");
        exitbutton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 255)));
        exitbutton.setContentAreaFilled(false);
        exitbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitbuttonActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(51, 51, 51));

        mop.setFont(new java.awt.Font("Monaco", 0, 14)); // NOI18N
        mop.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cash", "GCash", "Maya", "Debit", "Credit" }));

        discountfield.setBackground(new java.awt.Color(51, 51, 51));
        discountfield.setFont(new java.awt.Font("Monaco", 0, 14)); // NOI18N
        discountfield.setForeground(new java.awt.Color(0, 255, 255));
        discountfield.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 255)));

        cashfield.setBackground(new java.awt.Color(51, 51, 51));
        cashfield.setFont(new java.awt.Font("Monaco", 0, 14)); // NOI18N
        cashfield.setForeground(new java.awt.Color(0, 255, 255));
        cashfield.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 255)));

        changefield.setFont(new java.awt.Font("Monaco", 0, 24)); // NOI18N
        changefield.setForeground(new java.awt.Color(0, 255, 255));

        jLabel5.setFont(new java.awt.Font("Monaco", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Mode of Payment");

        jLabel6.setFont(new java.awt.Font("Monaco", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Discount");

        jLabel10.setFont(new java.awt.Font("Monaco", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("Cash");

        jLabel11.setFont(new java.awt.Font("Monaco", 0, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel11.setText("Change");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(119, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(changefield, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(mop, 0, 120, Short.MAX_VALUE)
                        .addComponent(discountfield))
                    .addComponent(cashfield, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(mop, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(discountfield, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cashfield, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(changefield, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12))
        );

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
        inventoryList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                inventoryListMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(inventoryList);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(paybutton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(removebutton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(resetbutton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(exitbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(paybutton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(removebutton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(resetbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(exitbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 780, 633);

        jPanel2.setBackground(new java.awt.Color(0, 255, 255));

        jLabel1.setFont(new java.awt.Font("Monaco", 0, 48)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Overview");

        jScrollPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));

        overviewTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product", "Price", "Quantity"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        overviewTable.setGridColor(new java.awt.Color(255, 255, 255));
        overviewTable.setRowHeight(30);
        jScrollPane1.setViewportView(overviewTable);

        jLabel2.setFont(new java.awt.Font("Monaco", 0, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("SubTotal");

        jLabel3.setFont(new java.awt.Font("Monaco", 0, 24)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Tax");

        jLabel4.setFont(new java.awt.Font("Monaco", 0, 24)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Total");

        subtotaltext.setFont(new java.awt.Font("Monaco", 0, 24)); // NOI18N

        taxtext.setFont(new java.awt.Font("Monaco", 0, 24)); // NOI18N

        totaltext.setFont(new java.awt.Font("Monaco", 0, 24)); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 288, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(subtotaltext, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(totaltext, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(taxtext, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(subtotaltext, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(taxtext, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(totaltext, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        getContentPane().add(jPanel2);
        jPanel2.setBounds(780, 0, 300, 620);

        setSize(new java.awt.Dimension(1080, 648));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void paybuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paybuttonActionPerformed
        String cashAmountText = cashfield.getText();
        double cashAmount = Double.parseDouble(cashAmountText);

        if (!cashAmountText.isEmpty()) {
            cashAmount = Double.parseDouble(cashAmountText);
        }

        double total = Double.parseDouble(totaltext.getText());
        double discount = 0.0;
        String discountText = discountfield.getText();
        if (!discountText.isEmpty()) {
            discount = Double.parseDouble(discountText);
        }
        double discountedTotal = total - (total * (discount / 100.0));

        double change = cashAmount - discountedTotal;

        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        String formattedChange = decimalFormat.format(change);
        changefield.setText(formattedChange);

        DefaultTableModel model = (DefaultTableModel) overviewTable.getModel();
        int rowCount = model.getRowCount();
        boolean validAmount = cashAmount >= discountedTotal;

        for (int i = 0; i < rowCount; i++) {
            String productName = model.getValueAt(i, 0).toString();
            int quantityBought = Integer.parseInt(model.getValueAt(i, 2).toString());

            String selectQuery = "SELECT Quantity, ID, Developer, Price FROM invenTable WHERE Product = ?";
            try (PreparedStatement selectStatement = connect.getConnection().prepareStatement(selectQuery)) {
                selectStatement.setString(1, productName);
                try (ResultSet resultSet = selectStatement.executeQuery()) {
                    if (resultSet.next()) {
                        int currentQuantity = resultSet.getInt("Quantity");
                        int productID = resultSet.getInt("ID");
                        String developer = resultSet.getString("Developer");
                        double price = resultSet.getDouble("Price");

                        if (currentQuantity >= quantityBought) {
                            int updatedQuantity = currentQuantity - quantityBought;
                            String updateQuery = "UPDATE invenTable SET Quantity = ? WHERE Product = ?";
                            try (PreparedStatement updateStatement = connect.getConnection().prepareStatement(updateQuery)) {
                                updateStatement.setInt(1, updatedQuantity);
                                updateStatement.setString(2, productName);
                                updateStatement.executeUpdate();

                                System.out.println("Quantity Updated");

                                double totalSold = quantityBought * price * 1.1;

                                String insertQuery = "INSERT INTO salesTable (ID, Product, Developer, Quantity, Sold, `Date and Time Sold`) VALUES (?, ?, ?, ?, ?, ?)";
                                try (PreparedStatement insertStatement = connect.getConnection().prepareStatement(insertQuery)) {
                                    insertStatement.setInt(1, productID);
                                    insertStatement.setString(2, productName);
                                    insertStatement.setString(3, developer);
                                    insertStatement.setInt(4, quantityBought);
                                    insertStatement.setDouble(5, totalSold);

                                    Date currentDate = new Date();
                                    SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yy hh:mm:ss");
                                    String formattedDateTime = dateFormat.format(currentDate);

                                    insertStatement.setString(6, formattedDateTime);

                                    insertStatement.executeUpdate();
                                    System.out.println("Sale recorded");

                                    totaltext.setText(decimalFormat.format(discountedTotal));
                                } catch (SQLException e) {
                                    System.out.println("Error occurred while inserting sales data: " + e.getMessage());
                                    e.printStackTrace();
                                }
                            }
                        } else {
                            JOptionPane.showMessageDialog(null, "Quantity exceeded the number of inventory stocks.", "ERROR!", JOptionPane.INFORMATION_MESSAGE);
                            model.removeRow(i);
                            i--;
                        }
                    }
                }
            } catch (SQLException e) {
                System.out.println("Error occurred while querying or updating the database: " + e.getMessage());
                e.printStackTrace();
            }
        }

        String paymentMethod = mop.getSelectedItem().toString();

        if (validAmount && (paymentMethod.equals("Debit") || paymentMethod.equals("Credit"))) {
            int option = JOptionPane.showOptionDialog(null, "Swipe or Tap card onto Reader.", "PROCESSING", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, new Object[]{"Print Receipt"}, null);
            if (option == 0) {
                receiptframe receipt = new receiptframe();
                receipt.displayData();
                receipt.getSubtotal.setText(subtotaltext.getText());
                receipt.getTax.setText(taxtext.getText());
                receipt.getTotal.setText(totaltext.getText());
                receipt.getCash.setText(decimalFormat.format(cashAmount));
                receipt.getDiscount.setText(discountfield.getText() + "%");
                receipt.getChange.setText(formattedChange);
                receipt.setVisible(true);
            }
        } else if (validAmount && (paymentMethod.equals("GCash") || paymentMethod.equals("Maya"))) {
            int option = JOptionPane.showOptionDialog(null, null, "Scan QR", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, new ImageIcon(getClass().getResource("/rsc/qr.png")), new Object[]{"Print Receipt"}, null);
            if (option == 0) {
                receiptframe receipt = new receiptframe();
                receipt.displayData();
                receipt.getSubtotal.setText(subtotaltext.getText());
                receipt.getTax.setText(taxtext.getText());
                receipt.getTotal.setText(totaltext.getText());
                receipt.getCash.setText(decimalFormat.format(cashAmount));
                receipt.getDiscount.setText(discountfield.getText() + "%");
                receipt.getChange.setText(formattedChange);
                receipt.setVisible(true);
            }
        } else if (validAmount) {
            int option = JOptionPane.showOptionDialog(null, "Payment received. Transaction successful.", "Success", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, new Object[]{"Print Receipt"}, null);
            if (option == 0) {
                receiptframe receipt = new receiptframe();
                receipt.displayData();
                receipt.getSubtotal.setText(subtotaltext.getText());
                receipt.getTax.setText(taxtext.getText());
                receipt.getTotal.setText(totaltext.getText());
                receipt.getCash.setText(decimalFormat.format(cashAmount));
                receipt.getDiscount.setText(discountfield.getText() + "%");
                receipt.getChange.setText(formattedChange);
                receipt.setVisible(true);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Invalid amount. The cash amount is less than the total.");
            return;
        }
    }//GEN-LAST:event_paybuttonActionPerformed

    private void removebuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removebuttonActionPerformed
        int removeYesNo = JOptionPane.showConfirmDialog(null, "This will remove the selected item", "WARNING!", JOptionPane.YES_NO_OPTION);

        if (removeYesNo == JOptionPane.YES_OPTION) {
            JTextField usernameField = new JTextField();
            JPasswordField passwordField = new JPasswordField();

            Object[] message = {
                "Username:", usernameField,
                "Password:", passwordField
            };

            int result = JOptionPane.showConfirmDialog(null, message, "Ma'am, pa-void", JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);

            if (result == JOptionPane.OK_OPTION) {
                String username = usernameField.getText();
                String password = new String(passwordField.getPassword());

                if (username.equals("admin") && password.equals("admin")) {
                    int selectedRow = overviewTable.getSelectedRow();
                    DefaultTableModel model = (DefaultTableModel) overviewTable.getModel();

                    if (selectedRow != -1) {
                        double removedPrice = Double.parseDouble(model.getValueAt(selectedRow, 1).toString());
                        int removedQuantity = Integer.parseInt(model.getValueAt(selectedRow, 2).toString());

                        model.removeRow(selectedRow);

                        double subtotal = 0.0;
                        for (int i = 0; i < model.getRowCount(); i++) {
                            double itemPrice = Double.parseDouble(model.getValueAt(i, 1).toString());
                            int itemQuantity = Integer.parseInt(model.getValueAt(i, 2).toString());
                            subtotal += itemPrice * itemQuantity;
                        }

                        double taxRate = 0.10;
                        double tax = subtotal * taxRate;
                        double total = subtotal + tax;

                        DecimalFormat decimalFormat = new DecimalFormat("#.##");
                        String formattedSubtotal = decimalFormat.format(subtotal);
                        String formattedTax = decimalFormat.format(tax);
                        String formattedTotal = decimalFormat.format(total);

                        subtotaltext.setText(formattedSubtotal);
                        taxtext.setText(formattedTax);
                        totaltext.setText(formattedTotal);
                    } else {
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Incorrect username or password. Removal canceled.");
                }
            } else {
            }
        }
    }//GEN-LAST:event_removebuttonActionPerformed

    private void resetbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetbuttonActionPerformed
        dispose();
        posframe pos = new posframe();
        pos.setVisible(true);
    }//GEN-LAST:event_resetbuttonActionPerformed

    private void exitbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitbuttonActionPerformed
        int yesno = JOptionPane.showConfirmDialog(null, "Are you sure you want to Exit? This will bring you back to Login.", "WARNING!", JOptionPane.YES_NO_OPTION);
        if (yesno == JOptionPane.YES_OPTION) {
            dispose();
            loginframe login = new loginframe();
            login.setVisible(true);
        } else {
        }
    }//GEN-LAST:event_exitbuttonActionPerformed

    private void inventoryListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inventoryListMouseClicked
        int selectedRowIndex = inventoryList.getSelectedRow();

        String productName = inventoryList.getValueAt(selectedRowIndex, 1).toString();
        double price = Double.parseDouble(inventoryList.getValueAt(selectedRowIndex, 4).toString());

        int quantity = 1;

        DefaultTableModel model = (DefaultTableModel) overviewTable.getModel();

        boolean productExists = false;
        for (int i = 0; i < model.getRowCount(); i++) {
            String existingProductName = model.getValueAt(i, 0).toString();
            if (existingProductName.equals(productName)) {
                double existingPrice = Double.parseDouble(model.getValueAt(i, 1).toString());
                int existingQuantity = Integer.parseInt(model.getValueAt(i, 2).toString());
                double updatedPrice = existingPrice;
                int updatedQuantity = existingQuantity + quantity;
                String formattedPrice = String.format("%.2f", updatedPrice);

                model.setValueAt(formattedPrice, i, 1);
                model.setValueAt(updatedQuantity, i, 2);
                productExists = true;
                break;
            }
        }

        if (!productExists) {
            model.addRow(new Object[]{productName, price, quantity});
        }

        double subtotal = 0.0;
        for (int i = 0; i < model.getRowCount(); i++) {
            double itemPrice = Double.parseDouble(model.getValueAt(i, 1).toString());
            int itemQuantity = Integer.parseInt(model.getValueAt(i, 2).toString());
            subtotal += itemPrice * itemQuantity;
        }

        double taxRate = 0.10;
        double tax = subtotal * taxRate;
        double totalPrice = subtotal + tax;

        subtotaltext.setText(String.format("%.2f", subtotal));
        taxtext.setText(String.format("%.2f", tax));
        totaltext.setText(String.format("%.2f", totalPrice));
    }//GEN-LAST:event_inventoryListMouseClicked

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new posframe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField cashfield;
    private javax.swing.JLabel changefield;
    private javax.swing.JTextField discountfield;
    private javax.swing.JButton exitbutton;
    private javax.swing.JTable inventoryList;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JComboBox<String> mop;
    public static javax.swing.JTable overviewTable;
    private javax.swing.JButton paybutton;
    private javax.swing.JButton removebutton;
    private javax.swing.JButton resetbutton;
    private javax.swing.JLabel subtotaltext;
    private javax.swing.JLabel taxtext;
    private javax.swing.JLabel totaltext;
    // End of variables declaration//GEN-END:variables
}
