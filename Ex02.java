import java.util.Scanner;
public class Ex02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[3];
        System.out.print("Digite x: ");
        numeros[0] = scanner.nextInt();
        System.out.print("Digite y: ");
        numeros[1] = scanner.nextInt();
        System.out.print("Digite z: ");
        numeros[2] = scanner.nextInt();
        
        int x = numeros[0];
        int y = numeros[1];
        int z = numeros[2];
        int maior = x;
        int menor = x;
        
        if (y > maior) maior = y;
        if (z > maior) maior = z;
        if (y < menor) menor = y;
        if (z < menor) menor = z;
        
        System.out.println("Maior numero: " + maior);
        System.out.println("Menor numero: " + menor);
        
        int inicio = Math.min(y, z);
        int fim = Math.max(y, z);
        
        if (x >= inicio && x <= fim) {
            System.out.println("x esta dentro do intervalo [y, z].");
        } else {
            System.out.println("x esta fora do intervalo [y, z].");
        }
        
        if (y != 0 && z != 0 && x % y == 0 && x % z == 0) {
            System.out.println("x e divisivel por y e por z.");
        } else {
            System.out.println("x nao e divisivel por y e por z.");
        }
        
        scanner.close();
    }
}