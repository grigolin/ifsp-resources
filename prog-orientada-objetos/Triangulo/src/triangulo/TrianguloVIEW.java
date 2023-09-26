/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package triangulo;

import javax.swing.JOptionPane;

/**
 *
 * @author Aluno
 */
public class TrianguloVIEW {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            TrianguloDTO trianguloDTO = new TrianguloDTO();
            TrianguloCTR trianguloCTR = new TrianguloCTR();
            
            trianguloDTO.setL1(Integer.parseInt(JOptionPane.showInputDialog("lado 1: ")));
            trianguloDTO.setL2(Integer.parseInt(JOptionPane.showInputDialog("lado 2: ")));
            trianguloDTO.setL3(Integer.parseInt(JOptionPane.showInputDialog("lado 3: ")));
            
            String msg;
            
            if (trianguloCTR.VerificarTriangulo(trianguloDTO)){
                msg = trianguloCTR.Tipo(trianguloDTO);
            } else {
                msg = "Não é um triângulo";
            }
            
            JOptionPane.showMessageDialog(null, msg);
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Erro no sistema: "+ 
                    e.getMessage());
        }
    }
    
}
