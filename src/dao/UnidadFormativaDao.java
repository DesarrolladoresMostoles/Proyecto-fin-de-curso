
package dao;

import bd.Conexion;
import entidades.UnidadFormativa;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author borda
 */
public class UnidadFormativaDao {
 
    // Aqui incluiremos todos los metodos que usaremos para interactuar con la BBDD referentes a la clase UnidadFormativa.
    
    // Atributos que usaremos en toda la clase
    // Necesarios para enviar sentencias SQL.
    PreparedStatement ps = null;
    ResultSet rs = null;
    // Necesarios para realizar la conexion con la BBDD.
    Conexion conexion = new Conexion();
    Connection con;
    
    //Metodo Consulta
    
    public ArrayList<UnidadFormativa> ConsultaUFDao() throws SQLException{
        
        ArrayList<UnidadFormativa> listado = new ArrayList<>();
               
        try {
          con = conexion.conectar();
          String sql = "SELECT Codigo, Descripcion, Horas FROM UnidadesFormativas";
          ps = con.prepareStatement(sql);
          
            rs = ps.executeQuery();
            while(rs.next()){
                UnidadFormativa uf = new UnidadFormativa();
                uf.setCodigo(rs.getString("Codigo"));
                uf.setDescripcion(rs.getString("Descripcion"));
                uf.setHoras(rs.getInt("Horas"));
                
                listado.add((UnidadFormativa) rs); // No se porque me pide que haga el cast de Unidad Formativa
            }
          
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al realizar la busqueda seleccionada." + e.getMessage());            
        } finally{
            con.close();
        }
        return listado;
        
    }
    
    public Boolean AñadirUFDao (UnidadFormativa uf) throws SQLException{
            
        boolean exito= false;  // Bandera qe nos indicará si se ha insertado o no correctamente en la BBDD
        
        try {
            con = conexion.conectar();
            String sql= "INSERT INTO UnidadesFormativas (Codigo, Descripcion, Horas) VALUES (?, ?, ?)";
            ps = con.prepareStatement(sql);
            ps.setString(1, uf.getCodigo());
            ps.setString(2, uf.getDescripcion());
            ps.setInt(3, uf.getHoras());
            
            // ejecutamos la sentencia
            int filas= ps.executeUpdate();
            exito = filas>0;
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al añadir la Unidad Formativa seleccionada." + e.getMessage());            
        } finally {
            con.close();
        }
       
        return exito;
    
    }
    
    public void EliminarUFDao(String cod){      // he puesto String porque realmente no se que tipo de dato va a ser el código de las unidades formativas.
        try {
            String sql = "DELETE FROM UnidadesFormativas WHERE codigo ="+cod+";";
            
            con = conexion.conectar();
            ps = con.prepareCall(sql);
            
            int i = ps.executeUpdate();
            
            if (i > 0) {
                JOptionPane.showMessageDialog(null, "se elimino correctamente");                             
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al eliminar la Unidad Formativa seleccionada." + e.getMessage());           
        }
    } 
        
}