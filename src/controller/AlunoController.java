
package controller;

import model.Aluno;

public class AlunoController extends GenericController<Aluno> {

    @Override
    public Class<Aluno> getClassType() {
        return Aluno.class;
    }
    
    
    
}
