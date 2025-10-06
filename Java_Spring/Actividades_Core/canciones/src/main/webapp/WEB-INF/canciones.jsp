<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <title>Canciones</title>
</head>
<body>
    <h1>Listado de Canciones</h1>
    <table border="1" cellspacing="0" cellpadding="6">
        <thead>
        <tr>
            <th>Título</th>
            <th>Autor</th>
            <th>Detalle</th>
        </tr>
        </thead>
    <tbody>
        <c:forEach var="cancion" items="${canciones}">
            <tr>
                <td>${cancion.titulo}</td>
                <td>
                    <c:choose>
                        <c:when test='${cancion.artista != null}'>${cancion.artista.nombre} ${cancion.artista.apellido}</c:when>
                        <c:otherwise>Sin artista</c:otherwise>
                    </c:choose>
                </td>
                <td>
                    <a href="${pageContext.request.contextPath}/canciones/detalle/${cancion.id}">Detalle</a>
                </td>
            </tr>
        </c:forEach>
    </tbody>
    </table>
    <div style="margin-top:16px;">
        <a href="${pageContext.request.contextPath}/canciones/formulario/agregar">
            <button type="button">Agregar Canción</button>
        </a>
    </div>
    <hr>
    <a href='${pageContext.request.contextPath}/artistas'>Ir a artistas</a>
</body>
</html>
