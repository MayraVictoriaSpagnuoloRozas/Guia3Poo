package entidades;

public class ImpVehículo implements Auto, Moto{
    @Override
    public void Marca() {
        System.out.println("La marca es Honda");
    }

    @Override
    public void MarcaCubierta() {
        System.out.println("La marca es Fate");

    }

    @Override
    public void Velocidad() {
        System.out.println("Su velocidad es alta");

    }

    @Override
    public void Color() {
        System.out.println("Su color es negro");

    }

    @Override
    public void Patente() {
        System.out.println("Su patente es: ABC ");

    }
}
