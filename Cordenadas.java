import java.util.Scanner;
public class Cordenadas {
    public static void main(String [] agrs){
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite a coordenada x: ");
        double X = entrada.nextDouble();
        System.out.println("Digite a coordenada y: ");
        double Y = entrada.nextDouble();
        if(X >= 0 && Y >= 0){
            System.out.println("Esta no quadrante Q1 ");
        }else if(X <= 0 && Y >= 0){
            System.out.println("Esta no quadrante: Q2 ");
        }else if(X<=0 && Y<=0){
            System.out.println("Esta no quadrante: Q3 ");
        }else if(X >= 0 && Y <= 0){
            System.out.println("Esta no quadrante: Q4 ");
        }else if(X == 0 && Y == 0){
            System.out.println("Esta na origem ");
        }
           
        
        
        
        
        
        
        
        
        entrada.close();
    }
    
}
