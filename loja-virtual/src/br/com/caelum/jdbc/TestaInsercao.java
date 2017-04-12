package br.com.caelum.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestaInsercao {

	public static void main(String[] args) throws Exception {
		
		try (Connection connection = new Database().getConnection()) {
			
		

			String sql = "insert into produto (nome, descricao) values (?, ?)";

			try (PreparedStatement statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {

				adiciona("TV LCD", "32 polegadas", statement);
				adiciona("Blueray", "FullHdmi", statement);
				connection.commit();

			} 
			
			
			catch (Exception ex) {
				ex.printStackTrace();
				connection.rollback();

				System.out.println("roll back efetuado com sucesso");
			}
			
		
		}
	}

	public static void adiciona(String nome, String descricao, PreparedStatement statement) throws SQLException {

//		if (nome.equals("Blueray")) {
//
//			throw new IllegalArgumentException("Problema ocorrido");
//
//		}

		statement.setString(1, nome);
		statement.setString(2, descricao);

		statement.execute();

		ResultSet resultSet = statement.getGeneratedKeys();

		while (resultSet.next()){
		
			int id = resultSet.getInt(1);

			System.out.println(id);

			// String Nome = resultSet.getString("nome");
			//
			// System.out.println(Nome);
			//
			// String Descricao = resultSet.getString("descricao");
			//
			// System.out.println(Descricao);
			
		}

		resultSet.close();
	}

}
