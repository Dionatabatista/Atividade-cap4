import java.util.Scanner;

public class Questão24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o preço do produto: R$ ");
        double precoProduto = scanner.nextDouble();
        
        System.out.print("Digite a categoria do produto (1 - Limpeza, 2 - Alimentação, 3 - Vestuário): ");
        int categoria = scanner.nextInt();
        
        System.out.print("Digite a situação do produto (R - Refrigeração, N - Sem Refrigeração): ");
        char situacao = scanner.next().charAt(0);
        
        double aumento = 0.0;
        double imposto = 0.0;
        
        if (precoProduto <= 25.00) {
            if (categoria == 1) {
                aumento = precoProduto * 0.05; // 5% de aumento
            } else if (categoria == 2) {
                aumento = precoProduto * 0.08; // 8% de aumento
            } else if (categoria == 3) {
                aumento = precoProduto * 0.10; // 10% de aumento
            }
        } else {
            if (categoria == 1) {
                aumento = precoProduto * 0.12; // 12% de aumento
            } else if (categoria == 2) {
                aumento = precoProduto * 0.15; // 15% de aumento
            } else if (categoria == 3) {
                aumento = precoProduto * 0.18; // 18% de aumento
            }
        }
        
        if (situacao == 'R' || situacao == 'r') {
            imposto = precoProduto * 0.05; // 5% de imposto para produtos com refrigeração
        }
        
        double precoFinal = precoProduto + aumento - imposto;
        
        System.out.println("Valor do Aumento: R$ " + aumento);
        System.out.println("Valor do Imposto: R$ " + imposto);
        System.out.println("Preço Final do Produto: R$ " + precoFinal);
        
        scanner.close();
    }
}

