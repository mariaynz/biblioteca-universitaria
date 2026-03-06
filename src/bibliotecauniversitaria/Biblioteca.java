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
public class Biblioteca {
    // atributos
    private ArrayList<MaterialBiblioteca> materiales;
    private ArrayList<Usuario> usuarios;
    private ArrayList<Transaccion> transacciones;

    /// constructor
    public Biblioteca() {
        this.materiales = new ArrayList<>();
        this.usuarios = new ArrayList<>();
        this.transacciones = new ArrayList<>();
    }

    //// metodos
    public void registrarMaterial(MaterialBiblioteca material) {
        materiales.add(material);
        System.out.println("Material registrado: " + material.getTitulo());
    }

    
    public void registrarUsuario(Usuario usuario) {
        usuarios.add(usuario);
        System.out.println("Usuario registrado: " + usuario.getNombre());
    }

  
    public void prestarMaterial(String idMaterial, String idUsuario) {
        MaterialBiblioteca material = buscarMaterial(idMaterial);
        Usuario usuario = buscarUsuario(idUsuario);

        if (material == null) {
            System.out.println("Material no encontrado");
            return;
        }
        if (usuario == null) {
            System.out.println("Usuario no encontrado");
            return;
        }
        if (material instanceof Prestable) {
            Prestable prestable = (Prestable) material;
            if (prestable.estaDisponible()) {
                prestable.prestar(usuario);
                usuario.agregarMaterial(material);
                transacciones.add(new Transaccion(usuario, material, "PRESTAMO"));
            } else {
                System.out.println("El material no está disponible");
            }
        } else {
            System.out.println("Este material no es prestable");
        }
    }

    
    public void devolverMaterial(String idMaterial, String idUsuario) {
        MaterialBiblioteca material = buscarMaterial(idMaterial);
    Usuario usuario = buscarUsuario(idUsuario);
    
    if (material == null) {
        System.out.println("Material no encontrado");
        return;
    }
    if (usuario == null) {
        System.out.println("Usuario no encontrado");
        return;
    }
    if (material instanceof Prestable) {
        Prestable prestable = (Prestable) material;
        prestable.devolver();
        usuario.removerMaterial(material);
        transacciones.add(new Transaccion(usuario, material, "DEVOLUCION"));
        System.out.println("Devolución registrada correctamente");
    } else {
        System.out.println("Este material no es prestable");
    }
    }

   
    public void mostrarMaterialesDisponibles() {
        System.out.println("=== MATERIALES DISPONIBLES ===");
        boolean hayAlguno = false;
        for (MaterialBiblioteca material : materiales) {
            if (material.isDisponible()) {
                material.mostrarInfo();
                hayAlguno = true;
            }
        }
        if (!hayAlguno) {
            System.out.println("No hay materiales disponibles");
        }
    }


    public void mostrarHistorial() {
        if (transacciones.isEmpty()) {
        System.out.println("No hay transacciones registradas");
    } else {
        System.out.println("=== HISTORIAL DE TRANSACCIONES ===");
        for (Transaccion t : transacciones) {
            t.mostrarTransaccion();
        }
    }
    }

    
    private MaterialBiblioteca buscarMaterial(String id) {
        for (MaterialBiblioteca m : materiales) {
            if (m.getId().equals(id)) {
                return m;
            }
        }
        return null;
    }

    private Usuario buscarUsuario(String id) {
        for (Usuario u : usuarios) {
        if (u.getId().equals(id)) {
            return u;
        }
    }
    return null;
    }
}
