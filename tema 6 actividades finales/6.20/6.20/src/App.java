import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("--- PROGRAMA PARA ORDENAR LAS PALABRAS ALFABÉTICAMENTE DE UNA FRASE ---");
        System.out.print("Escribe una frase: ");
        String frase = sc.nextLine();
        String fraseCopia = frase.toLowerCase();
        String[] palabras = fraseCopia.split(" ");
        System.out.println("");
        System.out.println("La frase es: " + frase);
        System.out.println("");
        System.out.println("La frase descompuesta es: " + Arrays.toString(palabras));
        Arrays.sort(palabras);
        System.out.println("");
        System.out.println("Orden alfabeticamente: " + Arrays.toString(palabras));
    }

}
