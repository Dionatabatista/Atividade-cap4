import java.util.Scanner;

public class Questão23 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double precoUni, desconto, precoTotal, precoFinal;
        int codigoProduto, quantidade;
        
        System.out.print("Informe o código (1 a 40): ");
        codigoProduto = entrada.nextInt();
        
        System.out.print("Informe a quantidade : ");
         quantidade = entrada.nextInt();
        
         precoUni = 0.0;
        
        if (codigoProduto >= 1 && codigoProduto <= 10) {
            precoUni = 10.00;
        } else if (codigoProduto >= 11 && codigoProduto <= 20) {
            precoUni = 15.00;
        } else if (codigoProduto >= 21 && codigoProduto <= 30) {
            precoUni = 20.00;
        } else if (codigoProduto >= 31 && codigoProduto <= 40) {
            precoUni = 30.00;
        } else {
            System.out.print("Código de produto inválido! ");
            entrada.close();
            return;
        }
        
         precoTotal = precoUni * quantidade;
        
         desconto = 0.0;
        
        if (precoTotal <= 250.00) {
            desconto = precoTotal * 0.05; // 5% de desconto
        } else if (precoTotal <= 500.00) {
            desconto = precoTotal * 0.10; // 10% de desconto
        } else {
            desconto = precoTotal * 0.15; // 15% de desconto
        }
        
         precoFinal = precoTotal - desconto;
        
        System.out.println("Preço Unitário do Produto: R$ " + precoUni);
        System.out.println("Preço Total da Nota: R$ " + precoTotal);
        System.out.println("Valor do Desconto: R$ " + desconto);
        System.out.println("Preço Final da Nota: R$ " + precoFinal);
        
        entrada.close();
    }
}

