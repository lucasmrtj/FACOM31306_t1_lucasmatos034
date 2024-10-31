public class Cliente implements Classificavel{
    private String nome;

    public Cliente(String nome){
        this.nome = nome;
    }

    public int eMenorQue(Classificavel o){
        Cliente compara = (Cliente) o;
        if(this.nome.compareTo( compara.nome)==0){
            return 0;
        }
        else if(this.nome.compareTo( compara.nome)>0){
            return 1;
        }
        else{
            return -1;
        }
    }

    public String toString(){
        return "\nNome: " +  nome;
    }
}
