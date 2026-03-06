/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bibliotecauniversitaria;
import java.util.Scanner;
/**
 *
 * @author mariayanezojeda
 */
public class BibliotecaUniversitaria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n===== BIBLIOTECA UNIVERSITARIA =====");
            System.out.println("1. Registrar material");
            System.out.println("2. Registrar usuario");
            System.out.println("3. Prestar material");
            System.out.println("4. Devolver material");
            System.out.println("5. Consultar materiales disponibles");
            System.out.println("6. Ver historial de transacciones");
            System.out.println("7. Salir");
            System.out.print("Elige una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.println("¿Qué tipo de material? 1. Libro  2. Tesis  3. Revista");
                    int tipo = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Título: ");
                    String titulo = scanner.nextLine();
                    System.out.print("Autor: ");
                    String autor = scanner.nextLine();
                    System.out.print("Año: ");
                    int year = scanner.nextInt();
                    scanner.nextLine();

                    if (tipo == 1) {
                        System.out.print("ISBN: ");
                        String isbn = scanner.nextLine();
                        System.out.print("Género: ");
                        String genero = scanner.nextLine();
                        biblioteca.registrarMaterial(new Libro(titulo, autor, year, isbn, genero));
                    } else if (tipo == 2) {
                        System.out.print("Programa: ");
                        String programa = scanner.nextLine();
                        System.out.print("Modalidad: ");
                        String modalidad = scanner.nextLine();
                        biblioteca.registrarMaterial(new Tesis(titulo, autor, year, programa, modalidad));
                    } else if (tipo == 3) {
                        System.out.print("Número de edición: ");
                        int edicion = scanner.nextInt();
                        scanner.nextLine();
                        System.out.print("Categoría: ");
                        String categoria = scanner.nextLine();
                        biblioteca.registrarMaterial(new Revista(titulo, autor, year, edicion, categoria));
                    }
                    break;

                case 2:
                    System.out.print("Nombre: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Email: ");
                    String email = scanner.nextLine();
                    biblioteca.registrarUsuario(new Usuario(nombre, email));
                    break;

                case 3:
                    System.out.print("ID del material: ");
                    String idMat = scanner.nextLine();
                    System.out.print("ID del usuario: ");
                    String idUsr = scanner.nextLine();
                    biblioteca.prestarMaterial(idMat, idUsr);
                    break;

                case 4:
                    System.out.print("ID del material: ");
                    String idMatDev = scanner.nextLine();
                    System.out.print("ID del usuario: ");
                    String idUsrDev = scanner.nextLine();
                    biblioteca.devolverMaterial(idMatDev, idUsrDev);
                    break;

                case 5:
                    biblioteca.mostrarMaterialesDisponibles();
                    break;

                case 6:
                    biblioteca.mostrarHistorial();
                    break;

                case 7:
                    System.out.println("¡Hasta luego!");
                    break;

                default:
                    System.out.println("Opción inválida");
            }

        } while (opcion != 7);

        scanner.close();
    }
    }
    

