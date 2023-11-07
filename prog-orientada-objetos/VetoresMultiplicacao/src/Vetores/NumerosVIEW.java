package Vetores;

import javax.swing.JOptionPane;

public class NumerosVIEW {
    public static void main(String[] args) {
        NumerosDTO numerosDTO = new NumerosDTO();
        NumerosCTR numerosCTR = new NumerosCTR();
        
        int n[] = new int[3];
        int n2[] = new int[3];
        
        for(int cont = 0; cont < n.length; cont++){
            n[cont] = Integer.parseInt(JOptionPane.showInputDialog("Vetor 1 - Informe o n para posicao " + cont));
            n2[cont] = Integer.parseInt(JOptionPane.showInputDialog("Vetor 2 - Informe o n para posicao " + cont));
        }
        
        numerosDTO.setN(n);
        numerosDTO.setN2(n2);
        
        JOptionPane.showMessageDialog(null, numerosCTR.Imprimir(numerosDTO));
    }
                        
}
