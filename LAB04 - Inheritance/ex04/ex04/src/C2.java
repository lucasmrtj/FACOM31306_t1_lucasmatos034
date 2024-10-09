public class C2  extends C1{
    protected String c2Protegido;
    private String c2Privado;
    public String c2Publico;

    public C2(String c2Protegido, String c2Privado, String c2Publico) {
        System.out.println("Classe C2: chamada do construtor com parametros");
        this.c2Protegido = c2Protegido;
        this.c2Privado = c2Privado;
        this.c2Privado = c2Privado;
    }
    public C2(){
        System.out.println("Classe C2: chamada do construtor padrao, sem parametros");
    }

    public String getC2Privado(){
        return this.c2Privado;
    }
    @Override
    public void mostrar_atributos(){
        System.out.println("C1 Protegido: " + c1Protegido);
        System.out.println("C1 Privado: " + getC1Privado());
        System.out.println("C1 Publico: " + c1Publico);
        System.out.println("C2 Protegido: " + c2Protegido);
        System.out.println("C2 Privado: " + c2Privado);
        System.out.println("C2 Publico: " + c2Publico);
    }
    public void mostrar_atributos_super(){
        super.mostrar_atributos();
        System.out.println("C2 Protegido: " + c2Protegido);
        System.out.println("C2 Privado: " + c2Privado);
        System.out.println("C2 Publico: " + c2Publico);
    }


}
