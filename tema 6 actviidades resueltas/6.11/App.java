import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        String original;
        String intento;
        do {
            System.out.println("Jugador 1. Introduzca una palabra");
            original = new Scanner(System.in).next();
        } while (original.isEmpty());
        String anagrama = creaAnagrama(original);
        System.out.println("A que palabra corespondo el anagrama:" + anagrama);
        do {
            System.out.println("Jugador 2. ¿Qual es el original? ");
            intento = new Scanner(System.in).next();
        } while (!original.equals(intento));
        System.out.println("Muy bien...");
    }

    static String creaAnagrama(String original) {
        char anagrama[] = original.toCharArray();
        for (int numCambios = 0; numCambios < anagrama.length; numCambios++) {
            int i = (int) (Math.random() * anagrama.length);
            int j = (int) (Math.random() * anagrama.length);
            char aux = anagrama[i];

            anagrama[i] = anagrama[j];
            anagrama[j] = aux;
        }
        return String.valueOf(anagrama);
    }
}
