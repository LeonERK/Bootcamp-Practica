<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <title>Detalle Canción</title>
    </head>
    <body>
        <h1>Detalle de la Canción</h1>
        <p><strong>Título:</strong> ${cancion.titulo}</p>
        <p><strong>Artista:</strong> ${cancion.artista}</p>
        <p><strong>Álbum:</strong> ${cancion.album}</p>
        <p><strong>Género:</strong> ${cancion.genero}</p>
        <p><strong>Idioma:</strong> ${cancion.idioma}</p>
        <div style="margin-top:12px;">
            <a href="${pageContext.request.contextPath}/canciones/formulario/editar/${cancion.id}">
                <button type="button">Editar Canción</button>
            </a>
        </div>
        <hr/>
        <a href="${pageContext.request.contextPath}/canciones">Volver</a>
    </body>
</html>
