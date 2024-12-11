package Classes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class ConexaoBD {
	
	public Connection conectaBD() {
		
		Connection conn = null;
		
		try {
		
			String url = "jdbc:mysql://localhost:3306/localhost?user=root&password=jhba0121";
			conn = DriverManager.getConnection(url);
			
		} catch (SQLException erro) {
		
			JOptionPane.showMessageDialog(null, "Erro na Classe ConexaoBD" + erro.getMessage());
		
		}
		
		return conn;
	}
		//testando conection
}
