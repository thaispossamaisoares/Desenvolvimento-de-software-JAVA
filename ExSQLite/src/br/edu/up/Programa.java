package br.edu.up;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;

// Substitui tudo que esta em cima.
// import java.sql.*;
public class Programa {

	public static void main(String[] args) throws SQLException {
		
		incluir();
		listar();
		atualizar();
		apagar();
		
	
		
	}
	
	public static void apagar() throws SQLException {
		
		String url = "jdbc:sqlite:C:\\Users\\Aluno\\eclipse-workspace\\ExSQLite\\DB\\primeiro_banco_de_dados.db";
		
		// 1. Abrir a conexão.
		Connection conexao = DriverManager.getConnection(url);
			//("jdbc:nomeDoDriver:nomeDoBanco", "oLogin", "aSenha");
		
		// 2. Criar e executar o SQL.
		Statement comando = conexao.createStatement();
		String queryDelete = "DELETE FROM cliente WHERE codigo = 4";
		
		 comando.execute(queryDelete);
	}
	
	public static void atualizar() throws SQLException {
		
		String url = "jdbc:sqlite:C:\\Users\\Aluno\\eclipse-workspace\\ExSQLite\\DB\\primeiro_banco_de_dados.db";
		
		// 1. Abrir a conexão.
		Connection conexao = DriverManager.getConnection(url);
			//("jdbc:nomeDoDriver:nomeDoBanco", "oLogin", "aSenha");
		
		// 2. Criar e executar o SQL.
		Statement comando = conexao.createStatement();
		String queryUPDATE = "UPDATE cliente SET nome = 'ana maria' WHERE codigo = 2";
		
		 comando.executeUpdate(queryUPDATE);
	}
	
	public static void incluir() throws SQLException {
		
		String url = "jdbc:sqlite:C:\\Users\\Aluno\\eclipse-workspace\\ExSQLite\\DB\\primeiro_banco_de_dados.db";
		
		// 1. Abrir a conexão.
		Connection conexao = DriverManager.getConnection(url);
			//("jdbc:nomeDoDriver:nomeDoBanco", "oLogin", "aSenha");
		
		// 2. Criar e executar o SQL.
		Statement comando = conexao.createStatement();
		String queryInsert ="INSERT INTO cliente(nome,dt_nasc,cpf,email) VALUES ('carlos','2003/12/25','8005263692','carlos_u@hotmail.com')";
		
		 comando.execute(queryInsert);
	}

	public static void listar() throws SQLException {
		
		String url = "jdbc:sqlite:C:\\Users\\Aluno\\eclipse-workspace\\ExSQLite\\DB\\primeiro_banco_de_dados.db";
		
		// 1. Abrir a conexão.
		Connection conexao = DriverManager.getConnection(url);
			//("jdbc:nomeDoDriver:nomeDoBanco", "oLogin", "aSenha");
		
		// 2. Criar e executar da consulta.
		Statement comando = conexao.createStatement();
		String querySelect = "SELECT * FROM cliente";
		
		ResultSet resultado = comando.executeQuery(querySelect);
		
		
		// 3. Utilizar os dados.
		while (resultado.next()) {
			int codigo = resultado.getInt(1);
			String nome = resultado.getString(2);
			String dt_nasc = resultado.getString(3);
			String cpf = resultado.getString(4);
			String email = resultado.getString(5);
			
			System.out.print("Codigo: " + codigo + "\n");
			System.out.print("Nome: " + nome + "\n");
			System.out.print("-----------------------\n");
		}
		
	}
}


