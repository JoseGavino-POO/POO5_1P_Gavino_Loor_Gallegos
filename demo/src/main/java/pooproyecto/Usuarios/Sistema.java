package pooproyecto.Usuarios;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Sistema {
    private static List<Usuario> usuarios = new ArrayList<>();
    public static int inicio() {
        Scanner sc = new Scanner(System.in);
        // Línea superior
        primerLinea("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        // Título centrado
        titulo("BIENVENIDO A LA APLICACION ");
        // Línea intermedia
        primerLinea("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        // Opciones del menú
        menu();
        // Línea inferior
        primerLinea("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        System.out.print("Escoga una opcion(1/2): ");
        int opcion = sc.nextInt();
        return opcion;

    }

    public static void primerLinea(String linea) {
        System.out.println("+" + linea + "+");
    }

    public static void titulo(String titulo) {
        int longitudTitulo = titulo.length();
        int espacios = (60 - longitudTitulo) / 2;
        String espaciosAntes = " ".repeat(espacios);
        String espaciosDespues = " ".repeat(57 - espacios - longitudTitulo);
        System.out.println("|" + espaciosAntes + titulo + espaciosDespues + "|");
    }

    public static void menu() {
        System.out.println("| Que quiere hacer hoy?                                   |");
        System.out.println("|  1. Iniciar sesion                                      |");
        System.out.println("|  2. Someter Articulo                                    |");
    }


     // Método para inicializar los datos desde archivos
  public static void leertxt() {
        try {
            // Leer datos de usuarios
            if (Files.exists(Paths.get("usuarios.txt"))) {
                List<String> usuariosLeer = Files.readAllLines(Paths.get("usuarios.txt"));
                for (String leer : usuariosLeer) {
                    String[] parts = leer.split(",");
                    if (parts.length != 7) {  // Verifica que haya exactamente 7 partes
                        System.out.println("Datos de usuario invalidos (número de partes incorrecto): " + leer);
                        continue;  // Salta a la siguiente iteración del bucle
                    }
                    String rol = parts[0];
                    if (rol.equals("E")) {
                        usuarios.add(new Editor(parts[1], parts[2], parts[3], parts[4], parts[5], parts[6]));
                    } else if (rol.equals("R")) {
                        usuarios.add(new Revisor(parts[1], parts[2], parts[3], parts[4], parts[5], parts[6]));
                    } else {
                        System.out.println("Rol de usuario desconocido: " + rol);
                    }
                }
            } else {
                System.out.println("Archivo usuarios.txt no existe.");
            }
        } catch (IOException e) {
            System.out.println("Error al leer archivo: " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error de índice al procesar los datos del usuario: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error inesperado: " + e.getMessage());
        }
    }

    //Generar codigo id de autor
    public static int generarCodigoID(){
        Random random = new Random();
        int id = random.nextInt((1000000));
        return id;
    }




    

}

}
