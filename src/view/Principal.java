
package view;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        
    Scanner input = new Scanner(System.in);
    char call = 'z';    

    AlunoView av = new AlunoView();
 
    ProfessorView pv = new ProfessorView();
    
    
    do{
        System.out.print("Escola"+
            "\nA-Menu Alunos."+
            "\nP-Menu Professor."+
            "\nS-Sair"+
            "\nOpção: ");
        call = input.next().charAt(0);
    switch(call){
        case 'A': case 'a':
            av.run();
            break;
        case 'P': case 'p':
            pv.run();
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
