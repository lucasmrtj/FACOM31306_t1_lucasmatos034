public class ContaComum extends ContaCorrente {
    private double limite;
    
    public ContaComum(float val, int num, int pwd){
        super(val, num, pwd);
        limite = 0;
    }
}
