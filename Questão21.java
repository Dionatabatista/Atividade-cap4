import java.util.Scanner;

public class Questão21 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double precoPro;
        int codigo;
        String procedencia;

        System.out.print("Informe o preço: R$ ");
        precoPro = entrada.nextDouble();

        System.out.print("Informe o código do produto: ");
        codigo = entrada.nextInt();

        if (codigo == 1) {
            procedencia = "Sul";
        }else if (codigo == 2) {
            procedencia = "Norte";
        }else if (codigo == 3) {
            procedencia = "Leste";
        }else if (codigo == 4) {
            procedencia = "Oeste";
        }else if (codigo == 5 || codigo == 6) {
            procedencia = "Nordeste";
        }else if (codigo == 7 || codigo == 8 || codigo == 9) {
            procedencia = "Sudeste";
        }else if (codigo >= 21 && codigo <= 20) {
            procedencia = "Centro-oeste";
        }else if (codigo >= 21 && codigo <= 30) {
            procedencia = "Nordeste";
        }else {
            procedencia = "Procedência desconhecida!";
        }

        System.out.print("Procedência: " + procedencia);

        entrada.close();
    }
}
