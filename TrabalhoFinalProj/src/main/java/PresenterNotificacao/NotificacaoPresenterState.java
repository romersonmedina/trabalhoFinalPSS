package PresenterNotificacao;

import MainPresenter.PrincipalPresenter;

public abstract class NotificacaoPresenterState {

    NotificacaoPresenter presenter;
    PrincipalPresenter principalPresenter;

    public NotificacaoPresenterState(NotificacaoPresenter presenter, PrincipalPresenter principalPresenter) {
        this.presenter = presenter;
        this.principalPresenter = principalPresenter;
        presenter.setState(this);
    }

    public abstract void ler();

    public abstract void fechar();
}
