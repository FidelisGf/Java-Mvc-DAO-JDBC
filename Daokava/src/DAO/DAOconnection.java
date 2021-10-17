package DAO;
import Model.PFisica;
import Model.Pessoa;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.sql.*;
public class DAOconnection {
    Scanner le= new Scanner(System.in);
    private Connection connection;

    public DAOconnection(){
        this.connection = new ConnectionFactory().getConnection();
    }

    public void DAOinsereDados(PFisica pf){
        String sql = "INSERT INTO pessoa_fisica" + "(Nome, Idade, Cpf)" + "VALUES (?,?,?)";
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, pf.getNome());
            stmt.setInt(2, pf.getIdade());
            stmt.setInt(3, pf.getCpf());
            stmt.execute();
            stmt.close();
            System.out.println("Usuario Cadastrado com Sucesso !");
        }catch (SQLException e){
            e.getErrorCode();
        }
    }
    public List<PFisica> DAOlistaDados(){
        String sql = "SELECT * from pessoa_fisica";
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            ResultSet resultSet = stmt.executeQuery(sql);
            List<PFisica> lista_pessoaFisica = new ArrayList<>();
            PFisica pfisica;
            while(resultSet.next()){
                pfisica = new PFisica(resultSet.getString("Nome"), resultSet.getInt("Idade"), resultSet.getInt("Cpf"));
                lista_pessoaFisica.add(pfisica);
            }
            return lista_pessoaFisica;
        }catch (SQLException e){
            throw  new RuntimeException();
        }
    }
    public PFisica buscaporId(int id){
        String sql = "SELECT * FROM pessoa_fisica WHERE Id = ?";
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setInt(1, id);
            ResultSet resultSet = stmt.executeQuery();
            while (resultSet.next()){
                PFisica pFisica = new PFisica();
                pFisica.setNome(resultSet.getString("Nome"));
                pFisica.setIdade(resultSet.getInt("Idade"));
                pFisica.setCpf(resultSet.getInt("Cpf"));
                return pFisica;
            }
        }catch (SQLException e){
            throw  new RuntimeException();
        }
        return null;
    }
}
