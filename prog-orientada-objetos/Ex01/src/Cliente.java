
import javax.swing.JOptionPane;

public class Cliente {
    private String nome, rg; 
    public void mostrar(String nome, String rg){
        this.nome = nome;
        this.rg = rg;
        
        System.out.println("O nome foi " + this.nome +
                " O rg Informado foi " + this.rg);
    }
    public void mostraNome(String nome){
        this.nome = nome;
        JOptionPane.showMessageDialog(null, "O nome é " + this.nome);
    }
}
