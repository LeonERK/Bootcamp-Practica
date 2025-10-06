package com.leon.canciones.controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import jakarta.validation.Valid;
import org.springframework.validation.BindingResult;

import com.leon.canciones.modelos.cancion;
import com.leon.canciones.servicios.ServiciosCanciones;

@Controller
@RequestMapping("/canciones")
public class ControladorCanciones {
    @Autowired
    private ServiciosCanciones serviciosCanciones;

    @GetMapping
    public String desplegarCanciones(Model model) {
        List<cancion> todas = serviciosCanciones.obtenerTodasLasCanciones();
        model.addAttribute("canciones", todas);
        return "canciones";
    }

    @GetMapping("/detalle/{idCancion}")
    public String desplegarDetalleCancion(@PathVariable Long idCancion, Model model) {
        cancion una = serviciosCanciones.obtenerCancionPorId(idCancion);
        model.addAttribute("cancion", una);
        return "detalleCancion";
    }

    @GetMapping("/formulario/agregar")
    public String formularioAgregarCancion(Model model) {
        if (!model.containsAttribute("cancion")) {
            model.addAttribute("cancion", new cancion());
        }
        return "agregarCancion";
    }

    @PostMapping("/procesa/agregar")
    public String procesarAgregarCancion(@Valid @ModelAttribute("cancion") cancion nuevaCancion,
            BindingResult result) {
        if (result.hasErrors()) {
            return "agregarCancion";
        }
        serviciosCanciones.agregarCancion(nuevaCancion);
        return "redirect:/canciones";
    }
}
