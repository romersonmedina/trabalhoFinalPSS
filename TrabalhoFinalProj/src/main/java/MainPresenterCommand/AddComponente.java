package MainPresenterCommand;

import Command.Command;
import View.PrincipalView;
import java.awt.Component;

public class AddComponente implements Command {

    private PrincipalView view;
    private Component c;

    public AddComponente(PrincipalView view, Component c) {
        this.view = view;
        this.c = c;
    }

    @Override
    public void executar() {
        view.addView(c);
    }
}
