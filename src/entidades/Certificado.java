
package entidades;

public class Certificado extends Area
{
  private  String   idCer="";
  private  String   nomCer="";
  private  String   comCer="";
  private  int      nvCer=0;
  private  String   regCer="";
  private  String   areaCer="";
  private String    praCer=null;             // Módulo de prácticas

  public Certificado(String idCer,String nomCer,String comCer,int nvCer,String regCer,String praCer,  
                     String idpA,String despA,String idpF,String despF,int vigpF) 
  {
    super(idpA,despA,idpF,despF,vigpF);
    this.idCer=idCer; this.nomCer=nomCer; this.comCer=comCer; this.nvCer=nvCer; this.regCer=regCer; 
    this.areaCer=areaCer; this.praCer=praCer;
  }
  public Certificado(Certificado f)  {   this(f.getIdCer(),f.getNomCer(), f.getComCer(),f.getNvCer(),f.getRegCer(),f.getPraCer(), 
                                              f.getIdArea(),((Area)f).getDescripcion(),f.getIdFamilia(),((Familia)f).getDescripcion(),f.getVigencia() );  }

  public String getIdCer() { return idCer;  }
  public void setIdCer(String idCer) { this.idCer = idCer;  }
  public String getNomCer() {  return nomCer;  }
  public void setNomCer(String nomCer) {  this.nomCer = nomCer;  }
  public String getComCer() { return comCer;  }
  public void setComCer(String comCer) { this.comCer = comCer;  }
  public int getNvCer() { return nvCer; }
  public void setNvCer(int nvCer) { this.nvCer = nvCer; }
  public String getRegCer() {  return regCer; }
  public void setRegCer(String regCer) { this.regCer = regCer;  }
  public String getAreaCer() { return areaCer; }
  public void setAreaCer(String areaCer) { this.areaCer = areaCer; }
  public String getPraCer() { return praCer; }
  public void setPraCer(String praCer) { this.praCer = praCer; }
  
  
}
