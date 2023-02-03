package entidades;

import java.util.Scanner;

public class ImpBiblioteca implements Biblioteca {

    protected String nombre;
    protected String apellido;
    protected String titulo;
    protected int paginas;

    @Override
    public void crearAutor() {
        Scanner input= new Scanner(System.in);
        System.out.println("Ingrese el nombre del autor: ");
        nombre = input.next();
        System.out.println("Ahora su apellido: ");
        apellido= input.next();


    }

    @Override
    public void crearLibro() {
        Scanner input= new Scanner(System.in);
        System.out.println("Ingrese el título del libro: ");
        titulo = input.next();
        System.out.println("Ahora la cantidad de páginas: ");
        paginas= input.nextInt();



    }
    public void mostrarLibro(){
        System.out.println("El nombre del autor es: " + nombre +  "Su apellido es: " + apellido +
                 "El título de su libro es: " + titulo +  "Y este tiene: " + paginas +  "páginas");
    }
}
