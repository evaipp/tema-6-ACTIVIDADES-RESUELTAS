import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        final char palabra[] = { 'a', 'e', 'i', 'o', 'u', 'k', 'm', 'p', 'q', 'r' };
        final char codificar[] = { '$', '@', '&', '€', '#', '♠', '☺', '♫', '☼', '♥' };
        char codificado[];
        String texto;
        System.out.println("Idroduzca una palabra");
        texto = sc.nextLine();
        texto = texto.toLowerCase();
        codificado = new char[texto.length()];
        for (int i = 0; i < texto.length(); i++) {
            codificado[i] = codificar(palabra, codificar, texto.charAt(i));
        }
        texto = String.valueOf(codificado);
        System.out.println(texto);
    }

    static char codificar(char palabra[], char codificar[], char c) {
        final String letras = String.valueOf(palabra);
        char codificado;
        int pos = letras.indexOf(c);
        if (pos == -1) {
            codificado = c;
        } else {
            codificado = codificar[pos];
        }
        return codificado;
    }
}
