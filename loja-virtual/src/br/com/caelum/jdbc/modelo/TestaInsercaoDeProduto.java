package br.com.caelum.jdbc.modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import br.com.caelum.jdbc.BancoDeProdutos;
import br.com.caelum.jdbc.Database;

public class TestaInsercaoDeProduto {

	public static void main(String[] args) throws SQLException, Exception {

		Produto mesa = new Produto("Mesa azul", "Mesa com 4 pés");
		try (Connection conn = new Database().getConnection()) {

			new BancoDeProdutos(conn).salva(mesa);

		}

		System.out.println("Mesa inserida com sucesso, " + mesa);
	}

}
