package Model;

import java.util.Collections;
import java.util.List;

public class VerificacoesRegistro {

    private boolean nomeEmUso;
    private List<String> recusasNome;
    private List<String> recusasSenha;

    public VerificacoesRegistro(boolean nomeEmUso, List<String> recusasNome, List<String> recusasSenha) {
        if (recusasNome == null || recusasSenha == null) {
            return;
        }
        this.nomeEmUso = nomeEmUso;
        this.recusasNome = recusasNome;
        this.recusasSenha = recusasSenha;
    }

    public boolean nomeEstaEmUso() {
        return nomeEmUso;
    }

    public List<String> getRecusasNome() {
        return Collections.unmodifiableList(recusasNome);
    }

    public String toStringRecusasNome() {
        return toStringRecusas(recusasNome, "", " e ");
    }

    public String toStringRecusasSenha() {
        return toStringRecusas(recusasSenha, "\n", "\n");
    }

    private String toStringRecusas(
            List<String> lista,
            String SeparadorMeio,
            String separadorFinal
    ) {
        if (lista.isEmpty()) {
            return "";
        }

        if (lista.size() == 1) {
            return lista.get(0);
        }

        String retorno = String.join(
                SeparadorMeio,
                lista.subList(0, lista.size() - 1));
        retorno += separadorFinal + lista.get(lista.size() - 1);

        return retorno;
    }

    public List<String> getRecusasSenha() {
        return Collections.unmodifiableList(recusasSenha);
    }

    public boolean possuiRecusas() {
        return nomeEmUso || !recusasNome.isEmpty() || !recusasSenha.isEmpty();
    }
}
