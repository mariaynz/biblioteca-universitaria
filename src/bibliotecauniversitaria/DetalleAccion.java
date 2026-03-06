/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bibliotecauniversitaria;
import java.time.LocalDateTime;

/**
 *
 * @author mariayanezojeda
 */
public class DetalleAccion {
    // atributos
    private LocalDateTime fecha;
    private String tipoAccion; 

    /// constructor
    public DetalleAccion(String tipoAccion) {
        this.fecha = LocalDateTime.now(); 
        this.tipoAccion = tipoAccion;
    }

    /// getters
    public LocalDateTime getFecha() {
        return fecha; 
    }
    public String getTipoAccion() {
        return tipoAccion;
    }

    
    // metodos
    public void mostrarDetalle() {
        System.out.println("Acción: " + tipoAccion + " | Fecha: " + fecha);
    }
}
