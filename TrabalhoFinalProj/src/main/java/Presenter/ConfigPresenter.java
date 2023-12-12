package Presenter;

import MainPresenter.PrincipalPresenter;
import Util.ArquivoDeCofiguracaoService;
import View.ConfigView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.JOptionPane;

public class ConfigPresenter {

    private PrincipalPresenter principalPresenter;
    private ConfigView view;

    public ConfigPresenter(PrincipalPresenter principalPresenter) {
        this.principalPresenter = principalPresenter;
        view = new ConfigView();

        view.getBtnSave().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                salvar();
            }
        });

        principalPresenter.addView(view);
        view.setVisible(true);
    }

    private void salvar() {
        try {
            ArquivoDeCofiguracaoService.getInstance().setFormatoLog(
                    view.getCbFormatsLogger().getSelectedItem().toString()
            );
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(
                    null,
                    e.getMessage(),
                    "Erro",
                    JOptionPane.ERROR_MESSAGE
            );

        }
        view.dispose();
        principalPresenter.removerView(view);
    }
}
