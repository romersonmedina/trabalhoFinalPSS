package PresenterUsuariosCommand;

import Util.UsuarioRetorno;
import PresenterUsuarios.UsuarioPresenter;
import PresenterUsuarios.UserPresenter;

import View.ListaUsuarioView;

public class AutorizarUsuarioCommand extends ListarUsuariosCommand {

    public AutorizarUsuarioCommand(UserPresenter presenter, ListaUsuarioView view, UsuarioPresenter model) {
        super(presenter, view, model);
    }

    public void executar() {
        if (view.getTblUsuarios().getSelectedRow() == -1) {
            return;
        }

        UsuarioRetorno u = model.getUser(
                view.getTblUsuarios().getSelectedRow()
        );

        model.atualizarTabela();
    }
}
