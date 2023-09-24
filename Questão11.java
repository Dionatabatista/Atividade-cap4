import java.util.Scanner;

public class Questão11 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double salarioAtual, percentualAmen, novoSal, aumento;

        System.out.print("Informe o salário: R$ ");
        salarioAtual = entrada.nextDouble();

        if (salarioAtual <= 300) {
            percentualAmen = 0.15;
        }else if (salarioAtual <= 600) {
            percentualAmen = 0.10;
        }else if (salarioAtual <= 900) {
            percentualAmen = 0.05;
        }else {
            percentualAmen = 0.00;
        }

        aumento = salarioAtual * percentualAmen;
        novoSal = salarioAtual + aumento;

        System.out.println("O valor do aumento: R$ " + aumento);
        System.out.print("Novo salário: R$ " + novoSal);

        entrada.close();
    }
}
