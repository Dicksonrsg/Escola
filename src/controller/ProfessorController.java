
package controller;

import java.util.ArrayList;
import java.util.List;
import model.Professor;

public class ProfessorController {
    
    private List<Professor> professores;
    
    public ProfessorController(){
    this.professores  = new ArrayList<>();
    } 
    
    public void create (Professor professor){
    professores.add(professor);
    }
    
    public List<Professor> findAll(){
    return professores;
    }
    
    public Professor findById(int matricula){
        Professor professor = new Professor();
        professor = null;
        for (Professor b : professores){
            if(b.getMatricula() == matricula){
                professor = b;
                break;
            } 
        }
        return professor;
    }
    
    public void update(Professor professor){
        for (Professor b : professores){
            if (b.getMatricula() == professor.getMatricula()){
            b.setNome(professor.getNome());
            b.setIdade(professor.getIdade());
            b.setDisciplina(professor.getDisciplina());
            break;
            }
        }
    } 
    
    public void delete(Professor professor){
    professores.remove(professor);
    }
    
}
