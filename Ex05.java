import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int idade;
        int maiorIdade = 0;
        int menorIdade = 0;
        int quantidade = 0;
        int contador = 0;

        while (true) {
            System.out.print("Digite a idade: ");
            idade = sc.nextInt();

            if (idade == -1) {
                break;
            }

            System.out.print("Digite o sexo (M/F): ");
            char sexo = sc.next().charAt(0);

            System.out.print("Digite a cor dos olhos (A/V/C): ");
            char olhos = sc.next().charAt(0);

            System.out.print("Digite a cor dos cabelos (L/C/P): ");
            char cabelos = sc.next().charAt(0);

            if (contador == 0) {
                maiorIdade = idade;
                menorIdade = idade;
            }

            if (idade > maiorIdade) {
                maiorIdade = idade;
            }

            if (idade < menorIdade) {
                menorIdade = idade;
            }

            if ((sexo == 'F' || sexo == 'f')
                    && idade >= 18
                    && idade <= 35
                    && (olhos == 'V' || olhos == 'v')
                    && (cabelos == 'L' || cabelos == 'l')) {

                quantidade++;
            }

            contador++;
        }

        if (contador > 0) {
            System.out.println("Maior idade: " + maiorIdade);
            System.out.println("Menor idade: " + menorIdade);
        }

        System.out.println("Quantidade de mulheres entre 18 e 35 anos, com olhos verdes e cabelos louros: " + quantidade);

        sc.close();
    }
}