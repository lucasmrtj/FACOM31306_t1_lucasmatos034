public class CamaroteSuperior extends Vip{
    private double valorAdicional;

    public CamaroteSuperior(double valor, double porcentagemAd,double valorAdicional){
        super(valor, porcentagemAd);
        this.valorAdicional = valorAdicional;
    }
    @Override
    public void setAdcional(double valorAdicional) {
        this.valorAdicional = valorAdicional;
    }

    public double calcularValor(){
        return getValor() + valorAdicional;
    }

    @Override
    public String toString() {
        return super.toString() + "\nvalorAdicional: " + valorAdicional+"\n";
    }

}
