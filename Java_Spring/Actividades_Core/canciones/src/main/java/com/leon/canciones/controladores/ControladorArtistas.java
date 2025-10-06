package com.leon.canciones.controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.leon.canciones.modelos.Artista;
import com.leon.canciones.servicios.ServicioArtistas;

import jakarta.validation.Valid;

@Controller
public class ControladorArtistas {

    @Autowired
    private ServicioArtistas servicioArtistas;

    @GetMapping("/artistas")
    public String desplegarArtistas(Model model) {
        List<Artista> artistas = servicioArtistas.obtenerTodosLosArtistas();
        model.addAttribute("artistas", artistas);
        return "artistas";
    }

    @GetMapping("/artistas/detalle/{idArtista}")
    public String desplegarDetalleArtista(@PathVariable Long idArtista, Model model) {
        Artista artista = servicioArtistas.obtenerArtistaPorId(idArtista);
        if (artista == null) {
            return "redirect:/artistas";
        }
        model.addAttribute("artista", artista);
        return "detalleArtista";
    }

    @GetMapping("/artistas/formulario/agregar")
    public String formularioAgregarArtista(Model model) {
        if (!model.containsAttribute("artista")) {
            model.addAttribute("artista", new Artista());
        }
        return "agregarArtista";
    }

    @PostMapping("/artistas/procesa/agregar")
    public String procesarAgregarArtista(@Valid @ModelAttribute("artista") Artista artista, BindingResult result) {
        if (result.hasErrors()) {
            return "agregarArtista";
        }
        servicioArtistas.agregarArtista(artista);
        return "redirect:/artistas";
    }
}
