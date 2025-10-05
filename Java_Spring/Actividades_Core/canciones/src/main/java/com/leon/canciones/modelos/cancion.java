package com.leon.canciones.modelos;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.PrePersist;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Column;
import java.util.Date;
import jakarta.persistence.PreUpdate;

@Entity
@Table(name = "canciones")
public class cancion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titulo;
    private String artista;
    private String album;
    private String genero;
    private String idioma;

    @Temporal(jakarta.persistence.TemporalType.TIMESTAMP)
    @Column(name = "fecha_de_creacion")
    private Date fechaCreacion;

    @Temporal(jakarta.persistence.TemporalType.TIMESTAMP)
    @Column(name = "fecha_de_modificacion")
    private Date fechaModificacion;

    public cancion() {
    }

    @PrePersist
    protected void onCreate() {
        fechaCreacion = new Date();
        fechaModificacion = new Date();
    }

    @PreUpdate
    protected void onUpdate() {
        fechaModificacion = new Date();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public Date getFechaModificacion() {
        return fechaModificacion;
    }

    public void setFechaModificacion(Date fechaModificacion) {
        this.fechaModificacion = fechaModificacion;
    }

}
