import java.util.Scanner;

public class Questão9 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double saldoMedi, pencentualCre, valorCre;

        System.out.print("Informe o salário do cliente: ");
        saldoMedi = entrada.nextDouble();

        if (saldoMedi > 400) {
            pencentualCre = 0.30;
        }else if (saldoMedi >= 300 && saldoMedi <= 400) {
            pencentualCre = 0.25;
        }else if (saldoMedi >= 200 && saldoMedi < 300) {
            pencentualCre = 0.10;
        }
            
    

        valorCre = saldoMedi * pencentualCre;

        System.out.print("O saldo é: R$ " + saldoMedi);
        System.out.print("Valor do crédito: R$ " + valorCre);

        entrada.close();

    }
}
