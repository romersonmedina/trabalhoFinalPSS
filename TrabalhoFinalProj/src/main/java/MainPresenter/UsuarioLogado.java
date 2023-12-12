package MainPresenter;

import Observer.EventListerners;
import MainPresenterCommand.AddComponente;
import MainPresenterCommand.AlterarSenha;
import MainPresenterCommand.Deslogar;
import MainPresenterCommand.AtualizarNumeroDeNotificacoes;
import MainPresenterCommand.RemoverComponente;
import MainPresenterCommand.VerNotificacoes;
import java.awt.Component;

public class UsuarioLogado extends PrincipalPresenterState implements EventListerners {

    public UsuarioLogado(PrincipalPresenter presenter) {
        super(presenter);

        presenter.view.getBtnAlterarSenha().setEnabled(true);
        presenter.view.getBtnVerNotificacoes().setEnabled(true);
        presenter.view.getBtnAlterarSenha().setVisible(true);
        presenter.view.getBtnVerNotificacoes().setVisible(true);

        presenter.view.getBtnAdiministrador().setVisible(false);
        presenter.view.getBtnAdiministrador().setEnabled(false);

        presenter.view.getBtnUsuario().setVisible(true);
        presenter.view.getBtnUsuario().setEnabled(true);

    }

    @Override
    public void configurarSenha() {
        new AlterarSenha(presenter).executar();
    }

    @Override
    public void verNotificacoes() {
        new VerNotificacoes(presenter).executar();
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
        new Deslogar(presenter, presenter.view).executar();

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
