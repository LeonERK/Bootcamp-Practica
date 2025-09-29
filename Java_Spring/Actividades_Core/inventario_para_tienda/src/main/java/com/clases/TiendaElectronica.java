package com.clases;
import java.util.ArrayList;

public class TiendaElectronica {
    private ArrayList<ProductoElectrodomestico> listaDeProductos;

    public TiendaElectronica() {
        listaDeProductos = new ArrayList<>();
    }

    public void agregarProducto(ProductoElectrodomestico producto) {
        listaDeProductos.add(producto);
    }

    public void mostrarProductos() {
        for (ProductoElectrodomestico producto : listaDeProductos) {
            producto.mostrarInformacion();
        }
    }

    public ProductoElectrodomestico buscarProductoPorNombre(String nombre) {
        for (ProductoElectrodomestico producto : listaDeProductos) {
            if (producto.getNombre().equalsIgnoreCase(nombre)) {
                return producto;
            }
        }
        return null;
    }

    public boolean venderProducto(String nombre, int cantidad) {
        ProductoElectrodomestico producto = buscarProductoPorNombre(nombre);
        if (cantidad > 0) {
            if (producto != null && producto.getCantidadDisponible() >= cantidad) {
                producto.setCantidadDisponible(producto.getCantidadDisponible() - cantidad);
                return true;
            }
            else {
                System.out.println("Producto agotado o invalido");
            }
        }
        else {
            System.out.println("Cantidad invalida: la cantidad debe ser mayor que cero.");
        }
        return false;
    }
}
