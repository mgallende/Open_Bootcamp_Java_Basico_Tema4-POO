package poo.Smart;

import poo.clases.SmartDevice;

public class SmartPhone extends SmartDevice {

    public SmartPhone(){

    }

    public SmartPhone(String descripcion, String fabricante, String modelo, String procesador, String dimensiones, String bateria, int peso, String conectividad) {
        super(descripcion, fabricante, modelo, procesador, dimensiones, bateria, peso, conectividad);
    }

    @Override
    public String toString() {
        return "poo.Smart.SmartPhone{" +
                "descripcion='" + descripcion + '\'' +
                ", fabricante='" + fabricante + '\'' +
                ", modelo='" + modelo + '\'' +
                ", Procesador='" + Procesador + '\'' +
                ", dimensiones='" + dimensiones + '\'' +
                ", bateria='" + bateria + '\'' +
                ", peso=" + peso +
                ", conectividad='" + conectividad + '\'' +
                "} " + super.toString();
    }
}
