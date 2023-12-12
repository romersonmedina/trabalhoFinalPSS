package PresenterUsuarios;

import Util.UsuarioRetorno;

import java.util.List;
import javax.swing.table.AbstractTableModel;

public class UsuarioPresenter extends AbstractTableModel {

    private List<UsuarioRetorno> users;
    private String[] colunas = {"id", "nome", "autorizado"};

    public void setUsers(List<UsuarioRetorno> users) {
        this.users = users;
        fireTableDataChanged();
    }

    public void atualizarTabela() {
        fireTableDataChanged();
    }

    public UsuarioRetorno getUser(int rowIndex) {
        return users.get(rowIndex);
    }

    @Override
    public String getColumnName(int column) {
        return colunas[column];
    }

    @Override
    public int getRowCount() {
        return users.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        UsuarioRetorno user = users.get(rowIndex);

        switch (columnIndex) {
            case 0:
                return user.getId();
            case 1:
                return user.getNome();
            case 2:
                return user.getEstado();
            default:
                throw new AssertionError();
        }
    }
}
