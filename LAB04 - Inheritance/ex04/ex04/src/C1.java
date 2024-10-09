public class C1 {
    protected String c1Protegido;
    private String c1Privado;
    public String c1Publico;

    public C1(String c1Protegido, String c1Privado, String c1Publico){
        System.out.println("Classe C1: chamada do construtor com parametros");
        this.c1Protegido = c1Protegido;
        this.c1Privado = c1Privado;
        this.c1Publico = c1Publico;
    }
    public C1(){
        System.out.println("Classe C1: chamada do construtor padrao, sem parametros");

    }
    public String getC1Privado(){
        return c1Privado;
    }
    public void mostrar_atributos(){
        System.out.println("C1 Protegido: " + c1Protegido);
        System.out.println("C1 Privado: " + c1Privado);
        System.out.println("C1 Publico: " + c1Publico);
    }
}
