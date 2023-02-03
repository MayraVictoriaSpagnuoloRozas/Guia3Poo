package entidades;

import java.util.ArrayList;
import java.util.Scanner;

public class PeliculaServicio {
    String pelicula;
    String Director;
    int duracionHora;
    String termina;


    Scanner scanner= new Scanner(System.in);

    Pelicula pelicula1= new Pelicula();
        pelicula1.setTitulo("La sociedad de los poetas muertos");
        pelicula1.setDirector("Pepito pepito");
        pelicula1.setDuracionHora(2);

    ArrayList<Pelicula> listaPeliculas= new ArrayList<>();
        listaPeliculas.add(new Pelicula());


        do{
        System.out.println("Ingrese el título de la película");
        pelicula = scanner.next();
        System.out.println("Ingrese el director de la película");
        Director = scanner.next();
        System.out.println("Ingrese la duración de la película");
        duracionHora = scanner.nextInt();
        System.out.println("Si desea cargar otra película ingrese la letra s, de lo contrario" +
                "presione cualquier tecla");

        Pelicula.add(new Pelicula());

        termina= scanner.next();



    }while(termina.equalsIgnoreCase("s"))








}


}

