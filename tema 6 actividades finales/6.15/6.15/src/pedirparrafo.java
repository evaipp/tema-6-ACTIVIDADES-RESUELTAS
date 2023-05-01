import java.util.Scanner;

public class pedirparrafo {
    public static String pedirparrafo() {
        String parrafo;
        Scanner sc = new Scanner(System.in);
        System.out.println("introduce el parrafo");
        parrafo = sc.nextLine();
        return parrafo;
    }
}
