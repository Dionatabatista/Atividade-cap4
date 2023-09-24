import java.util.Scanner;

public class Questão13 {
    public static void main(String[] args) {
      Scanner entrada = new Scanner(System.in);
      double precoPro, percentualAme, novoPre;
      String classificação;
      
      System.out.print("Informe o preço: R$ ");
      precoPro = entrada.nextDouble();

      if (precoPro <= 50) {
        percentualAme = 0.05;
      }else if (precoPro <= 100) {
        percentualAme = 0.10;
      }else {
        percentualAme = 0.15;
      }

      novoPre = precoPro * (1 + percentualAme);

      if (novoPre <= 80) {
       classificação = "Barato"; 
      }else if (novoPre <= 120) {
        classificação = "Normal";
      }else if (novoPre <= 200) {
        classificação = "Caro";
      }else {
        classificação = "Muito caro";
      }

      System.out.println("Novo preço: R$" + novoPre);
      System.out.print("Classificação: " + classificação);

      entrada.close();

    }
}
