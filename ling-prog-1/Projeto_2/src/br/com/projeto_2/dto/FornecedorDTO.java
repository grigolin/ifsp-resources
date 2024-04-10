/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.projeto_2.dto;

import java.util.Date;

/**
 *
 * @author Aluno
 */
public class FornecedorDTO {

    private String nome_for, cnpj_for, tel_for;
    private Date data_cad_for;
    private int id_for;

    public String getNome_for() {
        return nome_for;
    }

    public void setNome_for(String nome_for) {
        this.nome_for = nome_for;
    }

    public String getCnpj_for() {
        return cnpj_for;
    }

    public void setCnpj_for(String cnpj_for) {
        this.cnpj_for = cnpj_for;
    }

    public String getTel_for() {
        return tel_for;
    }

    public void setTel_for(String tel_for) {
        this.tel_for = tel_for;
    }

    public Date getData_cad_for() {
        return data_cad_for;
    }

    public void setData_cad_for(Date data_cad_for) {
        this.data_cad_for = data_cad_for;
    }

    public int getId_for() {
        return id_for;
    }

    public void setId_for(int id_for) {
        this.id_for = id_for;
    }

}
