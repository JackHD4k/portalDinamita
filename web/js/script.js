/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/JavaScript.js to edit this template
 */


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
};

function addRow(){
    var select = document.getElementById("setcategorias");
    var option = select.options[select.selectedIndex];
    
    Console.log(option.text)
    
    
    
    
    var t1 = document.getElementById("tablasuscripciones");
    var tbody = document.getElementById("tbody");
    
    var row1 = document.createElement("TR");
    
    for(var i=0;i<6;i++){
        var col1 = document.createElement("TD");
        col1.innerHTML = "<font color='red'>1212</font>";
        
        row1.appendChild(col1);
    }
    tbody.appendChild(row1);
    t1.appendChild(tbody);
}