package ValidacaoNome;

public class TamanhoMinimoTratador implements ITratadorNome {

    private final int TAMANHO_MINIMO = 4;

    @Override
    public String verificar(String nome) {
        if (nome.length() < TAMANHO_MINIMO) {
            return "ser maior que " + TAMANHO_MINIMO;
        }

        return null;
    }
}
