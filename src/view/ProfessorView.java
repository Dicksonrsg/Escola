
package view;

import controller.ProfessorController;
import java.util.Scanner;
import model.Professor;


public class ProfessorView {
    
    Scanner input = new Scanner(System.in);
    
    ProfessorController pc =  new ProfessorController();
    
    public void run(){
        int opcao = -1;
    
         do{
            System.out.print(
                "====== Professores ======"+
                "\n1-Cadastrar"+
                "\n2-Listar Tudo"+
                "\n3-Buscar por Matricula"+
                "\n4-Editar Professor"+
                "\n5-Excluir Professor"+
                "\n0-Sair"+
                "\n========================="+
                "\nOpção: ");
        opcao = input.nextInt();
        switch(opcao){
            case 1:
                Professor professor =  new Professor();
                System.out.print("Nome: ");
                professor.setNome(input.next());
                System.out.print("Idade: ");
                professor.setIdade(input.nextInt());
                System.out.print("Sexo: ");
                professor.setSexo(input.next());                
                System.out.print("Disciplina: ");
                professor.setDisciplina(input.next());
                pc.create(professor);
                break;
            case 2:
                for (Professor b : pc.findAll()){
                    System.out.println(b.toString());
                }
                break;
            case 3:
                System.out.println("Digite a matricula: ");
                professor = pc.findById(input.nextInt());
                if (professor == null){
                    System.out.println("Professor não encontrado!");
                }else{
                System.out.print(professor.toString());}
                break;
            case 4:
                System.out.print("Matricula: ");
                professor = pc.findById(input.nextInt());
                if (professor == null){
                    System.out.println("Professor não encontrado!");
                }else {
                    System.out.print("Novo nome: ");
                    professor.setNome(input.next());
                    System.out.print("Nova Idade: ");
                    professor.setIdade(input.nextInt());
                    System.out.print("Sexo: ");
                    professor.setSexo(input.next());
                    professor.setSexo(input.next());                
                    System.out.print("Disciplina: ");                    
                    pc.update(professor);
                }
                break;
            case 5:
                System.out.print("Matricula: ");
                professor = pc.findById(input.nextInt());
                if (professor == null){
                    System.out.println("Professor não encontrado!");
                }else {
                pc.delete(professor);
                }                
                break;
        }
    }while(opcao != 0);        
    }
    
    public ProfessorView(){}
}
