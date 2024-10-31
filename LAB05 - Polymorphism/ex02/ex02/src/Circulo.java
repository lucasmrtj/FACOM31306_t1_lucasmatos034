public class Circulo  extends FormaBidimencional{
    private double raio;

    public Circulo(double raio) {
        super();
        this.raio = raio;
    }
    @Override
    public double obterArea(){
        return (raio*raio*Math.PI);
    }
    public String toString(){
        return super.toString() + "Circulo de raio:" + raio;	
    }
}
