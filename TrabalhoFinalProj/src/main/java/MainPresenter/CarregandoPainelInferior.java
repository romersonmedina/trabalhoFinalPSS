package MainPresenter;

import MainPresenterCommand.AddComponente;
import Util.UsuarioRetorno;
import MainPresenterCommand.AtualizarNumeroDeNotificacoes;
import MainPresenterCommand.RemoverComponente;

import java.awt.Component;

public class CarregandoPainelInferior extends PrincipalPresenterState {

    public CarregandoPainelInferior(PrincipalPresenter presenter) {
        super(presenter);

        presenter.view.getLblTipoUsuario().setText(usuario.getType().toUpperCase());

        presenter.view.getPnlInferior().setVisible(true);
        presenter.view.getBtnQtdNotificacoes().setVisible(true);

        if (usuario.getType() == UsuarioRetorno.ADMINISTRADOR) {
            new AtualizarNumeroDeNotificacoes(presenter.view).executar();
            new AdministradorLogado(presenter);
        } else {
            if (usuario.getState().equals(UsuarioRetorno.DESAUTORIZADO)) {
                presenter.view.getBtnQtdNotificacoes().setVisible(false);
                new UsuarioNaoAutorizado(presenter);
            } else {
                new AtualizarNumeroDeNotificacoes(presenter.view).executar();
                new UsuarioLogado(presenter);
            }
        }
    }

    @Override
    public void configurarSenha() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void verNotificacoes() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void addUsuario() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void listarUsuario() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void abrirConfiguracoes() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void deslogar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void addComponente(Component c) {
        new AddComponente(presenter.view, c).executar();
    }

    @Override
    public void removerComponente(Component c) {
        new RemoverComponente(presenter.view, c).executar();
    }
}
