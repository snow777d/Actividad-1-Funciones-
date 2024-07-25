import java.util.Scanner;

public class reemplazar {
 public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Dame una palabra:");
    String txt = scanner.nextLine();

    System.out.print("Dame la letra que quieres reemplzara:");
    char letra = scanner.nextLine().charAt(0);

    System.out.print("Dame la nueva letra");
    char nuevaletra = scanner.nextLine().charAt(0);

    StringBuilder txtn = new StringBuilder(txt);

        for (int i = 0; i < txtn.length(); i++) {
            if (txtn.charAt(i) == letra) {
                txtn.setCharAt(i, nuevaletra);
            }
        }

    System.out.println("el texto modificado es:" + txtn.toString());

    scanner.close();
    }
}
