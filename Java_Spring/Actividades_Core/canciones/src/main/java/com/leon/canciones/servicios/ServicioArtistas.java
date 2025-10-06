package com.leon.canciones.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.leon.canciones.modelos.Artista;
import com.leon.canciones.repositorios.RepositorioArtistass;

@Service
public class ServicioArtistas {

    @Autowired
    private RepositorioArtistass repositorioArtistass;

    public List<Artista> obtenerTodosLosArtistas() {
        return repositorioArtistass.findAll();
    }

    public Artista obtenerArtistaPorId(Long id) {
        return repositorioArtistass.findById(id).orElse(null);
    }

    public Artista agregarArtista(Artista artista) {
        return repositorioArtistass.save(artista);
    }
}
