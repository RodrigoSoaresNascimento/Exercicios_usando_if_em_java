import java.util.Scanner;
public class Aumento{
    public static void main(String [] agrs){
        Scanner entrada = new Scanner(System.in);

        //Uma empresa vai conceder um aumento percentual de salário aos seus funcionários dependendo de quanto cada pessoa ganha, conforme tabela ao lado. Fazer um programa para ler o salário de uma pessoa, daí mostrar qual o novo salário desta pessoa depois do aumento, quanto foi o aumento e qual foi a porcentagem de aumento//

        double Salario;
        System.out.println("Salario atual do funcionario: ");
        Salario = entrada.nextDouble();
        if (Salario <= 1000){
            double NovoSalario = (Salario * 0.20) + Salario;
            double aumento = NovoSalario - Salario;
            String porcentagem = "20%";
            System.out.println("Salario novo salario do funcionario: " + NovoSalario);
            System.out.println("Aumento " + aumento);
            System.out.println("Porcentagem: " + porcentagem);
        }else if(Salario >= 1000 && Salario <= 3000){
            double NovoSalario = (Salario * 0.15) + Salario;
            double aumento = NovoSalario - Salario;
            String porcentagem = "15%";
            System.out.println("Salario novo salario do funcionario: " + NovoSalario);
            System.out.println("Aumento " + aumento);
            System.out.println("Porcentagem: " + porcentagem);
        }else if(Salario >= 3000 && Salario <= 8000){
            double NovoSalario = (Salario * 0.10) + Salario;
            double aumento = NovoSalario - Salario;
            String porcentagem = "10%";
            System.out.println("Salario novo salario do funcionario: " + NovoSalario);
            System.out.println("Aumento " + aumento);
            System.out.println("Porcentagem: " + porcentagem);
        }else{
            double NovoSalario = (Salario * 0.05) + Salario;
            double aumento = NovoSalario - Salario;
            String porcentagem = "5%";
            System.out.println("Salario novo salario do funcionario: " + NovoSalario);
            System.out.println("Aumento " + aumento);
            System.out.println("Porcentagem: " + porcentagem);
        }
        
         
         
        
         
        





        entrada.close();
    }
}