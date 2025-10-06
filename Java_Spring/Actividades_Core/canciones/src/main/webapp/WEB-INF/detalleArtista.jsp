<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <title>Detalle Artista</title>
</head>
<body>
<h1>Detalle del Artista</h1>
<p><strong>Nombre:</strong> ${artista.nombre}</p>
<p><strong>Apellido:</strong> ${artista.apellido}</p>
<p><strong>Biografía:</strong> ${artista.biografia}</p>
<p><strong>Fecha creación:</strong> <c:out value='${artista.fechaCreacion}'/></p>
<p><strong>Última actualización:</strong> <c:out value='${artista.fechaActualizacion}'/></p>
<h2>Canciones</h2>
<c:choose>
    <c:when test='${not empty artista.canciones}'>
        <ul>
            <c:forEach var="c" items="${artista.canciones}">
                <li>${c.titulo}</li>
            </c:forEach>
        </ul>
    </c:when>
    <c:otherwise>
        <em>Sin canciones registradas.</em>
    </c:otherwise>
</c:choose>
<hr>
<a href='${pageContext.request.contextPath}/artistas'>Volver a lista de artistas</a>
</body>
</html>
