public class Candidatos {
    private String nome;
    private String nascimento;
    private char genero;
    private double bens;
    private boolean reeleicao;
    private int partido;
    
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


