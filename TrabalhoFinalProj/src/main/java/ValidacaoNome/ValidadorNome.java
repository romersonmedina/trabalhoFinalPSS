package ValidacaoNome;

import java.util.ArrayList;
import java.util.List;

public class ValidadorNome {

    private final List<ITratadorNome> tratadores;

    public ValidadorNome() {
        this.tratadores = new ArrayList();

        tratadores.add(new TamanhoMinimoTratador());
        tratadores.add(new ExistenciaDeNumerosTratador());
    }

    public List<String> validar(String nome) {
        List<String> recusas = new ArrayList();
        String retorno;
        for (var t : tratadores) {
            retorno = t.verificar(nome);
            if (retorno != null) {
                recusas.add(retorno);
            }
        }
        return recusas;
    }
}
