package Presenter;

import Observer.EventListerners;
import MainPresenter.PrincipalPresenter;
import View.LoginView;
import View.PrincipalView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class LoginPresenter implements EventListerners {

    private LoginView view;
    private PrincipalView principalView;
    private PrincipalPresenter principalPresenter;

    public LoginPresenter(PrincipalPresenter principalPresenter) {
        this.principalPresenter = principalPresenter;
        this.view = new LoginView();

        view.getLblNomeDeUsuarioOuSenhaInvalidos().setVisible(false);

        view.getBtnLogin().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                login();
            }
        });

        view.getBtnFechar().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        principalPresenter.addView(view);

        view.setVisible(true);
    }

    private void login() {
        String name = this.view.getTxtNomeUsuario().getText();
        String password = String.valueOf(this.view.getTxtSenha().getPassword());

    }

    @Override
    public void update(String mensagem) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
