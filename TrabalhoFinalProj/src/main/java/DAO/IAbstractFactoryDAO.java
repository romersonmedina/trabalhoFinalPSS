package DAO;


public interface IAbstractFactoryDAO {
    public INotificacoesDAO criarNotificationDAO(String caminho) throws Exception;
    public IUserDAO criarUserDAO(String caminho) throws Exception;
    public String getTipoPersistencia();
}
