public class CandidatoPerfeito {
    private String nome;
    private String nascimento;
    private char genero;
    private double bens;
    private boolean reeleicao;
    private int partido;
    private String nomeVice;
    private String partidoVice;

    public CandidatoPerfeito(String nome, String nascimento, char genero, double bens, boolean reeleicao, int partido, String nomeVice, String partidoVice){
        this.nome = nome;
        this.nascimento = nascimento;
        this.genero = genero;
        this.bens = bens;
        this.reeleicao = reeleicao;
        this.partido = partido;
        this.nomeVice = nomeVice;
        this.partidoVice = partidoVice;
    }
    
    public String toString(){
        return "nome: "+ nome +"\nnascimento: "+ nascimento +"\ngenero: "+ genero +"\nbens: "+ bens +"\nreeleicao: "+ reeleicao+"\npartido: "+ partido+ "\nnome vice: "+ nomeVice+ "\npartido vice: "+ partidoVice+ "\n";  
    }

}


