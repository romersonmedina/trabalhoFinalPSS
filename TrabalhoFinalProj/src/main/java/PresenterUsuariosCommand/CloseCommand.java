package PresenterUsuariosCommand;

import PresenterUsuarios.UserPresenter;
import PresenterUsuarios.UsuarioPresenter;
import MainPresenter.PrincipalPresenter;
import View.ListaUsuarioView;

public class CloseCommand extends ListarUsuariosCommand {

    PrincipalPresenter principalPresenter;

    public CloseCommand(
            UserPresenter presenter,
            ListaUsuarioView view,
            UsuarioPresenter model,
            PrincipalPresenter principalPresenter) {
        super(presenter, view, model);
        this.principalPresenter = principalPresenter;
    }

    @Override
    public void executar() {
        if (view != null) {
            view.dispose();
            principalPresenter.removerView(view);
        }
    }
}
