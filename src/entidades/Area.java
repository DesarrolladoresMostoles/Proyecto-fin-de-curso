
package entidades;

public class Area extends Familia
{
   private String   idArea="";
   private String  descripcionA="";

  public Area(String idpA,String despA,String idpF,String despF,int vigpF) 
  {
    super(idpF,despF,vigpF);
    this.idArea = idpA; this.descripcionA = despA;
  }
  public Area(Area f)  {   this(f.getIdArea(),f.getDescripcion(),f.getIdFamilia(),((Familia)f).getDescripcion(),f.getVigencia() );  }
  public String getIdArea() {  return idArea; }
  public void setIdArea(String idArea) { this.idArea = idArea; }
  public String getDescripcion() {  return descripcionA; }
  public void setDescripcion(String descripcion) { this.descripcionA = descripcion; }
  
}
