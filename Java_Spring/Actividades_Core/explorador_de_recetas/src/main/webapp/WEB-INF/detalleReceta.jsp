<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <title>Detalle de Receta</title>
    <link rel="stylesheet" href="<c:url value='/css/styles.css'/>">
</head>
<body>
    <h1>Detalle de Receta</h1>
    
    <c:choose>
        <c:when test="${not empty mensajeError}">
            <div class="mensaje-error">
                <p>${mensajeError}</p>
            </div>
        </c:when>
        <c:when test="${not empty nombreReceta and not empty ingredientes}">
            <h2>${nombreReceta}</h2>
            <h3>Ingredientes:</h3>
            <ul class="ingredientes-lista">
                <c:forEach var="ingrediente" items="${ingredientes}">
                    <li class="ingrediente-item">${ingrediente}</li>
                </c:forEach>
            </ul>
        </c:when>
        <c:otherwise>
            <div class="mensaje-error">
                <p>No se pudo cargar la información de la receta.</p>
            </div>
        </c:otherwise>
    </c:choose>
    
    <div>
        <a href="<c:url value='/recetas'/>" class="volver-link">Volver a la lista</a>
    </div>
</body>
</html>