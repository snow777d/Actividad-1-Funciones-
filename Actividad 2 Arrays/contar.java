import java.util.Scanner;

public class contar {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
        int[] n = new int[10];
        System.out.println("Dame 10 numeros:");
        for (int i = 0; i < n.length; i++) {
            System.out.print("numero" +(i + 1)+ ": ");
            n[i] = scanner.nextInt();
        }
         int contadorp = 0;
        int contadori = 0;
        for (int num : n) {
            if (num % 2 == 0) {
            contadorp++;
            } else {
            contadori++;
            }
        }
        System.out.println("numeros pares:" + contadorp);
        System.out.println("numeros impares:" + contadori);
        scanner.close();
    }
}
