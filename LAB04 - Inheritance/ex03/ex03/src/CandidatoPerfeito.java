public class CandidatoPerfeito extends Candidatos {
    
    private String nomeVice;
    private String partidoVice;

    public CandidatoPerfeito(String nome, String nascimento, char genero, double bens, boolean reeleicao, int partido, String nomeVice, String partidoVice){
        super(nome, nascimento, genero, bens, reeleicao, partido);
        this.nomeVice = nomeVice;
        this.partidoVice = partidoVice;
    }
    
    public String toString(){
        return super.toString()+ "\nnome vice: "+ nomeVice+ "\npartido vice: "+ partidoVice+ "\n";  
    }

}


