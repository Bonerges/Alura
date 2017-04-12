package br.com.caelum.jdbc;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public class Database {

	private DataSource dataSource;

	public Database() throws Exception {

		{

			ComboPooledDataSource ds = new ComboPooledDataSource();
			ds.setDriverClass("com.mysql.jdbc.Driver");
			ds.setUser("root");
			ds.setPassword("123456789");
			ds.setJdbcUrl("jdbc:mysql://localhost:3306/Trabalho?useSSL=false");
			ds.setUnreturnedConnectionTimeout(60);
			ds.setDebugUnreturnedConnectionStackTraces(true);
			ds.setMaxPoolSize(20);
			ds.setMinPoolSize(5);
			ds.setInitialPoolSize(5);
			ds.setMaxIdleTime(1800);
			ds.setMaxConnectionAge(1800);

			this.dataSource = ds;

		}

	}

	public Connection getConnection() throws SQLException {

		Connection connection = dataSource.getConnection();
		connection.setAutoCommit(false);
		System.out.println("ABRINDO CONEXAO");
		
		
		return connection;

		// Connection connection =
		// DriverManager.getConnection("jdbc:mysql://localhost:3306/loja-virtual?useSSL=false",
		// "root",
		// "123456789");
		//
		// connection.setAutoCommit(false);
		//
		// System.out.println("Abrindo uma conexão");
		//
		// if(connection.equals(true)){
		//
		// System.out.println("Conexão efetuada com sucesso!");
		// }
		//

	}

}
