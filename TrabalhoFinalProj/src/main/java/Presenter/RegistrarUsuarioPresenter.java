package Presenter;

import MainPresenter.PrincipalPresenter;
import View.RegistraUsuarioView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class RegistrarUsuarioPresenter {

    private RegistraUsuarioView view;
    private PrincipalPresenter principalPresenter;

    public RegistrarUsuarioPresenter(PrincipalPresenter principalPresenter) {
        this.principalPresenter = principalPresenter;
        view = new RegistraUsuarioView();

        view.getLblInvalidPassword().setVisible(false);
        view.getLblInvalidName().setVisible(false);
        view.getLblNomeUsuarioUso().setVisible(false);

        view.getBtnRegistre().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                registrar();
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

    private void registrar() {
        String nome = this.view.getTxtUserName().getText();
        String senha = String.valueOf(this.view.getTxtPassword().getPassword());
        String confirmacaoSenha = String.valueOf(this.view.getTxtConfirmPassword().getPassword());
        boolean senhaConfere = senha.equals(confirmacaoSenha);

        if (!senhaConfere) {
            view.getLblInvalidPassword().setVisible(true);
            return;
        }
        view.getLblInvalidPassword().setVisible(false);

        JOptionPane.showMessageDialog(
                null,
                "Cadastrado com sucesso",
                "Sucesso",
                JOptionPane.INFORMATION_MESSAGE
        );

    }
}
