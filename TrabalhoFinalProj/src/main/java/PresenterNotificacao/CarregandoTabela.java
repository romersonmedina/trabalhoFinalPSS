package PresenterNotificacao;

import MainPresenter.PrincipalPresenter;

public class CarregandoTabela extends NotificacaoPresenterState {

    public CarregandoTabela(NotificacaoPresenter presenter,
            PrincipalPresenter principalPresenter) {
        super(presenter, principalPresenter);

        presenter.view.getTxtAutor().setEnabled(false);
        presenter.view.getTxtMenssagem().setEnabled(false);
        presenter.view.getTxtSujeito().setEnabled(false);

        presenter.view.getBtnLer().setEnabled(false);
        presenter.view.getBtnFechar().setEnabled(false);

        presenter.view.getTblNotificacoes().setModel(presenter.table);

        new TabelaPresenter(presenter, principalPresenter);
    }

    @Override
    public void ler() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void fechar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
