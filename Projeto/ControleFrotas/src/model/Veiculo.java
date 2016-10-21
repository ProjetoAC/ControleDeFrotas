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
public class Veiculo {
    private int IdVeiculo;
    private String TipoVeiculo;
    private String Placa;
    private String TipoCombustivel;
    private String Carga;

    public void setIdVeiculo(int IdVeiculo) {
        this.IdVeiculo = IdVeiculo;
    }

    public void setTipoVeiculo(String TipoVeiculo) {
        this.TipoVeiculo = TipoVeiculo;
    }

    public void setPlaca(String Placa) {
        this.Placa = Placa;
    }

    public void setTipoCombustivel(String TipoCombustivel) {
        this.TipoCombustivel = TipoCombustivel;
    }

    public void setCarga(String Carga) {
        this.Carga = Carga;
    }

    public int getIdVeiculo() {
        return IdVeiculo;
    }

    public String getTipoVeiculo() {
        return TipoVeiculo;
    }

    public String getPlaca() {
        return Placa;
    }

    public String getTipoCombustivel() {
        return TipoCombustivel;
    }

    public String getCarga() {
        return Carga;
    }
}
 
