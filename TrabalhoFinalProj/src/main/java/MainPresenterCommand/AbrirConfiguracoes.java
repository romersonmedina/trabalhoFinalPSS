package MainPresenterCommand;

import Presenter.ConfigPresenter;
import MainPresenter.PrincipalPresenter;

public class AbrirConfiguracoes extends PrincipalCommand {

    public AbrirConfiguracoes(PrincipalPresenter principalPresenter) {
        super(principalPresenter);
    }

    @Override
    public void executar() {
        new ConfigPresenter(principalPresenter);
    }
}
