package br.com.caelum.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;



public class Teste {
	
	//GeraNomes geraNomes = new GeraNomes();

	public static void main(String[] args) throws Exception {

			Connection connection = new Database().getConnection();
			String sql = "insert into produto (nome, valor, ativo, data) values (?, ?, ?, ?)";
			
			PreparedStatement statement = connection.prepareStatement(sql);
			

	}
}
