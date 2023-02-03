import entidades.PeliculaServicio;

public class Main {
    public static void main(String[] args) {
        PeliculaServicio pelicula1= new PeliculaServicio();
        pelicula1.AgregarPeliculas();
        System.out.println("Películas cargadas");
        pelicula1.VerListaPeliculas();

        System.out.println("Películas con duración mayor a 2 horas: ");
        pelicula1.MayorHora();

        System.out.println("Películas con duración menor a 2 horas: ");
        pelicula1.MenorHora();
    }
}