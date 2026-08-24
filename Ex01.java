import java.util.Scanner;
public class Ex01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um numero inteiro: ");
        int x = sc.nextInt();
        int fatorial = 1;
        
        for (int i = x; i >= 1; i--) {
            fatorial = fatorial * i;
        }
        
        System.out.println(x + "! = " + fatorial);
        sc.close();
    }
}