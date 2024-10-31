import java.time.LocalDate;
public class Horistas extends Funcionario {
    private double valorHora;

    public Horistas(String nome, LocalDate dataNascimento, double valorHora) {
        super(nome, dataNascimento);
        this.valorHora = valorHora;
    }
    @Override
    public void calculaSalario(double horas){
        double salario = valorHora*horas;
        super.setSalario(salario); 
    }

    public String toString() {
        return super.toString() + "ValorHora: " + valorHora +"\n";
    }
    
}