import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input= new Scanner (System.in);
        List<Integer> ListaNumeros= new ArrayList<Integer>();

        ListaNumeros.add(1);
        ListaNumeros.add(2);
        ListaNumeros.add(3);
        ListaNumeros.add(4);
        ListaNumeros.add(5);
        ListaNumeros.add(6);
        ListaNumeros.add(7);

        for (Integer valor: ListaNumeros) {
            System.out.println(valor);
        }

        System.out.println("Ingrese el primer número:");
        int N= input.nextInt();

        for (int i = 0; i< N; i ++ ){
        System.out.println("Ingrese otro número");
        int numero= input.nextInt();
        ListaNumeros.add(numero);

    }

}
}