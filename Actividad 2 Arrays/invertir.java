import java.util.Scanner;

public class invertir {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
       int[] n = new int[6];
      int[] inve = new int[6];

    System.out.println("Dam 6 numeros:");
        for (int i = 0; i < n.length; i++) {
            System.out.print("numero " + (i + 1) + ": ");
            n[i] = scanner.nextInt();
        }

        for (int i = 0; i < n.length; i++) {
            inve[i] = n[n.length - 1 - i];
        }

        System.out.println("arreglo invertido:");
        for (int numero : inve) {
            System.out.print(numero + " ");
        }

        scanner.close();
    }
}
