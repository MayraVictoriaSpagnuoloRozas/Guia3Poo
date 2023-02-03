package entidades;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class ProductoServicio {

    private String tipo;
    private int cantidad;
    private int precio;
    String fin="";
    private ArrayList<Producto> listaProductos;

    public ProductoServicio(){
        this.listaProductos= new ArrayList<>();
    }

    public Producto CrearProducto(String tipo, int cantidad, int precio){
        Producto producto = new Producto();
        return producto;
    }

    public ArrayList<Producto> AgregarProducto(){
        System.out.println("Ingrese una película");
        Scanner scanner= new Scanner(System.in);
        String fin="";
        do {
            System.out.println("Ingrese el tipo producto: ");
            tipo=scanner.next();
            System.out.println("Ingrese la cantidad que desea: ");
            cantidad=scanner.nextInt();
            System.out.println("Ingrese el precio del producto: ");
            precio=scanner.nextInt();

            listaProductos.add(CrearProducto(tipo,cantidad,precio));

            System.out.println("Si desea ingresar otro producto presione la letra s, de lo contrario presione" +
                    "cualquier tecla");
            fin=scanner.next();
        }while(fin.equalsIgnoreCase("s"));
        return listaProductos;

        }

    public void VerListaProductoss(){
        for (Producto i: listaProductos) {
            System.out.println(i);

        }
    }
    public void ProductoMayor20(){
        for (Producto i: listaProductos) {
            if (i.getPrecio()>=20){
                System.out.println(i);
            }
        }
    }
    public void ProductoMenor100(){
        for (Producto i: listaProductos) {
            if (i.getPrecio()<100){
                System.out.println(i);
            }
        }

}
         Iterator<Producto> i = listaProductos.iterator();
            while (i.hasNext()){
            System.out.println(i.next());
}
}

