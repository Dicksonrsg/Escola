
package controller;

import java.util.ArrayList;
import java.util.List;

public abstract class GenericController <T extends Persiste>{
    
    private List<T> list = new ArrayList();
    
    public void create(T t){
        t.setMatricula(list.size());
        list.add(t);
    }
    
    public List<T> findAll(){
        return list;
    }
    
    public T findById(int id){
        for (T t: list){
        if(t.getMatricula() == id){
            return t;
            }
        }
        return null;
    }
    
    public void update(T t){
        for (T c: list){
            if (c.getMatricula() == t.getMatricula()){
                c = t;
                break;
            }
        }
    }
    
    public void delete(T t){
        list.remove(t);
    }
    
    public abstract Class<T> getClassType();  
}
