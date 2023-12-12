package PresenterUsuarios;

import MainPresenter.PrincipalPresenter;

import View.ListaUsuarioView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ListSelectionModel;

public class UserPresenter {

    private ListaUsuarioView view;
    private UsuarioPresenter model;
    private UserPresenterState state;
    private PrincipalPresenter principalPresenter;

    public UserPresenter(PrincipalPresenter principalPresenter) {
        this.principalPresenter = principalPresenter;
        view = new ListaUsuarioView();
        model = new UsuarioPresenter();
        view.getTblUsuarios().setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        view.getTblUsuarios().setModel(model);
        view.getBtnAutorizar().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                state.autorizar();
            }
        });

        view.getBtnExcluir().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                state.remover();
            }
        });

        view.getBtnfechar().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                state.fechar();
            }
        });

        view.getBtnEnviarNotificacao().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                state.enviarNotificacao();
            }
        });

        new CarregandoTabelaState(this, principalPresenter);

        principalPresenter.addView(view);
        view.setVisible(true);
    }

    protected ListaUsuarioView getView() {
        return view;
    }

    UsuarioPresenter getModel() {
        return model;
    }

    public void setState(UserPresenterState state) {
        this.state = state;
    }
}
