
package view;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        
    Scanner input = new Scanner(System.in);
    char call = 'z';    

    AlunoView av = new AlunoView();
 
    ProfessorView pv = new ProfessorView();
    TurmaView tv = new TurmaView();
    
    
    do{
        System.out.print("Escola"+
            "\nA-Menu Alunos."+
            "\nP-Menu Professor."+
            "\nS-Sair"+
            "\nT-Turma"+
            "\nOpção: ");
        call = input.next().charAt(0);
    switch(call){
        case 'A': case 'a':
            av.run();
            break;
        case 'P': case 'p':
            pv.run();
            break;
        case 'T': case 't':
            tv.run();
            break;
        case 'S': case 's':
            call = 'S';
            break;
        default:
            System.out.println("Opção invalida!");
            break;
    }
    
    }while(call != 'S');
    
    
    
    

    }



    
    


    
    
}
