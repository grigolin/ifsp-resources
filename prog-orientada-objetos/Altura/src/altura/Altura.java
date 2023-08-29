/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package altura;

import javax.swing.JOptionPane;

/**
 *
 * @author Aluno
 */
public class Altura {

    private double soma, media;
    private int cont;
    public void Receba() {
        for (int i = 1; i <= 3; i++) { // 
            double n = Double.parseDouble(JOptionPane.showInputDialog("Altura " + i));
            if(n > 2.00){
                cont++;
            }
            soma += n;
        }
    }
    public double CalcularMedia(){
        return this.soma / 3; // 
   }
    
    public void Mostrar(){
        JOptionPane.showMessageDialog(null, "O valor da media é: " + CalcularMedia());
        JOptionPane.showMessageDialog(null, "A quant de pessoas maiores que 2 metros é: " + this.cont);
    }
}
