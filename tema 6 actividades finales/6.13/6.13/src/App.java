import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escriba una sentencia: ");
        String sentencia = sc.nextLine();
        sentencia = sentencia.toLowerCase();
        String parametro1 = "/*";
        String parametro2 = "*/";
        int pos1 = 0;
        int pos2 = 0;
        int contador = 0;
        while (sentencia.indexOf(parametro1) != -1) {
            while (contador < sentencia.length()) {
                pos1 = sentencia.indexOf(parametro1);
                pos2 = sentencia.indexOf(parametro2);
                contador = pos1;
                String frase1 = sentencia.substring(0, pos1); // limites de la impresion de la sentencia
                String frase2 = sentencia.substring(pos2 + 2, sentencia.length());
                sentencia = frase1 + frase2;
            }
        }
        System.out.println(sentencia);
    }
}
