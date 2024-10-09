public class Ingresso {
    protected double valor;

    public Ingresso(double valor) {
        this.valor = valor;
    }
    public void escreverValor(double valor) {
        this.valor = valor;
    }
    @Override
    public String toString() {
        
        return "Valor: " + valor ;
    }
}
