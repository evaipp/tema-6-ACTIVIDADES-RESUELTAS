public class construirEncabezado {
    private static void construirEncabezado(String encabezado, String parrafo) {
        System.out.println("<DOCTYPE!>\n<html>\n\t\t<title><h1>" + encabezado + "</h1><title>\n\t</head>");// utilizamos
                                                                                                           // un solo
                                                                                                           // sout para
                                                                                                           // mostrar
                                                                                                           // todo los
                                                                                                           // datos//
        System.out.println("<body>\n\t<p>" + parrafo + "</p\n\t<body>\n</html>");// con\n saltamos de linea y con \t
                                                                                 // movemos el cursor sin volver al
                                                                                 // cominezo de la linea//

    }
}
