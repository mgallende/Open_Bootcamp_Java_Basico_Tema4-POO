package poo.clases;

public class SmartDevice {

    //Atributos de la superclase
    protected String descripcion;
    protected String fabricante;
    protected String modelo;
    protected String Procesador;
    protected String dimensiones;
    protected String bateria;
    protected int peso;
    protected String conectividad;


    // Constructores

    public SmartDevice(){

    }

    public SmartDevice(String descripcion, String fabricante, String modelo, String procesador, String dimensiones, String bateria, int peso, String conectividad) {
        this.descripcion = descripcion;
        this.fabricante = fabricante;
        this.modelo = modelo;
        Procesador = procesador;
        this.dimensiones = dimensiones;
        this.bateria = bateria;
        this.peso = peso;
        this.conectividad = conectividad;
    }
}
