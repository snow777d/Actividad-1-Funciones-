import java.util.Scanner;

public class elementos {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int[] n = new int[5];
        
    System.out.println("Dame 5 numeroos:");
        for (int i = 0; i < n.length; i++) {
            System.out.print("numero" + (i + 1) + ": ");
            n[i] = scanner.nextInt();
        }
        int suma = 0;
        for (int i = 0; i < n.length; i++) {
            suma = suma + n[i]; 
        }
         System.out.println("la suma de los numeros es:" + suma);
         scanner.close();
    }
}
