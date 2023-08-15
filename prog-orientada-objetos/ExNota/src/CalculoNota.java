public class CalculoNota {
    private double nota1, nota2, nota3, p1, p2, p3;
    public void Receber(double nota1,double nota2,double nota3,double p1,double p2,double p3){
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }
    public double Media(){
        return (nota1*(p1/10)) + (nota2*(p2/10)) + (nota3*(p3/10));
    }
}
