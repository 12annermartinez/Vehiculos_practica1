package com.actividad.herencia.practica.AnnetJME.poo;

public class Tractor extends Terrestre{
    private int tareasRealizar;
    private int capacidadCarga;
    public Tractor(int tareasRealizar, int capacidadCarga, String marca, int modeloAnio, int capacidadPasajeros, int velocidadIn, int velocidadFin, String combustible, boolean estadoVehi, int tiempo, int tamanio) {
        super(marca, modeloAnio, capacidadPasajeros, velocidadIn, velocidadFin, combustible, estadoVehi, tiempo, tamanio);
        this.tareasRealizar = tareasRealizar;
        this.capacidadCarga = capacidadCarga;
    }
    public void mostrar() {
        super.mostrar();
        System.out.println("Tareas que realiza el tractor: " + tareasRealizar);
        System.out.println("Capacidad de carga: " + capacidadCarga);
    }

}
