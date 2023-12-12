package Model;


public class Notificacao {

    public static int NAO_LIDO = 0;
    public static int LIDO = 1;

    private long idRemetente;
    private long idReceptor;
    private String assunto;
    private String mensagem;

    public Notificacao(long idRemetente, long idReceptor, String assunto, String mensagem) {
        this.idRemetente = idRemetente;
        this.idReceptor = idReceptor;
        this.assunto = assunto;
        this.mensagem = mensagem;
    }

    public Notificacao(long idRemetente, long idReceptor, String mensagem) {
        this.idRemetente = idRemetente;
        this.idReceptor = idReceptor;
        this.mensagem = mensagem;
    }

    public String getAssunto() {
        return assunto;
    }

    public long getIdRemetente() {
        return idRemetente;
    }

    public long getIdReceptor() {
        return idReceptor;
    }

    public String getMensagem() {
        return mensagem;
    }
}
