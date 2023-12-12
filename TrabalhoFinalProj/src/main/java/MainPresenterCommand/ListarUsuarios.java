package MainPresenterCommand;


import PresenterUsuarios.UserPresenter;
import MainPresenter.PrincipalPresenter;

public class ListarUsuarios extends PrincipalCommand {

    public ListarUsuarios(PrincipalPresenter principalPresenter) {
        super(principalPresenter);
    }

    @Override
    public void executar() {
        new UserPresenter(principalPresenter);
    }

}
