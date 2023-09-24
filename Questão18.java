import java.util.Scanner;

public class Questão18 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int idade;

        System.out.print("Informe a sua idade: ");
        idade = entrada.nextInt();

        if (idade >= 18) {
            System.out.print("Maior de idade! ");
        }else {
            System.out.print("Menor de idade! ");
        }

        entrada.close();
    }
}
