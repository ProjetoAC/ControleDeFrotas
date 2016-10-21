/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.Usuario;

/**
 *
 * @author Senai
 */
public class UsuarioDao {

    Statement st;
    PreparedStatement prepst;

    static String INSERT = "INSERT INTO usuario("
            + "idUsuario, nome, cpf, telefone, estado, cidade, endereco, bairro, numerocarteira, tipocarteira)"
            + "  VALUES ((SELECT COALESCE(max(idusuario)+1,1) from usuario) , ?, ?, ?, ?, ?, ?, ?, ?, ?);";

    static String SELECTALL = "SELECT idusuario, nome, cpf, telefone, estado, cidade, endereco, bairro, numerocarteira, tipocarteira  FROM usuario order by idusuario";
    static String UPDATE = "UPDATE usuario SET idusuario=?, estadoid=?, cidadeid=?, nome=?, cpf=?, telefone=?, endereco=?, bairro=?, numerocarteira=?, tipocarteira=? WHERE idusuario = ? ;";
    static String DELETE = "DELETE FROM usuario  WHERE idusuario = ?;";

    public boolean insereUsuario(Usuario usuario) {
        ResultSet rs;
        int id = 0;
        try {
            PreparedStatement preparedStatement = Conexao.getConexao().prepareStatement(INSERT);
            //preparedStatement.setInt(1, usuario.getIdUsuario());
            preparedStatement.setString(1, usuario.getNome() + "");
            preparedStatement.setString(2, usuario.getCpf());
            preparedStatement.setString(3, usuario.getTelefone());
            preparedStatement.setString(4, usuario.getEstado() + "");
            preparedStatement.setString(5, usuario.getCidade() + "");
            preparedStatement.setString(6, usuario.getEndereco() + "");
            preparedStatement.setString(7, usuario.getBairro() + "");
            preparedStatement.setString(8, usuario.getNumeroCarteira()+ "");
            preparedStatement.setString(9, usuario.getTipoCarteira() + "");

            preparedStatement.execute();
            return true;
        } catch (SQLException ex) {
            System.out.println("Problema ao inserir usuario: " + ex);
            JOptionPane.showMessageDialog(null, "Erro:" + ex);
        }
        return false;
    }

    public ArrayList<Usuario> getAllUsuario() {
        ArrayList<Usuario> lista = new ArrayList<Usuario>();

        try {
            PreparedStatement preparedStatement = Conexao.getConexao().prepareStatement(SELECTALL);
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {
                Usuario usuario = new Usuario();
                usuario.setIdUsuario(rs.getInt("idusuario"));
                usuario.setNome(rs.getString("nome"));
                usuario.setCpf(rs.getString("cpf"));
                usuario.setTelefone(rs.getString("telefone"));
                usuario.setCidade(rs.getString("cidade"));
                usuario.setEstado(rs.getString("estado"));
                usuario.setEndereco(rs.getString("endereco"));
                usuario.setBairro(rs.getString("bairro"));
                usuario.setNumeroCarteira(rs.getString("numerocarteira"));
                usuario.setTipoCarteira(rs.getString("tipocarteira"));
                lista.add(usuario);

            }

        } catch (Exception ex) {
            System.out.println("Problema ao carregar usuarios : " + ex);
            JOptionPane.showMessageDialog(null, "Erro:" + ex);
        }
        return lista;
    }

    public boolean updateUsuario(Usuario usuario) {
        try {

            PreparedStatement preparedStatement = Conexao.getConexao().prepareStatement(UPDATE);
            preparedStatement.setInt(1, usuario.getIdUsuario());
            preparedStatement.setString(2, usuario.getNome() + "");
            preparedStatement.setString(3, usuario.getCpf());
            preparedStatement.setString(4, usuario.getTelefone());
            preparedStatement.setString(5, usuario.getEstado() + "");
            preparedStatement.setString(6, usuario.getCidade() + "");
            preparedStatement.setString(7, usuario.getEndereco() + "");
            preparedStatement.setString(8, usuario.getBairro() + "");
            preparedStatement.setString(9, usuario.getNumeroCarteira()+ "");
            preparedStatement.setString(10, usuario.getTipoCarteira() + "");
            preparedStatement.execute();
            return true;
        } catch (Exception ex) {
            System.out.println("Problema ao fazer update do usuario: " + ex);
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
            System.out.println("Problema ao deletar o usuario: " + ex);
            JOptionPane.showMessageDialog(null, "Erro:" + ex);
        }

        return false;

    }

}
