import java.util.Scanner;

public class Questao6b {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double res, num1, num2;
        int escolha;

        System.out.print("Informe o primeiro número: ");
        num1 = entrada.nextDouble();

        System.out.print("Informe o segundo número: ");
        num2 = entrada.nextDouble();

        System.out.print("Escolha a operação: ");

        System.out.print("1 - Cacular a raiz quadrada do  primeiro número ");
        System.out.print("2 - Cacular a raiz quadrada do segundo número");

        escolha = entrada.nextInt();

        switch (escolha) {
            case 1:
                if (num1 >= 0) {
                   res = Math.sqrt(num1);
                   System.out.print("A raiz quadrada do primeiro número é" + res); 
                } else {
                    System.out.print("Erro: Não é possível cacular a raiz quadrada. ");
                }
                break;
            case 2:
                    if (num2 >= 0) {
                    res = Math. sqrt(num2);
                    System.out.print("A raiz quadrada do segundo número é: " + res); 
                    } else {
                    System.out.print("Erro: Não é possível cacular a raiz. ");
                    }
                break;
            default:
                    System.out.print("Opção invalida. ");
                break;
        }

                entrada.close();
    }   
}
