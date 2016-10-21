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
public class Usuario {
    private int IdUsuario;
    private String Nome;
    private String Cpf;
    private String Telefone;
    private String Estado;
    private String Cidade;
    private String Endereco;
    private String Bairro;
    private String NumeroCarteira;
    private String TipoCarteira;

    public int getIdUsuario() {
        return IdUsuario;
    }

    public void setIdUsuario(int IdUsuario) {
        this.IdUsuario = IdUsuario;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getCpf() {
        return Cpf;
    }

    public void setCpf(String Cpf) {
        this.Cpf = Cpf;
    }

    public String getTelefone() {
        return Telefone;
    }

    public void setTelefone(String Telefone) {
        this.Telefone = Telefone;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }

    public String getCidade() {
        return Cidade;
    }

    public void setCidade(String Cidade) {
        this.Cidade = Cidade;
    }

    public String getEndereco() {
        return Endereco;
    }

    public void setEndereco(String Endereco) {
        this.Endereco = Endereco;
    }

    public String getBairro() {
        return Bairro;
    }

    public void setBairro(String Bairro) {
        this.Bairro = Bairro;
    }

    public String getNumeroCarteira() {
        return NumeroCarteira;
    }

    public void setNumeroCarteira(String NumeroCarteira) {
        this.NumeroCarteira = NumeroCarteira;
    }

    public String getTipoCarteira() {
        return TipoCarteira;
    }

    public void setTipoCarteira(String TipoCarteira) {
        this.TipoCarteira = TipoCarteira;
    }

 
}
   