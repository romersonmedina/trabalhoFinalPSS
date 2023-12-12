package PresenterNotificacao;

import Observer.EventListerners;
import PresenterNotificacaoCommand.CloseCommand;
import PresenterNotificacaoCommand.ReadCommand;
import MainPresenter.PrincipalPresenter;

public class TabelaPresenter extends NotificacaoPresenterState implements EventListerners {

    public TabelaPresenter(NotificacaoPresenter presenter, PrincipalPresenter principalPresenter) {
        super(presenter, principalPresenter);
        presenter.view.getBtnLer().setEnabled(true);
        presenter.view.getBtnFechar().setEnabled(true);
    }

    @Override
    public void ler() {
        new ReadCommand(presenter.view, presenter.table).executar();
    }

    @Override
    public void update(String mensagem) {

    }

    @Override
    public void fechar() {
        new CloseCommand(presenter.view, principalPresenter).executar();
    }
}
