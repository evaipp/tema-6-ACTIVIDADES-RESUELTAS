public class contactosordenados {
    public static String[][] mostrarInfor(String[] contactos, String[] numeroTelfs) {
        String[][] contactosOrdenados = new String[contactos.length][numeroTelfs.length];

        for (int i = 0; i < contactos.length; i++) {
            for (int j = 0; j < contactos.length; j++) {
                contactosOrdenados[i][j] = contactos[i] + " - " + numeroTelfs[j];
            }
        }
        return contactosOrdenados;

    }
}
