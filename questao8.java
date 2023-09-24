import java.util.Scanner;

public class questao8 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double salarioAtual, percenSalario, aumento, salarioRes;

        System.out.print("Informe o salário: ");
        salarioAtual = entrada.nextDouble();

        if (salarioAtual >= 300) {
            percenSalario = 0.35;
        }else {
            percenSalario = 0.15;
        }

        aumento = salarioAtual * percenSalario;
        salarioRes = salarioAtual + aumento;

        System.out.print("O salário reajustado é: " + salarioRes);

        entrada.close();
    }

}