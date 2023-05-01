import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String passwd, palabra;
        System.out.println("Jugador 1. Itroduzca la contraseña: ");
        passwd = sc.nextLine();
        do {
            System.out.println("Jugador 2. Palabra: ");
            palabra = sc.nextLine();
            int comparacion = passwd.compareTo(palabra);
            if (comparacion == 0) {
                System.out.println("¡Asertaste!");

            } else if (comparacion < 0) {
                System.out.println("La contraseña es menor que: " + palabra);

            } else {
                System.out.println("La contraseña es mayor que: " + palabra);
            }
        } while (!passwd.equals(palabra));
    }

}
