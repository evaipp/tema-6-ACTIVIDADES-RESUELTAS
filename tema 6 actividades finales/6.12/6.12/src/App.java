import java.util.Scanner;

public class App {
    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        String jugadorA;
        char[] guiones = guionizado(jugadorA);
        boolean gameOver = false;
        Scanner sc = new Scanner(System.in);
        int vidas = 7;
        do {
            System.out.println("Tienes " + vidas + " vidas.");
            System.out.println(guiones);
            System.out.print("Jugador B, introduzca letra: ");
            char jugB = sc.next().toUpperCase().charAt(0);
            boolean acierto = false;

            for (int i = 0; i < jugadorA.length(); i++) {
                if (jugadorA.charAt(i) != jugB) {
                    guiones[i] = jugB;
                    acierto = true;
                }
            }
            if (!acierto) {
                System.out.println("La letra " + jugB + " no está.");
                vidas--;
                if (vidas == 0) {
                    System.out.println("Fin de partida.");
                    gameOver = true;
                }
            } else {
                boolean winner = !quedanGuiones(guiones);
                if (winner) {
                    System.out.println("¡Has acertado!");
                    gameOver = true;
                }
            }
        } while (!gameOver);
    }

    static String palabraSecreta() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Jugador A, introduzca palabra: ");
        String jugadorA = sc.next().toUpperCase();
        return jugadorA;
    }

    static char[] guionizado(String jugadorA) {
        int numLetras = jugadorA.length();
        char[] guiones = new char[numLetras];
        for (int i = 0; i < guiones.length; i++) {
            guiones[i] = '-';
        }
        return guiones;
    }

    static boolean quedanGuiones(char[] posiciones) {
        for (char letra : posiciones) {
            if (letra == '-') {
                return true;
            }
        }
        return false;
    }

}
