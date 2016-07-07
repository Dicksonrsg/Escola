
package model;

import controller.Persiste;

public class Professor extends Pessoa implements Persiste{
    
    private int matricula;
    private String Disciplina;


    @Override
    public int getMatricula() {
        return matricula;
    }

    @Override
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getDisciplina() {
        return Disciplina;
    }

    public void setDisciplina(String Disciplina) {
        this.Disciplina = Disciplina;
    }

    @Override
    public String toString() {
        return "Professor{" + "matricula=" + matricula + ", nome="+ nome+ ", idade="+ idade + ", sexo="+ sexo + Disciplina + '}';
    }
    
    
}
