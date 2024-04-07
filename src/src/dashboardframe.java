package src;

import javax.swing.JOptionPane;

/**
 *
 * @author Allen Caingcoy
 */
public class dashboardframe extends javax.swing.JFrame {

    public dashboardframe() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dashboardpanel = new javax.swing.JPanel();
        dashboardlabel = new javax.swing.JLabel();
        inventorybutton = new javax.swing.JButton();
        shopbutton = new javax.swing.JButton();
        soldbutton = new javax.swing.JButton();
        soldoutbutton = new javax.swing.JButton();
        accountsbutton = new javax.swing.JButton();
        logoutbutton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(239, 238, 238));
        setMaximumSize(new java.awt.Dimension(760, 550));
        setMinimumSize(new java.awt.Dimension(760, 550));
        setSize(new java.awt.Dimension(760, 550));

        dashboardpanel.setBackground(new java.awt.Color(51, 51, 51));
        dashboardpanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(125, 249, 255), 2));
        dashboardpanel.setMaximumSize(new java.awt.Dimension(760, 550));
        dashboardpanel.setMinimumSize(new java.awt.Dimension(760, 550));
        dashboardpanel.setPreferredSize(new java.awt.Dimension(760, 550));
        dashboardpanel.setSize(new java.awt.Dimension(760, 550));

        dashboardlabel.setFont(new java.awt.Font("Monaco", 1, 64)); // NOI18N
        dashboardlabel.setForeground(new java.awt.Color(125, 249, 255));
        dashboardlabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dashboardlabel.setText("DASHBOARD");
        dashboardlabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        inventorybutton.setFont(new java.awt.Font("Monaco", 0, 12)); // NOI18N
        inventorybutton.setForeground(new java.awt.Color(125, 249, 255));
        inventorybutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rsc/inventory.png"))); // NOI18N
        inventorybutton.setText("Inventory");
        inventorybutton.setBorder(null);
        inventorybutton.setBorderPainted(false);
        inventorybutton.setContentAreaFilled(false);
        inventorybutton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        inventorybutton.setMaximumSize(new java.awt.Dimension(128, 148));
        inventorybutton.setMinimumSize(new java.awt.Dimension(128, 148));
        inventorybutton.setPreferredSize(new java.awt.Dimension(128, 148));
        inventorybutton.setSize(new java.awt.Dimension(128, 148));
        inventorybutton.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        inventorybutton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        inventorybutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inventorybuttonActionPerformed(evt);
            }
        });

        shopbutton.setFont(new java.awt.Font("Monaco", 0, 12)); // NOI18N
        shopbutton.setForeground(new java.awt.Color(125, 249, 255));
        shopbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rsc/shop.png"))); // NOI18N
        shopbutton.setText("Shop");
        shopbutton.setBorder(null);
        shopbutton.setBorderPainted(false);
        shopbutton.setContentAreaFilled(false);
        shopbutton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        shopbutton.setMaximumSize(new java.awt.Dimension(128, 148));
        shopbutton.setMinimumSize(new java.awt.Dimension(128, 148));
        shopbutton.setPreferredSize(new java.awt.Dimension(128, 148));
        shopbutton.setSize(new java.awt.Dimension(128, 148));
        shopbutton.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        shopbutton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        shopbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                shopbuttonActionPerformed(evt);
            }
        });

        soldbutton.setFont(new java.awt.Font("Monaco", 0, 12)); // NOI18N
        soldbutton.setForeground(new java.awt.Color(125, 249, 255));
        soldbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rsc/log.png"))); // NOI18N
        soldbutton.setText("<html>&nbsp;&nbsp;Sold, Return<br>\n&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Refund</html>\n");
        soldbutton.setActionCommand("Sold, Return /n\nRefund");
        soldbutton.setBorder(null);
        soldbutton.setBorderPainted(false);
        soldbutton.setContentAreaFilled(false);
        soldbutton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        soldbutton.setMaximumSize(new java.awt.Dimension(128, 148));
        soldbutton.setMinimumSize(new java.awt.Dimension(128, 148));
        soldbutton.setPreferredSize(new java.awt.Dimension(128, 148));
        soldbutton.setSize(new java.awt.Dimension(128, 148));
        soldbutton.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        soldbutton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        soldbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                soldbuttonActionPerformed(evt);
            }
        });

        soldoutbutton.setFont(new java.awt.Font("Monaco", 0, 12)); // NOI18N
        soldoutbutton.setForeground(new java.awt.Color(125, 249, 255));
        soldoutbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rsc/soldout.png"))); // NOI18N
        soldoutbutton.setText("Out of Stock");
        soldoutbutton.setBorder(null);
        soldoutbutton.setBorderPainted(false);
        soldoutbutton.setContentAreaFilled(false);
        soldoutbutton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        soldoutbutton.setMaximumSize(new java.awt.Dimension(128, 148));
        soldoutbutton.setMinimumSize(new java.awt.Dimension(128, 148));
        soldoutbutton.setPreferredSize(new java.awt.Dimension(128, 148));
        soldoutbutton.setSize(new java.awt.Dimension(128, 148));
        soldoutbutton.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        soldoutbutton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        soldoutbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                soldoutbuttonActionPerformed(evt);
            }
        });

        accountsbutton.setFont(new java.awt.Font("Monaco", 0, 12)); // NOI18N
        accountsbutton.setForeground(new java.awt.Color(125, 249, 255));
        accountsbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rsc/accounts.png"))); // NOI18N
        accountsbutton.setText("Accounts");
        accountsbutton.setBorder(null);
        accountsbutton.setBorderPainted(false);
        accountsbutton.setContentAreaFilled(false);
        accountsbutton.setEnabled(false);
        accountsbutton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        accountsbutton.setMaximumSize(new java.awt.Dimension(128, 148));
        accountsbutton.setMinimumSize(new java.awt.Dimension(128, 148));
        accountsbutton.setPreferredSize(new java.awt.Dimension(128, 148));
        accountsbutton.setSize(new java.awt.Dimension(128, 148));
        accountsbutton.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        accountsbutton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        accountsbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                accountsbuttonActionPerformed(evt);
            }
        });

        logoutbutton.setFont(new java.awt.Font("Monaco", 0, 12)); // NOI18N
        logoutbutton.setForeground(new java.awt.Color(125, 249, 255));
        logoutbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rsc/logout.png"))); // NOI18N
        logoutbutton.setText("Logout");
        logoutbutton.setBorder(null);
        logoutbutton.setBorderPainted(false);
        logoutbutton.setContentAreaFilled(false);
        logoutbutton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        logoutbutton.setMaximumSize(new java.awt.Dimension(128, 148));
        logoutbutton.setMinimumSize(new java.awt.Dimension(128, 148));
        logoutbutton.setPreferredSize(new java.awt.Dimension(128, 148));
        logoutbutton.setSize(new java.awt.Dimension(128, 148));
        logoutbutton.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        logoutbutton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        logoutbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutbuttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout dashboardpanelLayout = new javax.swing.GroupLayout(dashboardpanel);
        dashboardpanel.setLayout(dashboardpanelLayout);
        dashboardpanelLayout.setHorizontalGroup(
            dashboardpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dashboardpanelLayout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addGroup(dashboardpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dashboardlabel, javax.swing.GroupLayout.DEFAULT_SIZE, 576, Short.MAX_VALUE)
                    .addGroup(dashboardpanelLayout.createSequentialGroup()
                        .addGroup(dashboardpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(inventorybutton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(soldoutbutton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(dashboardpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(dashboardpanelLayout.createSequentialGroup()
                                .addComponent(shopbutton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(soldbutton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(dashboardpanelLayout.createSequentialGroup()
                                .addComponent(accountsbutton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(logoutbutton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(90, 90, 90))
        );
        dashboardpanelLayout.setVerticalGroup(
            dashboardpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dashboardpanelLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(dashboardlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(dashboardpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(inventorybutton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(shopbutton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(soldbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(dashboardpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(soldoutbutton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(accountsbutton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(logoutbutton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(64, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dashboardpanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dashboardpanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(760, 578));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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

    private void soldbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_soldbuttonActionPerformed
        dispose();
        soldframe sold = new soldframe();
        sold.setVisible(true);
    }//GEN-LAST:event_soldbuttonActionPerformed

    private void soldoutbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_soldoutbuttonActionPerformed
        dispose();
        soldoutframe soldout = new soldoutframe();
        soldout.setVisible(true);
    }//GEN-LAST:event_soldoutbuttonActionPerformed

    private void accountsbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_accountsbuttonActionPerformed
        dispose();
        accountsframe accounts = new accountsframe();
        accounts.setVisible(true);
    }//GEN-LAST:event_accountsbuttonActionPerformed

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
                new dashboardframe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton accountsbutton;
    private javax.swing.JLabel dashboardlabel;
    private javax.swing.JPanel dashboardpanel;
    public static javax.swing.JButton inventorybutton;
    private javax.swing.JButton logoutbutton;
    private javax.swing.JButton shopbutton;
    private javax.swing.JButton soldbutton;
    private javax.swing.JButton soldoutbutton;
    // End of variables declaration//GEN-END:variables
}
