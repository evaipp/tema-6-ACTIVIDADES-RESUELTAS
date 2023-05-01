import java.util.Scanner;

public class numerotelefonos {
    public static void busartelf(String[] contactos, String[] numeroTelfs) {
        String nombreBuscar;
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe un nombre de tu contacto");
        nombreBuscar = sc.next();
        for (int i = 0; i < contactos.length; i++) {
            if (contactos[i].contentEquals(nombreBuscar)) {
                System.out.println("El telefono que le corresponde es: " + numeroTelfs[i]);
            }
        }
    }

}
