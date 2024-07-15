package pooproyecto.Usuarios;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.UUID;


public class Sistema {
    static ArrayList<Usuario> listUsuarios = new ArrayList<>();
    static ArrayList<Autor> autores = new ArrayList<>();
    static ArrayList<Articulo> articulos = new ArrayList<>();
    static ArrayList<Revisor> listRevisores = new ArrayList<>();
    static ArrayList<Editor> listEditores = new ArrayList<>();
    
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
    public static void leertxt(){
        try {
            // Leer datos de usuarios
            if (Files.exists(Paths.get("demo/src/main/java/pooproyecto/Usuarios/usuarios.txt"))) {
                List<String> usuariosLeer = Files.readAllLines(Paths.get("demo/src/main/java/pooproyecto/Usuarios/usuarios.txt"));
                for (String leer : usuariosLeer) {
                    String[] parts = leer.split(",");
                    if (parts.length != 7) { // Verifica que haya exactamente 7 partes
                        System.out.println("Datos de usuario inválidos (número de partes incorrecto): " + leer);
                        continue; // Salta a la siguiente iteración del bucle
                    }
                    String rol = parts[0];
                    if (rol.equals("E")) {
                        listUsuarios.add(new Editor(parts[1], parts[2], parts[3], parts[4], parts[5], parts[6]));
                    } else if (rol.equals("R")) {
                        listUsuarios.add(new Revisor(parts[1], parts[2], parts[3], parts[4], parts[5], parts[6]));
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
    public static String generarCodigo(){
        return UUID.randomUUID().toString();   
    }



    
    
    public static void iniciarSesionUsuario(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese su usuario: ");
        String usuario = sc.nextLine();
        System.out.println("Ingrese su contraseña: ");
        String contraseña = sc.nextLine();
        boolean cor = false;
        for (Usuario usuarios : listUsuarios){
            if (usuarios.getUser().equals(usuario) && usuarios.getContrasenia().equals(contraseña)){    
                System.out.println("Acceso exitoso");
                cor = false;
                break;
            }
            else {
                cor = true;
            }    
        }
        if (cor) {
            System.out.println("Contraseña incorrecta");
        }
    }




    public static void enviarCorreo(Revisor revisor, Articulo articulo){
        String correo = revisor.getEmail();
        System.out.println(correo+":\nSe le ha asignado un articulo para su revision");
        articulo.toString();
    }
    public static void gestionRevision(Articulo articulo){
        Random rd = new Random();
        int indice1 = rd.nextInt(listRevisores.size());
        int indice2;
        do{
            indice2 = rd.nextInt(listRevisores.size());
        }
        while(indice2 == indice1);
        enviarCorreo(listRevisores.get(indice1), articulo);
        enviarCorreo(listRevisores.get(indice2), articulo);
    }
    
    public static Articulo registroDatosAutor(){
        Scanner sc = new Scanner(System.in);
        System.out.println("----Ingrese sus datos---- ");
        String codigoIdentificacion = generarCodigo();
        System.out.print("Ingrese su nombre: ");
        String nombre = sc.nextLine();
        System.out.print("Ingrese su apellido: ");
        String apellido = sc.nextLine();
        System.out.print("Ingrese su correo electronico: ");
        String correo = sc.nextLine();
        System.out.print("Ingrese su institucion: ");
        String institucion = sc.nextLine();
        System.out.print("Ingrese su campo de investigacion: ");
        String campoInvestigacion = sc.nextLine();
        Revision revision = new Revision(codigoIdentificacion, nombre, apellido, correo, institucion, campoInvestigacion);
        Autor autor = new Autor(codigoIdentificacion, nombre, apellido, correo, institucion, campoInvestigacion);
        Articulo articulo = autor.someterArticulo();
        articulos.add(articulo);
        if (!autores.contains(autor)){
            autores.add(autor);
        }
        return articulo;
    }
    
   
    }






    

}

}
