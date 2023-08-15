
package salario;


import javax.swing.JOptionPane;

public class Salario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pessoa salario = new Pessoa();
        
        salario.Receber(
                Double.parseDouble(JOptionPane.showInputDialog("Informe o valor do salário: ")),
                Double.parseDouble(JOptionPane.showInputDialog("Informe a porcentagem: "))
                );

        JOptionPane.showMessageDialog(null, "O salário com aumento é: " + salario.Calculo());
    }
    
}
