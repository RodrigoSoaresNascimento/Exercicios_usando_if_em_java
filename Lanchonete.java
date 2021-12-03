import java.util.Scanner;
public class Lanchonete {
    public static void main(String[]agrs){
        Scanner entrada = new Scanner(System.in);
        char  operacao;
        
        System.out.print("Escolha o código do produto de [1 2 3 4 5]: ");
        operacao = entrada.nextLine().charAt(0);
        switch( operacao )
        {
            case '1':
                System.out.println("O valor do produto é 5 Reais: ");
                System.out.println("Quantas unidades? ");
                double P1 = entrada.nextDouble();
                double Total1 = P1 * 5;
                System.out.println("Valor a pagar: " + Total1);
                break;        
                
            case '2':
                System.out.println("O valor do produto é 3,50 Reais: ");
                System.out.println("Quantas unidades? ");
                double P2 = entrada.nextDouble();
                double Total2 = P2 * 3.5;
                System.out.println("Valor a pagar: " + Total2);
                break;
                
            case '3':
                System.out.println("O valor do produto é 4,80 Reais: ");
                System.out.println("Quantas unidades? ");
                double P3 = entrada.nextDouble();
                double Total3 = P3 * 4.80;
                System.out.println("Valor a pagar: " + Total3);
                break; 
            case '4':
                System.out.println("O valor do produto é 8,90 Reais: ");
                System.out.println("Quantas unidades? ");
                double P4 = entrada.nextDouble();
                double Total4 = P4 * 8.90;
                System.out.println("Valor a pagar: " + Total4);
                break; 
            case '5':
                System.out.println("O valor do produto é 7,32 Reais: ");
                System.out.println("Quantas unidades? ");
                double P5 = entrada.nextDouble();
                double Total5 = P5 * 7.32;
                System.out.println("Valor a pagar: " + Total5);
                break;     
            default:
            System.out.printf("Você digitou uma operação inválida.");        
        }

        
        
        
        
        
        entrada.close();

    }
}
