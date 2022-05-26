<%-- 
    Document   : index
    Created on : 3 may. 2022, 20:48:43
    Author     : joelr
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Portal de recordatorios</title>
        <link href="css/bootstrap.min.css" rel="stylesheet">
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.8.1/font/bootstrap-icons.css">
        <link rel="preconnect" href="https://fonts.googleapis.com">
        <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
        <link href="https://fonts.googleapis.com/css2?family=Lato:wght@300&display=swap" rel="stylesheet">
        <script src="js/bootstrap.bundle.min.js"></script>
        <script src="//cdn.jsdelivr.net/npm/sweetalert2@11"></script>
        <script src="js/script.js"></script>
    </head>
    <body style="background: #232228; color: #c2c2c3; font-family: 'Lato'">
        <!-- 
        #####################
        Header
        -->
        <div class="container">
            <header class="py-3 text-center">
                <h1 style="color: #c2c2c3">Portal de gestión de suscripciones <i class="bi bi-card-text mx-2"></i> </h1>
                <hr style="background-color: #f51d46; height: 5px">
            </header>
        </div>
        <!-- 
        #####################
        Columnas
        -->
        <div class="container px-4">
            <div class="row gx-5">
                <!--
                --------------------------
                PRIMERA COLUMNA
                -->
                <div class="col p-4">
                    <div class="rounded-3" style="border-style: solid; border-color: #f51d46;background-color: #2a292f; height: 100%">
                        <div class="text-center">
                            <p class="fs-2 mt-4">Usuario</p>
                            <img class="d-block mx-auto my-5" src="img/login_user.png" alt="login_user" style="height: 90px" />
                            <p>TepoTepo</p>
                        </div>
                        <div class="dropdown my-5">
                            <button class="btn btn-secondary dropdown-toggle mx-3" type="button" id="dropdownMenuButton1" data-bs-toggle="dropdown" aria-expanded="false">
                                Seleccione categoria:
                            </button>
                            <ul class="dropdown-menu" aria-labelledby="dropdownMenuButton1">
                                <li><a class="dropdown-item" href="#">Entretenimiento</a></li>
                                <li><a class="dropdown-item" href="#">Música</a></li>
                                <li><a class="dropdown-item" href="#">Educación</a></li>
                            </ul>
                        </div>
                        <div class="container my-5">
                            <div class="card m-2 mb-5" style="width: 18rem; background-color: #393840">
                                <div class="card-body text-center">
                                    <h5 class="card-title">S/ 20.00</h5>
                                </div>
                            </div>
                        </div>
                        <div class=" my-5">
                            <p class="mx-3">Pago mensual:</p>
                            <div class="container my-4">
                                <div class="card m-2" style="width: 18rem; background-color: #393840">
                                    <div class="card-body text-center">
                                        <h5 class="card-title" id="pagoMensual"></h5>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="text-center">
                            <a href="login.jsp" class="btn btn-dark border-0 mb-4 rounded" style="background-color: #f51d46">
                                Cerrar sesión
                            </a>
                        </div>
                        <div class="" style="height: 15px;margin-top: 140px">
                            <hr>
                        </div>
                        <div class="mt-3 mx-3 text-end ">
                            <p>Soporte técnico: 442-1210</p>
                        </div>
                    </div>
                </div>
                <!--
                --------------------------
                SEGUNDA COLUMNA
                -->
                <div class="col p-4">
                    <div class="rounded-3" style="border-style: solid; border-color: #f51d46;background-color: #2a292f; height: 100%">
                        <div class="text-center">
                            <p class="fs-2 mt-4">Lista de suscripciones</p>
                        </div>
                        <div class="mx-3">
                            <p>Balance total:
                                <br> 
                                <span id="balance_total"></span>
                            </p>
                            <hr style="background-color: #f51d46">
                        </div>
                        <p class="mx-3">Suscripciones:</p>
                        <table class="table" id="tablasuscripciones" style="color: #c2c2c3">
                            <thead>
                                <tr class="col">
                                    <th class="col-8" scope="col">Nombre</th>
                                    <th class="col-2" scope="col">Precio</th>
                                </tr>
                            </thead>
                            <tbody id="tbody">

                            </tbody>
                        </table>
                    </div>
                </div>
                <!-- 
                --------------------------
                TERCERA COLUMNA
                -->
                <div class="col">
                    <div class="p-3">
                        <form class="mt-2 px-5 pt-3 rounded-3 text-center" style="border-style: solid; border-color: #f51d46;background-color: #2a292f">
                            <!--
                            #####################
                            Registar suscripción
                            -->
                            <p class="text-center fs-2 mb-4">Registrar suscripción</p>
                            <div class="mb-3">
                                <p class="form-label">Seleccione una suscripción:</p>

                                <select class="form-select border-0 border-success" id="suscripciones" style="background-color: #232228; color: #acafb9">
                                    <option selected>Seleccionar</option>
                                    <option value="Netflix">Netflix</option>
                                    <option value="Hostinger">Hostinger</option>
                                    <option value="Disney plus">Disney plus</option>
                                    <option value="Spotify">Spotify</option>
                                    <option value="Amazon Prime Video">Amazon Prime Video</option>
                                    <option value="Tidal">Tidal</option>
                                    <option value="Edelnor">Edelnor</option>
                                    <option value="Udemy">Udemy</option>
                                </select>
                                <p class="mt-2">o agregue el suyo</p>
                                <input type="text" id="categoriasnueva" class="form-control border-0" style="background-color: #232228; color: #acafb9">
                            </div>
                            <!--
                            #####################
                            Categoria 
                            -->
                            <div class="mb-3">
                                <p class="form-label">Categoria:</p>
                                <select class="form-select border-0 border-success" style="background-color: #232228; color: #acafb9">

                                    <option selected>Seleccionar</option>
                                    <option value="1">Música</option>
                                    <option value="2">Hosting</option>
                                    <option value="3">Educación</option>
                                    <option value="4">Entretenimiento</option>
                                </select>
                            </div>
                            <!--
                            #####################
                            Inicio de suscripción
                            -->
                            <div class="mb-3">
                                <p>Inicio de suscripción:</p>
                                <input type="date" name="dateinicio" style="background-color: #232228; color: #acafb9">
                            </div>
                            <!--
                            #####################
                            Ciclo
                            -->
                            <div class="mb-3">
                                <p>Ciclo:</p>
                                <select class="form-select border-0 border-success" style="background-color: #232228; color: #acafb9">
                                    <option selected>Seleccionar</option>
                                    <option value="1">Mensual</option>
                                    <option value="2">Semanal</option>
                                    <option value="3">Bimestral</option>
                                    <option value="4">Trimestral</option>
                                </select>
                            </div>
                            <!-- 
                            #####################
                            Fin de la suscripción
                            -->
                            <div class="mb-3">
                                <p>Fin de la suscripción</p>
                                <input type="date" id="fechaFinal" name="dateinicio" style="background-color: #232228; color: #acafb9">
                            </div>
                            <!-- 
                            #####################
                            Recordatorio
                            -->
                            <div class="mb-3">
                                <p>Recordatorio:</p>
                                <select class="form-select border-0 border-success" style="background-color: #232228; color: #acafb9">
                                    <option selected>Seleccionar</option>
                                    <option value="1">1 día antes</option>
                                    <option value="2">2 día antes</option>
                                    <option value="3">3 días antes</option>
                                    <option value="4">4 días antes</option>
                                </select>
                            </div>
                            <!--
                            #####################
                            Moneda
                            -->
                            <div class="mb-3">
                                <p>Moneda:</p>
                                <select class="form-select border-0 border-success" id="moneda" style="background-color: #232228; color: #acafb9">
                                    <option selected>Seleccionar</option>
                                    <option value="1">Soles</option>
                                    <option value="2">Dólar</option>
                                    <option value="3">Euro</option>
                                </select>
                            </div>
                            <!-- 
                            #####################
                            Precio de la suscripción 
                            -->
                            <div class="mb-3">
                                <p>Precio de la suscripción:</p>
                                <input type="number" id="precioSus" class="form-control border-0" style="background-color: #232228; color: #acafb9">
                            </div>
                            <button type="button" onclick="registrarSuscripcion()" class="btn btn-dark border-0 mb-4 rounded" style="background-color: #f51d46">
                                Registrar
                            </button>
                        </form>
                    </div>
                </div>
            </div>
        </div>
        <!-- 
        #####################
        Footer
        -->
        <footer class="py-3 text-center" style="background-color: #1b1a1f">
            <span class="text-muted">
                Equipo Dinamita
            </span>
        </footer>
    </body>
</html>
