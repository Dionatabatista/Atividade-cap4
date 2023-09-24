import java.util.Scanner;

public class Questão16 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double precoAtu, percentualDes, valorDes, novoPre;
        int codigoPro;

        System.out.print("Informe o preço: R$ ");
        precoAtu = entrada.nextDouble();

        System.out.print("Informe o código: ");
        codigoPro = entrada.nextInt();

        percentualDes = 0.0;

        if (precoAtu <= 30) {
            percentualDes = 0.0;
        }else if (precoAtu <= 100) {
            percentualDes = 0.10;
        }else {
            percentualDes = 0.15;
        }

        valorDes = precoAtu * percentualDes;
        novoPre = precoAtu - valorDes;

        System.out.println("O valor do desconto: R$ " + valorDes);
        System.out.print("Novo preço: R$ " + novoPre);

        entrada.close();
    }
}
