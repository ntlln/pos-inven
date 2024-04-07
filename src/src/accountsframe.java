package src;

import db.connect;
import java.awt.Color;
import java.sql.*;
import java.util.Random;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author Allen Caingcoy
 */
public class accountsframe extends javax.swing.JFrame {

    public accountsframe() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        namefield = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        usernamefield = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        passwordfield = new javax.swing.JPasswordField();
        confirmpass = new javax.swing.JPasswordField();
        showpass = new javax.swing.JCheckBox();
        forgotpass = new javax.swing.JButton();
        addaccount = new javax.swing.JButton();
        backbutton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(400, 550));
        setMinimumSize(new java.awt.Dimension(400, 550));
        setSize(new java.awt.Dimension(400, 550));

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setMaximumSize(new java.awt.Dimension(400, 550));
        jPanel1.setMinimumSize(new java.awt.Dimension(400, 550));
        jPanel1.setPreferredSize(new java.awt.Dimension(400, 550));
        jPanel1.setSize(new java.awt.Dimension(400, 550));

        jLabel1.setFont(new java.awt.Font("Monaco", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Accounts");

        jLabel2.setFont(new java.awt.Font("Monaco", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 255, 255));
        jLabel2.setText("Name");

        namefield.setBackground(new java.awt.Color(51, 51, 51));
        namefield.setFont(new java.awt.Font("Monaco", 0, 14)); // NOI18N
        namefield.setForeground(new java.awt.Color(0, 255, 255));
        namefield.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 255)));
        namefield.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                namefieldFocusGained(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Monaco", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 255, 255));
        jLabel3.setText("Username");

        usernamefield.setBackground(new java.awt.Color(51, 51, 51));
        usernamefield.setFont(new java.awt.Font("Monaco", 0, 14)); // NOI18N
        usernamefield.setForeground(new java.awt.Color(0, 255, 255));
        usernamefield.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 255)));
        usernamefield.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                usernamefieldFocusGained(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Monaco", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 255, 255));
        jLabel4.setText("Password");

        passwordfield.setBackground(new java.awt.Color(51, 51, 51));
        passwordfield.setFont(new java.awt.Font("Monaco", 0, 14)); // NOI18N
        passwordfield.setForeground(new java.awt.Color(0, 255, 255));
        passwordfield.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 255)));
        passwordfield.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                passwordfieldFocusGained(evt);
            }
        });

        confirmpass.setBackground(new java.awt.Color(51, 51, 51));
        confirmpass.setFont(new java.awt.Font("Monaco", 0, 14)); // NOI18N
        confirmpass.setForeground(new java.awt.Color(0, 255, 255));
        confirmpass.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 255)));
        confirmpass.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                confirmpassFocusGained(evt);
            }
        });

        showpass.setFont(new java.awt.Font("Monaco", 0, 12)); // NOI18N
        showpass.setForeground(new java.awt.Color(0, 255, 255));
        showpass.setText("Show Password");
        showpass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showpassActionPerformed(evt);
            }
        });

        forgotpass.setFont(new java.awt.Font("Monaco", 0, 12)); // NOI18N
        forgotpass.setForeground(new java.awt.Color(0, 255, 255));
        forgotpass.setText("Forgot Password");
        forgotpass.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 255)));
        forgotpass.setBorderPainted(false);
        forgotpass.setContentAreaFilled(false);
        forgotpass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                forgotpassActionPerformed(evt);
            }
        });

        addaccount.setFont(new java.awt.Font("Monaco", 0, 14)); // NOI18N
        addaccount.setForeground(new java.awt.Color(0, 255, 255));
        addaccount.setText("ADD");
        addaccount.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 255)));
        addaccount.setContentAreaFilled(false);
        addaccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addaccountActionPerformed(evt);
            }
        });

        backbutton.setFont(new java.awt.Font("Monaco", 0, 14)); // NOI18N
        backbutton.setForeground(new java.awt.Color(255, 0, 0));
        backbutton.setText("BACK");
        backbutton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));
        backbutton.setContentAreaFilled(false);
        backbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbuttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(confirmpass, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                    .addComponent(passwordfield, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                    .addComponent(usernamefield, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                    .addComponent(namefield, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(addaccount, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(backbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(forgotpass, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                    .addComponent(showpass, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(100, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(namefield, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(usernamefield, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(passwordfield, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(confirmpass, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(showpass, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(forgotpass, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addaccount, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(backbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(110, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(400, 578));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void showpassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showpassActionPerformed
        if (showpass.isSelected()) {
            passwordfield.setEchoChar((char) 0);
            confirmpass.setEchoChar((char) 0);
        } else {
            passwordfield.setEchoChar('*');
            confirmpass.setEchoChar('*');
        }
    }//GEN-LAST:event_showpassActionPerformed

    private void forgotpassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_forgotpassActionPerformed
        String url = connect.url;
        String user = connect.user;
        String dbPassword = connect.password;

        String enteredID = JOptionPane.showInputDialog(null, "Enter your ID:");
        int id = Integer.parseInt(enteredID);

        try (Connection connection = DriverManager.getConnection(url, user, dbPassword)) {
            String selectQuery = "SELECT Name, Username FROM accountsTable WHERE ID = ?";
            PreparedStatement selectStatement = connection.prepareStatement(selectQuery);
            selectStatement.setInt(1, id);
            ResultSet resultSet = selectStatement.executeQuery();

            if (resultSet.next()) {
                String name = resultSet.getString("Name");
                String username = resultSet.getString("Username");

                namefield.setText(name);
                usernamefield.setText(username);

                int option = JOptionPane.showConfirmDialog(null, "Do you want to update your information?", "Update Information", JOptionPane.YES_NO_OPTION);
                if (option == JOptionPane.YES_OPTION) {
                    boolean dataMatch = false;
                    while (!dataMatch) {
                        JTextField nameField = new JTextField(name);
                        JTextField usernameField = new JTextField(username);
                        JPasswordField passwordField = new JPasswordField();
                        JPasswordField confirmPasswordField = new JPasswordField();
                        Object[] message = {
                            "Name:", nameField,
                            "Username:", usernameField,
                            "New Password:", passwordField,
                            "Confirm Password:", confirmPasswordField
                        };
                        int confirmOption = JOptionPane.showConfirmDialog(null, message, "Enter New Information", JOptionPane.OK_CANCEL_OPTION);

                        if (confirmOption == JOptionPane.OK_OPTION) {
                            String newName = nameField.getText();
                            String newUsername = usernameField.getText();
                            char[] newPasswordChars = passwordField.getPassword();
                            char[] confirmPasswordChars = confirmPasswordField.getPassword();
                            String newPassword = new String(newPasswordChars);
                            String confirmPassword = new String(confirmPasswordChars);

                            if (newPassword.length() < 6) {
                                JOptionPane.showMessageDialog(null, "Password should have at least 6 characters.", "Error", JOptionPane.ERROR_MESSAGE);
                            } else if (!newPassword.equals(confirmPassword)) {
                                JOptionPane.showMessageDialog(null, "Passwords do not match. Please try again.", "Error", JOptionPane.ERROR_MESSAGE);
                            } else {
                                int confirmation = JOptionPane.showConfirmDialog(null, "Confirm changes?", "Confirmation", JOptionPane.YES_NO_OPTION);
                                if (confirmation == JOptionPane.YES_OPTION) {
                                    String updateQuery = "UPDATE accountsTable SET Name = ?, Username = ?, Password = ? WHERE ID = ?";
                                    PreparedStatement updateStatement = connection.prepareStatement(updateQuery);
                                    updateStatement.setString(1, newName);
                                    updateStatement.setString(2, newUsername);
                                    updateStatement.setString(3, newPassword);
                                    updateStatement.setInt(4, id);
                                    updateStatement.executeUpdate();
                                    JOptionPane.showMessageDialog(null, "Information updated successfully.", "Success", JOptionPane.INFORMATION_MESSAGE);
                                }
                                dataMatch = true;
                            }
                        } else {
                            JOptionPane.showMessageDialog(null, "Information update canceled.", "Canceled", JOptionPane.INFORMATION_MESSAGE);
                            dataMatch = true;
                        }
                    }
                }
            } else {
                JOptionPane.showMessageDialog(null, "ID not found.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_forgotpassActionPerformed

    private void addaccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addaccountActionPerformed
        String name = namefield.getText();
        String username = usernamefield.getText();
        String password = passwordfield.getText();
        String confirmPassword = confirmpass.getText();

        if (name.isEmpty() || username.isEmpty() || password.isEmpty() || confirmPassword.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please fill in all the fields.");
            namefield.setBorder(BorderFactory.createLineBorder(Color.red));
            usernamefield.setBorder(BorderFactory.createLineBorder(Color.red));
            passwordfield.setBorder(BorderFactory.createLineBorder(Color.red));
            confirmpass.setBorder(BorderFactory.createLineBorder(Color.red));
        } else if (!password.equals(confirmPassword)) {
            JOptionPane.showMessageDialog(null, "Passwords do not match.");
            passwordfield.setBorder(BorderFactory.createLineBorder(Color.RED));
            confirmpass.setBorder(BorderFactory.createLineBorder(Color.RED));
        } else if (password.length() < 6) {
            JOptionPane.showMessageDialog(null, "Password should have at least 6 characters.");
            passwordfield.setBorder(BorderFactory.createLineBorder(Color.RED));
        } else {
            namefield.setText("");
            usernamefield.setText("");
            passwordfield.setText("");
            confirmpass.setText("");
            showpass.setSelected(false);

            String url = connect.url;
            String user = connect.user;
            String dbPassword = connect.password;

            try (Connection connection = DriverManager.getConnection(url, user, dbPassword)) {
                Random random = new Random();
                int nextID = random.nextInt(900000) + 100000;

                String insertQuery = "INSERT INTO accountsTable (ID, Name, Username, Password) VALUES (?, ?, ?, ?)";
                PreparedStatement insertStatement = connection.prepareStatement(insertQuery);
                insertStatement.setInt(1, nextID);
                insertStatement.setString(2, name);
                insertStatement.setString(3, username);
                insertStatement.setString(4, password);
                insertStatement.executeUpdate();

                String selectQuery = "SELECT ID FROM accountsTable WHERE Name = ? AND Username = ? AND Password = ?";
                PreparedStatement selectStatement = connection.prepareStatement(selectQuery);
                selectStatement.setString(1, name);
                selectStatement.setString(2, username);
                selectStatement.setString(3, password);
                ResultSet resultSet = selectStatement.executeQuery();

                int generatedID = 0;
                if (resultSet.next()) {
                    generatedID = resultSet.getInt("ID");
                }

                JOptionPane.showMessageDialog(null, "Account Added\nID: " + generatedID);
                System.out.println("Data saved to the database.");
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_addaccountActionPerformed

    private void backbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbuttonActionPerformed
        int yesno = JOptionPane.showConfirmDialog(null, "Are you sure you want to exit? This will bring you back to dashboard.", "WARNING", JOptionPane.YES_NO_OPTION);
        if (yesno == JOptionPane.YES_OPTION) {
            dispose();
            dashboardframe dashboard = new dashboardframe();
            dashboard.setVisible(true);
        } else {
        }
    }//GEN-LAST:event_backbuttonActionPerformed

    private void passwordfieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passwordfieldFocusGained
        passwordfield.setBorder(BorderFactory.createLineBorder(Color.cyan));
    }//GEN-LAST:event_passwordfieldFocusGained

    private void confirmpassFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_confirmpassFocusGained
        confirmpass.setBorder(BorderFactory.createLineBorder(Color.cyan));
    }//GEN-LAST:event_confirmpassFocusGained

    private void namefieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_namefieldFocusGained
        namefield.setBorder(BorderFactory.createLineBorder(Color.cyan));
    }//GEN-LAST:event_namefieldFocusGained

    private void usernamefieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_usernamefieldFocusGained
        usernamefield.setBorder(BorderFactory.createLineBorder(Color.cyan));
    }//GEN-LAST:event_usernamefieldFocusGained

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new accountsframe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addaccount;
    private javax.swing.JButton backbutton;
    private javax.swing.JPasswordField confirmpass;
    private javax.swing.JButton forgotpass;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField namefield;
    private javax.swing.JPasswordField passwordfield;
    private javax.swing.JCheckBox showpass;
    private javax.swing.JTextField usernamefield;
    // End of variables declaration//GEN-END:variables
}
