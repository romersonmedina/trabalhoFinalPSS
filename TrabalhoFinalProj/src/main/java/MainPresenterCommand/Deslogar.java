package MainPresenterCommand;

import MainPresenter.PrincipalPresenter;
import MainPresenter.UsuarioDeslogado;

import View.PrincipalView;

public class Deslogar extends PrincipalCommand {

    private PrincipalView view;

    public Deslogar(PrincipalPresenter principalPresenter, PrincipalView view) {
        super(principalPresenter);
        this.view = view;
    }

    @Override
    public void executar() {
        view.getPnlPrincipal().removeAll();

        new UsuarioDeslogado(principalPresenter);
    }
}
