public abstract class Usuario {
    protected String usuario;
    protected String contrasena;
    protected String rol;
    public Usuario(String usuario, String contra,String rol){
    this.usuario = usuario;
    this.contrasena = contra;
    this.rol = rol;
    
}
public abstract String crearCorreo();
}
