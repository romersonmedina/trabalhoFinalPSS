package Util;

public class NotificacaoRetorno {

    public static String LIDO = "SIM";
    public static String NAO_LIDO = "NÂO";

    private long id;
    private String remetente;
    private String assunto;
    private String mensagem;
    private String estado;

    public NotificacaoRetorno(long id, String remetente, String assunto, String mensagem, String estado) {
        this.id = id;
        this.remetente = remetente;
        this.assunto = assunto;
        this.mensagem = mensagem;
        this.estado = estado;
    }

    public long getId() {
        return id;
    }

    public String getRemetente() {
        return remetente;
    }

    public String getAssunto() {
        return assunto;
    }

    public String getMensagem() {
        return mensagem;
    }

    public String getEstado() {
        return estado;
    }

    /**
     * Set adicionado para diminuir o custo de processamento para atualizar
     * tables
     *
     * @param estado
     */
    void setEstado(String estado) {
        this.estado = estado;
    }
}
