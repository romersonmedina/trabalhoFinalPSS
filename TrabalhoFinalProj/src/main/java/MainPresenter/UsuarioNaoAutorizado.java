package MainPresenter;

import MainPresenterCommand.AddComponente;
import MainPresenterCommand.Deslogar;
import MainPresenterCommand.RemoverComponente;
import java.awt.Component;
import javax.swing.JOptionPane;

public class UsuarioNaoAutorizado extends PrincipalPresenterState {

    public UsuarioNaoAutorizado(PrincipalPresenter presenter) {
        super(presenter);

        presenter.view.getBtnAlterarSenha().setEnabled(false);
        presenter.view.getBtnVerNotificacoes().setEnabled(false);
        presenter.view.getBtnAlterarSenha().setVisible(false);
        presenter.view.getBtnVerNotificacoes().setVisible(false);

        presenter.view.getBtnUsuario().setVisible(true);
        presenter.view.getBtnUsuario().setEnabled(true);

        presenter.view.getPnlPrincipal().removeAll();

        JOptionPane.showMessageDialog(
                presenter.view.getPnlPrincipal(),
                "Falha de autorização! Este usuário não possui permissão para executar esta ação!",
                "Fale com seu gestor ou agurde autorização!",
                JOptionPane.INFORMATION_MESSAGE
        );
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
        new Deslogar(presenter, presenter.view).executar();
    }

    @Override
    public void addComponente(Component c) {
        new AddComponente(presenter.view, c);
    }

    @Override
    public void removerComponente(Component c) {
        new RemoverComponente(presenter.view, c);
    }
}
