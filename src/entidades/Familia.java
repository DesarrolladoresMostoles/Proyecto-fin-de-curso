
package entidades;

public class Familia 
{
  private String     idFamilia="";
  private String    descripcionF="";
  private int       vigencia=0;


  public Familia(String idp,String desp,int vigp) 
  {
    this.idFamilia = idp; this.descripcionF = desp; this.vigencia=vigp;
  }
  public Familia(Familia f)  {   this(f.getIdFamilia(),f.getDescripcion(),f.getVigencia() );  }
  public String getIdFamilia() {  return idFamilia; }
  public void setIdFamilia(String idFamilia) { this.idFamilia = idFamilia; }
  public String getDescripcion() {  return descripcionF; }
  public void setDescripcion(String descripcion) { this.descripcionF = descripcion; }
  public int getVigencia() {  return vigencia;  }
  public void setVigencia(int vigencia) {  this.vigencia = vigencia; }
}
