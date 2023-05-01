import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Escriba una palabra:");
        String palabra = new Scanner(System.in).nextLine();
        System.out.println("Tamaño de las secuencias:");
        int n = new Scanner(System.in).nextInt();

        while (!palabra.isEmpty()) {
            n = n < palabra.length() ? n : palabra.length();
            String linea = palabra.substring(0, n);
            palabra = palabra.substring(n);
            System.out.println(linea);
        }
    }
}
