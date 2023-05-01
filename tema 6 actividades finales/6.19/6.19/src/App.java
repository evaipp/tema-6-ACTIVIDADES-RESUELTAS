import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String frase;
        int veces = 0, pos;
        System.out.println("INTRODUZCA SU FRASE");
        frase = sc.nextLine();

        System.out.println("INTRODUZCA UNA PALABRA");
        String palabra = sc.next();
        pos = frase.indexOf(palabra);
        while (!palabra.isEmpty()) {

            pos = frase.indexOf(palabra, pos + 1);
            frase = frase.replaceAll(frase, palabra);
            System.out.println("Introduce otra palabra");
            palabra = sc.next();
        }
    }

}
