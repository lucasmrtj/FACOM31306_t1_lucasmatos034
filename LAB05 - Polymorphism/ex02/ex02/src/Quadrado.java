public class Quadrado extends FormaBidimencional {
    private double lado;

    public Quadrado(double lado) {
        super();
        this.lado =lado;
    }
    public double obterArea(){
        return lado*lado;
    }
    public String toString(){
        return super.toString() + "Quadrado de lado: " + lado;
    }
}
