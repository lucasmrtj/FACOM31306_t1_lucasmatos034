public class ContaEspecial extends ContaCorrente {
    private double limite;

    public ContaEspecial(float val, int num, int pwd, double limite ){
        super(val, num, pwd);
        this.limite = limite;
        
        if(limite == 0){
        
        }
    }
}
