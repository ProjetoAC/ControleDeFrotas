/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Senai
 */
public class Rota {
    private int RotaId;
    private String Saida;
    private String Destino;
    private String DistanciaPercorrida;
    private String GastosExtras;

    public int getRotaId() {
        return RotaId;
    }

    public void setRotaId(int RotaId) {
        this.RotaId = RotaId;
    }

    public String getSaida() {
        return Saida;
    }

    public void setSaida(String Saida) {
        this.Saida = Saida;
    }

    public String getDestino() {
        return Destino;
    }

    public void setDestino(String Destino) {
        this.Destino = Destino;
    }

    public String getDistanciaPercorrida() {
        return DistanciaPercorrida;
    }

    public void setDistanciaPercorrida(String DistanciaPercorrida) {
        this.DistanciaPercorrida = DistanciaPercorrida;
    }

    public String getGastosExtras() {
        return GastosExtras;
    }

    public void setGastosExtras(String GastosExtras) {
        this.GastosExtras = GastosExtras;
    }
    
    
    
}
