package pooproyecto.Usuarios;

public class Autor {
    private int codigoIdentificacion;
    private String nombre;
    private String apellido;
    private String correoElectronico;
    private String institucion;
    private String campoInvestigacion;
    // private Articulo articulo;
    
    public Autor(int codigoIdentificacion, String nombre, String apellido, String correoElectronico, String institucion, String campoInvestigacion){
        this.codigoIdentificacion = codigoIdentificacion;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correoElectronico = correoElectronico;
        this.institucion = institucion;
        this.campoInvestigacion = campoInvestigacion;
        // this.articulo = articulo; Recordar descomentarlo cuando este la clase articulo
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
    // public Articulo getArticulo(){
    // return articulo;
    // }
    // public void setArticulo(Articulo articulo){
    // this.articulo = articulo;
    // }
    
    public void someterArticulo(){
        
    }
}
