package salario;

public class Pessoa {
    private Double salario, p;
    
    public void Receber(Double salario, Double p){
        this.salario = salario;
        this.p = p;
    }
    public Double Calculo(){
        return salario * (1 + (p / 100 ));
    }
}
