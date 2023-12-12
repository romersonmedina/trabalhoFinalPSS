package Presenter;

import MainPresenter.PrincipalPresenter;

import View.OpcaoAcessoView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AcessoPresenter {

    private OpcaoAcessoView view;
    private PrincipalPresenter principalPresenter;

    public AcessoPresenter(PrincipalPresenter principalPresenter) {
        this.principalPresenter = principalPresenter;
        view = new OpcaoAcessoView();

        view.getBtnRegistra().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cadastrar();
            }
        });

        principalPresenter.addView(view);
        view.setVisible(true);
    }

    private void logar() {
        view.dispose();
        principalPresenter.removerView(view);
        new LoginPresenter(principalPresenter);
    }

    private void cadastrar() {
        view.dispose();
        principalPresenter.removerView(view);
        new RegistrarUsuarioPresenter(principalPresenter);
    }
}
