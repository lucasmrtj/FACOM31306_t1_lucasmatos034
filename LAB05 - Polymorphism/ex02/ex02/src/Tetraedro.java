public class Tetraedro extends FormaTrimencional{
    private double lado;
    private double altura;
    
    public Tetraedro(double lado, double altura){
        super();
        this.lado = lado;
        this.altura = altura;
    }
    
    public double obterArea(){
        return lado*lado*Math.sqrt(3);
    }
    public double obterVolume(){
        return (1.0/3.0)*lado*lado*(1.0/2.0)*altura;
    }
    public String toString(){
        return super.toString() + "Tetraedro de lado: " + lado +" e altura: "+ altura;
    }
}
