package PresenterNotificacaoCommand;

import Command.Command;
import MainPresenter.PrincipalPresenter;
import View.NotificacaoView;

public class CloseCommand implements Command {

    private NotificacaoView view;
    private PrincipalPresenter principalPresenter;

    public CloseCommand(NotificacaoView view, PrincipalPresenter principalPresente) {
        this.view = view;
        this.principalPresenter = principalPresente;
    }

    @Override
    public void executar() {
        view.dispose();
        principalPresenter.removerView(view);
    }
}
