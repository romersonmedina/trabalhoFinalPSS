package Model;

public class RegistroUsuario {

    public final static int DESAUTORIZADO = 0;
    public final static int AUTORIZADO = 1;

    public final static int USUARIO = 0;
    public final static int ADMINISTRADOR = 1;

    private String nome;
    private int tipo;
    private int estado;
    private String senha;

    public RegistroUsuario(String nome, String senha, int estado, int tipo) {
        this.nome = nome;
        this.estado = estado;
        this.tipo = tipo;
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public int getEstado() {
        return estado;
    }

    public int getTipo() {
        return tipo;
    }

    public String getSenha() {
        return senha;
    }
}
