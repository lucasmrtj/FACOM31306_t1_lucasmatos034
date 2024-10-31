import java.time.LocalDate;
public class Empresa {
    public static void main(String[] args) {
        
        Funcionario funcionarios[] = new Funcionario[8];
        funcionarios[0] = new Horistas("Raquel Emillene",LocalDate.of(2002,06,18), 17);
        funcionarios[1] = new Horistas("Luana Pessoa",LocalDate.of(2000,04,23), 21);
        funcionarios[2] = new Operarios("Daniel Borges",LocalDate.of(2003,9,12), 32.50);
        funcionarios[3] = new Operarios("Bruno Travencolo" ,LocalDate.of(1976, 11, 06), 40.00);
        funcionarios[4] = new Vendedor("Luana Rodrigues", LocalDate.of(2004, 8, 1),1420.00,0.05);
        funcionarios[5] =  new Vendedor("Gabriela Goular", LocalDate.of(2005, 8, 13),1600.00,0.02);
        funcionarios[6] = new Chefe("Eduarda Lopes",LocalDate.of(2001, 4, 24), 5400.80);
        funcionarios[7] = new Chefe("Hanny Borges",LocalDate.of(2004,12,2), 6400.00 );
        
        FolhaPagamento.imprimeFolha(funcionarios);

        
        
    }
}
