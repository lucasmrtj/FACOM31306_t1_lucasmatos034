import java.time.LocalDate;
public class Operarios extends Funcionario {
    private double valorProducao;
    public Operarios(String nome, LocalDate dataNascimento, double valorProducao) {
        super(nome, dataNascimento);
        this.valorProducao = valorProducao;
    }
    @Override
    public void calculaSalario(double quantidadeProduzida){
        double salario = valorProducao*quantidadeProduzida;
        super.setSalario(salario);
    }
    public String toString(){
        return super.toString()+ "Valor Producao:" + valorProducao+"'\n";
    }
}
