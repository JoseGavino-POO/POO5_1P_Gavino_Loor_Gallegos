package pooproyecto;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import pooproyecto.Usuarios.Autor;
import pooproyecto.Usuarios.Sistema;
import pooproyecto.Usuarios.Usuario;



public class Main {
    private static List<Usuario> usuarios = new ArrayList<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
                Boolean decision;
                do{
                Sistema.leertxt();
                int opcion = Sistema.inicio();
                switch(opcion){
                    case 1: 
                    break;
                    case 2:
                    Autor.someterArticulo();
                    break;
                    default:
                    System.out.println("Opcion Invalida.");
                }
                System.out.println("Desea continuar(si o no): ");
                String siOno = sc.nextLine();
                decision = siOno.equalsIgnoreCase("si");
                }while(decision != false);
                


    }
}

