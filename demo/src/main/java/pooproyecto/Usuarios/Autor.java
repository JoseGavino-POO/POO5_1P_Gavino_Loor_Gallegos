package pooproyecto.Usuarios;
import java.util.Scanner;
public class Autor {
    private int codigoIdentificacion;
    private String nombre;
    private String apellido;
    private String correoElectronico;
    private String institucion;
    private String campoInvestigacion;
    private Articulo articulo;
    
    
    public Autor(int codigoIdentificacion, String nombre, String apellido, String correoElectronico, String institucion, String campoInvestigacion,Articulo articulo){
        this.codigoIdentificacion = codigoIdentificacion;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correoElectronico = correoElectronico;
        this.institucion = institucion;
        this.campoInvestigacion = campoInvestigacion;
        this.articulo = articulo; 
    }
    public int getCodigoId(){
    return codigoIdentificacion;
    }
    public void setCodigoId(int codigo){
    this.codigoIdentificacion = codigo;
    }
    public String getNombre(){
    return nombre;
    }
    public void setNombre(String nombre){
    this.nombre = nombre;
    }
    public String getApellido(){
    return apellido;
    }
    public void setApellido(String apellido){
    this.apellido = apellido;
    }
    public String getCorreo(){
    return correoElectronico;
    }
    public void setCorreo(String correo){
    this.correoElectronico = correo;
    }
    public String getInstitucion(){
    return institucion;
    }
    public void setInstitucion(String institucion){
    this.institucion = institucion;
    }
    public String getCampoInvestigacion(){
    return campoInvestigacion;
    }
    public void setCampoInvestigacion(String campo){
        this.campoInvestigacion = campo;
    }
    public Articulo getArticulo(){
    return articulo;
    }
    public void setArticulo(Articulo articulo){
    this.articulo = articulo;
    }
    
    public static Autor someterArticulo(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Registre sus datos como autor.");
        System.out.println("Ingrese su nombre: ");
        String nombre = sc.nextLine();
        System.out.println("Ingrese su apellido: ");
        String apellido = sc.nextLine();
        System.out.println("Correo Electronico: ");
        String correo = sc.nextLine();
        System.out.println("Institucion: "); 
        String inst = sc.nextLine();
        System.out.println("Campo de Investigacion: ");
        String campo = sc.nextLine();
        System.out.println("\n");
        System.out.println("Ingrese datos del articulo.");
        System.out.print("Ingrese el título: ");
        String titulo = sc.nextLine();
        System.out.print("Ingrese el resumen: ");
        String resumen = sc.nextLine();
        System.out.print("Ingrese el contenido: ");
        String contenido = sc.nextLine();
        System.out.print("Ingrese las palabras claves: ");
        String palabrasClave = sc.nextLine();
        Articulo articulo = new Articulo(titulo, contenido,resumen, palabrasClave);
        Autor autor = new Autor(Sistema.generarCodigoID(),nombre,apellido,correo,inst,campo,articulo);
        return autor;
    }
}

