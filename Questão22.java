import java.util.Scanner;

public class Questão22 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double peso;
        int grupoRisco, idade;
        
        System.out.print("Informe a sua idade : ");
        idade = entrada.nextInt();
        
        System.out.print("Informe o seu peso : ");
        peso = entrada.nextDouble();
        
        
        if (idade < 20) {
            if (peso <= 60) {
                grupoRisco = 9;
            } else if (peso <= 90) {
                grupoRisco = 8;
            } else {
                grupoRisco = 7;
            }
        } else if (idade >= 20 && idade <= 50) {
            if (peso <= 60) {
                grupoRisco = 6;
            } else if (peso <= 90) {
                grupoRisco = 5;
            } else {
                grupoRisco = 4;
            }
        } else {
            if (peso <= 60) {
                grupoRisco = 3;
            } else if (peso <= 90) {
                grupoRisco = 2;
            } else {
                grupoRisco = 1;
            }
        }
        
        System.out.print("Grupo de Risco: " + grupoRisco);
        
        entrada.close();
    }
}
