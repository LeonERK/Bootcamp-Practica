package com.leon.peliculas_y_directores.Controladores;
import java.util.HashMap;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PathVariable;


@RestController
@RequestMapping("/peliculas")
public class ControladorPeliculas {

    private static HashMap<String, String> listaPeliculas = new HashMap<String, String>();

    public ControladorPeliculas() {
	listaPeliculas.put("Winnie the Pooh", "Don Hall");	
	listaPeliculas.put("El zorro y el sabueso", "Ted Berman");
	listaPeliculas.put("Tarzán", "Kevin Lima");		
	listaPeliculas.put("Mulán", "Barry Cook");
	listaPeliculas.put("Oliver", "Kevin Lima");	
	listaPeliculas.put("Big Hero 6", "Don Hall");	
    }

    @GetMapping
    public HashMap<String, String> obtenerPeliculas() {
        return listaPeliculas;
    }

    @GetMapping("/{nombrePelicula}")
    public String obtenerPeliculaPorNombre(@PathVariable String nombrePelicula) {
        String director = listaPeliculas.get(nombrePelicula);
        if (director != null) {
            return "Película: " + nombrePelicula + " - Director: " + director;
        } else {
            return "La película no se encuentra en nuestra lista.";
        }
    }

    @GetMapping("/director/{nombre}")
    public String obtenerPeliculasPorDirector(@PathVariable String nombre) {
    String resultado = "";
    boolean encontrado = false;

    for (String pelicula : listaPeliculas.keySet()) {
        String director = listaPeliculas.get(pelicula);
        
        if (director.equalsIgnoreCase(nombre)) {
            if (!resultado.isEmpty()) {
                resultado = resultado + ", ";
            }
            resultado = resultado + pelicula;
            encontrado = true;
        }
    }
    
    if (encontrado) {
        return "Películas del director " + nombre + ": " + resultado;
    } else {
        return "No contamos con películas con ese director en nuestra lista.";
    }
}
}

