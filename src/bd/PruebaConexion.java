
package bd;

import java.sql.Connection;

/**
 *
 * @author borda
 */
public class PruebaConexion {
    
    public static void main(String[] args) {
        
        Conexion p = new Conexion();
        
        Connection con = p.conectar();
        
 
    }
    
}
