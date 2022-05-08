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
        <link rel="preconnect" href="https://fonts.googleapis.com">
        <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
        <link href="https://fonts.googleapis.com/css2?family=Lato:wght@300&display=swap" rel="stylesheet">
        <script src="js/bootstrap.bundle.min.js"></script>
        <title>Login</title>
    </head>
    <body class="text-center container" style="background: #232228; color: #c2c2c3; font-family: 'Lato'">
        <div class="container">
            <header class="py-3 text-center">
                <h1 style="color: #c2c2c3">Portal de gestión de suscripciones <i class="bi bi-card-text mx-2"></i> </h1>
                <hr style="background-color: #f51d46; height: 5px">
            </header>
        </div>
        <div class="form-signin mx-5">
            <form class="mt-4 px-5 pt-5 mx-5" style="border-style: solid; border-color: #f51d46; background-color: #2a292f">
                <h1 class="text-center">Iniciar sesión</h1>
                <img class="d-block mx-auto my-5" src="img/login_user.png" alt="login_user" style="height: 150px" />
                <!-- USUARIO -->
                <div class="mb-3 w-50 mx-auto">
                    <label class="form-label">Usuario:</label>
                    <input type="text" class="form-control">
                </div>
                <!-- CONTRASEÑA -->
                <div class="mb-3 w-50 mx-auto">
                    <label class="form-label">Contraseña:</label>
                    <input type="password" class="form-control">
                </div>
                <div class="d-grid w-25 mx-auto">
                    <button type="submit" class="btn btn-dark border-0 m-4 rounded" style="background-color: #f51d46">
                        Registrar
                    </button>
                </div>
            </form>
            <p class="mt-3 lead">Si no se acuerda de su contraseña puede comunicarse con nuestra área de soporte al cliente <3</p>
        </div>
        <footer class="py-3 text-center" style="background-color: #1e2225">
            <span class="text-muted">
                Equipo Dinamita
            </span>
        </footer>
    </body>
</html>
