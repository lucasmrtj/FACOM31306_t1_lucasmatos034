public class Triangulo extends FormaBidimencional {
    private double base;
    private double altura;
    public Triangulo(double base, double altura){
        super();
        this.base = base;
        this.altura = altura;
    }
    public double obterArea(){
        return (base*altura / 2);
    }
    public String toString(){
        return super.toString() + "Triangulo de base: " + base + " e altura: " + altura;
    }    
}
