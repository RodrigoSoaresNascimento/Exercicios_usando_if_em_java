import java.util.Scanner;

public class Notas{
    public static void main(String[] agrs){

        Scanner entrada = new Scanner(System.in);

        double Nota1, Nota2, Media;

        System.out.println("Digite a primeira nota: ");
        Nota1 = entrada.nextDouble();
        System.out.println("Digite a segunda nota: ");
        Nota2 = entrada.nextDouble();
        Media = (Nota1 + Nota2);
        if (Media >= 60){
            System.out.println("Aprovado, sua nota é: "+ Media);
        } else {
            System.out.println("Reprovado, sua nota é: "+ Media);
        }
        
        





        entrada.close();

    }
}