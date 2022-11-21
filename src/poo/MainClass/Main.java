package poo.MainClass;

import poo.MainDevices.SmartPhone;

public class Main {

    public static void main(String[] args) {

        SmartPhone iPhone = new SmartPhone("El teléfono más avanzado del momento",
                                            "Apple",
                                            "14 Pro",
                                            "CPU de 6 núcleos",
                                            "14,75 x 7,15 x 0,78",
                                            "9800mAh",
                                            "450gr",
                                            "WiFi");

        SmartPhone samsungPhone = new SmartPhone( "El teléfono plegable numero uno",
                                                   "SamSung",
                                                   "Galaxyu Z Fold",
                                                   "Qualcomm Snapdragon 888 (SM8350)",
                                                   "158,2 x 67,1 x 16.0/14.4 mm",
                                                   "4400 mAh",
                                                   "750gr",
                                                   "802.11 a/b/g/n/ac ax 2.4G+5GHz");

        SmartPhone xiaomiPhone = new SmartPhone("El teléfono plegable numero uno",
                                                 "SamSung",
                                                 "Galaxyu Z Fold",
                                                 "Qualcomm Snapdragon 888 (SM8350)",
                                                 "158,2 x 67,1 x 16.0/14.4 mm",
                                                 "4400 mAh",
                                                 "750gr",
                                                 "802.11 a/b/g/n/ac ax 2.4G+5GHz");


        System.out.println(iPhone);

    }



}
