/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bibliotecauniversitaria;
import java.util.ArrayList;
/**
 *
 * @author mariayanezojeda
 */
public class Usuario  {
    // atributos
    private String id;
    private String nombre;
    private String email;
    private static int contadorId = 0;
    private ArrayList<MaterialBiblioteca> materialesPrestados;
    
    /// constructor
    public Usuario(String nombre, String email) {
        contadorId++;
        this.id = "MYG-" + contadorId;
        this.nombre = nombre;
        this.email = email;
        this.materialesPrestados = new ArrayList<>(); 
    }
    
    // metodos 
    public void agregarMaterial(MaterialBiblioteca material) {
        materialesPrestados.add(material);
    }

    public void removerMaterial(MaterialBiblioteca material) {
        materialesPrestados.remove(material);
    }

    public void mostrarMaterialesPrestados() {
       if (materialesPrestados.isEmpty()) {
            System.out.println("El usuario no tiene materiales prestados.");
        } else {
            System.out.println("=== Materiales de " + nombre + " ===");
            for (MaterialBiblioteca material : materialesPrestados) {
                material.mostrarInfo(); 
            }
        }
    }
    
    public void mostrarInfo() {
        System.out.println("=== USUARIO ===");
        System.out.println("ID: " + id);
        System.out.println("Nombre: " + nombre);
        System.out.println("Email: " + email);
        System.out.println("Materiales prestados: " + materialesPrestados.size());
    }
    
    // getters
    public String getId() { 
        return id;
    }
    public String getNombre() {
        return nombre; 
    }
    public String getEmail() { 
        return email; 
    }
    public ArrayList<MaterialBiblioteca> getMaterialesPrestados() {
        return materialesPrestados;
    }
    
    // setters
    public void setNombre(String nombre) {
        this.nombre = nombre; 
    }
    public void setEmail(String email) { 
        this.email = email; 
    }
}
