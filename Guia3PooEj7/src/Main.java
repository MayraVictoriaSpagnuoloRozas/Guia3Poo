import entidades.Producto;
import entidades.ProductoServicio;

public class Main {
    public static void main(String[] args) {

        ProductoServicio producto1= new ProductoServicio();
        producto1.AgregarProducto();
        System.out.println("Productos cargados");
        producto1.VerListaProductoss();

        System.out.println("Productos con precio mayor a 20: ");
        producto1.ProductoMayor20();

        System.out.println("Producto con precio menor a 100: ");
        producto1.ProductoMenor100();


    }
}