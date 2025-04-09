package com.actividad.herencia.practica.AnnetJME.poo;
import java.util.*;
public class Terrestre extends Vehiculo{
    private int numRuedas;
    private String transmision;
    private String tipoVehiculo;
    public Terrestre(int numRuedas, String transmision, String tipoVehiculo, String marca, int modeloAnio, int capacidadPasajeros, int velocidadIn, int velocidadFin, String combustible, boolean estadoVehi, int tiempo, int tamanio){
        super(marca, modeloAnio, capacidadPasajeros, velocidadIn, velocidadFin, combustible, estadoVehi, tiempo, tamanio);
        this.numRuedas=numRuedas;
        this.transmision=transmision;
        this.tipoVehiculo=tipoVehiculo;
    }
    public void mostrarTerrestre(){
        System.out.println("El numero de ruedas de este vehiculo es: "+numRuedas);
        System.out.println("El tipo de transmision de carro es: " + transmision);
        System.out.println("El tipo de vehiculo es: "+ tipoVehiculo);
    }
}
