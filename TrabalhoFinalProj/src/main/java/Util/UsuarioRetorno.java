package Util;

import Model.RegistroUsuario;

public class UsuarioRetorno {

    public final static String DESAUTORIZADO = "Não autorizado";
    public final static String AUTORIZADO = "Autorizado";

    public final static String USUARIO = "Usuario";
    public final static String ADMINISTRADOR = "Administrador";

    private long id;
    private String nome;
    private String tipo;
    private String estado;

    public UsuarioRetorno(long id, String nome, int estado, int tipo) {
        this.id = id;
        this.nome = nome;
        if (estado == RegistroUsuario.AUTORIZADO) {
            this.estado = AUTORIZADO;
        } else {
            this.estado = DESAUTORIZADO;
        }

        if (tipo == RegistroUsuario.ADMINISTRADOR) {
            this.tipo = ADMINISTRADOR;
        } else {
            this.tipo = USUARIO;
        }
    }

    public UsuarioRetorno(UsuarioRetorno user) {
        this.id = user.id;
        this.nome = user.nome;
        this.estado = user.estado;
        this.tipo = user.tipo;
    }

    public long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getEstado() {
        return estado;
    }

    public String getTipo() {
        return tipo;
    }

    void setEstado(String state) {
        this.estado = state;
    }
}
