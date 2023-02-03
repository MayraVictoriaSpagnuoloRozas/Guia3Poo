package entidades;

public class ImpTransporte implements Transporte{
    @Override
    public void TipoTransporte() {
        System.out.println("Auto");

    }

    @Override
    public void Velocidad() {
        System.out.println("Media");

    }

    @Override
    public void Asientos() {
        System.out.println(5);

    }
}
