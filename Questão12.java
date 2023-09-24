import java.util.Scanner;

public class Questão12 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double salarioBru, gratifi, imposto, valorReceber;

        System.out.print("Informe o salário: R$ ");
        salarioBru = entrada.nextDouble();

        if (salarioBru <= 350) {
            gratifi = 100.00;
        }else if (salarioBru <= 600) {
            gratifi = 75.00;
        }else if (salarioBru <= 900) {
            gratifi = 50.00;
        }else{
            gratifi = 35.00;
        }

        imposto = 0.07 * salarioBru;
        valorReceber = salarioBru + gratifi - imposto;

        System.out.print("O valor a receber: R$ " + valorReceber);

        entrada.close();
            
        
    
    }
}
