
package view;

import controller.TurmaController;
import java.util.Scanner;
import model.Turma;

public class TurmaView {
    
    Scanner input = new Scanner(System.in);
    
    TurmaController tc = new TurmaController();
    
    public void run(){
    
    int call = -1;
    
    do{
        System.out.print("====== Turma ======"+
                "\n1-Criar Turma"+
                "\n2-Listar Tudo"+
                "\n3-Buscar por Codigo"+
                "\n4-Editar Turma"+
                "\n5-Excluir Turma"+
                "\n0-Sair"+
                "\n==================="+
                "\nOpção: ");
        call = input.nextInt();
        
        switch(call){
        
            case 1:
                Turma turma = new Turma();
                System.out.print("Sala: ");
                turma.setSala(input.nextInt());
                System.out.println("Turno: ");
                turma.setTurno(input.next());
                
                tc.create(turma);
                break;   
            case 2:
                for(Turma x : tc.findAll()){
                    System.out.println(x.toString());
                }
                break;
            case 3:
                System.out.print("Codigo: ");
                turma = tc.findById(input.nextInt());
                if(turma == null){
                    System.out.println("Turma não encontrada!");
                }else{
                    System.out.println(turma.toString());}
                break;
            case 4:
                System.out.print("Codigo: ");
                turma = tc.findById(input.nextInt());
                if(turma == null){
                    System.out.println("Turma não encontrada!");
                }else{
                    System.out.print("Nova sala: ");
                    turma.setSala(input.nextInt());
                    System.out.println("Novo turno: ");
                    turma.setTurno(input.next());
                    
                    tc.update(turma);} 
                break;
            case 5:
                System.out.print("Codigo: ");
                turma = tc.findById(input.nextInt());
                if(turma == null){
                    System.out.println("Turma não encontrada!");
                }else{
                    tc.delete(turma);
                }
                break;
        }
    }while (call != 0);
        
    }
    
    public TurmaView(){}
    
}
