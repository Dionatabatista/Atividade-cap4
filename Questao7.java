import java.util.Scanner;

public class Questao7 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double sal, amen, novoSal;

        System.out.print("Informe o salário do funcionário: ");
        sal = entrada.nextDouble();

        if (sal >= 500.00) {
            amen = sal * 0.30;
            novoSal = sal + amen;

            System.out.print("O funcionário tem direito a aumento! ");
            System.out.println("O salário antes do aumento R$: " + sal);
            System.out.print("Novo aumento R$: " + novoSal );
        } else {
            System.out.print("O funcionário não tem direito a aumento! ");
            System.out.print("O salário atual R$: " + sal);
        }

            entrada.close();
    }   

}
