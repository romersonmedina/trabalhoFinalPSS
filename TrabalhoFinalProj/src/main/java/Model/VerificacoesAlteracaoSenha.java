package Model;

import java.util.Collections;
import java.util.List;

public class VerificacoesAlteracaoSenha {

    private List<String> recusasSenha;

    public VerificacoesAlteracaoSenha(List<String> recusasSenha) {
        this.recusasSenha = recusasSenha;
    }

    @Override
    public String toString() {
        if (recusasSenha.isEmpty()) {
            return "";
        }

        if (recusasSenha.size() == 1) {
            return recusasSenha.get(0);
        }

        String retorno = String.join(
                "\n",
                recusasSenha.subList(0, recusasSenha.size() - 1));
        retorno += "\n" + recusasSenha.get(recusasSenha.size() - 1);

        return retorno;
    }

    public List<String> getRecusasSenha() {
        return Collections.unmodifiableList(recusasSenha);
    }
}
