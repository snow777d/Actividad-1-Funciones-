import java.util.Scanner;

public class comundivisor {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("dame el numero 1:");
    int n1 = scanner.nextInt();
    System.out.print("dame el numero 2:");
    int n2 = scanner.nextInt();
    int mcd = maximo(n1, n2);
         System.out.println("el maximo comun divisor de " +n1+ " y " +n2 + " es: " + mcd);

scanner.close();
    }
public static int maximo(int n1, int n2) {
        while (n2 != 0) {
        int cont = n2;
        n2 = n1 % n2;
        n1 = cont;
    }
    return n1;
    }
}
