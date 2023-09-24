import java.util.Scanner;

public class Questão10 {
   public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    double custoFabri, percentualDistri, percentualImpos, precoCons;

    System.out.print("Informe o custo: ");
    custoFabri = entrada.nextDouble();

    if (custoFabri <= 12000) {
        percentualDistri = 0.5;
        percentualImpos = 0.0;
    }else if (custoFabri <= 25000) {
        percentualDistri = 0.10;
        percentualImpos = 0.15;
    }else {
        percentualDistri = 0.15;
        percentualImpos = 0.02;
    }

    precoCons = custoFabri + (custoFabri * percentualDistri) + (custoFabri * percentualImpos);

    System.out.print("O preço é: R$ " + precoCons);


    entrada.close();



   } 
}
