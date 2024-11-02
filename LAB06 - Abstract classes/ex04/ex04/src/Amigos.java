import java.time.LocalDate;

public class Amigos extends Contato {
    protected int grau;
    
    public Amigos(String apelido, String nome, String email, LocalDate aniversario, int grau){
        super(apelido, nome, email, aniversario);
        this.grau = grau;
    }

    public int getGrau() {
        return grau;
    }

    public String imprimirContato(){
        return imprimirBasico() + "\nGrau: "+ grau; 
    }

}
