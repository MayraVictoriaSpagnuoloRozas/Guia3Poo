import entidades.ImpVehículo;

public class Main {
    public static void main(String[] args) {

        ImpVehículo objAuto = new ImpVehículo();
        objAuto.Marca();
        objAuto.MarcaCubierta();
        objAuto.Color();
        objAuto.Patente();
        objAuto.Velocidad();

        ImpVehículo objMoto = new ImpVehículo();
        objMoto.Marca();
        objMoto.MarcaCubierta();
        objMoto.Color();
        objMoto.Patente();
        objMoto.Velocidad();
    }
}