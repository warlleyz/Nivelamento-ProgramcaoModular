import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] temperaturas = new double[12];

        String[] meses = {
                "Janeiro", "Fevereiro", "Marco", "Abril",
                "Maio", "Junho", "Julho", "Agosto",
                "Setembro", "Outubro", "Novembro", "Dezembro"
        };

        for (int i = 0; i < 12; i++) {
            System.out.print("Digite a temperatura media de " + meses[i] + ": ");
            temperaturas[i] = sc.nextDouble();
        }

        double maior = temperaturas[0];
        double menor = temperaturas[0];

        int mesMaior = 0;
        int mesMenor = 0;

        for (int i = 1; i < 12; i++) {
            if (temperaturas[i] > maior) {
                maior = temperaturas[i];
                mesMaior = i;
            }

            if (temperaturas[i] < menor) {
                menor = temperaturas[i];
                mesMenor = i;
            }
        }

        System.out.println("\nMaior temperatura: " + maior + " em " + meses[mesMaior]);
        System.out.println("Menor temperatura: " + menor + " em " + meses[mesMenor]);

        sc.close();
    }
}