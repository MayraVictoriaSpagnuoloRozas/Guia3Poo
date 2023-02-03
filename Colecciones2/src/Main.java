import entidades.Personas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input= new Scanner (System.in);

        List<Personas> listaDeNombres = new ArrayList<>();

        listaDeNombres.add(new Personas("Pepito"));

        for (Personas persona1: listaDeNombres){
        System.out.println("El nombre del empleado es: " + persona1.getNombre());

    }
}
}