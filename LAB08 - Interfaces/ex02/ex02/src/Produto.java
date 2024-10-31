public class Produto implements Classificavel {
    private int codigo;

    public Produto(int codigo) {
        this.codigo = codigo;
    }

    public int eMenorQue(Classificavel o){
        Produto compara = (Produto) o;
        if(this.codigo < compara.codigo){
            return 1;
        }
        else if(this.codigo == compara.codigo){
            return 0;
        }
        else{
            return -1;
        }
    }

    public String toString(){
        return "\nCodigo: " + codigo;
    }
}
