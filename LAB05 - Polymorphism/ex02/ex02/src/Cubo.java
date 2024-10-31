public class Cubo extends FormaTrimencional {
    private double lado;

    public Cubo(double lado){
        super();
        this.lado = lado;
    }

    public double obterArea(){
        return 6*lado*lado;
    }
    public double obterVolume(){
        return lado*lado*lado;
    }
    public String toString(){
        return super.toString() + "Cubo de lado: " + lado;
    }
}
