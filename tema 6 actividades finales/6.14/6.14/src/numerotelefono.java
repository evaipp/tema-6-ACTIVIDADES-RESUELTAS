import java.util.Scanner;

public class numerotelefono {
    public static String[] addTelf(String[] numeroTelfs) {
        String telefono;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Introduce un telefono: ");
            telefono = sc.next();
            numeroTelfs = Arrays.copyOf(numeroTelfs, numeroTelfs.length + 1);
            if (numeroTelfs.length == 9) {
                numeroTelfs[numeroTelfs.length - 1] = telefono;

            } else {
                System.out.println("Tienes que introducir un número de 9 dígitos");
            }
        } while (telefono.length() != 9);

        return numeroTelfs;
    }

}
