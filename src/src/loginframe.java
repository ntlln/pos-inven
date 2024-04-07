package src;

import db.connect;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.sql.*;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.Timer;

/**
 *
 * @author Allen Caingcoy
 */
public class loginframe extends javax.swing.JFrame {

    public int attempts = 3;
    public String adminUser = "admin", adminPass = "admin";

    public loginframe() {
        initComponents();
        progressbar.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        idfield = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        passwordfield = new javax.swing.JPasswordField();
        loginbutton = new javax.swing.JButton();
        exitbutton = new javax.swing.JButton();
        showpass = new javax.swing.JCheckBox();
        progressbar = new javax.swing.JProgressBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(500, 400));
        setMinimumSize(new java.awt.Dimension(500, 400));

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 255)));

        jLabel1.setFont(new java.awt.Font("Monaco", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Login");

        jLabel2.setFont(new java.awt.Font("Monaco", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 255, 255));
        jLabel2.setText("ID");

        idfield.setBackground(new java.awt.Color(51, 51, 51));
        idfield.setFont(new java.awt.Font("Monaco", 0, 14)); // NOI18N
        idfield.setForeground(new java.awt.Color(0, 255, 255));
        idfield.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 255)));
        idfield.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                idfieldFocusGained(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Monaco", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 255, 255));
        jLabel3.setText("Password");

        passwordfield.setBackground(new java.awt.Color(51, 51, 51));
        passwordfield.setFont(new java.awt.Font("Monaco", 0, 14)); // NOI18N
        passwordfield.setForeground(new java.awt.Color(0, 255, 255));
        passwordfield.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 255)));
        passwordfield.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                passwordfieldFocusGained(evt);
            }
        });
        passwordfield.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                passwordfieldKeyReleased(evt);
            }
        });

        loginbutton.setFont(new java.awt.Font("Monaco", 0, 14)); // NOI18N
        loginbutton.setForeground(new java.awt.Color(0, 255, 255));
        loginbutton.setText("Login");
        loginbutton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 255)));
        loginbutton.setContentAreaFilled(false);
        loginbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginbuttonActionPerformed(evt);
            }
        });

        exitbutton.setFont(new java.awt.Font("Monaco", 0, 14)); // NOI18N
        exitbutton.setForeground(new java.awt.Color(255, 0, 0));
        exitbutton.setText("Exit");
        exitbutton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));
        exitbutton.setContentAreaFilled(false);
        exitbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitbuttonActionPerformed(evt);
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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(125, 125, 125)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(showpass, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(loginbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(exitbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                        .addComponent(idfield, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                        .addComponent(passwordfield)))
                .addContainerGap(123, Short.MAX_VALUE))
            .addComponent(progressbar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(idfield, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(passwordfield, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(showpass, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(loginbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(exitbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addComponent(progressbar, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
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

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void showpassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showpassActionPerformed
        if (showpass.isSelected()) {
            passwordfield.setEchoChar((char) 0);
        } else {
            passwordfield.setEchoChar('*');
        }
    }//GEN-LAST:event_showpassActionPerformed

    private void exitbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitbuttonActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitbuttonActionPerformed

    private void loginbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginbuttonActionPerformed
        String enteredUser = idfield.getText();
        String enteredPassword = new String(passwordfield.getPassword());

        if ("admin".equals(enteredUser)) {
            if (adminPass.equals(enteredPassword)) {
                progressbar.setVisible(true);
                Timer timer = new Timer(30, new ActionListener() {
                    private int progress = 0;

                    @Override
                    public void actionPerformed(ActionEvent e) {
                        progress++;
                        progressbar.setValue(progress);
                        if (progress >= 100) {
                            ((Timer) e.getSource()).stop();
                            JOptionPane.showMessageDialog(null, "Admin login successful.", "Success", JOptionPane.INFORMATION_MESSAGE);
                            dispose();
                            dashboardframe dashboard = new dashboardframe();
                            dashboardframe.accountsbutton.setEnabled(true);
                            dashboard.setVisible(true);
                        }
                    }
                });
                timer.start();
            } else {
                JOptionPane.showMessageDialog(null, "Incorrect admin password.", "Error", JOptionPane.ERROR_MESSAGE);
                passwordfield.setBorder(BorderFactory.createLineBorder(Color.red));
            }
        } else {
            try {
                int id = Integer.parseInt(enteredUser);
                String url = connect.url;
                String user = connect.user;
                String dbPassword = connect.password;

                try (Connection connection = DriverManager.getConnection(url, user, dbPassword)) {
                    String selectQuery = "SELECT Password FROM accountsTable WHERE ID = ?";
                    PreparedStatement selectStatement = connection.prepareStatement(selectQuery);
                    selectStatement.setInt(1, id);
                    ResultSet resultSet = selectStatement.executeQuery();

                    if (resultSet.next()) {
                        String password = resultSet.getString("Password");

                        if (password.equals(enteredPassword)) {
                            progressbar.setVisible(true);
                            Timer timer = new Timer(30, new ActionListener() {
                                private int progress = 0;

                                @Override
                                public void actionPerformed(ActionEvent e) {
                                    progress++;
                                    progressbar.setValue(progress);
                                    if (progress >= 100) {
                                        ((Timer) e.getSource()).stop();
                                        JOptionPane.showMessageDialog(null, "Login successful.", "Success", JOptionPane.INFORMATION_MESSAGE);
                                        dispose();
                                        dashboardframe dashboard = new dashboardframe();
                                        dashboard.setVisible(true);
                                    }
                                }
                            });
                            timer.start();
                        } else {
                            if (enteredPassword.length() >= 6) {
                                attempts--;

                                if (attempts > 0) {
                                    JOptionPane.showMessageDialog(null, "Incorrect password. Remaining attempts: " + attempts, "Error", JOptionPane.ERROR_MESSAGE);
                                    passwordfield.setText("");
                                    enteredPassword = new String(passwordfield.getPassword());
                                    passwordfield.setBorder(BorderFactory.createLineBorder(Color.red));
                                } else {
                                    String adminEnteredUser = JOptionPane.showInputDialog(null, "Enter admin username:", "Admin Login", JOptionPane.PLAIN_MESSAGE);
                                    String adminEnteredPassword = new String(JOptionPane.showInputDialog(null, "Enter admin password:", "Admin Login", JOptionPane.PLAIN_MESSAGE).toCharArray());

                                    if (adminUser.equals(adminEnteredUser) && adminPass.equals(adminEnteredPassword)) {
                                        JOptionPane.showMessageDialog(null, "Admin login successful.", "Success", JOptionPane.INFORMATION_MESSAGE);
                                        dispose();
                                        dashboardframe dashboard = new dashboardframe();
                                        dashboardframe.inventorybutton.setEnabled(true);
                                        dashboardframe.accountsbutton.setEnabled(true);
                                        dashboard.setVisible(true);
                                    } else {
                                        JOptionPane.showMessageDialog(null, "Invalid admin credentials. Exiting application.", "Error", JOptionPane.ERROR_MESSAGE);
                                        System.exit(0);
                                    }
                                }
                            } else {
                                JOptionPane.showMessageDialog(null, "Password requires 6 or more characters", "Error", JOptionPane.ERROR_MESSAGE);
                                passwordfield.setBorder(BorderFactory.createLineBorder(Color.red));
                            }
                        }
                    } else {
                        attempts--;
                        JOptionPane.showMessageDialog(null, "ID not found. Remaining attempts: " + attempts, "Error", JOptionPane.ERROR_MESSAGE);
                        idfield.setBorder(BorderFactory.createLineBorder(Color.red));
                    }
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Invalid ID. If an Admin enter proper username.", "Error", JOptionPane.ERROR_MESSAGE);
                idfield.setBorder(BorderFactory.createLineBorder(Color.red));
            }
        }
    }//GEN-LAST:event_loginbuttonActionPerformed

    private void passwordfieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passwordfieldKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            String enteredUser = idfield.getText();
            String enteredPassword = new String(passwordfield.getPassword());

            if ("admin".equals(enteredUser)) {
                if (adminPass.equals(enteredPassword)) {
                    progressbar.setVisible(true);
                    Timer timer = new Timer(30, new ActionListener() {
                        private int progress = 0;

                        @Override
                        public void actionPerformed(ActionEvent e) {
                            progress++;
                            progressbar.setValue(progress);
                            if (progress >= 100) {
                                ((Timer) e.getSource()).stop();
                                JOptionPane.showMessageDialog(null, "Admin login successful.", "Success", JOptionPane.INFORMATION_MESSAGE);
                                dispose();
                                dashboardframe dashboard = new dashboardframe();
                                dashboardframe.accountsbutton.setEnabled(true);
                                dashboard.setVisible(true);
                            }
                        }
                    });
                    timer.start();
                } else {
                    JOptionPane.showMessageDialog(null, "Incorrect admin password.", "Error", JOptionPane.ERROR_MESSAGE);
                    passwordfield.setBorder(BorderFactory.createLineBorder(Color.red));
                }
            } else {
                try {
                    int id = Integer.parseInt(enteredUser);
                    String url = connect.url;
                    String user = connect.user;
                    String dbPassword = connect.password;

                    try (Connection connection = DriverManager.getConnection(url, user, dbPassword)) {
                        String selectQuery = "SELECT Password FROM accountsTable WHERE ID = ?";
                        PreparedStatement selectStatement = connection.prepareStatement(selectQuery);
                        selectStatement.setInt(1, id);
                        ResultSet resultSet = selectStatement.executeQuery();

                        if (resultSet.next()) {
                            String password = resultSet.getString("Password");

                            if (password.equals(enteredPassword)) {
                                progressbar.setVisible(true);
                                Timer timer = new Timer(30, new ActionListener() {
                                    private int progress = 0;

                                    @Override
                                    public void actionPerformed(ActionEvent e) {
                                        progress++;
                                        progressbar.setValue(progress);
                                        if (progress >= 100) {
                                            ((Timer) e.getSource()).stop();
                                            JOptionPane.showMessageDialog(null, "Login successful.", "Success", JOptionPane.INFORMATION_MESSAGE);
                                            dispose();
                                            dashboardframe dashboard = new dashboardframe();
                                            dashboard.setVisible(true);
                                        }
                                    }
                                });
                                timer.start();
                            } else {
                                if (enteredPassword.length() >= 6) {
                                    attempts--;

                                    if (attempts > 0) {
                                        JOptionPane.showMessageDialog(null, "Incorrect password. Remaining attempts: " + attempts, "Error", JOptionPane.ERROR_MESSAGE);
                                        passwordfield.setText("");
                                        enteredPassword = new String(passwordfield.getPassword());
                                        passwordfield.setBorder(BorderFactory.createLineBorder(Color.red));
                                    } else {
                                        String adminEnteredUser = JOptionPane.showInputDialog(null, "Enter admin username:", "Admin Login", JOptionPane.PLAIN_MESSAGE);
                                        String adminEnteredPassword = new String(JOptionPane.showInputDialog(null, "Enter admin password:", "Admin Login", JOptionPane.PLAIN_MESSAGE).toCharArray());

                                        if (adminUser.equals(adminEnteredUser) && adminPass.equals(adminEnteredPassword)) {
                                            JOptionPane.showMessageDialog(null, "Admin login successful.", "Success", JOptionPane.INFORMATION_MESSAGE);
                                            dispose();
                                            dashboardframe dashboard = new dashboardframe();
                                            dashboardframe.inventorybutton.setEnabled(true);
                                            dashboardframe.accountsbutton.setEnabled(true);
                                            dashboard.setVisible(true);
                                        } else {
                                            JOptionPane.showMessageDialog(null, "Invalid admin credentials. Exiting application.", "Error", JOptionPane.ERROR_MESSAGE);
                                            System.exit(0);
                                        }
                                    }
                                } else {
                                    JOptionPane.showMessageDialog(null, "Password requires 6 or more characters", "Error", JOptionPane.ERROR_MESSAGE);
                                    passwordfield.setBorder(BorderFactory.createLineBorder(Color.red));
                                }
                            }
                        } else {
                            attempts--;
                            JOptionPane.showMessageDialog(null, "ID not found. Remaining attempts: " + attempts, "Error", JOptionPane.ERROR_MESSAGE);
                            idfield.setBorder(BorderFactory.createLineBorder(Color.red));
                        }
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Invalid ID. If an Admin enter proper username.", "Error", JOptionPane.ERROR_MESSAGE);
                    idfield.setBorder(BorderFactory.createLineBorder(Color.red));
                }
            }
        }
    }//GEN-LAST:event_passwordfieldKeyReleased

    private void idfieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_idfieldFocusGained
        idfield.setBorder(BorderFactory.createLineBorder(Color.cyan));
    }//GEN-LAST:event_idfieldFocusGained

    private void passwordfieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passwordfieldFocusGained
        passwordfield.setBorder(BorderFactory.createLineBorder(Color.cyan));
    }//GEN-LAST:event_passwordfieldFocusGained

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new loginframe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton exitbutton;
    private javax.swing.JTextField idfield;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton loginbutton;
    private javax.swing.JPasswordField passwordfield;
    private javax.swing.JProgressBar progressbar;
    private javax.swing.JCheckBox showpass;
    // End of variables declaration//GEN-END:variables
}
