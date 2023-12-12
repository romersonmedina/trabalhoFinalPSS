package DAO;

import Model.Notificacao;
import Model.NotificacaoDTO;
import Util.UsuarioRetorno;
import java.util.List;

public interface INotificacoesDAO {

    public void enviarNoticacao(Notificacao notification) throws Exception;

    public List<NotificacaoDTO> getNotificacoes(UsuarioRetorno user) throws Exception;

    public void marcaComoLida(long id) throws Exception;
}
