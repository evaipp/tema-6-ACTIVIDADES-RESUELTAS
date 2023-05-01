import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        String s1 = "";
        char c = sc.next().charAt(0);
        System.out.println(s1.charAt(1));
        System.out.println("Introducir frase; ");
        s1 = sc.nextLine().toLowerCase();

        char a1[] = s1.toCharArray();
        System.out.println("La cadena de caracteres es: " + Arrays.toString(a1));

        for (int i = 0; i < a1.length; i++) {
            if (a1[i] == ' ') {
                a1[i + 1] = Character.toUpperCase(a1[i + 1]);
            }
        }
        String s3 = "";
        for (int i = 0; i < a1.length; i++) {
            if (a1[i] != ' ') {
                s3 = s3 + a1[i];
            }
        }
        System.out.println("El string sin espacios es: " + s3);

    }
}
