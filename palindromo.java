import java.util.Scanner;

public class palindromo {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("dame cualquier texto:");
    String txt = scanner.nextLine();

        if (Palindromo(txt)) {
            System.out.println("el texto es un palindromo");
        } else {
            System.out.println("el texto no es un palindromo");
        }
     scanner.close();
    }
public static boolean Palindromo(String txt) {
    String txtn = txt.replaceAll("\\s+", "").toLowerCase();
    String txtatras = new StringBuilder(txtn).reverse().toString();
        
    return txtn.equals(txtatras);
    }
}


