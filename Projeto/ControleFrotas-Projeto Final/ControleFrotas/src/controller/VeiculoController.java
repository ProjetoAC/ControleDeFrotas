/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.VeiculoDao;
import java.util.ArrayList;
import model.Veiculo;

/**
 *
 * @author Senai
 */
public class VeiculoController {
    
     VeiculoDao veiculoDao;

    public VeiculoController() {
        if (veiculoDao == null) {
            veiculoDao = new VeiculoDao();
        }
    }

    public boolean insereUsuario(Veiculo veiculo) {

        if (veiculo.getIdVeiculo() != 0) {
            return veiculoDao.updateVeiculo(veiculo);
        } else {
            return veiculoDao.insereVeiculo(veiculo);
        }
    }

    public ArrayList<Veiculo> getVeiculo() {
        return veiculoDao.getAllVeiculo();
    }
    
     public boolean deleteVeiculo(int id) {
        return veiculoDao.excluir(id);
    }

}



