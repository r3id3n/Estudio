package com.example;

public class CocheMain {
    public static void main(String[] args) {
        String coche = "Alfa Romeo";
        Coche cocheObj =new Coche();
        Coche cocheObj2 = new Coche("Rojo", "Honda", "Civic", 1430.45, 5.4);
        cocheObj2.acelerar(50);
        System.out.println(cocheObj2);

        CocheElectrico cocheElectrico = new CocheElectrico();
        cocheElectrico.motorElectrico = "Motor ejemplo";
        cocheElectrico.color = "verde";
        cocheElectrico.fabricante = "hinda";
        cocheElectrico.modelo = "Civic";
        System.out.println(cocheElectrico);

        CocheElectrico cocheElectrico2 = new CocheElectrico("Azul", "Alfa", "Julieta", 1500d, 4.99, "TXZ");
        System.out.println(cocheElectrico2);

        cocheElectrico2.acelerar(50);
        System.out.println(cocheElectrico2);
    }
}
