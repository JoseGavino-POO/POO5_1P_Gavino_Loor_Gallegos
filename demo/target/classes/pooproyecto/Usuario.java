public abstract class Usuario {
    protected String nombre;
    protected String apellido;
    public Usuario(String nombre, String apellido){
    this.nombre = nombre;
    this.apellido = apellido;
    
}
public abstract String crearCorreo();
}
