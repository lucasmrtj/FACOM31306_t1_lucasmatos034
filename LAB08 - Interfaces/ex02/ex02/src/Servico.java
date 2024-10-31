public class Servico implements Classificavel {
    private double preco;

    public Servico(double preco){
        this.preco = preco;
    }

    public int eMenorQue(Classificavel o){
        Servico compara = (Servico) o;
        if(this.preco < compara.preco){
            return 1;
        }
        else if(this.preco == compara.preco){
            return 0;
        }
        else{
            return -1;
        }
    }

    public String toString() {
        return "\nPreco: "+ this.preco;
    }
}
