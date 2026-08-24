import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o tamanho do vetor X: ");
        int n = sc.nextInt();

        System.out.print("Digite o tamanho do vetor Y: ");
        int m = sc.nextInt();

        int[] x = new int[n];
        int[] y = new int[m];
        int[] z = new int[n + m];

        System.out.println("Digite os valores do vetor X:");

        for (int i = 0; i < n; i++) {
            x[i] = sc.nextInt();
        }

        System.out.println("Digite os valores do vetor Y:");

        for (int i = 0; i < m; i++) {
            y[i] = sc.nextInt();
        }

        int tamanhoZ = 0;

        for (int i = 0; i < n; i++) {
            z[tamanhoZ] = x[i];
            tamanhoZ++;
        }

        for (int i = 0; i < m; i++) {
            boolean existe = false;

            for (int j = 0; j < tamanhoZ; j++) {
                if (y[i] == z[j]) {
                    existe = true;
                }
            }

            if (existe == false) {
                z[tamanhoZ] = y[i];
                tamanhoZ++;
            }
        }

        System.out.println("Vetor uniao:");

        for (int i = 0; i < tamanhoZ; i++) {
            System.out.print(z[i] + " ");
        }

        sc.close();
    }
}