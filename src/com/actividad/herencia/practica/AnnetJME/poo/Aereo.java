package com.actividad.herencia.practica.AnnetJME.poo;
import java.util.*;
public class Aereo extends Vehiculo{
    private int altitud;
    private String uso;
    private int turbinas;
    private String sistemaNav;
    public Aereo(int altitud, String uso, int turbinas, String sistemaNav, String marca, int modeloAnio, int capacidadPasajeros, int velocidadIn, int velocidadFin, String combustible, boolean estadoVehi, int tiempo, int tamanio){
        super(marca, modeloAnio, capacidadPasajeros, velocidadIn, velocidadFin, combustible, estadoVehi, tiempo, tamanio);
        this.altitud=altitud;
        this.uso=uso;
        this.turbinas=turbinas;
        this.sistemaNav=sistemaNav;
    }
    public void mostrarAereo(){
        System.out.println("la altitud máxima es: "+ altitud);
        System.out.println("El uso de esta nave es: "+uso);
        System.out.println("La cantidad de turbinas es: "+ turbinas);
        System.out.println("Esta nave usa: "+ sistemaNav);
    }

}
