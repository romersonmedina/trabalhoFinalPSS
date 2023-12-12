package ValidacaoNome;

import java.util.regex.Pattern;

public class ExistenciaDeNumerosTratador implements ITratadorNome {

    @Override
    public String verificar(String nome) {
        Pattern p = Pattern.compile("[0-9]");
        if (p.matcher(nome).find()) {
            return "ERRO! A senha deve conter dígitos!";
        }

        return null;
    }
}
