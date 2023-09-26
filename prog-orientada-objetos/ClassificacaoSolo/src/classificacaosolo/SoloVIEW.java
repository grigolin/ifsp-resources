/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classificacaosolo;

import javax.swing.JOptionPane;

/**
 *
 * @author Aluno
 */
public class SoloVIEW {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            SoloCTR soloCTR = new SoloCTR();
            SoloDTO soloDTO = new SoloDTO();
            
            soloDTO.setAgua(Integer.parseInt(JOptionPane.showInputDialog("Agua: ")));
            JOptionPane.showMessageDialog(null, soloCTR.Verificar(soloDTO));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "fodase");
        }
    }
    
}
