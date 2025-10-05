package com.leon.explorador_de_recetas.Controladores;

import java.util.HashMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.ui.Model;

@Controller
@RequestMapping("/")
public class ControladorRecetas {
    private static String[] listaRecetas = { "Pizza", "Espagueti", "Lasaña" };
    private static HashMap<String, String[]> recetasConIngredientes = new HashMap<String, String[]>();

    public ControladorRecetas() {
        String[] pizza = { "Pan", "Salsa de tomate", "Queso", "Pepperoni" };
        recetasConIngredientes.put("Pizza", pizza);
        String[] espagueti = { "Pasta", "Salsa de tomate", "Carne molida", "Queso parmesano" };
        recetasConIngredientes.put("Espagueti", espagueti);
        String[] lasaña = { "Pasta", "Salsa de tomate", "Queso", "Albahaca", "Espinaca", "Champiñones" };
        recetasConIngredientes.put("Lasaña", lasaña);
    }

    @GetMapping("/recetas")
    public String obtenerTodasLasRecetas(Model modelo) {
        modelo.addAttribute("listaRecetas", listaRecetas);
        return "recetas";
    }

    @GetMapping("/recetas/{nombreReceta}")
    public String obtenerRecetaPorNombre(@PathVariable String nombreReceta, Model modelo) {
        if (recetasConIngredientes.containsKey(nombreReceta)) {
            modelo.addAttribute("nombreReceta", nombreReceta);
            modelo.addAttribute("ingredientes", recetasConIngredientes.get(nombreReceta));
        } else {
            modelo.addAttribute("mensajeError", "La receta no se encuentra en nuestra lista.");
        }

        return "detalleReceta";
    }
}