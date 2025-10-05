package com.leon.canciones.controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.leon.canciones.modelos.cancion;
import com.leon.canciones.servicios.ServiciosCanciones;

@Controller
@RequestMapping
public class ControladorCanciones {
    @Autowired
    private ServiciosCanciones serviciosCanciones;

    @GetMapping("/canciones")
    public String desplegarCanciones(Model model) {
        List<cancion> todas = serviciosCanciones.obtenerTodasLasCanciones();
        model.addAttribute("canciones", todas);
        return "canciones";
    }

    @GetMapping("/canciones/detalle/{idCancion}")
    public String desplegarDetalleCancion(@PathVariable Long idCancion, Model model) {
        cancion una = serviciosCanciones.obtenerCancionPorId(idCancion);
        model.addAttribute("cancion", una);
        return "detalleCancion";
    }
}
