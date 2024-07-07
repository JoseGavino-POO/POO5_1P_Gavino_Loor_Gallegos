public class Revision {
    private String codigoArticulo;
    private String codigoRevisor;
    private String comentarios;
    private String decision;

    public Revision(String codigoArticulo, String codigoRevisor, String comentarios, String decision) {
        this.codigoArticulo = codigoArticulo;
        this.codigoRevisor = codigoRevisor;
        this.comentarios = comentarios;
        this.decision = decision;
    }
  public String getCodigoA(){
    return codigoArticulo;
  }
  public void setCodigoA(String codigoArticulo){
    this.codigoArticulo = codigoArticulo;
  }
  public String getCodigoR(){
    return codigoRevisor;
  }
  public void setCodigoR(String codigoRevisor){
    this.codigoRevisor = codigoRevisor;
  }
  public String getComentarios(){
    return comentarios;
  }
  public void setComentarios(String comentarios){
    this.comentarios = comentarios;
  }
  public String getDecision(){
    return decision;
  }
  public void setDecision(String decision){
    this.decision = decision;
  }
}
  
