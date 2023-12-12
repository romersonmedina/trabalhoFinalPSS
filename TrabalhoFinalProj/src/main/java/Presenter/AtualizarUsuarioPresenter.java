package Presenter;

import MainPresenter.PrincipalPresenter;

import View.RegistraUsuarioView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class AtualizarUsuarioPresenter {

    private RegistraUsuarioView view;
    private PrincipalPresenter principalPresenter;

    public AtualizarUsuarioPresenter(PrincipalPresenter principalPresenter) {
        this.principalPresenter = principalPresenter;
        view = new RegistraUsuarioView();
        view.setTitle("Atualizar senha");

        view.getLblInvalidName().setVisible(false);
        view.getLblInvalidPassword().setVisible(false);
        view.getLblNomeUsuarioUso().setVisible(false);

        view.getTxtUserName().setEnabled(false);

        view.getBtnRegistre().setText("Atualizar");
        view.getBtnRegistre().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                atualizar();
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

    private void atualizar() {
        var senha = String.valueOf(view.getTxtPassword().getPassword());
        var confirmacaoSenha = String.valueOf(view.getTxtConfirmPassword().getPassword());

        boolean senhaConfere = senha.equals(confirmacaoSenha);
        List<String> recusas;

        if (senhaConfere) {
            view.getLblInvalidPassword().setVisible(false);

        }
    }
}