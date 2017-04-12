package br.com.caelum.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class TestaListagem {

	public static void main(String[] args) throws Exception {

		Connection connection = new Database().getConnection();

		String sql =  "select d.id_disc, d.nome_disc, c.nome_curso from disciplina d join curso c on c.id_curso = d.id_curso where d.id_curso = 2;";
		Statement statement = connection.prepareStatement(sql);

		statement.execute(sql);

		ResultSet resultSet = statement.getResultSet();

		while (resultSet.next()){

		int id = resultSet.getInt("d.id_disc");
		String nome = resultSet.getString("d.nome_disc");
		String descricao = resultSet.getString("c.nome_curso");
		
		System.out.print(id + " || ");		
		System.out.print(nome + " || ");
		System.out.print(descricao );
		
		}
		
		resultSet.close();
		connection.close();
	}

	
	}


