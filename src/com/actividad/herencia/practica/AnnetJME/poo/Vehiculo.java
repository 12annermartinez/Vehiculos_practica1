package com.actividad.herencia.practica.AnnetJME.poo;
import java.util.*;
public class Vehiculo {// ESTA SERIA LA CLASE PADRE.
    private String marca;
    private int modeloAnio;
    private int capacidadPasajeros;
    private int velocidadIn;
    private int velocidadFin;
    private String combustible;
    private boolean estadoVehi;
    private int tiempo;
    private int tamanio;
    public Vehiculo(String marca, int modeloAnio, int capacidadPasajeros, int velocidadIn, int velocidadFin, String combustible, boolean estadoVehi, int tiempo, int tamanio){
        this.marca=marca;
        this.modeloAnio=modeloAnio;
        this.capacidadPasajeros=capacidadPasajeros;
        this.velocidadIn =velocidadIn;
        this.velocidadFin=velocidadFin;
        this.combustible=combustible;
        this.estadoVehi=0;
        this.tiempo=tiempo;
        this.tamanio=tamanio;
    }
    public void mostrarVehiculo(){
        System.out.println("La marca del vehículo es: " + marca);
        System.out.println("El año modelo del vehículo es: " + modeloAnio);
        System.out.println("La máxima capacidad de pasajeros del vehículo es: " + capacidadPasajeros);
        System.out.println("La máxima velocidadIn es: " + velocidadIn);
        System.out.println("El combustible del vehículo es: " + combustible);
        System.out.println("el tamaño del vahícuolo es: "+ tamanio);
    }
    public void arrancar(){
        if (estadoVehi==0){
            this.estadoVehi=estadoVehi++;
        }
    }
    public void detener(){
        if (estadoVehi==1){
            this.estadoVehi=estadoVehi--;
        }
    }
    public int acelerar(int aceleracion){
        aceleracion=(velocidadFin-velocidadIn)/tiempo;
        return aceleracion;
    }

}
