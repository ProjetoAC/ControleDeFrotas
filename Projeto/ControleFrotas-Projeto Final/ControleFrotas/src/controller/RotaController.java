/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.RotaDao;
import dao.UsuarioDao;
import java.util.ArrayList;
import model.Rota;
import model.Usuario;

/**
 *
 * @author Senai
 */
public class RotaController {
    RotaDao rotaDao;

    public RotaController() {
        if (rotaDao == null) {
            rotaDao = new RotaDao();
        }
    }

    public boolean insereRota(Rota rota) {

        if (rota.getRotaId() != 0) {
            return rotaDao.updateRota(rota);
        } else {
            return rotaDao.insereRota(rota);
        }
    }

    public ArrayList<Rota> getRota() {
        return rotaDao.getAllRota();
    }

    public boolean deleteRota(int id) {
        return rotaDao.excluir(id);
    }

}

