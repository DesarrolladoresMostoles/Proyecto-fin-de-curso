
package entidades;

public class Certificado extends Familia 
{
  private  String   idCer="";
  private  String   nomCer="";
  private  String   comCer="";
  private  int      nvCer=0;
  private  String   regCer="";
  private  int      famCer=-1;
  private String    praCer=null;             // Módulo de prácticas

  public Certificado(String idCer,String nomCer,String comCer,int nvCer,String regCer,int famCer,String praCer,Familia f) 
  {
    super(f);
    this.idCer=idCer; this.nomCer=nomCer; this.comCer=comCer; this.nvCer=nvCer; this.regCer=regCer; 
    this.famCer=famCer; this.praCer=praCer;
  }

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
  public int getFamCer() { return famCer; }
  public void setFamCer(int famCer) { this.famCer = famCer; }
  public String getPraCer() { return praCer; }
  public void setPraCer(String praCer) { this.praCer = praCer; }
  
  
}
