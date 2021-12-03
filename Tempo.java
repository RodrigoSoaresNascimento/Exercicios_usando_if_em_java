import java.util.Scanner;
public class Tempo {
    public static void main(String [] agrs){
        //Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.//
        Scanner entrada = new Scanner(System.in);
        System.out.println("Salario atual do funcionario: ");
        double HorasEn = entrada.nextDouble();
        System.out.println("Salario atual do funcionario: ");
        double HorasSai = entrada.nextDouble();
        if (HorasEn < HorasSai){
            double duracao = HorasSai - HorasEn;
            System.out.println("A duração do jogo foi de: " + duracao);
        }else{
            double duracao = 24 - HorasEn + HorasSai;
            System.out.println("A duração do jogo foi de: " + duracao);
        }

        

        entrada.close();

    }
}
