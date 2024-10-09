public class CandidatoVereador {
    private String nome;
    private String nascimento;
    private char genero;
    private double bens;
    private boolean reeleicao;
    private int partido;
    private String numero;
    private String bairro;

    public CandidatoVereador(String nome, String nascimento, char genero, double bens, boolean reeleicao, int partido, String numero, String bairro){
        this.nome = nome;
        this.nascimento = nascimento;
        this.genero = genero;
        this.bens = bens;
        this.reeleicao = reeleicao;
        this.partido = partido;
        this.bairro = bairro;
        this.numero = numero;
    }

    public String toString(){
        return "nome: "+ nome +"\nnascimento: "+ nascimento +"\ngenero: "+ genero +"\nbens: "+ bens +"\nreeleicao: "+ reeleicao+"\npartido: "+ partido+ "\nnumero: "+ numero+ "\nBairro: "+ bairro+ "\n";  
    }
    
    



}
