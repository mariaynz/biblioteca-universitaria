/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bibliotecauniversitaria;
/**
 *
 * @author mariayanezojeda
 */
public class Libro extends MaterialBiblioteca implements Prestable {
    // atributos extra del libro
      private String isbn;
      private String genero;
      private Usuario usuarioPrestamo;
      
      public Libro(String titulo, String autor, int year, String ISBN, String genero){
          super(titulo, autor, year);
          this.isbn = ISBN;
          this.genero = genero;
          this.usuarioPrestamo = null;
      }
      

    @Override
    public void mostrarInfo() {
    System.out.println("=== LIBRO ===");
    System.out.println("ID: " + getId());
    System.out.println("Título: " + getTitulo());
    System.out.println("Autor: " + getAutor());
    System.out.println("Año: " + getYear());
    System.out.println("ISBN: " + isbn);
    System.out.println("Género: " + genero);
    System.out.println("Disponible: " + isDisponible());
    }

    @Override
    public void devolver() {
        setDisponible(true);
        this.usuarioPrestamo = null;
        System.out.println("El libro fue devuelto correctamente");
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
            System.out.println("El libro no está disponible");
        }
    }
}
