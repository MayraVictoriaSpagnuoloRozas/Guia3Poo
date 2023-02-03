import com.sun.source.tree.NewArrayTree;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner input= new Scanner (System.in);
        List<String> listadeNombres = new ArrayList<>();

        System.out.println("Ingrese la cantidad de nombres que va a ingresar");
        int N= input.nextInt();

        for (int i= 0; i<N; i++){
            System.out.println("Ingrese un nombre: ");
            String nombre= input.next();
            listadeNombres.add(nombre);
        }


        Collections.sort(listadeNombres);
        listadeNombres.remove(2);

        for(String valor: listadeNombres){
        System.out.println("El nombre ingresado es: " + valor);

        }
    }
}