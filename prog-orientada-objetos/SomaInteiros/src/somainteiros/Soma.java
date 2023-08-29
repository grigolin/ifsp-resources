/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package somainteiros;

import javax.swing.JOptionPane;

/**
 *
 * @author Aluno
 */
public class Soma {

    private int soma;

      
    public void Receba() {
        for (int i = 1; i <= 10; i++) {
            int n = Integer.parseInt(JOptionPane.showInputDialog("Numero " + i));
            soma += n;
        }
    }
    
    public void Mostre(){
        JOptionPane.showMessageDialog(null, "O valor da soma é: " + this.soma);
    }
    
}
