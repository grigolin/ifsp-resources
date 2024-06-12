package br.com.projeto_3.dto;

/**
 * Importando as classes necessárias para trabalhar nesta classe
 */
import java.util.Date; 

public class FornecedorDTO {
    private String nome_for, cnpj_for, tel_for;
    private Date data_cad_for;
    private int id_for;

    public Date getData_cad_for() {
        return data_cad_for;
    }

    public void setData_cad_for(Date data_cad_for) {
        this.data_cad_for = data_cad_for;
    }

    public String getNome_for() {
        return this.nome_for;
    }

    public void setNome_for(String nome_for) {
        this.nome_for = nome_for;
    }

    public String getCnpj_for() {
        return this.cnpj_for;
    }

    public void setCnpj_for(String cnpj_for) {
        this.cnpj_for = cnpj_for;
    }

    public String getTel_for() {
        return this.tel_for;
    }

    public void setTel_for(String tel_for) {
        this.tel_for = tel_for;
    }

    public int getId_for() {
        return this.id_for;
    }

    public void setId_for(int id_for) {
        this.id_for = id_for;
    }
    
    
}
