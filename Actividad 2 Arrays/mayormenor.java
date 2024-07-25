import java.util.Scanner;

public class mayormenor {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

        int[] n = new int[8];
        
    System.out.println("Dame 8 numeros:");
    for (int i = 0; i < n.length; i++) {
            System.out.print("numero " + (i + 1) + ": ");
            n[i] = scanner.nextInt();
        }
             int may = n[0];
            int men = n[0];

    for (int i = 1; i < n.length; i++) {
            if (n[i] > may) may = n[i];
            if (n[i] < men) men = n[i];
        }

        System.out.println("El mayor es:" + may);
        System.out.println("El menor es:" + men);
    scanner.close();
    }
}
