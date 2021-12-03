import java.util.Scanner;
public class Operadora {
    public static void main(String[] agrs){

        Scanner entrada = new Scanner(System.in);
        
        int Tempo , Pagar = 50, Limite = 100, Acrescimo = 2, Total;
        
        
        System.out.println("Digite o primeiro valor: ");
        Tempo = entrada.nextInt();
        if(Tempo <= 100){
            System.out.println("O valor a ser pago é de: " + Pagar);
        }else {
            Total = ((Tempo - Limite) * Acrescimo) + Pagar;
            System.out.println("O valor a ser pago é de: " + Total);
        }
        
        
        
        
        
        
        
        entrada.close();
    }
    
}
