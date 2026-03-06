/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bibliotecauniversitaria;

/**
 *
 * @author mariayanezojeda
 */
public class Revista extends MaterialBiblioteca implements Consultable{
    // extra atributos
    private int numeroEdicion;
    private String categoria;

    public Revista(String titulo, String autor, int year, int numeroEdicion, String categoria) {
        super(titulo, autor, year);
        this.numeroEdicion = numeroEdicion;
        this.categoria = categoria;
    }

    @Override
    public void mostrarInfo() {
        System.out.println("=== REVISTA ===");
    System.out.println("ID: " + getId());
    System.out.println("Título: " + getTitulo());
    System.out.println("Autor: " + getAutor());
    System.out.println("Año: " + getYear());
    System.out.println("Número de edición: " + numeroEdicion);
    System.out.println("Categoria: " + categoria);
    System.out.println("Disponible: " + isDisponible());
    }

    @Override
    public void consultarEnSala() {
        if(isDisponible()){
        System.out.println("La revista '" + getTitulo() + "' está disponible para consulta en sala.");
    } else {
        System.out.println("La revista no está disponible en este momento.");
    }
    }

    @Override
    public boolean estaDisponible() {
       return isDisponible();
    }

    
}
