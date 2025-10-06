<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
    <title>Agregar Canción</title>
    <style>
        .error { color: red; font-size: 0.9em; }
        form div { margin-bottom: 10px; }
        label { display:block; font-weight:600; }
    </style>
</head>
<body>
<h1>Agregar Canción</h1>
<form:form method="post" modelAttribute="cancion" action="${pageContext.request.contextPath}/canciones/procesa/agregar">
    <div>
        <label for="titulo">Título</label>
        <form:input path="titulo" id="titulo" />
        <form:errors path="titulo" cssClass="error" />
    </div>
    <div>
        <label for="artistaId">Artista</label>
        <select name="artistaId" id="artistaId" required>
            <option value="" disabled selected>-- Selecciona un artista --</option>
            <c:forEach var="a" items="${artistas}">
                <option value="${a.id}">${a.nombre} ${a.apellido}</option>
            </c:forEach>
        </select>
        <form:errors path="artista" cssClass="error" />
    </div>
    <div>
        <label for="album">Álbum</label>
        <form:input path="album" id="album" />
        <form:errors path="album" cssClass="error" />
    </div>
    <div>
        <label for="genero">Género</label>
        <form:input path="genero" id="genero" />
        <form:errors path="genero" cssClass="error" />
    </div>
    <div>
        <label for="idioma">Idioma</label>
        <form:input path="idioma" id="idioma" />
        <form:errors path="idioma" cssClass="error" />
    </div>
    <div>
        <button type="submit">Guardar</button>
    </div>
</form:form>
<hr>
<a href="${pageContext.request.contextPath}/canciones">Volver a lista de canciones</a>
</body>
</html>
