package PresenterNotificacaoCommand;

import Command.Command;
import PresenterNotificacao.NotificacaoTable;

import View.NotificacaoView;

public class ReadCommand implements Command {

    private NotificacaoView view;
    private NotificacaoTable table;

    public ReadCommand(NotificacaoView view, NotificacaoTable table) {
        this.table = table;
        this.view = view;
    }

    @Override
    public void executar() {
        int linha = view.getTblNotificacoes().getSelectedRow();
        if (linha == -1) {
            return;
        }

        view.getTxtAutor().setEnabled(true);
        view.getTxtAutor().setText(
                String.valueOf(view.getTblNotificacoes().getValueAt(linha, 0))
        );
        view.getTxtAutor().setEnabled(false);

        view.getTxtSujeito().setEnabled(true);
        view.getTxtSujeito().setText(
                String.valueOf(view.getTblNotificacoes().getValueAt(linha, 1))
        );
        view.getTxtSujeito().setEnabled(false);

        view.getTxtMenssagem().setEnabled(true);
        view.getTxtMenssagem().setText(table.getMensagem(linha)
        );
        view.getTxtMenssagem().setEnabled(false);

    }

}
