public class Servico implements Classificavel {
    private double preco;

    public Servico(double preco){
        this.preco = preco;
    }

    public boolean eMenorQue(Classificavel o){
        Servico compara = (Servico) o;
        if(this.preco< compara.preco){
            return true;
        }
        else{
            return false;
        }
    }

    public String toString() {
        return "\nPreco: "+ this.preco;
    }
}
