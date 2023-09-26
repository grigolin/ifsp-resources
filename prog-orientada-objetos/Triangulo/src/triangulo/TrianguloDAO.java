/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package triangulo;

/**
 *
 * @author Aluno
 */
public class TrianguloDAO {

    public boolean VerificarTriangulo(TrianguloDTO trianguloDTO) {
        int l1 = trianguloDTO.getL1();
        int l2 = trianguloDTO.getL2();
        int l3 = trianguloDTO.getL3();
        
        if (((l1 + l2) > l3) && ((l2 + l3) > l1) && ((l3 + l1) > l2)) {
            return true;
        }
        return false;
        } 

    public String Tipo(TrianguloDTO trianguloDTO) {

        int l1 = trianguloDTO.getL1();
        int l2 = trianguloDTO.getL2();
        int l3 = trianguloDTO.getL3();

        String msg = "escaleno";

        if (l1 == l2 && l1 == l2) {
            msg = " Trata-se de um Triangulo Equilatero";
        } else if (l1 == l2 || l1 == l3) {
            msg = "Dois lados iguais . Trata-se de um Triangulo Isosceles";
        }
        return msg;
    }
    
}
