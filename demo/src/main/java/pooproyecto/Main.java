package pooproyecto;
import java.util.Scanner;
import java.util.ArrayList;
import java.io.IOException;
import pooproyecto.Usuarios.*;


public class Main {
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //ArrayList<Autor> autores;
        int eleccion;
        String eleccion2;
        do{
            imprimirFormato();
            eleccion = sc.nextInt();
            if (eleccion != 1 && eleccion!=2){
                System.out.println("Opcion no valida.Intente de nuevo");
            }
        }while(eleccion!=1 && eleccion!=2);

        
        
        

    }

    private static void imprimirFormato() {
        // Línea superior
        imprimirLinea("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        // Título centrado
        imprimirTituloCentrado("BIENVENIDO A LA APLICACION ");

        // Línea intermedia
        imprimirLinea("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        // Opciones del menú
        imprimirMenu();

        // Línea inferior
        imprimirLinea("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }

    private static void imprimirLinea(String linea) {
        System.out.println("+" + linea + "+");
    }

    private static void imprimirTituloCentrado(String titulo) {
        int longitudTitulo = titulo.length();
        int espacios = (60 - longitudTitulo) / 2;
        String espaciosAntes = " ".repeat(espacios);
        String espaciosDespues = " ".repeat(57 - espacios - longitudTitulo);
        System.out.println("|" + espaciosAntes + titulo + espaciosDespues + "|");
    }

    private static void imprimirMenu() {
        System.out.println("| Que quiere hacer hoy?                                   |");
        System.out.println("|  1. Someter articulo                                    |");
        System.out.println("|  2. Iniciar sesion                                      |");
    }

    private static void someterArticulo(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese su nombre: ");
        String nombre = sc.nextLine();
        System.out.print("Ingrese su apellido: ");
        String apellido = sc.nextLine();
        System.out.print("Ingrese Correo Electronico: ");
        String correo = sc.nextLine();
        System.out.print("Ingrese Institucion: ");
        String institucion = sc.nextLine();
        System.out.print("Ingrese Campo de investigacion: ");
        String campo = sc.nextLine();
        System.out.println("\n");
        System.out.print("Registre los datos del articulo. ");
        System.out.print("Ingrese el titulo: ");
        String titulo = sc.nextLine();
        System.out.print("Ingrese Resumen: ");
        String resumen = sc.nextLine();
        System.out.print("Ingrese Contenido: ");
        String contenido = sc.nextLine();
        System.out.print("Ingrese palabras claves: ");
        String palabrasClaves = sc.nextLine();
        Autor a = new Autor(12312, nombre,apellido,correo,institucion,campo);


    }
    // Método para inicializar los datos desde archivos
private static void inicializarDatos (){
try{
// Leer datos de usuarios
    if (Files.exists(Paths.get(usuarios))) {
    List<String> usuariosLeer = Files.readAllLines(Paths.get(usuarios.txt));
    for (String leer: usuariosLeer) {
    String[] parts = leer.split (",");
    String rol = parts[0];
    if (rol.equals("E")) {
    usuarios.add(new Editor (parts[1], parts [2], parts [3], parts [4], parts [5], parts [6]));
    } else if (rol.equals("R")) {
    usuarios.add(new Revisor(parts [1], parts [2], parts [3], parts [4], parts [5], parts [6]));
    }
    } else {
    System.err.println("Datos de usuario invalidos: " + leer);
}
}
}
}
}

/*
// Método para inicializar los datos desde archivos
private static void inicializarDatos () 1
try {
// Leer datos de usuarios
if (Files.exists(path: Paths.get(first: USUARIOS FILE))) {
List<String> usuariosLeer Files.readAllLines (path: Paths.get(fish: USUARIOS FILE));
for (String leer usuariosLeer) {
String[] parts leer.split (regex: ",");
if (parts.length > 5) (
String rol parts[0];
if (rol.equals(anObjecs: "E")) {
usuarios.add(new Editor (parts[1], parts [2], parts [3], parts [4], parts [5], parts [6]));
} else if (rol.equals(anÜbject: "R")) {
usuarios.add(new Revisor (parts [1], parts [2], parts [3], parts [4], parts [5], parts [6]));
} else {
System.err.println("Datos de usuario invalidos: " + leer);
}
}
}


*/