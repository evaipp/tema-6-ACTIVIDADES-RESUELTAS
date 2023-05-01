import java.util.Scanner;

public class pedirencabezado {
    public static String pedirEncabezado(){
        String encabezado;
         Scanner sc= new Scanner(System.in);
         System.out.println("introduzca un encabezado");
         encabezado=sc.nextLine();
         return encabezado;
}
