import java.util.Scanner;

public class Questão15 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double valorInves, rendimentoMen, valorCorr;
        int tipoInves;
        
        System.out.print("Informe o investimento (1 para Poupança, 2 para Fundos de renda): ");
        tipoInves = entrada.nextInt();

        System.out.print("Informe o valor do investimento: R$ ");
        valorInves = entrada.nextDouble();

        if (tipoInves == 1) {
            rendimentoMen = 0.03;
        }else if (tipoInves == 2) {
            rendimentoMen = 0.04;
        }else {
            System.out.print("Tipo de investimento inválido! ");
            return;
        }

        valorCorr = valorInves * (1 + rendimentoMen);

        System.out.print("Valor corrigido após um mês de investimento: R$ " + valorCorr);

        entrada.close();
    }
}
