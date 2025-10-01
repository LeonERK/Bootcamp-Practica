package com.clases;

public class ComputadoraPortatil extends ProductoElectrodomestico {
    private String marca;
    private String numeroSerie;
    private int memoriaRam;

    public ComputadoraPortatil(String nombre, double precio, int cantidadDisponible, String marca, String numeroSerie, int memoriaRam) {
        super(nombre, precio, cantidadDisponible);
        this.marca = marca;
        this.numeroSerie = numeroSerie;
        this.memoriaRam = memoriaRam;
    }

    public String getMarca() {
        return marca;
    }
    public String getNumeroSerie() {
        return numeroSerie;
    }
    public int getMemoriaRam() {
        return memoriaRam;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public void setNumeroSerie(String numeroSerie) {
        this.numeroSerie = numeroSerie;
    }
    public void setMemoriaRam(int memoriaRam) {
        this.memoriaRam = memoriaRam;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Marca: " + marca + ", Número de Serie: " + numeroSerie + ", Memoria RAM: " + memoriaRam + "GB");
    }
}
