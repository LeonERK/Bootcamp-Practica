package com.leon.canciones.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.leon.canciones.modelos.cancion;
import com.leon.canciones.repositorios.RepositoriosCanciones;

@Service
public class ServiciosCanciones {
    @Autowired
    private RepositoriosCanciones repositoriosCanciones;

    public List<cancion> obtenerTodasLasCanciones() {
        return repositoriosCanciones.findAll();
    }

    public cancion obtenerCancionPorId(Long id) {
        return repositoriosCanciones.findById(id).orElse(null);
    }

    public cancion agregarCancion(cancion nuevaCancion) {
        return repositoriosCanciones.save(nuevaCancion);
    }

    public cancion actualizaCancion(cancion cancionActualizada) {
        if (cancionActualizada == null || cancionActualizada.getId() == null) {
            return null;
        }
        return repositoriosCanciones.findById(cancionActualizada.getId()).map(existing -> {
            existing.setTitulo(cancionActualizada.getTitulo());
            existing.setArtista(cancionActualizada.getArtista());
            existing.setAlbum(cancionActualizada.getAlbum());
            existing.setGenero(cancionActualizada.getGenero());
            existing.setIdioma(cancionActualizada.getIdioma());
            return repositoriosCanciones.save(existing);
        }).orElse(null);
    }
}
