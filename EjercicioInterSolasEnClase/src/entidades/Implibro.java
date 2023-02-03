package entidades;

public class Implibro implements Libro{
    @Override
    public void titulo() {
        System.out.println("El título es: Foucault para encapuchadas");

    }

    @Override
    public void cantidadDePaginas() {
        System.out.println("El libro tiene 200 páginas");

    }

    @Override
    public void autor() {
        System.out.println("El colectivx de autorxs es: Mxnxdx de Lobxs");

    }
}
