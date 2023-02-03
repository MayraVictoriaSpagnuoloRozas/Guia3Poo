package entidades;

import java.util.Scanner;

public class ImpOperacion implements Suma{
    @Override
    public void Saludar() {
        System.out.println("Bienvenidx");

    }

    @Override
    public void TipoOperacion() {
        System.out.println("La operación es una suma");

    }

    @Override
    public void Operacion() {
        int suma;
        Scanner input= new Scanner(System.in);
        System.out.println("Ingrese el primer valor");
        int V1 = input.nextInt();
        System.out.println("Ingrese el segundo valor");
        int V2 = input.nextInt();
        suma=  V1 + V2;
        System.out.println("El resultado de la operación es: " + suma);

    }
}
