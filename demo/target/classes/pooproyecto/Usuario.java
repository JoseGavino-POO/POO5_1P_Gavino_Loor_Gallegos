public abstract class Usuario {
    protected String nombre;
    protected String apellido;
    protected String correoElectronico;
    public Usuario(String nombre, String apellido, String correo){
    this.nombre = nombre;
    this.apellido = apellido;
    this.correoElectronico = correo;
}
public abstract String crearCorreo();
}
