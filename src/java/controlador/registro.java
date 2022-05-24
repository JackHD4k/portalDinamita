/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

/**
 *
 * @author joelr
 */
public class registro {
    
    private static class obtener {

        public String suscripcion() {
            String sus = "document.getbyID('suscripciones')";
            String susnuevo = "document.getbyID('suscripcionnueva')";
            return sus;
        }
        
        public String categoria(){
            String categoria = "document.getbyID('categoria')";
            return categoria;
        }
        public String inicioSus(){
            String inicioFecha = "parseInt('document.getbyID('iniciofecha')')";
            return inicioFecha;
        }
        public String ciclo(){
            String ciclo = "document.getbyID('ciclousuario')";
            return ciclo;
        }
        public String finSus(){
            String finSuscripcion = "document.getbyID('finsuscripcion')";
            return finSuscripcion;
        }
        public String recordatorio(){
            String recorda = "document.getbyID('recordatorio')";
            return recorda;
        }
        public String moneda(){
            String money = "document.getID('money')";
            return money;
        }
        public String precio(){
            String precio = "document.getbyID('preciosus')";
            return precio;
        }
    }
}
