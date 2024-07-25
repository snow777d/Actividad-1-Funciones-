import java.util.Scanner;

public class mayusculas {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

     while (true) {
        System.out.print("dame un texto:");
        String txt = scanner.nextLine();

            if (txt.trim().isEmpty()) {
                break;
            }
    System.out.println(txt.toUpperCase());
        }
        scanner.close();
    }
}
