package MainPresenter;

import java.awt.Component;

public abstract class PrincipalPresenterState {

    PrincipalPresenter presenter;

    public PrincipalPresenterState(PrincipalPresenter presenter) {
        this.presenter = presenter;
        presenter.setState(this);
    }

    public abstract void configurarSenha();

    public abstract void verNotificacoes();

    public abstract void addUsuario();

    public abstract void listarUsuario();

    public abstract void abrirConfiguracoes();

    public abstract void deslogar();

    public abstract void addComponente(Component c);

    public abstract void removerComponente(Component c);
}
