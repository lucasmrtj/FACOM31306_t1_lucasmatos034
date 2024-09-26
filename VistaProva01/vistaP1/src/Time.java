public class Time {
    private String nomeTime;
    private Jogador jogadores[];
    private Jogador sub;

    public Time(String nomeTime, Jogador jog1, Jogador jog2){
        this.nomeTime = nomeTime;
        jogadores = new Jogador[2];
        jogadores[0] = new Jogador(jog1.getNome(),jog1.getIdade(),jog1.getAltura(),jog1.getPeso());
        jogadores[1] = new Jogador(jog2.getNome(),jog2.getIdade(),jog2.getAltura(),jog2.getPeso());
        sub = null;
    }
    public Time(String nomeTime, Jogador jog1, Jogador jog2, Jogador sub){
        this.nomeTime = nomeTime;
        jogadores = new Jogador[2];
        jogadores[0] = new Jogador(jog1.getNome(),jog1.getIdade(),jog1.getAltura(),jog1.getPeso());
        jogadores[1] = new Jogador(jog2.getNome(),jog2.getIdade(),jog2.getAltura(),jog2.getPeso());
        this.sub = new Jogador(sub.getNome(),sub.getIdade(), sub.getAltura(), sub.getPeso());
    }
    
    public String toString(){
        if (this.sub != null){
            return "Time: "+nomeTime+"\nJogadores:\n "+ jogadores[0].toString()+ jogadores[1].toString() + "Subistituto: \n"+ sub.toString() ; 
        }
        return "Time: "+nomeTime+"\nJogadores:\n "+ jogadores[0].toString()+ jogadores[1].toString() + "Subistituto: Nao possui \n";
    }

    public int calculaMediaIdade(){
        int med = 0;
        if (this.sub != null){
            med = (this.jogadores[0].getIdade()+this.jogadores[1].getIdade()+this.sub.getIdade())/3;
        }
        else{
            med = (this.jogadores[0].getIdade()+this.jogadores[1].getIdade())/2;
        }
        return med;
    }
}
