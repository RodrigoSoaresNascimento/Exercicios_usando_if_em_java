import java.util.Scanner;
public class Menor {
    public static void main(String[]agrs){
        Scanner entrada = new Scanner(System.in);

        //Indicar o menor de 3 numeros e se for repetido mostrar ele apenas uma vez.//
        int A, B, C, Menor;

        System.out.println("Digite o primeiro valor: ");
        A = entrada.nextInt();
        System.out.println("Digite o segundo valor: ");
        B = entrada.nextInt();
        System.out.println("Digite o terceiro valor: ");
        C = entrada.nextInt();
        if(A <= B && A <= C ){
            Menor = A;
            System.out.println("O menor valor é: " + Menor);

        } else if (B <= C && B <= A){
            Menor = B;
            System.out.println("O menor valor é: " + Menor);
        }else {
                Menor = C;
                System.out.println("O menor valor é: " + Menor);

        }







        entrada.close();


    }
}
