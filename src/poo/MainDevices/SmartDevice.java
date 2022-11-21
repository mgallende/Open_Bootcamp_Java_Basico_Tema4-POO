package poo.MainDevices;

public class SmartDevice {

    //Atributos de la superclase
    String descripcion;
    String fabricante;
    String modelo;

    public SmartDevice(){
    }

    public SmartDevice(String descripcion, String fabricante, String modelo) {
        this.descripcion = descripcion;
        this.fabricante = fabricante;
        this.modelo = modelo;
    }
}
