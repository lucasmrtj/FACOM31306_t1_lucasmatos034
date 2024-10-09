public class CamaroteInferior extends Vip {
    private String Local;

    public CamaroteInferior(String local, double valor, double porcentagemAd){
        super(valor, porcentagemAd);
        this.Local = local;
    }

    @Override
    public String toString() {
        return super.toString()+"\nLocal: "+Local+"\n";
    }
    public void setLocal(String Local) {
        this.Local = Local;
    }

    public String getLocal() {
        return Local;
    }

    
}
