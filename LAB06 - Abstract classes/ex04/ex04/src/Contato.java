import java.time.LocalDate;
abstract class Contato {
    protected String apelido, 
                     nome,
                     email;
    protected LocalDate aniversario;

    public Contato(String apelido, String nome, String email, LocalDate aniversario) {
        this.apelido = apelido;
        this.nome = nome;
        this.email = email;
        this.aniversario = aniversario;
    }

    public String imprimirBasico(){
        return "Apelido: " + apelido + "\nNome: " + nome + "\nEmail: " + email + "\nAniversario: " + aniversario; 
    }

    abstract String imprimirContato();

}
