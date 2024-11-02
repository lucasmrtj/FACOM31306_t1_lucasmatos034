import java.time.LocalDate;

public class Trabalho extends Contato{
    protected String tipo;

    public Trabalho(String apelido, String nome, String email, LocalDate aniversario, String tipo){
        super(apelido, nome, email, aniversario);
        this.tipo = tipo;	 
    }

    public String imprimirContato(){
        return imprimirBasico() + "Tipo: " + tipo; 
    }
    public String getTipo(){
        return tipo;
    }
    
}
