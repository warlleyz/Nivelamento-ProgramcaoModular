import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a quantidade de alunos: ");
        int n = sc.nextInt();

        int[] modular = new int[n];
        int[] calculo = new int[n];

        System.out.println("Digite as matriculas de Programacao Modular:");

        for (int i = 0; i < n; i++) {
            modular[i] = sc.nextInt();
        }

        System.out.println("Digite as matriculas de Calculo:");

        for (int i = 0; i < n; i++) {
            calculo[i] = sc.nextInt();
        }

        System.out.println("Alunos matriculados nas duas disciplinas:");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                if (modular[i] == calculo[j]) {
                    System.out.println(modular[i]);
                    break;
                }

            }
        }

        sc.close();
    }
}