package poo.MainDevices;

public class SmartPhone extends SmartDevice {
    public SmartPhone(){

    }
    public SmartPhone(String descripcion, String fabricante, String modelo) {
        super(descripcion, fabricante, modelo);
    }
    @Override
    public String toString() {
        return " {" +
                "descripcion ='" + descripcion + '\'' +
                ", fabricante ='" + fabricante + '\'' +
                ", modelo ='" + modelo + '\'' +
                "} ";
    }
}
