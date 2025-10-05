<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <title>Lista de Recetas</title>
    <link rel="stylesheet" href="<c:url value='/css/styles.css'/>">
</head>
<body>
    <h1>Explorador de Recetas</h1>
    
    <c:choose>
        <c:when test="${not empty listaRecetas}">
            <h2>Nuestras Recetas:</h2>
            <ul class="recetas-lista">
                <c:forEach var="receta" items="${listaRecetas}">
                    <li class="receta-item">
                        <a href="<c:url value='/recetas/${receta}'/>" class="receta-link">
                            ${receta}
                        </a>
                    </li>
                </c:forEach>
            </ul>
        </c:when>
        <c:otherwise>
            <p class="mensaje-vacio">No hay recetas disponibles.</p>
        </c:otherwise>
    </c:choose>
</body>
</html>