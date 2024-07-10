package pooproyecto.Usuarios;

public class Revisor extends Usuario {
    private String especialidad;
    private int numeroArticulosRevisados;
    
    public Revisor(String usuario, String contra,String nombre, String apellido, String correo, String especialidad, int numeroArticulosRevisados) {
    super(usuario, contra,nombre,apellido,correo);
    this.especialidad = especialidad;
    this.numeroArticulosRevisados = numeroArticulosRevisados;
  }
    
    public String getEspecialidad(){
    return especialidad;
    }
    public void setEspecialidad(String especialidad){
    this.especialidad = especialidad;
    }
    public int getNarticulosRevisados(){
    return numeroArticulosRevisados;
    }
    public void setNumeroArticulosRevisados(int articulosrevisados){
    this.numeroArticulosRevisados = articulosrevisados;
    }
    @Override
    public String generarCorreo(){
    String correo = "Correo revisor";
            return correo;
    }
    
    @Override
    public void decidirSobreArticulo(){
        System.out.println("decision revisor");
    }
    
}
