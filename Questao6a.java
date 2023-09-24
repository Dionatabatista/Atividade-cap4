import java.util.Scanner;

public class Questao6a {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double res, num1, num2, base, exp;
        int escolha;

        System.out.print("Informe o primeiro número: ");
        base = entrada.nextDouble();

        System.out.print("Informe o segundo número (expoente): ");
        exp = entrada.nextDouble();

        System.out.print("Escolha a operação: ");
        System.out.print("1 - Cacular o primeiro número elevado ao segundo número: ");

        escolha = entrada.nextInt();

        switch (escolha) {
            case 1:
                res = Math.pow(base, exp);
                System.out.print(base + "Elevado a" + exp + "é igual a " + res);
                break;
            default:
                System.out.print("Opção inálida. ");
                break;
        }
                entrada.close();

    }
}
