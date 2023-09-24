import java.util.Scanner;

public class Questão20 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int idade;

        System.out.print("Informe sua idade: ");
        idade = entrada.nextInt();

        if (idade < 5) {
            System.out.print("Não tem categoria para você! ");
        }else if (idade >= 5 && idade <= 7) {
            System.out.print("Categoria infantil! ");
        }else if (idade >= 8 && idade <= 10) {
           System.out.print("Categoria juvenil! "); 
        }else if (idade >= 11 && idade <= 15) {
            System.out.print("Categoria adolescente! ");
        }else if (idade >= 16 && idade <= 30) {
           System.out.print("Categoria adulto! "); 
        }else {
            System.out.print("Categoria sênior! ");
        }

        entrada.close();
    }
}
