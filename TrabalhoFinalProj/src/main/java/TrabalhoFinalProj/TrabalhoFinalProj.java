package TrabalhoFinalProj;

import MainPresenter.PrincipalPresenter;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;

public class TrabalhoFinalProj {

    public static void main(String[] args) throws Exception {
        try {
            for (LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(
                    null,
                    "ERRO! Falha ao aplicar tema!",
                    "Opção de tema",
                    JOptionPane.INFORMATION_MESSAGE
            );
        }

        new PrincipalPresenter();
    }
}
