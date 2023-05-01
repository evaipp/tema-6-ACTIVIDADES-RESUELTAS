public static String[] addUser(String[] contactos) {
    String user = "";
    String telefono;
    String nombre;
    Scanner sc = new Scanner(System.in);
    System.out.println("Introduce un nombre: ");
    nombre = sc.next();
    contactos = Arrays.copyOf(contactos, contactos.length + 1);
    contactos[contactos.length - 1] = nombre;

    return contactos;
}