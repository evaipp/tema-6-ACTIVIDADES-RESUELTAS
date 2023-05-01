import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
                String jugadorA = palabraSecreta();
        char[] guiones = guionizando(jugadorA);
        boolean gameOver = false;
        Scanner sc = new Scanner(System.in);
        int vidas = 7;

        do {
            System.out.println("Tienes" + vidas + " vidas");
            System.out.println(guiones);
            System.out.println("Jugador B, introduzca letra: ");
            char jugB = sc.next().charAt(0);
            boolean acierto = false;
        }
    }

    }

    for(

    int i = 0;i<jugadorA.length();i++)
    {
        if (jugadorA.charAt(i) == jugB) {
            guiones[i] = jugB;
            acierto = true;
        }
    }if(!acierto)
    {
        System.out.println("Esa letra no existe");
        vidas--;
        if (vidas == 0) {
            System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!GAME OVER!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
            gameOver = true;// rompemos el bucle while y nos salimoes de él.
        }

    }else
    {
        boolean winner = !quedanGuiones(guiones);
        if (winner) {
            System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!YOU WIN!!!!!!!!!!!!!!!!!!!!!!!!!");
            gameOver = true;
        }

    }

    }while(!gameOver);

    (palabra secreta)

    public static String palabraSecreta() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Jugador A, introduzca palabra: ");
        String jugadorA = sc.next();
        return jugadorA;
    }

    public static char[] guionizando(String jugadorA) {
        int numLetras = jugadorA.length();
        char[] guiones = new char[numLetras];
        for (int i = 0; i < guiones.length; i++) {
            guiones[i] = '_';

        }
        return guiones;
    }

 public static boolean quedanGuiones(char[] posiciones) {
      
        for (char letra : posiciones) {
            if (letra == '_') {
                return true;
            }
        }
        return false;
    }
