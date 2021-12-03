import java.util.Scanner;
public class Glicose {
    public static void main(String[]agrs){
        Scanner entrada = new Scanner(System.in);
        double Glicose;

        System.out.println("Digite a medida da glicose: ");
        Glicose = entrada.nextDouble();
        if(Glicose <= 100){
            System.out.println("Normal");
        }else if(Glicose >= 100 && Glicose <= 140){
            System.out.println("Elevado ");
        }else if(Glicose >= 140){
            System.out.println("Diabetes");
        }
        
        
        
        
        
        
        
        
        entrada.close();
    }
}
