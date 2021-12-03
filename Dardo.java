import java.util.Scanner;

public class Dardo {
    public static void main(String[]agrs){
        Scanner entrada = new Scanner(System.in);

        //Indicar a maior de 3 numeros e se for repetido mostrar ele apenas uma vez.//
        Double A, B, C, Maior;

        System.out.println("Digite o primeiro valor: ");
        A = entrada.nextDouble();
        System.out.println("Digite o segundo valor: ");
        B = entrada.nextDouble();
        System.out.println("Digite o terceiro valor: ");
        C = entrada.nextDouble();
        if(A >= B && A >= C ){
            Maior = A;
            System.out.println("O maior valor é: " + Maior);

        } else if (B >= C && B >= A){
            Maior = B;
            System.out.println("O maior valor é: " + Maior);
        }else {
                Maior = C;
                System.out.println("O maior valor é: " + Maior);

        }







        entrada.close();


    }
}