<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <title>Artistas</title>
</head>
<body>
<h1>Listado de Artistas</h1>
<ul>
    <c:forEach var="artista" items="${artistas}">
        <li>
            <a href="${pageContext.request.contextPath}/artistas/detalle/${artista.id}">
                ${artista.nombre} ${artista.apellido}
            </a>
        </li>
    </c:forEach>
</ul>
<div style="margin:12px 0;">
    <a href='${pageContext.request.contextPath}/artistas/formulario/agregar'>
        <button type="button">Agregar Artista</button>
    </a>
</div>
<hr>
<a href="${pageContext.request.contextPath}/canciones">Ir a canciones</a>
</body>
</html>
