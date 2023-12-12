package MainPresenterCommand;

import PresenterNotificacao.NotificacaoPresenter;
import MainPresenter.PrincipalPresenter;

public class VerNotificacoes extends PrincipalCommand {

    public VerNotificacoes(PrincipalPresenter principalPresenter) {
        super(principalPresenter);
    }

    @Override
    public void executar() {
        new NotificacaoPresenter(principalPresenter);
    }
}
