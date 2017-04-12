package br.com.caelum.jdbc;

import java.sql.Connection;
import java.sql.Statement;

public class TestaRemocao {
	
	public static void main(String[] args) throws Exception {
		
	
	
		Connection connection = new Database().getConnection();;
	
	Statement stmt = connection.createStatement();
	stmt.execute("delete from produto where id > 3");
	connection.commit();
	
	int count = stmt.getUpdateCount();
	
	System.out.println(count + " Linhas Atulaizadas!");
	
	connection.close();
	stmt.close();
	

}
}