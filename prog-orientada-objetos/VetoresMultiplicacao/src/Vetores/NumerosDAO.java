/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vetores;

public class NumerosDAO {
    private String resposta = "";
    private int[] n3 = new int[3];
    
    public void Calcular(NumerosDTO numerosDTO){
        int n[] = numerosDTO.getN();
        int n2[] = numerosDTO.getN2();
        
        for(int cont = 0; cont < n.length; cont++){
            this.n3[cont] = n[cont] * n2[cont];
        }
    }
    
    public String Imprimir(NumerosDTO numerosDTO){
        this.Calcular(numerosDTO);
        
        for(int cont = 0; cont < 3; cont++){
            this.resposta += n3[cont] + "\n";
        }
        return this.resposta;
    }
}
