package pooproyecto;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import pooproyecto.Usuarios.Sistema;
import pooproyecto.Usuarios.Usuario;



public class Main {
    private static List<Usuario> usuarios = new ArrayList<>();
    
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        //ArrayList<Autor> autores;
        
        int eleccion;
        String eleccion2;
        do{
            Sistema.imprimirFormato();
            eleccion = sc.nextInt();
            if (eleccion != 1 && eleccion!=2){
                System.out.println("Opcion no valida.Intente de nuevo");
            }
        }while(eleccion!=1 && eleccion!=2);
        Sistema.inicializarDatos();
        System.out.println(usuarios);   
        

    }

 
}
