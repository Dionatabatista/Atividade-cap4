import java.util.Scanner;

public class Questao5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double res, num1, num2;
        int escolha;

        System.out.print("Informe o primeiro número: ");
        num1 = entrada.nextDouble();

        System.out.print("Informe o segundo número: ");
        num2 = entrada.nextDouble();

        System.out.println("Escolha a operação: ");
        System.out.println("1 - Média entre os números digitados");
        System.out.println("2 - Diferença do maior pelo menor: ");
        System.out.println("3 - Produtos entre os números digitados: ");
        System.out.println("4 - Divisão do primeiro pelo segundo: ");

        escolha = entrada.nextInt();

        

        switch (escolha) {
            case 1:
                res = (num1 + num2) /2;
                System.out.print("A média dos números é: " + res);
                break;
            case 2:
                res = Math.abs(num1 - num2);     
                System.out.print("A diferença entre os números é:" + res);
            case 3:
                res = num1 * num2;
                System.out.print("O produto dos números é:" + res);
                break;
            case 4:
                if (num2 != 0) {
                    res = num1 / num2;
                    System.out.print("A divisão dos números é: " + res);
                } else {
                    System.out.print("Erro: Não é possível dividir.");
                }
                break;
            default:
                System.out.print("Escolha inválida. ");
        }
        
            entrada.close();
    }
}

         

        


