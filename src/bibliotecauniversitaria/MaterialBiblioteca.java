/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bibliotecauniversitaria;

/**
 *
 * @author mariayanezojeda
 */
public abstract class MaterialBiblioteca implements Prestable {
    // atributos
    private String titulo;
    private String autor;
    private int year;
    private String id;
    private boolean disponible;
    private static int contadorID = 0;
    
    /// constructor
    public MaterialBiblioteca(String titulo, String autor, int year){
        contadorID++;
        this.autor = autor;
        this.titulo = titulo;
        this.year = year;
        this.disponible = true;
        this.id = "jk-" + contadorID;
    }
    
    // getters
    public String getTitulo(){
        return titulo;
    }
    public String getAutor(){
        return autor;
    }
    public int getYear(){
        return year;
    }
    public String getId(){
        return id;
    }
    public boolean isDisponible(){
        return disponible;
    }
    
    // setters
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    public void setAutor(String autor){
        this.autor = autor;
    }
    public void setYear(int year){
        this.year = year;
    }
    public void setDisponible(boolean disponible){
        this.disponible = disponible;
    }
    
      // metodos
    public abstract void mostrarInfo();
}
