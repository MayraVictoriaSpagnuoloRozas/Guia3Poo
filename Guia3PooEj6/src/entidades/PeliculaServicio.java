package entidades;

import java.util.ArrayList;
import java.util.Scanner;

public class PeliculaServicio {

    String titulo;
    String director;
    int duracionHora;
    private ArrayList<Pelicula> listaPeliculas;

    public PeliculaServicio(){
        this.listaPeliculas= new ArrayList<>();
    }

    public Pelicula CrearPelicula(String titulo, String director, int duracionHora){
        Pelicula pelicula = new Pelicula();
        return pelicula;
    }

    public ArrayList<Pelicula> AgregarPeliculas(){

        System.out.println("Ingrese una película");
        Scanner scanner= new Scanner(System.in);
        String fin="";
      do {
          System.out.println("Ingrese el título de la película: ");
          titulo=scanner.next();
          System.out.println("Ingrese el nombre del director de la película: ");
          director=scanner.next();
          System.out.println("Ingrese la duración de la película: ");
          duracionHora=scanner.nextInt();

          listaPeliculas.add(CrearPelicula(titulo,director,duracionHora));

          System.out.println("Si desea ingresar otra película presione la letra s, de lo contrario presione" +
                  "cualquier tecla");
          fin=scanner.next();

      }while(fin.equalsIgnoreCase("s"));
          return listaPeliculas;
    }
       public void VerListaPeliculas(){
           for (Pelicula i: listaPeliculas) {
               System.out.println(i);

           }
    }

       public void MayorHora(){
           for (Pelicula i: listaPeliculas) {
               if (i.getDuracionHora()>=2){
                   System.out.println(i);
               }
           }
       }
        public void MenorHora(){
            for (Pelicula i: listaPeliculas) {
                if (i.getDuracionHora()<2){
                    System.out.println(i);
                }
            }


       }
}






