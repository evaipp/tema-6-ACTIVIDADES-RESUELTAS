import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String nombre = "";
        String[] contactos = new String[0];
        String[] numeroTelfs = new String[0];
        int opcion = 0;

        // MENU
        do {
            System.out.println("***** AGENDA PERSONAL ******");
            System.out.println("1. AÑADIR UN NUEVO CONTACTO");
            System.out.println("2. BUSCAR EL TELÉFONO DE UN CONTACTO A PARTIR DE SU NOMBRE");
            System.out.println(
                    "3. MOSTRAR INFORMACIÓN DE TODOS LOS CONTACTOS ORDENADOS ALFABÉTICAMENTE MEDIANTE EL NOMBRE");
            System.out.println("4. Salir");
            System.out.println("INTRODUZCA UNA OPCION: ");
            opcion = sc.nextInt();

            // OPCION 1
            if (opcion == 1) {
                String decision;
                do {
                    // SE AÑADE EL NOMBRE
                    contactos = addUser(contactos);
                    // SE AÑADE EL NUMERO
                    numeroTelfs = addTelf(numeroTelfs);
                    // SE PREGUNTA SI SE QUIERE SEGUIR
                    System.out.println("Quieres seguir añadiendo contactos? Si/No");
                    decision = sc.next();

                    decision = decision.toLowerCase();
                } while (decision.contentEquals("si"));
            } else if (opcion == 2 && contactos.length != 0) {
                busartelf(contactos, numeroTelfs);
            } else if (opcion == 3 && contactos.length != 0) {
                String[][] ordenadaConctactos = mostrarInfor(contactos, numeroTelfs);
                for (int i = 0; i < ordenadaConctactos.length; i++) {
                    System.out.println(ordenadaConctactos[i][i]);

                }
            }

            System.out.println("TIENES EN TU AGENDA : " + contactos.length + " CONTACTOS AÑADIDOS");

        } while (opcion != 4 || contactos.length == 0);

        System.out.println("TAH LUEGO");

    }

}
