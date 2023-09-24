import java.util.Scanner;

public class Questao6c {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    double res, num1, num2;
    int escolha;

    System.out.print("Informe o primeiro número: ");
    num1 = entrada.nextDouble();

    System.out.print("Informe o segundo número: ");
    num2 = entrada.nextDouble();

    System.out.print("Escolha a operação: ");

    System.out.println("1 - Cacular a raiz cúbica do primeiro número: ");
    System.out.print("2 - Cacular a raiz cúbica do segundo número: ");

    escolha = entrada.nextInt();

    if (escolha == 1) {
        res = Math.cbrt(num1);
        System.out.print("A raiz cúbica do primeiro número é: " + res);
    } else if (escolha == 2) {
        res = Math.cbrt(num2);
        System.out.print("A raiz cúbica do segundo número é: " + res);       
    } else {
        System.out.print("Opção inválida. O programa será encerrado! ");
    }

        entrada.close();
  }  
}
