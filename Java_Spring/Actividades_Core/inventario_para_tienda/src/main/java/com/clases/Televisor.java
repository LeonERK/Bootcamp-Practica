package com.clases;

public class Televisor extends ProductoElectrodomestico {
    private String resolucion;
    private double tamañoPantalla;
    private boolean smartTV;

    public Televisor(String nombre, double precio, int cantidadDisponible, String resolucion, double tamañoPantalla, boolean smartTV) {
        super(nombre, precio, cantidadDisponible);
        this.resolucion = resolucion;
        this.tamañoPantalla = tamañoPantalla;
        this.smartTV = smartTV;
    }

    public String getResolucion() {
        return resolucion;
    }
    public double getTamañoPantalla() {
        return tamañoPantalla;
    }
    public boolean isSmartTV() {
        return smartTV;
    }
    public void setResolucion(String resolucion) {
        this.resolucion = resolucion;
    }
    public void setTamañoPantalla(double tamañoPantalla) {
        this.tamañoPantalla = tamañoPantalla;
    }
    public void setSmartTV(boolean smartTV) {
        this.smartTV = smartTV;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Resolución: " + resolucion + "p, Tamaño de Pantalla: " + tamañoPantalla + " pulgadas, Smart TV: " + (smartTV ? "Sí" : "No"));
    }
}
