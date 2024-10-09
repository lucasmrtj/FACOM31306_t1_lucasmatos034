public class Candidatos {
    protected String nome;
    protected String nascimento;
    protected char genero;
    protected double bens;
    protected boolean reeleicao;
    protected int partido;
    
    public Candidatos(String nome, String nascimento, char genero, double bens, boolean reeleicao, int partido){
        this.nome = nome;
        this.nascimento = nascimento;
        this.genero = genero;
        this.bens = bens;
        this.reeleicao = reeleicao;
        this.partido = partido;
    }
    public String toString(){
        return "nome: "+ nome +"\nnascimento: "+ nascimento +"\ngenero: "+ genero +"\nbens: "+ bens +"\nreeleicao: "+ reeleicao+"\npartido: "+ partido;  
    }
    

}


