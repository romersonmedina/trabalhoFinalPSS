package DAO;

import Model.Notificacao;
import Model.NotificacaoDTO;
import Util.UsuarioRetorno;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import DAO.INotificacoesDAO;


class NotificacaoSQLiteDAO implements INotificacoesDAO {
    private String caminho;

    public NotificacaoSQLiteDAO(String caminho) throws Exception {
        this.caminho = caminho;
        String sql = "CREATE TABLE IF NOT EXISTS notificacoes ("
                + "    id          INTEGER PRIMARY KEY AUTOINCREMENT"
                + "                        UNIQUE"
                + "                        NOT NULL,"
                + "    idremetente INTEGER NOT NULL"
                + "                        REFERENCES User (id),"
                + "    idreceptor  INTEGER NOT NULL"
                + "                        REFERENCES User (id),"
                + "    assunto     TEXT    NOT NULL,"
                + "    mensagem    TEXT    NOT NULL,"
                + "    estado      INTEGER NOT NULL DEFAULT 0"
                + ");";
        
        try (
                Connection conn = DriverManager.getConnection(caminho);
                Statement st = conn.createStatement()) {
            st.execute(sql);
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new Exception("ERRO! Falha ao criar a tabela notificacoes!");
        }
    }

    @Override
    public void enviarNoticacao(Notificacao notification) throws Exception {
        String sql = "INSERT INTO notificacoes (idremetente, idreceptor, assunto, mensagem) VALUES(?, ?, ?, ?)";

        try (
                Connection conn = DriverManager.getConnection(caminho);
                PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setLong(1, notification.getIdRemetente());
            ps.setLong(2, notification.getIdReceptor());
            ps.setString(3, notification.getAssunto());
            ps.setString(4, notification.getMensagem());

            ps.executeUpdate();
            
            
        } catch (SQLException e) {
            e.printStackTrace();
            throw new Exception(
                    "ERRO! Falha ao salvar informações da mensagem com assunto : "
                    + notification.getAssunto()
            );
        }
    }



    @Override
    public List<NotificacaoDTO> getNotificacoes(UsuarioRetorno user) throws Exception {
        String sql = "SELECT * FROM notificacoes where idreceptor = ?";

        List<NotificacaoDTO> notificacoes = new ArrayList<>();
        try (Connection conn = DriverManager.getConnection(caminho)) {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setLong(1, user.getId());
            try(ResultSet rs = ps.executeQuery();){
                while (rs.next()) {
                    notificacoes.add(new NotificacaoDTO(
                            rs.getLong("id"),
                            rs.getLong("idremetente"),
                            rs.getString("assunto"),
                            rs.getString("mensagem"),
                            rs.getInt("estado")));
                }
                return notificacoes;
            }
        } catch (Exception e) {
            throw new Exception("ERRO! Falha ao obter todas as notificações "
                    + "do usuário: "
                    + user.getNome());
        }
    }

    @Override
    public void marcaComoLida(long id) throws Exception {
        String sql = "UPDATE notificacoes SET estado=? WHERE id=?;";

        try (
                Connection conn = DriverManager.getConnection(caminho);
                PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, Notificacao.LIDO);
            ps.setLong(2, id);

            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
            throw new SQLException("ERRO! Falha ao marcar mensagem como lida!");
        }
    }
}
