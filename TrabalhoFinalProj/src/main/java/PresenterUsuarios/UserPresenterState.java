package PresenterUsuarios;

import View.ListaUsuarioView;

public abstract class UserPresenterState {

    protected UserPresenter presenter;
    protected ListaUsuarioView view;
    protected UsuarioPresenter model;

    public UserPresenterState(UserPresenter presenter) {
        this.presenter = presenter;
        this.view = presenter.getView();
        this.model = presenter.getModel();
        this.presenter.setState(this);
    }

    public abstract void autorizar();

    public abstract void remover();

    public abstract void fechar();

    public abstract void enviarNotificacao();
}
