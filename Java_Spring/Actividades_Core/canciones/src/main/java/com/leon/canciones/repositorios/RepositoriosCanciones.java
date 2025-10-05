package com.leon.canciones.repositorios;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.lang.NonNull;

import com.leon.canciones.modelos.cancion;

@Repository
public interface RepositoriosCanciones extends CrudRepository<cancion, Long> {
    @NonNull
    List<cancion> findAll();
}
