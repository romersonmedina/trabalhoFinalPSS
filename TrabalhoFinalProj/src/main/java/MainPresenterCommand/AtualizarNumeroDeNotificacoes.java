package MainPresenterCommand;

import Command.Command;

import View.PrincipalView;

public class AtualizarNumeroDeNotificacoes implements Command {

    private PrincipalView view;

    public AtualizarNumeroDeNotificacoes(PrincipalView view) {
        this.view = view;
    }

    @Override
    public void executar() {

    }

}
