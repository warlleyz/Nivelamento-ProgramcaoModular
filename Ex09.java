import java.util.Scanner;

public class Ex09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[6];
        int somaPares = 0;
        int quantidadeImpares = 0;

        for (int i = 0; i < 6; i++) {
            System.out.print("Digite o numero " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();
        }

        System.out.println("\nOs numeros pares sao:");

        for (int i = 0; i < 6; i++) {
            if (numeros[i] % 2 == 0) {
                System.out.println("Numero " + numeros[i] + " na posicao " + (i + 1));
                somaPares = somaPares + numeros[i];
            }
        }

        System.out.println("Soma dos pares = " + somaPares);

        System.out.println("\nOs numeros impares sao:");

        for (int i = 0; i < 6; i++) {
            if (numeros[i] % 2 != 0) {
                System.out.println("Numero " + numeros[i] + " na posicao " + (i + 1));
                quantidadeImpares++;
            }
        }

        System.out.println("Quantidade de impares = " + quantidadeImpares);

        sc.close();
    }
}