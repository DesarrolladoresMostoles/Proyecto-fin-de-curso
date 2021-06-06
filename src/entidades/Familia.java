
package entidades;

public class Familia 
{
  private int       idFamilia=0;
  private String    descripcion="";

  public Familia(int idp,String desp) 
  {
    this.idFamilia = idp; this.descripcion = desp;
  }
  public Familia(Familia f)  {   this(f.getIdFamilia(),f.getDescripcion() );  }
  public int getIdFamilia() {  return idFamilia; }
  public void setIdFamilia(int idFamilia) { this.idFamilia = idFamilia; }
  public String getDescripcion() {  return descripcion; }
  public void setDescripcion(String descripcion) { this.descripcion = descripcion; }
}
