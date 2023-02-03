import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input= new Scanner (System.in);
        ArrayList<Integer> Contactos = new ArrayList<>();

        int contacto;
        String termina="";


        do {
            System.out.println("Ingrese un contacto");
            contacto= input.nextInt();
            System.out.println("Si desea ingresar otro contacto presione la letra s, de lo contrario presione " +
                    "cualquier tecla");

            Contactos.add(contacto);

            termina= input.next();
        }while (termina.equalsIgnoreCase("S"));

        System.out.println("Los contactos ingresados a su lista son: "+ Contactos);
    }
}