public class CandidatoPerfeito extends Candidatos {
    
    private String nomeVice;
    private String partidoVice;

    public CandidatoPerfeito(String nome, String nascimento, char genero, double bens, boolean reeleicao, int partido, String nomeVice, String partidoVice){
        super(nome, nascimento, genero, bens, reeleicao, partido);
        this.nomeVice = nomeVice;
        this.partidoVice = partidoVice;
    }
    
    public String toString(){
        return "nome: "+ nome +"\nnascimento: "+ nascimento +"\ngenero: "+ genero +"\nbens: "+ bens +"\nreeleicao: "+ reeleicao+"\npartido: "+ partido+ "\nnome vice: "+ nomeVice+ "\npartido vice: "+ partidoVice+ "\n";  
    }

}


