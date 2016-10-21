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
import model.Rota;
import model.Usuario;

/**
 *
 * @author Senai
 */
public class RotaDao {

    Statement st;
    PreparedStatement prepst;

    static String INSERT = "INSERT INTO rota("
            + "rotaId, saida, destino, distanciaPercorrida, gastosExtras)"
            + "  VALUES ((SELECT COALESCE(max(rotaId)+1,1) from rota) , ?, ?, ?, ?);";

    static String SELECTALL = "SELECT rotaId, saida, destino, distanciaPercorrida, gastosExtras FROM rota order by rotaId";
    static String UPDATE = "UPDATE rota SET rotaId=?, saida=?, destino=?, distanciaPercorrida=?, gastosExtras=? WHERE rotaId = ? ;";
    static String DELETE = "DELETE FROM rota  WHERE rotaId = ?;";

    public boolean insereRota(Rota rota) {
        ResultSet rs;
        int id = 0;
        try {
            PreparedStatement preparedStatement = Conexao.getConexao().prepareStatement(INSERT);
            //preparedStatement.setInt(1, usuario.getRotaId());
            preparedStatement.setString(1, rota.getSaida() + "");
            preparedStatement.setString(2, rota.getDestino()+"");
            preparedStatement.setString(3, rota.getDistanciaPercorrida()+"");
            preparedStatement.setString(4, rota.getGastosExtras() + "");

            preparedStatement.execute();
            return true;
        } catch (SQLException ex) {
            System.out.println("Problema ao inserir Rota: " + ex);
            JOptionPane.showMessageDialog(null, "Erro:" + ex);
        }
        return false;
    }

    public ArrayList<Rota> getAllRota() {
        ArrayList<Rota> lista = new ArrayList<Rota>();

        try {
            PreparedStatement preparedStatement = Conexao.getConexao().prepareStatement(SELECTALL);
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {
                Rota rota = new Rota();
                rota.setRotaId(rs.getInt("rotaId"));
                rota.setSaida(rs.getString("saida"));
                rota.setDestino(rs.getString("destino"));
                rota.setDistanciaPercorrida(rs.getString("distanciaPercorrida"));
                rota.setGastosExtras(rs.getString("gastosExtras"));
                lista.add(rota);

            }

        } catch (Exception ex) {
            System.out.println("Problema ao carregar Rota : " + ex);
            JOptionPane.showMessageDialog(null, "Erro:" + ex);
        }
        return lista;
    }

    public boolean updateRota(Rota rota) {
        try {

            PreparedStatement preparedStatement = Conexao.getConexao().prepareStatement(UPDATE);
            preparedStatement.setInt(1, rota.getRotaId());
            preparedStatement.setString(2, rota.getSaida() + "");
            preparedStatement.setString(3, rota.getDestino()+"");
            preparedStatement.setString(4, rota.getDistanciaPercorrida()+"");
            preparedStatement.setString(5, rota.getGastosExtras() + "");

            preparedStatement.execute();
            return true;
        } catch (Exception ex) {
            System.out.println("Problema ao fazer update do Rota: " + ex);
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
            System.out.println("Problema ao deletar o Rota: " + ex);
            JOptionPane.showMessageDialog(null, "Erro:" + ex);
        }

        return false;

    }

}
