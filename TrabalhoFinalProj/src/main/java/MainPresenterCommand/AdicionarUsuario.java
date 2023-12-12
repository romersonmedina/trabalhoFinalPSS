package MainPresenterCommand;

import Presenter.RegistrarUsuarioPresenter;
import MainPresenter.PrincipalPresenter;

public class AdicionarUsuario extends PrincipalCommand {

    public AdicionarUsuario(PrincipalPresenter principalPresenter) {
        super(principalPresenter);
    }

    @Override
    public void executar() {
        new RegistrarUsuarioPresenter(principalPresenter);
    }

}
