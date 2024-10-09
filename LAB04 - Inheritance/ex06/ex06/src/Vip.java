public class Vip extends Ingresso {
    private double adicional;

    public Vip(double valor,double adicional){
        super(valor);
        this.adicional = adicional;
    }
    public void setAdcional(double adicional){
        this.adicional = adicional;
    }
    public double getValor(){
        return super.valor * adicional;
    }

    public String toString() {
        return super.toString() +"\nporcentagem adcional: " + adicional;
    }
    
}
