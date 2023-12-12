package MainPresenter;

import Observer.EventListerners;
import Presenter.AcessoPresenter;
import MainPresenterCommand.AddComponente;
import MainPresenterCommand.RemoverComponente;

import java.awt.Component;

public class UsuarioDeslogado extends PrincipalPresenterState implements EventListerners {

    public UsuarioDeslogado(PrincipalPresenter Principalpresenter) {
        super(Principalpresenter);

        Principalpresenter.view.getBtnAdiministrador().setVisible(false);
        Principalpresenter.view.getBtnAdiministrador().setEnabled(false);

        Principalpresenter.view.getBtnUsuario().setVisible(false);
        Principalpresenter.view.getBtnUsuario().setEnabled(false);

        Principalpresenter.view.getPnlInferior().setVisible(false);

        new AcessoPresenter(Principalpresenter);
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
    public void update(String mensagem) {

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
