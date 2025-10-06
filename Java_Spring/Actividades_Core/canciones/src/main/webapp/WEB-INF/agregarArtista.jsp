<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
    <title>Agregar Artista</title>
    <style>
        .error { color:red; font-size:0.9em; }
        form div { margin-bottom: 10px; }
        label { display:block; font-weight:600; }
    </style>
</head>
<body>
<h1>Agregar Artista</h1>
<form:form method="post" modelAttribute="artista" action="${pageContext.request.contextPath}/artistas/procesa/agregar">
    <div>
        <label for="nombre">Nombre</label>
        <form:input path="nombre" id="nombre" />
        <form:errors path="nombre" cssClass="error" />
    </div>
    <div>
        <label for="apellido">Apellido</label>
        <form:input path="apellido" id="apellido" />
        <form:errors path="apellido" cssClass="error" />
    </div>
    <div>
        <label for="biografia">Biografía</label>
        <form:textarea path="biografia" id="biografia" rows="5" cols="50" />
        <form:errors path="biografia" cssClass="error" />
    </div>
    <div>
        <button type="submit">Guardar</button>
        <a href="${pageContext.request.contextPath}/artistas">Cancelar</a>
    </div>
</form:form>
<hr>
<a href="${pageContext.request.contextPath}/artistas">Volver a lista de artistas</a>
</body>
</html>
