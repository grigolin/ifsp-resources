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
public class TrianguloCTR {
    TrianguloDAO trianguloDAO = new TrianguloDAO();
    
    public boolean VerificarTriangulo(TrianguloDTO trianguloDTO) {
        return trianguloDAO.VerificarTriangulo(trianguloDTO);
    }
    
    public String Tipo(TrianguloDTO trianguloDTO) {
        return trianguloDAO.Tipo(trianguloDTO);
    }
}
