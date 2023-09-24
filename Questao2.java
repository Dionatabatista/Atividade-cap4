import java.util.Scanner;

public class Questao2 {
  public static void main(String[] args) {
     Scanner entrada = new Scanner(System.in);
     double nota1, nota2, mediaArit;

     System.out.print("Informe a primeira nota: ");
     nota1 = entrada.nextDouble();

     System.out.print("Informe a segunda nota: ");
     nota2 = entrada.nextDouble();

     mediaArit = (nota1 + nota2) /2;

     if ((mediaArit >= 0) && (mediaArit < 3)) {
      System.out.print("Reprovado: " + mediaArit);
     }
     else if ((mediaArit >= 3) && (mediaArit < 7)) {
      System.out.print("Exame: ");
     }
     else if ((mediaArit >= 7) && (mediaArit <= 10)) {
      System.out.print("Aprovado: ");
     }
     else {
      System.out.print("Media invalida!!");
     }

     entrada.close();
  }  
}
