package PresenterUsuarios;

import MainPresenter.PrincipalPresenter;

public class CarregandoTabelaState extends UserPresenterState {

    PrincipalPresenter principalPresenter;

    public CarregandoTabelaState(UserPresenter presenter, PrincipalPresenter principalPresenter) {
        super(presenter);
        this.principalPresenter = principalPresenter;

        view.getBtnAutorizar().setEnabled(false);
        view.getBtnEnviarNotificacao().setEnabled(false);
        view.getBtnExcluir().setEnabled(false);

        model.atualizarTabela();

        new TabelaCarregadaState(presenter, principalPresenter);
    }

    @Override
    public void autorizar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void remover() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void enviarNotificacao() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void fechar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
