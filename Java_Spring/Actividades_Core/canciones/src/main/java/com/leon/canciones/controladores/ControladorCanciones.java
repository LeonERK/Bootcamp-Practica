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
import org.springframework.web.bind.annotation.RequestParam;

import com.leon.canciones.modelos.cancion;
import com.leon.canciones.servicios.ServiciosCanciones;
import com.leon.canciones.modelos.Artista;
import com.leon.canciones.servicios.ServicioArtistas;

@Controller
@RequestMapping("/canciones")
public class ControladorCanciones {
    @Autowired
    private ServiciosCanciones serviciosCanciones;

    @Autowired
    private ServicioArtistas servicioArtistas;

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
        model.addAttribute("artistas", servicioArtistas.obtenerTodosLosArtistas());
        return "agregarCancion";
    }

    @PostMapping("/procesa/agregar")
    public String procesarAgregarCancion(@Valid @ModelAttribute("cancion") cancion nuevaCancion,
            BindingResult result, Model model, @RequestParam(required = false) Long artistaId) {
        if (artistaId == null) {
            result.rejectValue("artista", "artista.requerido", "Debes seleccionar un artista");
        }
        if (result.hasErrors()) {
            model.addAttribute("artistas", servicioArtistas.obtenerTodosLosArtistas());
            return "agregarCancion";
        }
        Artista artista = servicioArtistas.obtenerArtistaPorId(artistaId);
        if (artista == null) {
            result.rejectValue("artista", "artista.noExiste", "El artista seleccionado no existe");
            model.addAttribute("artistas", servicioArtistas.obtenerTodosLosArtistas());
            return "agregarCancion";
        }
        nuevaCancion.setArtista(artista);
        serviciosCanciones.agregarCancion(nuevaCancion);
        return "redirect:/canciones";
    }

    @GetMapping("/formulario/editar/{idCancion}")
    public String formularioEditarCancion(@PathVariable Long idCancion, Model model) {
        cancion existente = serviciosCanciones.obtenerCancionPorId(idCancion);
        if (existente == null) {
            return "redirect:/canciones"; // si no existe redirige a la lista
        }
        if (!model.containsAttribute("cancion")) {
            model.addAttribute("cancion", existente);
        }
        return "editarCancion";
    }

    @PostMapping("/procesa/editar/{idCancion}")
    public String procesarEditarCancion(@PathVariable Long idCancion,
            @Valid @ModelAttribute("cancion") cancion cancionForm,
            BindingResult result) {
        if (result.hasErrors()) {
            return "editarCancion";
        }
        cancionForm.setId(idCancion);
        serviciosCanciones.actualizaCancion(cancionForm);
        return "redirect:/canciones";
    }

    @PostMapping("/eliminar/{idCancion}")
    public String procesarEliminarCancion(@PathVariable Long idCancion) {
        serviciosCanciones.eliminaCancion(idCancion);
        return "redirect:/canciones";
    }
}
