import java.util.Scanner;
public class Temperatura {
    public static void main(String[]agrs){
        Scanner entrada = new Scanner(System.in);
        
        Double Celsius, Fahrenheit;
        char  operacao;
        
        System.out.print("Escolha sua operação [C] ou [F]: ");
        operacao = entrada.nextLine().charAt(0);
        switch( operacao )
        {
            case 'C':
                System.out.println("Digite a temperatura em Celsius:");
                Celsius = entrada.nextDouble();
                Fahrenheit = (9 * Celsius + 160) / 5;
                System.out.println("A temperatura em Fahrenheit: " + Fahrenheit);
                break;        
                
            case 'F':
                System.out.println("Digite a temperatura em Fahrenheit:");
                Fahrenheit = entrada.nextDouble();
                Celsius = ((Fahrenheit - 32) * 5) / 9;
                System.out.println("Temperatura equivalente em Celsius: " + Celsius);
                break;
                
            default:
            System.out.printf("Você digitou uma operação inválida.");        
        }
    
        
        
        
        
        
        
        
        
        
        entrada.close();
    }
}
