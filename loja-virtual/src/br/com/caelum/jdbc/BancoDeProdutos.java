package br.com.caelum.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import br.com.caelum.jdbc.modelo.Produto;

public class BancoDeProdutos {

	Connection conn;

	public BancoDeProdutos(Connection conn) {

		this.conn = conn;
	}

	public void salva(Produto produto) throws SQLException {
		String sql = "insert into produto (nome, descricao) values (?,?)";
		try (PreparedStatement stmt = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {

			stmt.setString(1, produto.getNome());
			stmt.setString(2, produto.getDescricao());
			stmt.execute();

			conn.commit();

			try (ResultSet rs = stmt.getGeneratedKeys()) {
				while (rs.next()) {
					int id = rs.getInt(1);
					produto.setid(id);
				}

			}
		}

	}
}
