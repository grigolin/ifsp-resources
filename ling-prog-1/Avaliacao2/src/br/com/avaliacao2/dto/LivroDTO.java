package br.com.avaliacao2.dto;

public class LivroDTO {
    private String nome_livro, desc_livro, cod_bar_livro;
    private double p_custo_livro, p_venda_livro;
    private int id_livro;

    public String getNome_livro() {
        return nome_livro;
    }

    public void setNome_livro(String nome_livro) {
        this.nome_livro = nome_livro;
    }

    public String getDesc_livro() {
        return desc_livro;
    }

    public void setDesc_livro(String desc_livro) {
        this.desc_livro = desc_livro;
    }

    public String getCod_bar_livro() {
        return cod_bar_livro;
    }

    public void setCod_bar_livro(String cod_bar_livro) {
        this.cod_bar_livro = cod_bar_livro;
    }

    public double getP_custo_livro() {
        return p_custo_livro;
    }

    public void setP_custo_livro(double p_custo_livro) {
        this.p_custo_livro = p_custo_livro;
    }

    public double getP_venda_livro() {
        return p_venda_livro;
    }

    public void setP_venda_livro(double p_venda_livro) {
        this.p_venda_livro = p_venda_livro;
    }

    public int getId_livro() {
        return id_livro;
    }

    public void setId_livro(int id_livro) {
        this.id_livro = id_livro;
    }

    
      
}
