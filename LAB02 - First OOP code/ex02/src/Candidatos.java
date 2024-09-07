public class Candidatos {
    private String name;
    private String nascimento;
    private char genero;
    private double bens;
    private boolean reeleicao;
    private int partido;
    private String cargo;

    public Candidatos(){
        name = "";
        nascimento = "";
        genero = 0;
        bens = 0;
        reeleicao = false;
        partido = 0;
        cargo = "";
    }
    public Candidatos(String Ename, String Enascimento, char Egenero, double Ebens, boolean Ereeleicao, int Epartido, String Ecargo){
        name = Ename;
        nascimento = Enascimento;
        genero = Egenero;
        bens = Ebens;
        reeleicao = Ereeleicao;
        partido = Epartido;
        cargo = Ecargo;
    }
    public void Imprime(){
        System.out.printf(" %s \n %s \n %c \n %f \n %b \n %d \n %s\n \n", name, nascimento, genero, bens, reeleicao, partido, cargo);
    }

}


