package pooproyecto.Usuarios;


public abstract class Usuario {
    protected String user;
    protected String contrasenia;
    protected String nombre;
    protected String apellido;
    protected String email;
    
    public Usuario(String user, String contrasenia, String nombre, String apellido, String email){
        this.user = user;
        this.contrasenia = contrasenia;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
    }

    public String getUser() {
        return user;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getEmail() {
        return email;
    }
    
    public abstract String generarCorreo();
    
    public abstract void decidirSobreArticulo();
    
}
