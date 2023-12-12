package PresenterUsuariosCommand;

import Command.Command;
import PresenterUsuarios.UsuarioPresenter;
import PresenterUsuarios.UserPresenter;
import View.ListaUsuarioView;

public abstract class ListarUsuariosCommand implements Command {

    UserPresenter presenter;
    ListaUsuarioView view;
    UsuarioPresenter model;

    public ListarUsuariosCommand(UserPresenter presenter, ListaUsuarioView view, UsuarioPresenter model) {
        this.presenter = presenter;
        this.view = view;
        this.model = model;
    }
}
