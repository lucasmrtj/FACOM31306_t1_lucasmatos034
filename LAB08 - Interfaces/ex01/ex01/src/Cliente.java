public class Cliente implements Classificavel{
    private String nome;

    public Cliente(String nome){
        this.nome = nome;
    }

    public boolean  eMenorQue(Classificavel o){
        Cliente compara = (Cliente) o;
        if(this.nome.compareTo( compara.nome)<1){
            return true;
        }
        else{
            return false;
        }
    }

    public String toString(){
        return "\nNome: " +  nome;
    }
}
