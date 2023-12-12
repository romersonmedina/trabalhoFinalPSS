package DAO;

import Model.RegistroUsuario;
import Util.UsuarioRetorno;
import java.util.List;

public interface IUserDAO {

    public List<UsuarioRetorno> getUsuarios() throws Exception;

    public void registrar(RegistroUsuario user) throws Exception;

    public UsuarioRetorno getUltimoUsuarioAdd() throws Exception;

    public void atualizarSenha(UsuarioRetorno user, String senha) throws Exception;

    public void autorizarUsuario(UsuarioRetorno user) throws Exception;

    public void removerUsuario(UsuarioRetorno user) throws Exception;

    public UsuarioRetorno fazerLogin(String name, String password) throws Exception;

    public boolean nomeEmUso(String nome) throws Exception;

    public String getNome(long id) throws Exception;

    public boolean possuiCadastrosDeUsuario() throws Exception;
}
