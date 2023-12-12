package DAO;

import DAO.IAbstractFactoryDAO;
import java.util.ArrayList;
import java.util.List;


public class ConfigBD {
    private List<IAbstractFactoryDAO> fabricas;

    public ConfigBD() {
        fabricas = new ArrayList();
        
        fabricas.add(new SqliteFactoryDAO());
    }
    
    public IAbstractFactoryDAO getFabrica(String SGBD){
        IAbstractFactoryDAO fabrica;
        
        for(var f : fabricas){
            if(f.getTipoPersistencia().equals(SGBD)){
                return f;
            }
        }
        
        return null;
    }
    
    public List<String> getSBDBs(){
        List<String> SGDBs = new ArrayList();
        
        for(var x : fabricas){
            SGDBs.add(x.getTipoPersistencia());
        }
        
        return SGDBs;
    }
}
