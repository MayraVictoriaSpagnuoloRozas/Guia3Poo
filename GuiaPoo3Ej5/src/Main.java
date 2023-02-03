import entidades.Alumno;
import entidades.ServicioAlumno;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Alumno alumno= new Alumno();


        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
        ServicioAlumno listaAlumno = new ServicioAlumno();
        Integer nota1;
        String nombre;
        Integer nota2;
        Integer nota3;
        String termina = "";


        listaAlumno.CrearAlumno("Jano", 7, 8, 10);
        listaAlumno.CrearAlumno("Libertad", 10, 8, 7);
        listaAlumno.CrearAlumno("Julieta", 8, 8, 9);

        System.out.println("Ingreso de alumnxs a la lista");
        do {
            System.out.println("Ingrese el nombre");
            nombre= leer.next();
            System.out.println("Ingrese la primer nota");
            nota1= leer.nextInt();
            System.out.println("Ingrese la segunda nota");
            nota2= leer.nextInt();
            System.out.println("Ingrese la tercer nota");
            nota3= leer.nextInt();

            System.out.println("Para ingresar otro alumno presione S, de lo contrario cualquier tecla.");
            termina= leer.next();
            listaAlumno.CrearAlumno(nombre, nota1, nota2, nota3);

        }while(termina.equalsIgnoreCase("s"));

        System.out.println("Lista de alumnos: ");
        listaAlumno.VerListado();


    }
}