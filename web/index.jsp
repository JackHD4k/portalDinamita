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
        <script src="js/bootstrap.bundle.min.js"></script>
    </head>
    <body>
        <div class="container px-4">
            <div class="row gx-5">
                <div class="col">
                    <div class="p-3">
                        <!-- PRIMERA COLUMNA -->
                        <form>
                            <div class="mb-3">
                                <label for="exampleInputEmail1" class="form-label">Email address</label>
                                <input type="email" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp">
                                <div id="emailHelp" class="form-text">We'll never share your email with anyone else.</div>
                            </div>
                            <div class="mb-3">
                                <label for="exampleInputPassword1" class="form-label">Password</label>
                                <input type="password" class="form-control" id="exampleInputPassword1">
                            </div>
                            <div class="mb-3 form-check">
                                <input type="checkbox" class="form-check-input" id="exampleCheck1">
                                <label class="form-check-label" for="exampleCheck1">Check me out</label>
                            </div>
                            <button type="submit" class="btn btn-primary">Submit</button>
                        </form>
                    </div>
                </div>
                <div class="col">
                    <div class="p-3">
                        <!-- SEGUNDA COLUMNA -->
                        <form>
                            <div class="mb-3">
                                <label for="exampleInputEmail1" class="form-label">Email address</label>
                                <input type="email" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp">
                                <div id="emailHelp" class="form-text">We'll never share your email with anyone else.</div>
                            </div>
                            <div class="mb-3">
                                <label for="exampleInputPassword1" class="form-label">Password</label>
                                <input type="password" class="form-control" id="exampleInputPassword1">
                            </div>
                            <div class="mb-3 form-check">
                                <input type="checkbox" class="form-check-input" id="exampleCheck1">
                                <label class="form-check-label" for="exampleCheck1">Check me out</label>
                            </div>
                            <button type="submit" class="btn btn-primary">Submit</button>
                        </form>
                    </div>
                </div>
                <div class="col">
                    <div class="p-3">
                        <!-- 
                        --------------------------
                        TERCERA COLUMNA
                        -->
                        <form class="mt-2 px-5 pt-5 rounded-3 text-center" style="border-style: solid; border-color: #157347;background-color: white">
                            <!--
                            #####################
                            Registar suscripción
                            -->
                            <p class="text-center fs-2">Registrar suscripción</p>
                            <div class="mb-3">
                                <label class="form-label">Seleccione una suscripción:</label>
                                <select class="form-select" aria-label="Default select example">
                                    <option selected>Netflix</option>
                                    <option value="1">HBO</option>
                                    <option value="2">Hostinger</option>
                                    <option value="3">Display plus</option>
                                    <option value="4">Spotify</option>
                                    <option value="5">Amazon Prime Video</option>
                                    <option value="6">Tidal</option>
                                    <option value="7">Edelnor</option>
                                    <option value="8">Udemy</option>
                                </select>
                                <!--                                <div class="btn-group">
                                                                    <input type="button" class="btn btn-success" value="Seleccione">
                                                                    <button type="button" class="btn btn-success dropdown-toggle dropdown-toggle-split" data-bs-toggle="dropdown" aria-expanded="false">
                                                                        <span class="visually-hidden">Toggle Dropdown</span>
                                                                    </button>
                                                                    <ul class="dropdown-menu">
                                                                        <li><a class="dropdown-item" href="#">Netflix</a></li>
                                                                        <li><a class="dropdown-item" href="#">HBO</a></li>
                                                                        <li><a class="dropdown-item" href="#">Hostinger</a></li>
                                                                        <li><a class="dropdown-item" href="#">Display plus</a></li>
                                                                        <li><a class="dropdown-item" href="#">Spotify</a></li>
                                                                        <li><a class="dropdown-item" href="#">Amazon Prime Video</a></li>
                                                                        <li><a class="dropdown-item" href="#">Tidal</a></li>
                                                                        <li><a class="dropdown-item" href="#">Edelnor</a></li>
                                                                        <li><a class="dropdown-item" href="#">Udemy</a></li>
                                                                    </ul>
                                                                </div>-->
                                <p class="mt-2">o agregue el suyo</p>
                                <input type="text" class="form-control">
                            </div>
                            <!--
                            #####################
                            Categoria 
                            -->
                            <div class="mb-3">
                                <p class="form-label">Categoria:</p>
                                <div class="btn-group dropend">
                                    <button type="button" class="btn btn-primary dropdown-toggle" data-bs-toggle="dropdown" aria-expanded="false">
                                        Seleccione
                                    </button>
                                    <ul class="dropdown-menu">
                                        <li><a class="dropdown-item" href="#">Entretenimiento</a></li>
                                        <li><a class="dropdown-item" href="#">Música</a></li>
                                        <li><a class="dropdown-item" href="#">Hosting</a></li>
                                        <li><a class="dropdown-item" href="#">Educación</a></li>
                                        <li><a class="dropdown-item" href="#">Servicios</a></li>
                                    </ul>
                                </div>
                            </div>
                            <!--
                            #####################
                            Inicio de suscripción
                            -->
                            <div class="mb-3">
                                <p>Inicio de suscripción:</p>
                                <input type="date" name="dateinicio">
                            </div>
                            <!-- Ciclo -->
                            <div class="mb-3">
                                <p>Ciclo:</p>
                                <div class="btn-group dropend">
                                    <button type="button" class="btn btn-primary dropdown-toggle" data-bs-toggle="dropdown" aria-expanded="false">
                                        Seleccione
                                    </button>
                                    <ul class="dropdown-menu">
                                        <li><a class="dropdown-item" href="#">Mensual</a></li>
                                        <li><a class="dropdown-item" href="#">Semanal</a></li>
                                        <li><a class="dropdown-item" href="#">Quincenal</a></li>
                                        <li><a class="dropdown-item" href="#">Trimestal</a></li>
                                    </ul>
                                </div>
                            </div>
                            <!-- 
                            #####################
                            Fin de la suscripción
                            -->
                            <div class="mb-3">
                                <p>Recordatorio:</p>
                                <div class="btn-group dropend">
                                    <button type="button" class="btn btn-primary dropdown-toggle" data-bs-toggle="dropdown" aria-expanded="false">
                                        Seleccione
                                    </button>
                                    <ul class="dropdown-menu">
                                        <li><a class="dropdown-item" href="#">1 día antes</a></li>
                                        <li><a class="dropdown-item" href="#">2 días antes</a></li>
                                        <li><a class="dropdown-item" href="#">3 días antes</a></li>
                                        <li><a class="dropdown-item" href="#">4 días antes</a></li>
                                    </ul>
                                </div>
                            </div>
                            <!--
                            #####################
                            Moneda
                            -->
                            <div class="mb-3">
                                <p>Moneda:</p>
                                <div class="btn-group dropend">
                                    <button type="button" class="btn btn-primary dropdown-toggle" data-bs-toggle="dropdown" aria-expanded="false">
                                        Seleccione
                                    </button>
                                    <ul class="dropdown-menu">
                                        <li><a class="dropdown-item" href="#">Soles</a></li>
                                        <li><a class="dropdown-item" href="#">Dólares</a></li>
                                        <li><a class="dropdown-item" href="#">Euros</a></li>
                                    </ul>
                                </div>
                            </div>
                            <!-- 
                            #####################
                            Precio de la suscripción 
                            -->
                            <div class="mb-3">
                                <p>Precio de la suscripción:</p>
                                <input type="text" class="form-control">
                            </div>
                            <button type="submit" class="btn btn-success m-5 rounded-pill">Registrar</button>
                        </form>
                    </div>
                </div>
            </div>
        </div>
        <footer class="py-3 fixed-bottom text-center" style="background-color: #1e2225">
            <span class="text-muted">
                Equipo Dinamita
            </span>
        </footer>
    </body>
</html>
