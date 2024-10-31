import java.time.LocalDate;
public class Funcionario {
    private String nome;
    private LocalDate dataNascimento;
    private double salario;
    
    public Funcionario(String nome, LocalDate dataNascimento){
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.salario = 0;
    }
    public void calculaSalario(){

    }

    public void calculaSalario(double salario){
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String toString(){
        return "Nome: "+ nome + "\nDataNascimento: "+ dataNascimento+ "\nSalario: "+ salario+ "\n";
    }
}
