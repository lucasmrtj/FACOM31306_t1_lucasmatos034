public class Main {
    public static void main(String[] args) {
        C3 teste1 = new C3();
        teste1.mostrar_atributos_super();
        C3 teste2 = new C3("c2protegido", "C2Privado", "c2Publico","c3Protegido","c3Privado","c3Publico");
        teste2.mostrar_atributos_super();
    }
}
