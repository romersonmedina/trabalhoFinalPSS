package PresenterNotificacao;

import MainPresenter.PrincipalPresenter;
import View.NotificacaoView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ListSelectionModel;

public class NotificacaoPresenter {

    NotificacaoView view;
    NotificacaoTable table;
    NotificacaoPresenterState state;
    private PrincipalPresenter principalPresenter;

    public NotificacaoPresenter(PrincipalPresenter principalPresenter) {
        this.principalPresenter = principalPresenter;
        view = new NotificacaoView();
        table = new NotificacaoTable();

        view.getTblNotificacoes().setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        view.getBtnLer().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                state.ler();
            }
        });

        view.getBtnFechar().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                state.fechar();
            }
        });

        new CarregandoTabela(this, principalPresenter);

        principalPresenter.addView(view);
        view.setVisible(true);
    }

    public void setState(NotificacaoPresenterState state) {
        this.state = state;
    }
}
