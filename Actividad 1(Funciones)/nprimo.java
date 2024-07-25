import java.util.Scanner;

public class nprimo {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
        
    System.out.print("Dame un numero entero:");
    int n = scanner.nextInt();
       
    String result = esprimo(n);

    System.out.println("El numero"+ n+ " "+ result);

    scanner.close();
    }

 public static String esprimo(int num) {
        if (num < 2) {
        return "no es primo";
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
            return "no es primo";
            }
        }
        return "es primo";
    }
}
