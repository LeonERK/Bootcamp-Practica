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
}
