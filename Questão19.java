import java.util.Scanner;

public class Questão19 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double altura, pesoIde;
        char sexo;

        System.out.print("Informe a altura: ");
        altura = entrada.nextDouble();

        System.out.print("Informe o sexo: ");
        sexo = entrada.next().charAt(0);

        if (sexo == 'm' || sexo == 'm') {
           pesoIde = (72.7 * altura) - 58; 
        }else if (sexo == 'f' || sexo == 'f') {
            pesoIde = (62.1 * altura) - 44.7;
        }else {
            System.out.print("Sexo inválido! ");
            entrada.close();
            return;
        }

        System.out.print("O peso ideal é: " + pesoIde + "kg. ");

        entrada.close();
    }
}
