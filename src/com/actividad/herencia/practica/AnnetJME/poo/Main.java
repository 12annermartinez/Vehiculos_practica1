package com.actividad.herencia.practica.AnnetJME.poo;
public class Main {
    public static void main(String[] args) {
        Terrestre obj1=new Terrestre(3, "estándar", "mototaxi", "mercedes", 2006, 3, 0, 200, "diesel", false, 10, 200);
        obj1.mostrar();
        obj1.mostrar();
        Tractor objtrac=new Tractor("arrear", 12, 4, "manual", "tractor", "ferrari", 2009, 1, 0, 50, "gasolina", true, 20, 50);
        objtrac.mostrar();
        objtrac.mostrar();
    }
}