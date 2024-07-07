public class Autor extends Usuario{
  private String institucion;
  private String campoInvestigacion;
  private String correo;
  private int codigo;
  public Autor(String institucion,String campoInvestigacion,String correo,String nombre,String apellido,int codigo){
    super(nombre,apellido);
    this.institucion = institucion;
    this.campoInvestigacion = campoInvestigacion;
    this.correo = correo;
    this.codigo = codigo;
  }
  public String getInstitucion(){
    return institucion;
  }
  public void setInstitucion(String institucion){
    this.institucion = institucion;    
  }
  public String getCampo(){
    return campoInvestigacion;
  }
  public void setCampo(String campo){
    this.campoInvestigacion = campo;    
  }
  public String getCorreo(){
    return correo;
  }
  public void setCorreo(String correo){
    this.correo = correo;
  }
  public int getCodigo(){
    return codigo;
  }
  public void setCodigo(int codigo){
    this.codigo = codigo;
  }
}
