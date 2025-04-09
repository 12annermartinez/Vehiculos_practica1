package com.actividad.herencia.practica.AnnetJME.poo;
import java.util.*;
public class Acuatico extends Vehiculo{
    private String tipoEmbarcacion;
    private int numMotores;
    private int tripulacion;
    private int numCubiertas;
    public Acuatico(int numMotores, int trpulacion, int numCubiertas, String marca, int modeloAnio, int capacidadPasajeros, int velocidadIn, int velocidadFin, String combustible, boolean estadoVehi, int tiempo, int tamanio){
        super(marca, modeloAnio, capacidadPasajeros, velocidadIn, velocidadFin, combustible, estadoVehi, tiempo, tamanio);
        this.tipoEmbarcacion=tipoEmbarcacion;
        this.numMotores=numMotores;
        this.tripulacion=tripulacion;
        this.numCubiertas=numCubiertas;


    }

}
