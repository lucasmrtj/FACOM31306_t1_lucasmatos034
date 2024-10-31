import java.time.LocalDate;
public class Chefe extends Funcionario {
    private double valorFixo;

public Chefe(String nome, LocalDate dataNascimento, double valorFixo) {
    super(nome, dataNascimento);
    this.valorFixo = valorFixo;
}
public void calculaSalario(){
    setSalario(valorFixo);
}
@Override
public String toString() {
    return super.toString();
}
}
