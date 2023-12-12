package PresenterUsuariosCommand;

import PresenterUsuarios.UsuarioPresenter;
import Presenter.EnviarNotificacaoPresenter;
import PresenterUsuarios.UserPresenter;
import MainPresenter.PrincipalPresenter;
import View.ListaUsuarioView;

public class EnviarNotificacaoCommand extends ListarUsuariosCommand {

    private PrincipalPresenter principalPresenter;

    public EnviarNotificacaoCommand(
            UserPresenter presenter,
            ListaUsuarioView view,
            UsuarioPresenter model,
            PrincipalPresenter principalPresenter
    ) {
        super(presenter, view, model);
        this.principalPresenter = principalPresenter;

    }

    public void executar() {
        if (view.getTblUsuarios().getSelectedRow() == -1) {
            return;
        }

        model.getUser(view.getTblUsuarios().getSelectedRow());

        new EnviarNotificacaoPresenter(
                model.getUser(view.getTblUsuarios().getSelectedRow()),
                principalPresenter
        );
    }
}
