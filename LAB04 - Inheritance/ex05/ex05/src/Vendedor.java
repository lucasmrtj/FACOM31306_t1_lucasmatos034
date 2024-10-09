import java.time.LocalDate;
public class Vendedor extends Funcionario {
    private double valorFixo;
    private double comissao;

    public Vendedor(String nome, LocalDate dataNascimento, double valorFixo, double comissao){
        super(nome, dataNascimento);
        this.valorFixo = valorFixo;
        this.comissao = comissao;
    }
    public void calculaSalario(double vendas){
        double salario = valorFixo + comissao*vendas;
        super.setSalario(salario);
    }
    @Override
    public String toString(){
        return super.toString() + "Salario Base=" + valorFixo + "\nComissao: " + comissao + "\n";
    }
}
