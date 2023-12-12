package DAO;

import DAO.NotificacaoSQLiteDAO;
import DAO.IAbstractFactoryDAO;
import DAO.INotificacoesDAO;
import DAO.IUserDAO;


class SqliteFactoryDAO implements IAbstractFactoryDAO {

    @Override
    public INotificacoesDAO criarNotificationDAO(String caminho) throws Exception {
        return new NotificacaoSQLiteDAO(caminho);
    }

    @Override
    public IUserDAO criarUserDAO(String caminho) throws Exception {
        return new UsuarioSQLiteDAO(caminho);
    }

    @Override
    public String getTipoPersistencia() {
        return "SQLite";
    }
}
