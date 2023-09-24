import java.util.Scanner;

public class Questão25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o número de horas extras: ");
        int horasExtras = scanner.nextInt();
        
        System.out.print("Digite o número de horas de falta: ");
        int horasFalta = scanner.nextInt();
        
        int minutosTrabalhados = horasExtras - (2 * horasFalta / 3);
        
        double premio = 0.0;
        
        if (minutosTrabalhados >= 2400) {
            premio = 500.00;
        } else if (minutosTrabalhados >= 1800) {
            premio = 400.00;
        } else if (minutosTrabalhados >= 1200) {
            premio = 300.00;
        } else if (minutosTrabalhados >= 600) {
            premio = 200.00;
        } else {
            premio = 100.00;
        }
        
        System.out.println("Prêmio de Natal: R$ " + premio);
        
        scanner.close();
    }
}

