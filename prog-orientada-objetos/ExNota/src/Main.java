
import javax.swing.JOptionPane;



/**
 *
 * @author Aluno
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CalculoNota nota = new CalculoNota();
        
        nota.Receber(
                Double.parseDouble(JOptionPane.showInputDialog(null, "Insira a Nota 1: " )),
                Double.parseDouble(JOptionPane.showInputDialog(null, "Insira a Nota 2: " )),
                Double.parseDouble(JOptionPane.showInputDialog(null, "Insira a Nota 3: " )),
                Double.parseDouble(JOptionPane.showInputDialog(null, "Insira Peso 1: " )),
                Double.parseDouble(JOptionPane.showInputDialog(null, "Insira Peso 2: " )),
                Double.parseDouble(JOptionPane.showInputDialog(null, "Insira Peso 3: " )));
        JOptionPane.showMessageDialog(null, "A media é " + nota.Media());
        // System.out.println("A media é " + nota.Media());
    }
}
