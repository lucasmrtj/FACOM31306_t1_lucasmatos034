import java.time.LocalDate;

public class Familia extends Contato{
    protected String parentesco;

    public Familia(String apelido, String nome, String email, LocalDate aniversario, String parentesco){
        super(apelido,nome,email,aniversario);
        this.parentesco = parentesco;
    }

    public String getParentesco(){
        return parentesco;
    }

    @Override
    public String imprimirContato() {
         return imprimirBasico() + "\nParentesco: " + parentesco;
    }

    
    
    
}
