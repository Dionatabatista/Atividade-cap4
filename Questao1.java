import java.util.Scanner;

public class Questao1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double nota1, nota2, nota3, nota4, mediaArit;

        System.out.print("Informe a primeria nota: ");
        nota1 = entrada.nextDouble();

        System.out.print("Informe a segunda nota: ");
        nota2 = entrada.nextDouble();

        System.out.print("Informe a terceira nota: ");
        nota3 = entrada.nextDouble();

        System.out.print("Informe a quarta nota: ");
        nota4 = entrada.nextDouble();

        mediaArit = (nota1 + nota2 + nota3 + nota4) / 4;

        if (mediaArit >= 7) {
          System.out.println("Média: " + mediaArit);
          System.out.print("Aprovado"); 
        }
        else {
            System.out.println("Média: " + mediaArit);
            System.out.print("Reprovado");
        }

        entrada.close();
    }
    
}