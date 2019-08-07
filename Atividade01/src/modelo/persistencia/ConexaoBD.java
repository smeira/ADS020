package modelo.persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoBD {

    static Connection conexao;

    public static Connection getConexao() throws DadosException, SQLException {

        try {

            if (conexao == null) {
                Class.forName("com.mysql.jdbc.Driver");
                conexao = DriverManager.getConnection("uri, usuario, senha");
            }

        } catch (ClassNotFoundException ex) {
            throw new DadosException("Erro ao carregar JDBC!");
        } catch (SQLException ex) {
            throw new DadosException("Erro ao conectar MySQL!");
        }

        return conexao;

    }
}
