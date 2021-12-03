import java.util.Scanner;

public class Baskara {
    public static void main(String[] agrs){

        Scanner entrada = new Scanner(System.in);
        
        double A, B, C, X1, X2, Delta;

        // formula de baskara//
        System.out.println("Digite o valor de a: ");
        A = entrada.nextDouble();
        System.out.println("Digite o valor de b: ");
        B = entrada.nextDouble();
        System.out.println("Digite o valor de c: ");
        C = entrada.nextDouble();
        Delta = Math.pow(B,2) - 4 * A * C ;
        if(Delta >= 0){
            System.out.println("A função possui duas raizes reais: ");
            X1 = (-B + Math.sqrt(Delta))/(2*A);
            X2 = (-B - Math.sqrt(Delta))/(2*A);
            System.out.println("A solução do problema é: " + X1 + " e " + X2);

        }else{
            System.out.println("A função possui não raizes reais: ");
        }



        entrada.close();
    }
}
