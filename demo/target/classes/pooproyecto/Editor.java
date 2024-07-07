public class Editor extends Usuario {
    private String nombre;
    private String apellido;
    private String correo;
    private String nombreJournal;

public Editor(String user, String password, String rol, String nombre, String apellido, String correo, String nombreJournal) {
      super(user, password, rol);
      this.nombre = nombre;
      this.apellido = apellido;
      this.correo = correo;
      this.nombreJournal = nombreJournal;
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
    return correo;
  }
  public void setCorreo(String correo){
    this.correo = correo;
  }
  public String getNombreJournal(){
    return nombreJournal;
  }
  public void setNombreJournal(String nombreJournal){
    this.nombreJournal = nombreJournal;
  }
}
