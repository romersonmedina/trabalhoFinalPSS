package MainPresenter;

import Observer.EventListerners;
import MainPresenterCommand.AdicionarUsuario;
import MainPresenterCommand.AlterarSenha;
import MainPresenterCommand.AbrirConfiguracoes;
import MainPresenterCommand.AddComponente;
import MainPresenterCommand.ListarUsuarios;
import MainPresenterCommand.Deslogar;
import MainPresenterCommand.AtualizarNumeroDeNotificacoes;
import MainPresenterCommand.RemoverComponente;
import MainPresenterCommand.VerNotificacoes;
import java.awt.Component;

public class AdministradorLogado extends PrincipalPresenterState implements EventListerners {

    public AdministradorLogado(PrincipalPresenter presenter) {
        super(presenter);

        presenter.view.getBtnAlterarSenha().setEnabled(true);
        presenter.view.getBtnVerNotificacoes().setEnabled(true);
        presenter.view.getBtnAlterarSenha().setVisible(true);
        presenter.view.getBtnVerNotificacoes().setVisible(true);

        presenter.view.getBtnAdiministrador().setVisible(true);
        presenter.view.getBtnAdiministrador().setEnabled(true);

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
        new AdicionarUsuario(presenter).executar();
    }

    @Override
    public void listarUsuario() {
        new ListarUsuarios(presenter).executar();
    }

    @Override
    public void abrirConfiguracoes() {
        new AbrirConfiguracoes(presenter).executar();
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
