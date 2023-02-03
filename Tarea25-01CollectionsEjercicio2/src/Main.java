import entidades.Libro;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Libro libro1 = new Libro("Mxnxdx de Lobxs", "Foucault para encapuchadas",166);
        Libro libro2 = new Libro("Virgine Despentes", "Teoría King Kong", 120);
        Libro libro3 = new Libro("Julio Cortazar", "Rayuela", 642);
        Libro libro4 = new Libro("John Kennedy Toole", "La conjura de los necios", 365);

        LinkedHashSet<Libro> listaDeLibros = new LinkedHashSet<>();
        listaDeLibros.add(libro1);
        listaDeLibros.add(libro2);
        listaDeLibros.add(libro3);
        listaDeLibros.add(libro4);

       for (Libro valor: listaDeLibros){
           System.out.println("El libro ingresado es: " + valor);
       }
    }
}