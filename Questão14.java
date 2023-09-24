import java.util.Scanner;

public class Questão14 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double salario, percentualAme, aumento, novoSal;

        System.out.print("Informe o salário: R$ ");
        salario = entrada.nextDouble();

        if (salario <= 300) {
            percentualAme = 0.50;
        }else if (salario <= 500) {
            percentualAme = 0.40;
        }else if (salario <= 700) {
            percentualAme = 0.30;
        }else if (salario <= 800) {
            percentualAme = 0.20;
        }else if (salario <= 1000) {
            percentualAme = 0.10;
        }else {
            percentualAme = 0.05;
        }

        aumento = salario * percentualAme;
        novoSal = salario + aumento;

        System.out.print("Novo salário: R$ " + novoSal);

        entrada.close();
    }
}
