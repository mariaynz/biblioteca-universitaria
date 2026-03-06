/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bibliotecauniversitaria;

/**
 *
 * @author mariayanezojeda
 */
public class Transaccion {
    // atributos
    private String id;
    private static int contadorId = 0;
    private Usuario usuario;
    private MaterialBiblioteca material;
    private DetalleAccion detalle;

    /// constructor
    public Transaccion(Usuario usuario, MaterialBiblioteca material, String tipoAccion) {
        contadorId++;
        this.id = "TRX-" + contadorId;
        this.usuario = usuario;
        this.material = material;
        this.detalle = new DetalleAccion(tipoAccion); 
    }

    
    
    // metodo
    public void mostrarTransaccion() {
        System.out.println("=== TRANSACCIÓN " + id + " ===");
        System.out.println("Usuario: " + usuario.getNombre());
        System.out.println("Material: " + material.getTitulo());
        detalle.mostrarDetalle(); 
    }
}
