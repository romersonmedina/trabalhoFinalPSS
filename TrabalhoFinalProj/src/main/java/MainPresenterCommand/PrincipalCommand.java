package MainPresenterCommand;

import Command.Command;
import MainPresenter.PrincipalPresenter;

public abstract class PrincipalCommand implements Command {

    PrincipalPresenter principalPresenter;

    public PrincipalCommand(PrincipalPresenter principalPresenter) {
        this.principalPresenter = principalPresenter;
    }
}
