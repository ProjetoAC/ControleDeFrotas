/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.Veiculo;

/**
 *
 * @author Senai
 */
public class VeiculoDao {
    
    Statement st;
    PreparedStatement prepst;

    static String INSERT = "INSERT INTO veiculo("
            + "idveiculo, tipoveiculo, placa, tipocombustivel, carga)"
            + "  VALUES ((SELECT COALESCE(max(idveiculo)+1,1) from veiculo) , ?, ?, ?, ?);";

    static String SELECTALL = "SELECT idveiculo, tipoveiculo, placa, tipocombustivel, carga FROM veiculo order by idveiculo";
    static String UPDATE = "UPDATE veiculo SET idveiculo=?, tipoveiculo=?, placa=?,tipocombustivel=?, carga=? WHERE idveiculo = ? ;";
    static String DELETE = "DELETE FROM veiculo  WHERE idveiculo = ?;";

    public boolean insereVeiculo(Veiculo veiculo) {
        ResultSet rs;
        int id = 0;
        try {
            PreparedStatement preparedStatement = Conexao.getConexao().prepareStatement(INSERT);
           
            //preparedStatement.setInt(1, veiculo.getIdVeiculo());
            preparedStatement.setString(1, veiculo.getTipoVeiculo());
            preparedStatement.setString(2, veiculo.getPlaca());
            preparedStatement.setString(3, veiculo.getTipoCombustivel());
            preparedStatement.setString(4, veiculo.getCarga());
            System.out.println("Sql:"+preparedStatement.toString());
            preparedStatement.execute();
            return true;
        } catch (SQLException ex) {
            System.out.println("Problema ao inserir veiculo: " + ex);
            JOptionPane.showMessageDialog(null, "Erro:" + ex);
        }
        return false;
    }

    public ArrayList<Veiculo> getAllVeiculo() {
        ArrayList<Veiculo> lista = new ArrayList<Veiculo>();

        try {
            PreparedStatement preparedStatement = Conexao.getConexao().prepareStatement(SELECTALL);
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {
                Veiculo veiculo = new Veiculo();
                veiculo.setIdVeiculo(rs.getInt("idveiculo"));
                veiculo.setTipoVeiculo(rs.getString("tipoveiculo"));
                veiculo.setPlaca(rs.getString("placa"));
                veiculo.setTipoCombustivel(rs.getString("tipocombustivel"));
                veiculo.setCarga(rs.getString("carga"));
                lista.add(veiculo);

            }

        } catch (Exception ex) {
            System.out.println("Problema ao carregar veiculo : " + ex);
            JOptionPane.showMessageDialog(null, "Erro:" + ex);
        }
        return lista;
    }

    public boolean updateVeiculo(Veiculo veiculo) {
        try {

            PreparedStatement preparedStatement = Conexao.getConexao().prepareStatement(UPDATE);
            preparedStatement.setInt(1, veiculo.getIdVeiculo());
            preparedStatement.setString(2, veiculo.getTipoVeiculo());
            preparedStatement.setString(3, veiculo.getPlaca());
            preparedStatement.setString(4, veiculo.getTipoCombustivel());
            preparedStatement.setString(5, veiculo.getCarga());
            preparedStatement.execute();
            return true;
        } catch (Exception ex) {
            System.out.println("Problema ao fazer update do veiculo: " + ex);
            JOptionPane.showMessageDialog(null, "Erro:" + ex);
        }

        return false;
    }

    public boolean excluir(int id) {
        try {

            PreparedStatement preparedStatement = Conexao.getConexao().prepareStatement(DELETE);
            preparedStatement.setInt(1, id);
            preparedStatement.execute();
            return true;
        } catch (Exception ex) {
            System.out.println("Problema ao deletar o veiculo: " + ex);
            JOptionPane.showMessageDialog(null, "Erro:" + ex);
        }

        return false;

    }

}


