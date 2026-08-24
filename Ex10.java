import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[][] vendas = new double[12][4];

        String[] meses = {
                "Janeiro", "Fevereiro", "Marco", "Abril",
                "Maio", "Junho", "Julho", "Agosto",
                "Setembro", "Outubro", "Novembro", "Dezembro"
        };

        for (int i = 0; i < 12; i++) {
            System.out.println("\n" + meses[i]);

            for (int j = 0; j < 4; j++) {
                System.out.print("Digite as vendas da semana " + (j + 1) + ": ");
                vendas[i][j] = sc.nextDouble();
            }
        }

        double totalAno = 0;

        System.out.println("\nTotal vendido por mes:");

        for (int i = 0; i < 12; i++) {
            double totalMes = 0;

            for (int j = 0; j < 4; j++) {
                totalMes = totalMes + vendas[i][j];
            }

            System.out.println(meses[i] + ": R$ " + totalMes);
            totalAno = totalAno + totalMes;
        }

        System.out.println("\nTotal vendido por semana durante o ano:");

        for (int j = 0; j < 4; j++) {
            double totalSemana = 0;

            for (int i = 0; i < 12; i++) {
                totalSemana = totalSemana + vendas[i][j];
            }

            System.out.println("Semana " + (j + 1) + ": R$ " + totalSemana);
        }

        System.out.println("\nTotal vendido no ano: R$ " + totalAno);

        sc.close();
    }
}