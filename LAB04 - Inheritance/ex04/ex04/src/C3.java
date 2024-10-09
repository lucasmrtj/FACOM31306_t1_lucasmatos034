public class C3 extends C2 {
    protected String c3Protegido;
    private String c3Privado;
    public String c3Publico;

    public C3(String c2Protegido, String c2Privado, String c2Publico,String c3Protegido, String c3Privado, String c3Publico) {
        super( c2Protegido, c2Privado, c2Publico);
        System.out.println("Classe C3: chamada do construtor com parametros");
        this.c3Protegido = c3Protegido;	
        this.c3Privado = c3Privado;
        this.c3Publico = c3Publico;
    }
    public C3(){
        System.out.println("Classe C3: chamada do construtor padrao, sem parametros");
    }

    @Override
    public void mostrar_atributos(){
        System.out.println("C1 Protegido: " + c1Protegido);
        System.out.println("C1 Privado: " + getC1Privado());
        System.out.println("C1 Publico: " + c1Publico);
        System.out.println("C2 Protegido: " + c2Protegido);
        System.out.println("C2 Privado: " + getC2Privado());
        System.out.println("C2 Publico: " + c2Publico);
        System.out.println("C3 Protegido: " + c3Protegido);
        System.out.println("C3 Privado: " + c3Privado);
        System.out.println("C3 Publico: " + c3Publico);
    }
    public void mostrar_atributos_super(){
        super.mostrar_atributos_super();
        System.out.println("C3 Protegido: " + c3Protegido);
        System.out.println("C3 Privado: " + c3Privado);
        System.out.println("C3 Publico: " + c3Publico);
    }

}
