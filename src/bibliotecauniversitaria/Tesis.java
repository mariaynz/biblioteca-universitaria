/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bibliotecauniversitaria;

/**
 *
 * @author mariayanezojeda
 */
public class Tesis extends MaterialBiblioteca implements Prestable{
    
    /// atributos extra
    private String programa;
    private String modalidad;
    private Usuario usuarioPrestamo;
    
    public Tesis(String titulo, String autor, int year, String programa, String modalidad) {
        super(titulo, autor, year);
        this.programa = programa;
        this.modalidad = modalidad;
        this.usuarioPrestamo = null;
    }

    @Override
    public void mostrarInfo() {
    System.out.println("=== TESIS ===");
    System.out.println("ID: " + getId());
    System.out.println("Título: " + getTitulo());
    System.out.println("Autor: " + getAutor());
    System.out.println("Año: " + getYear());
    System.out.println("Programa: " + programa);
    System.out.println("Modalidad: " + modalidad);
    System.out.println("Disponible: " + isDisponible());
    }
    
    @Override
    public void devolver() {
        setDisponible(true);
        this.usuarioPrestamo = null;
        System.out.println("La tesis fue devuelta correctamente");
    }

    @Override
    public boolean estaDisponible() {
        return isDisponible();
    }

    @Override
    public void prestar(Usuario usuario) {
        if(isDisponible()){
            setDisponible(false);
            this.usuarioPrestamo = usuario;
        } else {
            System.out.println("La tésis no está disponible");
        }
    }
}
