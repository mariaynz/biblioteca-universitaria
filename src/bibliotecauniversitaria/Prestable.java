/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package bibliotecauniversitaria;
/**
 *
 * @author mariayanezojeda
 */
public interface Prestable {
    /// métodos
    void prestar(Usuario usuario);
    void devolver();
    boolean estaDisponible();
}
