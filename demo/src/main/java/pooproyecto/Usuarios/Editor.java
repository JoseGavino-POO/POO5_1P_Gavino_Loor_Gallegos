package pooproyecto.Usuarios;

public class Editor extends Usuario {
    private String nombreJournal;
    
    public Editor (String user, String contrasenia, String nombre, String apellido, String email, String nombreJournal){
        super(user, contrasenia, nombre, apellido, email);
        this.nombreJournal = nombreJournal;
    }

    public String getNombreJournal() {
        return nombreJournal;
    }
    public void setNombreJournal(String nombreJournal){
    this.nombreJournal = nombreJournal;
    }
    @Override
    public String generarCorreo(){
            String correo = "Correo editor";
            return correo;
    }
    @Override
    public void decidirSobreArticulo(){
        System.out.println("decision revisor");
    }
    
}
