import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        ArrayList<String> razaPerro = new ArrayList<>();

        String raza;
        String termina="";
        boolean encontro= false;

        do{
            System.out.println("Ingrese una raza por favor");
            raza= input.next();

            System.out.println("Presione la letra s si desea ingresar otra raza, de lo contrario presione " +
                    "cualquier tecla");
            razaPerro.add(raza);
            termina = input.next();

        }while (termina.equalsIgnoreCase("s"));

        System.out.println("Las razas ingresadas son: "+ razaPerro);

        for (String razas : razaPerro) {
            System.out.println(razas);

        }
        System.out.println("Ingrese la raza que desea eliminar");
        String eliminar= input.next();

        Iterator<String> iterator= razaPerro.iterator();
        while (iterator.hasNext()){
            String elementoRaza = iterator.next();

            if (elementoRaza.equals(eliminar)) {
                iterator.remove();
                encontro=true;
            }
        }
        if(!encontro){
            System.out.println("La raza de perro ingresada no se encuentra en su lista");
        }

        System.out.println("La lista de perros actualizada es: ");
        for (String razas :razaPerro) {
            System.out.println(razas);

        }



    }
}