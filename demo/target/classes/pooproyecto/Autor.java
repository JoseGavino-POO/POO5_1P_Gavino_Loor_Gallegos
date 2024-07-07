public class Autor extends Usuario{
    private String nombre;
    private String apellido;
    private String correo;
    private String institucion;
    private String campoDeInvestigacion;
public Autor(String usuario, String contra, String rol, String nombre, String apellido, String correo, String institucion, String campoDeInvestigacion) {
        super(usuario, contra, rol);
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.institucion = institucion;
        this.campoDeInvestigacion = campoDeInvestigacion;
}
  public String getInstitucion(){
    return institucion;
  }
  public void setInstitucion(String institucion){
    this.institucion = institucion;    
  }
  public String getCampo(){
    return campoDeInvestigacion;
  }
  public void setCampo(String campo){
    this.campoDeInvestigacion = campo;    
  }
  public String getCorreo(){
    return correo;
  }
  public void setCorreo(String correo){
    this.correo = correo;
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
}
