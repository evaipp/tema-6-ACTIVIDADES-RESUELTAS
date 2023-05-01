import java.util.Scanner;

public class App {
    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introducir encabezado: ");
        String encabezado = sc.nextLine();
        System.out.println("Introducir titulo: ");
        String parrafo = sc.nextLine();
        System.out.println("<DOCTYPE!>");
        System.out.println("<html>");
        System.out.println("\t\t <title><h1>" + encabezado + "</h1></title>\n\t</head>");
        System.out.println("<body>\n\t<p>" + parrafo + "</p>\n\t</body>\n</html>");

    }
}
