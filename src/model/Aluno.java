
package model;

import controller.Persiste;

public class Aluno extends Pessoa implements Persiste {
    
    private int matricula;

    @Override
    public int getMatricula() {
        return matricula;
    }

    @Override
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        return "Aluno{" + "matricula=" + matricula + ", nome="+ nome+ ", idade="+ idade + ", sexo="+ sexo +'}';
    }

    }


