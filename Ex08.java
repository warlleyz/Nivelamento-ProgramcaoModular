import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] preco = new double[10];
        int[] quantidade = new int[10];

        double totalVendas = 0;
        int maisVendido = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o valor do objeto " + (i + 1) + ": ");
            preco[i] = sc.nextDouble();

            System.out.print("Digite a quantidade vendida: ");
            quantidade[i] = sc.nextInt();
        }

        System.out.println("\nRELATORIO");

        for (int i = 0; i < 10; i++) {
            double totalObjeto = preco[i] * quantidade[i];

            System.out.println("\nObjeto " + (i + 1));
            System.out.println("Quantidade vendida: " + quantidade[i]);
            System.out.println("Valor unitario: R$ " + preco[i]);
            System.out.println("Valor total: R$ " + totalObjeto);

            totalVendas = totalVendas + totalObjeto;

            if (quantidade[i] > quantidade[maisVendido]) {
                maisVendido = i;
            }
        }

        double comissao = totalVendas * 0.05;
        double salario = 545 + comissao;

        System.out.println("\nValor total das vendas: R$ " + totalVendas);
        System.out.println("Comissao do vendedor: R$ " + comissao);
        System.out.println("Salario final: R$ " + salario);

        System.out.println("\nObjeto mais vendido:");
        System.out.println("Valor: R$ " + preco[maisVendido]);
        System.out.println("Posicao no vetor: " + maisVendido);

        sc.close();
    }
}