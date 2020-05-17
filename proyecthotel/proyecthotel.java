
package proyecthotel;
import java.util.List;

import data.clientData;
import entities.client;
import java.util.Scanner;

public class proyecthotel {
    public static void main(final String[] args) {
        final Scanner imput = new Scanner(System.in);
        int opt = 0;
        clientData cData = new clientData();
        do {
            System.out.println("***** HOTEL *****");
            System.out.println(" 1 lista");
            System.out.println(" 2 nuevo");
            System.out.println(" 3 eliminar");
            System.out.println(" 4 salir");
            System.out.println(" opcion de eleccion");
            opt = imput.nextInt();
            System.out.println("tu elegiste " + opt);
            imput.nextLine();
            switch (opt) {
                case 1:
                    System.out.println(" ***** 1 list ***** ");
                    final List<client> lis = cData.List();
                    System.out.println("ID \t nombre \t DNI \t nacionalidad \t sex");
                    for (final client d : lis) {
                        System.out.println(d.getId() + "\t" + d.getnombre() + "\t" + d.getDNI() + "\t"
                                + d.getnacionalidad() + "\t" + d.getsex());
                    }
                    ;
                    break;
                case 2:
                    System.out.println("**** 2 nuevo ****");
                    final client d = new client();
                    
                    System.out.println("ingrese el nombre:");
                    d.setnombre(imput.nextLine());
                    System.out.println("ingrese numero de DNI");
                    d.setDNI(imput.nextInt());
                    System.out.println(" ingrese nacionalidad");
                    d.setnacionalidad(imput.nextLine());
                    System.out.println("ingrese sex");
                    d.setsex(imput.nextLine());
                    cData.create(d);
                    break;
                case 3:
                    System.out.println("**** 3 Del ****");
                    System.out.print("Ingrese ID a eliminar: ");
                    cData.delete(imput.nextInt());
                    imput.nextLine();
                    break; 
                case 4:
                    System.out.println("gracias");
                    break;
                default:
                    System.out.println("la opcion es incorrecto");
                    break;    
            };
           
        } while (opt !=0);
    }
    
}
