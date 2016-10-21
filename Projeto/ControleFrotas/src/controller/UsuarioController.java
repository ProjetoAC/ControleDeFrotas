/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.UsuarioDao;
import java.util.ArrayList;
import model.Usuario;

/**
 *
 * @author User
 */
public class UsuarioController {
     UsuarioDao usuarioDao;

    public UsuarioController() {
        if (usuarioDao == null) {
            usuarioDao = new UsuarioDao();
        }
    }

    public boolean insereUsuario(Usuario usuario) {

        if (usuario.getIdUsuario() != 0) {
            return usuarioDao.updateUsuario(usuario);
        } else {
            return usuarioDao.insereUsuario(usuario);
        }
    }

    public ArrayList<Usuario> getUsuarios() {
        return usuarioDao.getAllUsuario();
    }

    public boolean deleteUsuario(int id) {
        return usuarioDao.excluir(id);
    }

}

    

