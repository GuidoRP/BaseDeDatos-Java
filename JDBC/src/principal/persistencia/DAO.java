
package principal.persistencia;



import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;


public abstract class DAO {
    
    protected Connection conexion = null;
    protected ResultSet respuesta = null;
    protected Statement sentencia = null;
    
    private final String USER = "root";
    private final String PASSWORD = "root";
    private final String DATABASE = "nba";
    private final String DRIVER = "com.mysql.Jdbc.Driver";
    
    
    protected void conectarBase() throws ClassNotFoundException, SQLException{
        try{
            Class.forName(DRIVER);
            String urlBaseDeDatos ="jdbc:mysql://localhost:3306/"+DATABASE+"?useSSL=false";
            conexion =  DriverManager.getConnection(urlBaseDeDatos, USER, PASSWORD);
        }catch(ClassNotFoundException | SQLException ex){
            throw ex;
            
        }
        
    }
    
    
    
    
}//LLAVE FINAL
