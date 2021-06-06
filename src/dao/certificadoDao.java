package dao;

import bd.Conexion;
import entidades.Certificado;
import entidades.Familia;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class certificadoDao 
{
  private Conexion myConn = null; 
  public certificadoDao()  {   myConn = new Conexion(); }
  
   // LISTADO DE TODOS LOS CERTIFICADOS
  public List<Familia>  getCertificados(String sql) throws ClassNotFoundException 
  {
    List<Familia> rt = new ArrayList<>();
    Connection conn = null;
     
    if((conn=myConn.conectar(Conexion.CONN_MYSQL))!=null)
    {
      try 
      {
        Statement s = conn.createStatement();
        ResultSet rs = s.executeQuery (sql); 
        while (rs.next()) rt.add( new Certificado(rs.getString(1), rs.getString(2),rs.getString(3),rs.getInt(4),rs.getString(5),rs.getInt(6),rs.getString(7), new Familia(rs.getInt(8),rs.getString(9))) );
        myConn.desconectar();
      } catch (SQLException e) { rt=null;}
   
    } else rt = null;
    return rt;
  }
   // LISTADO DE LAS RAMAS FORMATIVAS DE LOS PROFESORES o de los alumnos
  public List<Familia>  getFamilias(String sql) throws ClassNotFoundException 
  {
    List<Familia> rt = new ArrayList<>();
    Connection conn = null;
     
    if((conn=myConn.conectar(Conexion.CONN_MYSQL))!=null)
    {
      try 
      {
        Statement s = conn.createStatement();
        ResultSet rs = s.executeQuery (sql); //"SELECT rama_p from ramas"
        while (rs.next()) rt.add( new Familia(rs.getInt(1), rs.getString(2)) );
        myConn.desconectar();
      } catch (SQLException e) { rt=null;}
   
    } else rt = null;
    return rt;
  }
  
  
}
