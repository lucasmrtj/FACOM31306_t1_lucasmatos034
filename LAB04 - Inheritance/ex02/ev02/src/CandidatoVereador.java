public class CandidatoVereador extends Candidatos {
    private String numero;
    private String bairro;

    public CandidatoVereador(String nome, String nascimento, char genero, double bens, boolean reeleicao, int partido, String numero, String bairro){
        super(nome, nascimento, genero, bens, reeleicao, partido);
        this.bairro = bairro;
        this.numero = numero;
    }

    public String toString(){
        return "nome: "+ nome +"\nnascimento: "+ nascimento +"\ngenero: "+ genero +"\nbens: "+ bens +"\nreeleicao: "+ reeleicao+"\npartido: "+ partido+ "\nnumero: "+ numero+ "\nBairro: "+ bairro+ "\n";  
    }

}