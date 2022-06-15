/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/JavaScript.js to edit this template
 */

var total = 0;

function verificarContraseña() {
    var contraseña = document.getElementById("password").value;
    if (contraseña == "123890") {
        location.href = 'index.jsp'
    } else {
        Swal.fire({
            title: 'Error!',
            text: 'Contraseña incorrecta',
            icon: 'error',
            confirmButtonText: 'Aceptar'
        })
    }
}
;

function registrarSuscripcion() {
    //Suscripción
    var seleccion = document.getElementById("suscripciones");
    var valordesuscripcion = seleccion.selectedOptions[0].value;

    if (valordesuscripcion === "Seleccionar") {
        valordesuscripcion = document.getElementById("categoriasnueva").value;
    }

    //Moneda
    var seleccion_moneda = document.getElementById("moneda");
    var tipo_moneda = seleccion_moneda.selectedOptions[0].value;
    var precio = document.getElementById("precioSus").value;
    if (tipo_moneda === "2") {
        precio *= 3;
    } else if (tipo_moneda === "3") {
        precio *= 4;
    }

    //Recordatorio
    var recordatorio = document.getElementById("fechaFinal").value;
    if (recordatorio === "2022-06-08") {

        //Agregar una suscripción
        var fila = "<tr><td>" + valordesuscripcion + "</td><td>" + precio + "</td></tr>";
        var btn = document.createElement("TR");
        btn.innerHTML = fila;
        document.getElementById("tablasuscripciones").appendChild(btn);

        Swal.fire({
            title: 'ALERTA!',
            text: 'Hoy se debe pagar una suscripción',
            icon: 'warning',
            confirmButtonText: 'Ok'
        })
    } else {

        //Agregar una suscripción
        var fila = "<tr><td>" + valordesuscripcion + "</td><td>" + precio + "</td></tr>";
        var btn = document.createElement("TR");
        btn.innerHTML = fila;
        document.getElementById("tablasuscripciones").appendChild(btn);

        //Alerta
        Swal.fire({
            title: 'Agregado!',
            text: 'Suscripción agregado exitosamente',
            icon: 'success',
            confirmButtonText: 'Ok'
        })
    }

    //Balance total
    total = total + parseFloat(precio);
    var balance = document.getElementById("balance_total").textContent = "S/. " + total;
    var mensual = document.getElementById("pagoMensual").textContent = "S/. " + total;
    var categoria = document.getElementById("pagoCategoria").textContent = "S/. "+ total;
}

function validarbd() {
    Swal.fire({
        title: 'Conectado a la base de datos!',
        icon: 'success'
    })
}