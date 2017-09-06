package Control;
import java.sql.*;
import Model.ar;
import View.Consulta;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;

public class daoAr {
     private Connection connection;
    
     public daoAr(){
        this.connection = new Conexao().getConnection();
    }
    public void Incluir(ar a)
    {
        String sql ="INSERT INTO ar (indice,categoria, endereco, mensagem) VALUES (?,?,?,?);";
        try{
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, a.getIndice());
            stmt.setString(2, a.getCategoria());
            stmt.setString(3, a.getEndereco());
            stmt.setString(4, a.getMensagem());
            stmt.execute();   
        }catch(SQLException e){
            throw new RuntimeException(e);
        }
    }
    public void Consultar(ar a){
        Consulta c = new Consulta();
        String sql = " select * from ar";
		try (PreparedStatement statement = connection.prepareStatement(sql)){
			ResultSet result = statement.executeQuery();
                        while(result.next()){
                            DefaultTableModel tabela = tabela = (DefaultTableModel) c.jTable1.getModel();
                            int i = tabela.getRowCount()+1;
                            Object dados[] = {result.getString("endereco"), result.getString("categoria"), result.getString("indice")};
                            tabela.addRow(dados);
                        }
			
		}catch(SQLException e){
			e.printStackTrace();
		}
                c.show();
    }
    
}
