import java.util.Scanner;

public class raiz {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Dame un numero:");
    float n = scanner.nextFloat();

    float raizc = (float) Math.sqrt(n);
    System.out.println("La raíz cuadrada de "+ n +" es:"+ raizc);

    scanner.close();
    }
}
