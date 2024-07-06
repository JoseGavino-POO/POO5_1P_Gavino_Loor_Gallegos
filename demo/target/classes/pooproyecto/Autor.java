public class Autor extends Usuario{
  private String institucion;
  private String campoInvestigacion;
  private String correo;
  public Autor(String institucion,String campoInvestigacion,String correo,String nombre,String apellido,String correo){
    super(nombre,apeelido,correo);
    this.institucion = institucion;
    this.campoInvestigacion = campoInvestigacion;
    this.correo = correo;
  }
}
