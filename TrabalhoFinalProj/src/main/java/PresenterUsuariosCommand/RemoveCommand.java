package PresenterUsuariosCommand;

import PresenterUsuarios.UsuarioPresenter;
import PresenterUsuarios.UserPresenter;

import View.ListaUsuarioView;

public class RemoveCommand extends ListarUsuariosCommand {

    public RemoveCommand(UserPresenter presenter, ListaUsuarioView view, UsuarioPresenter model) {
        super(presenter, view, model);
    }

    public void executar() {
        if (view.getTblUsuarios().getSelectedRow() == -1) {
            return;
        }

        model.getUser(
                view.getTblUsuarios().getSelectedRow()
        );
    }
}
