import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String passwd, palabra;
        System.out.println("Jugador 1. Itroduzca la contraseña: ");
        passwd = sc.nextLine();
        System.out.println("La contraseña tiene" + passwd.length() + "caracteres");
        System.out.println("Jugador 2. Palabra: ");
        palabra = sc.nextLine();
        while (!palabra.equals(passwd)) {
            String pista = "";
            for (int i = 0; i < passwd.length(); i++) {
                if (passwd.charAt(i) == palabra.charAt(i)) {
                    pista += passwd.charAt(i);
                } else {
                    pista += '*';
                }
            }

            System.out.println(pista);
            System.out.println("Jugador 2. Introduzca palabra de nuevo: ");
            palabra = new Scanner(System.in).next();

            System.out.println("!Acertaste!");

        }

    }

}
