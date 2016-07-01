
package view;

import controller.AlunoController;
import java.util.Scanner;
import model.Aluno;

public class AlunoView {
    
    Scanner sc = new Scanner(System.in);
    
    AlunoController ac = new AlunoController();
    
    
    
    private void run(){
        int opcao = -1;

        do{
            System.out.print(
                "==== Alunos ===="+
                "\n1-Cadastrar"+
                "\n2-Listar Tudo"+
                "\n3-Buscar por Matricula"+
                "\n4-Editar Aluno"+
                "\n5-Excluir Aluno"+
                "\n0-Sair"+
                "\n================"+
                "\nOpção: ");
        opcao = sc.nextInt();
        switch(opcao){
            case 1:
                Aluno aluno =  new Aluno();
                System.out.print("Matricula: ");
                aluno.setMatricula(sc.nextInt());
                System.out.print("Nome: ");
                aluno.setNome(sc.next());
                System.out.print("Idade: ");
                aluno.setIdade(sc.nextInt());
                ac.create(aluno);
                break;
            case 2:
                for (Aluno a : ac.findAll()){
                    System.out.println(a.toString());
                }
                break;
            case 3:
                System.out.println("Digite a matricula: ");
                aluno = ac.findById(sc.nextInt());
                if (aluno == null){
                    System.out.println("Aluno não encontrado!");
                }else{
                System.out.print(aluno.toString());}
                break;
            case 4:
                System.out.print("Matricula: ");
                aluno = ac.findById(sc.nextInt());
                if (aluno == null){
                    System.out.println("Aluno não encontrado!");
                }else {
                    System.out.print("Novo nome: ");
                    aluno.setNome(sc.next());
                    System.out.print("Nova Idade: ");
                    aluno.setIdade(sc.nextInt());
                    ac.update(aluno);
                }
                break;
            case 5:
                System.out.print("Matricula: ");
                aluno = ac.findById(sc.nextInt());
                if (aluno == null){
                    System.out.println("Aluno não encontrado!");
                }else {
                ac.delete(aluno);
                }                
                break;
        }
    }while(opcao != 0);        
    }

    public AlunoView(){}
    
    public static void main(String[] args) {
        new AlunoView().run();
    }
}
