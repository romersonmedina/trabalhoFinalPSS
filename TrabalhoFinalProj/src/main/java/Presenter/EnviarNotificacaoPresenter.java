package Presenter;

import Observer.EventListerners;
import MainPresenter.PrincipalPresenter;

import Util.UsuarioRetorno;
import View.EnviarNotificacaoView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class EnviarNotificacaoPresenter implements EventListerners {

    private UsuarioRetorno usuarioReceptor;
    private EnviarNotificacaoView view;
    private PrincipalPresenter principalPresenter;

    public EnviarNotificacaoPresenter(UsuarioRetorno usuario, PrincipalPresenter principalPresenter) {
        this.principalPresenter = principalPresenter;
        this.usuarioReceptor = usuario;

        view = new EnviarNotificacaoView();

        view.getTxtDestinatario().setText(usuarioReceptor.getNome());
        view.getTxtDestinatario().setEnabled(false);

        view.getbtnEnviar().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                enviar();
            }
        });

        principalPresenter.addView(view);
        view.setVisible(true);
    }

    private void enviar() {

        JOptionPane.showMessageDialog(
                null,
                "Eviado com sucesso",
                "Sucesso",
                JOptionPane.INFORMATION_MESSAGE
        );

        view.dispose();
        principalPresenter.removerView(view);
    }

    @Override
    public void update(String mensagem) {

    }
}
