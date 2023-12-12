package PresenterUsuarios;

import Observer.EventListerners;
import PresenterUsuariosCommand.AutorizarUsuarioCommand;
import PresenterUsuariosCommand.EnviarNotificacaoCommand;
import PresenterUsuariosCommand.CloseCommand;
import PresenterUsuariosCommand.RemoveCommand;
import MainPresenter.PrincipalPresenter;

public class TabelaCarregadaState extends UserPresenterState implements EventListerners {

    private PrincipalPresenter principalPresenter;

    public TabelaCarregadaState(UserPresenter presenter, PrincipalPresenter principalPresenter) {
        super(presenter);
        this.principalPresenter = principalPresenter;

        view.getBtnAutorizar().setEnabled(true);
        view.getBtnEnviarNotificacao().setEnabled(true);
        view.getBtnExcluir().setEnabled(true);

    }

    @Override
    public void autorizar() {
        new AutorizarUsuarioCommand(presenter, view, model).executar();
    }

    @Override
    public void remover() {
        new RemoveCommand(presenter, view, model).executar();
    }

    @Override
    public void enviarNotificacao() {
        new EnviarNotificacaoCommand(presenter, view, model, principalPresenter).executar();
    }

    @Override
    public void update(String mensagem) {

    }

    private void unsubcribe() {

    }

    @Override
    public void fechar() {
        new CloseCommand(presenter, view, model, principalPresenter).executar();
        unsubcribe();
    }
}
