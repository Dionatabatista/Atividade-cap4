import java.util.Scanner;

public class Questão17 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int senha;

        System.out.print("Informe a senha: ");
        senha = entrada.nextInt();

        if (senha == 4531) {
            System.out.print("Senha correta! ");
        }else { 
            System.out.print("Senha incorreta! ");
        }

        entrada.close();
    }
}
