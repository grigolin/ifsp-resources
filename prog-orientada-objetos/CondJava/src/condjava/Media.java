/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package condjava;

/**
 *
 * @author Aluno
 */
public class Media {

    private double nota1, nota2, media;
    private String resposta;

    public String Calcular(double nota1, double nota2) {
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.media = (this.nota1 + this.nota2) / 2;
        if (this.media >= 6) {
            this.resposta = "Aprovado";
        } else {
            if ((this.media >= 4) && (this.media < 6)) {
                this.resposta = "Recuperacao";
            } else {
                this.resposta = "Reprovado";
            }
        }
        return this.resposta;
    }
}
