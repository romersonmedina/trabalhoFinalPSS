package View;

import java.awt.Component;
import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

public class PrincipalView extends javax.swing.JFrame {

    /**
     * Creates new form PrincipalView
     */
    public PrincipalView() {
        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH);
        setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlPrincipal = new javax.swing.JDesktopPane();
        pnlBottom = new javax.swing.JPanel();
        lblUserName = new javax.swing.JLabel();
        btnAmountNotifications = new javax.swing.JButton();
        lblUserType = new javax.swing.JLabel();
        menuBar = new javax.swing.JMenuBar();
        btnAdmin = new javax.swing.JMenu();
        btnListUsers = new javax.swing.JMenuItem();
        btnAddUser = new javax.swing.JMenuItem();
        btnConfig = new javax.swing.JMenuItem();
        btnUser = new javax.swing.JMenu();
        btnChangePassword = new javax.swing.JMenuItem();
        btnViewNotificaition = new javax.swing.JMenuItem();
        btnLogout = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Software para acesso de usuários ao sistema");
        setBackground(javax.swing.UIManager.getDefaults().getColor("Button.background"));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setFocusTraversalPolicyProvider(true);

        javax.swing.GroupLayout pnlPrincipalLayout = new javax.swing.GroupLayout(pnlPrincipal);
        pnlPrincipal.setLayout(pnlPrincipalLayout);
        pnlPrincipalLayout.setHorizontalGroup(
            pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 898, Short.MAX_VALUE)
        );
        pnlPrincipalLayout.setVerticalGroup(
            pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 342, Short.MAX_VALUE)
        );

        pnlBottom.setBackground(new java.awt.Color(255, 255, 255));

        lblUserName.setBackground(new java.awt.Color(255, 255, 255));
        lblUserName.setForeground(new java.awt.Color(0, 0, 0));
        lblUserName.setText("jLabel1");

        btnAmountNotifications.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAmountNotificationsActionPerformed(evt);
            }
        });

        lblUserType.setForeground(new java.awt.Color(0, 0, 0));
        lblUserType.setText("jLabel1");

        javax.swing.GroupLayout pnlBottomLayout = new javax.swing.GroupLayout(pnlBottom);
        pnlBottom.setLayout(pnlBottomLayout);
        pnlBottomLayout.setHorizontalGroup(
            pnlBottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBottomLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(255, 255, 255)
                .addComponent(lblUserType, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAmountNotifications, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );
        pnlBottomLayout.setVerticalGroup(
            pnlBottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBottomLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlBottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblUserType, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                    .addComponent(btnAmountNotifications, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblUserName, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        menuBar.setPreferredSize(new java.awt.Dimension(91, 40));

        btnAdmin.setMnemonic('e');
        btnAdmin.setText("Administrador");

        btnListUsers.setMnemonic('t');
        btnListUsers.setText("Listar Usuários");
        btnListUsers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListUsersActionPerformed(evt);
            }
        });
        btnAdmin.add(btnListUsers);

        btnAddUser.setMnemonic('y');
        btnAddUser.setText("Adicionar Usuário");
        btnAddUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddUserActionPerformed(evt);
            }
        });
        btnAdmin.add(btnAddUser);

        btnConfig.setText("Configuraçoes");
        btnAdmin.add(btnConfig);

        menuBar.add(btnAdmin);

        btnUser.setMnemonic('f');
        btnUser.setText("Usuário");

        btnChangePassword.setMnemonic('o');
        btnChangePassword.setText("Alterar senha");
        btnChangePassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChangePasswordActionPerformed(evt);
            }
        });
        btnUser.add(btnChangePassword);

        btnViewNotificaition.setMnemonic('s');
        btnViewNotificaition.setText("Ver notificações");
        btnUser.add(btnViewNotificaition);

        btnLogout.setText("Sair");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });
        btnUser.add(btnLogout);

        menuBar.add(btnUser);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlPrincipal, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlBottom, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlPrincipal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlBottom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnChangePasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChangePasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnChangePasswordActionPerformed

    private void btnListUsersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListUsersActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnListUsersActionPerformed

    private void btnAmountNotificationsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAmountNotificationsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAmountNotificationsActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void btnAddUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAddUserActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem btnAddUser;
    private javax.swing.JMenu btnAdmin;
    private javax.swing.JButton btnAmountNotifications;
    private javax.swing.JMenuItem btnChangePassword;
    private javax.swing.JMenuItem btnConfig;
    private javax.swing.JMenuItem btnListUsers;
    private javax.swing.JMenuItem btnLogout;
    private javax.swing.JMenu btnUser;
    private javax.swing.JMenuItem btnViewNotificaition;
    private javax.swing.JLabel lblUserName;
    private javax.swing.JLabel lblUserType;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JPanel pnlBottom;
    private javax.swing.JDesktopPane pnlPrincipal;
    // End of variables declaration//GEN-END:variables

    public JMenuItem getBtnAddUsuario() {
        return btnAddUser;
    }

    public JMenu getBtnAdiministrador() {
        return btnAdmin;
    }

    public JButton getBtnQtdNotificacoes() {
        return btnAmountNotifications;
    }

    public JMenuItem getBtnAlterarSenha() {
        return btnChangePassword;
    }

    public JMenuItem getBtnConfig() {
        return btnConfig;
    }

    public JMenuItem getBtnSair() {
        return btnLogout;
    }

    public JMenuItem getBtnListarUsuario() {
        return btnListUsers;
    }

    public JMenu getBtnUsuario() {
        return btnUser;
    }

    public JMenuItem getBtnVerNotificacoes() {
        return btnViewNotificaition;
    }

    public JLabel getLblNomeUsuario() {
        return lblUserName;
    }

    public JLabel getLblTipoUsuario() {
        return lblUserType;
    }

    public JDesktopPane getPnlPrincipal() {
        return pnlPrincipal;
    }

    public JPanel getPnlInferior() {
        return pnlBottom;
    }

    public void addView(Component c) {
        pnlPrincipal.add(c);
    }

    public void removerView(Component c) {
        pnlPrincipal.remove(c);
    }

}
