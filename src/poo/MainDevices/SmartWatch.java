package poo.MainDevices;

public class SmartWatch extends SmartDevice {

    String pilas;
    String conectividad;

    public SmartWatch (){

    }

    public SmartWatch(String descripcion, String fabricante, String modelo, String pilas, String conectividad) {
        super(descripcion, fabricante, modelo);
    }
    @Override
    public String toString() {
        return " {" +
                "descripcion='" + descripcion + '\'' +
                ", fabricante='" + fabricante + '\'' +
                ", modelo='" + modelo + '\'' +
                ", pilas'" + pilas + '\'' +
                ", conectividad='" + conectividad + '\'' +
                "} ";
    }
}
