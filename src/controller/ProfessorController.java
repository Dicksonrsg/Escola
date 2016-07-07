
package controller;


import model.Professor;

public class ProfessorController extends GenericController<Professor>{

    @Override
    public Class<Professor> getClassType() {
       return Professor.class;
    }
}
