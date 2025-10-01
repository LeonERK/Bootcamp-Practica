package com;

import com.clases.ComputadoraPortatil;
import com.clases.Televisor;
import com.clases.TiendaElectronica;

public class Aplicacion {
    public static void main(String[] args) {
        TiendaElectronica tienda = new TiendaElectronica();

        Televisor tv1 = new Televisor("Samsung QLED", 1200.00, 10, "2K", 55.0, true);
        Televisor tv2 = new Televisor("LG OLED", 1500.00, 5, "4K", 65.0, true);

        ComputadoraPortatil laptop1 = new ComputadoraPortatil("Dell XPS 13", 999.99, 15, "Dell", "XPS13-2021", 16);
        ComputadoraPortatil laptop2 = new ComputadoraPortatil("MacBook Pro", 1299.99, 0, "Apple", "MBP-2021", 16);

        tienda.agregarProducto(tv1);
        tienda.agregarProducto(tv2);
        tienda.agregarProducto(laptop1);
        tienda.agregarProducto(laptop2);

        tienda.venderProducto("Samsung QLED", 2);
        tienda.venderProducto("MacBook Pro", 1);

        tienda.mostrarProductos();

    }
}
