public class Main {
    public static void main(String[] args) {
        
        CamaroteInferior vipInf = new CamaroteInferior("Castelli Master", 100, 0.2);
        CamaroteSuperior vipSupe = new CamaroteSuperior(100.0 ,0.2, 30.0);
        Normal normal = new Normal(100);
        System.out.println(vipInf.toString());
        System.out.println(vipSupe.toString());
        normal.imprimeIngresso();


    }
}
