import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char[] gabarito = new char[8];
        int aprovados = 0;

        System.out.println("Digite o gabarito da prova:");

        for (int i = 0; i < 8; i++) {
            System.out.print("Questao " + (i + 1) + ": ");
            gabarito[i] = sc.next().charAt(0);
        }

        for (int aluno = 1; aluno <= 10; aluno++) {
            System.out.print("\nDigite o numero do aluno: ");
            int numeroAluno = sc.nextInt();

            int nota = 0;

            System.out.println("Digite as respostas do aluno:");

            for (int i = 0; i < 8; i++) {
                System.out.print("Questao " + (i + 1) + ": ");
                char resposta = sc.next().charAt(0);

                if (resposta == gabarito[i]) {
                    nota++;
                }
            }

            System.out.println("Aluno: " + numeroAluno);
            System.out.println("Nota: " + nota);

            if (nota >= 6) {
                aprovados++;
            }
        }

        double porcentagem = aprovados * 100.0 / 10;

        System.out.println("\nPorcentagem de aprovacao: " + porcentagem + "%");

        sc.close();
    }
}