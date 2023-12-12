package MainPresenterCommand;

import Presenter.AtualizarUsuarioPresenter;
import MainPresenter.PrincipalPresenter;

public class AlterarSenha extends PrincipalCommand {

    public AlterarSenha(PrincipalPresenter principalPresenter) {
        super(principalPresenter);
    }

    @Override
    public void executar() {
        new AtualizarUsuarioPresenter(principalPresenter);
    }
}
