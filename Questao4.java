import java.util.Scanner;

public class Questao4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double  num1, num2, num3;

        System.out.print("Informe o primeiro número: ");
        num1 = entrada.nextDouble();

        System.out.print("Informe o segundo número: ");
        num2 = entrada.nextDouble();

        System.out.print("Informe o terceiro número: ");
        num3 = entrada.nextDouble();
         
        

        if ((num1 > num2 ) && (num1 > num3)) {
         System.out.print("O maior número é: " + num1);
        }
        if ((num2 > num1) && (num2 > num3)) {
          System.out.print("O maior número é: " + num2);     
        }
        else {
            System.out.print("O maior número é: " + num3);
        }
        
        entrada.close();
    }
}
