import java.util.Scanner;

public class Questao3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double menor, num1, num2;

        System.out.print("Informe o primeiro número: ");
        num1 = entrada.nextDouble();

        System.out.print("Informe o segundo número: ");
        num2 = entrada.nextDouble();

        if (num1 < num2) {
        menor = num1; 
        }
        else {
        menor = num2;
        }

        System.out.print("O menor número é: " + menor);

        entrada.close();
    }
}
