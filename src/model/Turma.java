
package model;

import controller.Persiste;
import java.util.List;


public class Turma implements Persiste {
    
    private int codigo;
    private int sala;
    private String turno;
    private List<Aluno> alunos;
    private List<Professor> professores;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getSala() {
        return sala;
    }

    public void setSala(int sala) {
        this.sala = sala;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(List<Aluno> alunos) {
        this.alunos = alunos;
    }

    public List<Professor> getProfessores() {
        return professores;
    }

    public void setProfessores(List<Professor> professores) {
        this.professores = professores;
    }

    @Override
    public String toString() {
        return "Turma{" + "codigo=" + codigo + ", sala=" + sala + ", turno=" + turno + ", alunos=" + alunos + ", professores=" + professores + '}';
    }

    @Override
    public void setMatricula(int matricula) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getMatricula() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
