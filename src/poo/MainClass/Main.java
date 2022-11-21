package poo.MainClass;

import poo.MainDevices.SmartPhone;
import poo.MainDevices.SmartWatch;

public class Main {

    public static void main(String[] args) {

        SmartPhone iPhone = new SmartPhone("El teléfono más avanzado del momento",
                                            "Apple",
                                            "14 Pro");

        SmartPhone samsungPhone = new SmartPhone( "El teléfono plegable numero uno",
                                                   "SamSung",
                                                   "Galaxy Z Fold");

        SmartPhone xiaomiPhone = new SmartPhone("Uno de los mejores del mercado",
                                                 "Xiaomi",
                                                 "Redmi Note 10 Pro");

        //Smartwatches

        SmartWatch xiaomiWatch = new SmartWatch("Potente y fácil de usar",
                                                "Xiaomi",
                                                "Mi Watch Lite",
                                                "Polimero de litio",
                                                "bluetooth");

        SmartWatch huaweiWatch = new SmartWatch("Inspirado en la precisión de los coches deportivos modernos",
                                                "Huawei",
                                                "Band 7 Smart",
                                                "niMah",
                                                "whiFi");

        SmartWatch samsungWatch = new SmartWatch("Reloj Inteligente y Monitorización de la Salud",
                                                "SamSung",
                                                "Galaxy Watch 5",
                                                "Litio",
                                                "Bluetooth");

        System.out.println(iPhone);
        System.out.println(samsungPhone);
        System.out.println(xiaomiPhone);

        System.out.println(xiaomiWatch);
        System.out.println(huaweiWatch);
        System.out.println(samsungWatch);

    }
}
