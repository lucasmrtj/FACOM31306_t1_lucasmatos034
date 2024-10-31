public class Esfera extends FormaTrimencional {
    private double raio; 

    public Esfera(double raio){
        super();
        this.raio = raio;
    }

    public double obterArea(){
        return raio*raio*4*Math.PI;
    }
    public double obterVolume(){
        return (raio*raio*raio)*(4/3)*Math.PI;
    }
    public String toString(){
        return super.toString() + "Esfera de raio: " + raio;
    }
}
