

package ConexaoDAO;

import java.sql.Connection;
import javax.swing.JOptionPane;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionDb {
    public Connection conectaBD(){
        Connection conn = null;
        
        try {
            String url = "jdbc:mysql://localhost:3306/pokeword?user=root&password=root";
            conn = DriverManager.getConnection(url);
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro na conexão ao banco de dados"+erro.getMessage());
        }
        return conn;
    }
    
}
