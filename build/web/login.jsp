<%-- 
    Document   : login
    Created on : 3 may. 2022, 21:00:46
    Author     : joelr
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="css/bootstrap.min.css" rel="stylesheet">
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.8.1/font/bootstrap-icons.css">
        <script src="js/bootstrap.min.js"></script>
        <title>Login</title>
    </head>
    <body class="container" style="background-color: #f0f4f7">
        <form class="mt-5 px-5 pt-5" style="border-style: solid; border-color: #157347;background-color: white">
            <h1 class="text-center">Iniciar sesión</h1>
            <img class="d-block mx-auto my-5" src="img/login_user.png" alt="login_user" style="height: 180px" />
            <div class="mb-3">
                <label class="form-label">Usuario:</label>
                <input type="text" class="form-control">
            </div>
            <div class="mb-3">
                <label class="form-label">Contraseña:</label>
                <input type="password" class="form-control">
            </div>
            <div class="d-grid mx-auto">
                <button type="submit" class="btn btn-success m-5">Iniciar sesión</button>
            </div>
        </form>
        <footer class="py-3 fixed-bottom text-center" style="background-color: #1e2225">
            <span class="text-muted">
                Equipo Dinamita
            </span>
        </footer>
    </body>
</html>
