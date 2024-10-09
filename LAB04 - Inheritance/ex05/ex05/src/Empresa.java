import java.time.LocalDate;
public class Empresa {
    public static void main(String[] args) {
        
        Horistas [] fHoristas = new Horistas[2];
        Operarios [] fOperarios = new Operarios[2];
        Vendedor [] fVendedores = new Vendedor[2];
        Chefe [] fChefes = new Chefe[2];

        fHoristas[0] = new Horistas("Raquel Emillene",LocalDate.of(2002,06,18), 17);
        fHoristas[1] = new Horistas("Luana Pessoa",LocalDate.of(2000,04,23), 21);

        fOperarios[0] = new Operarios("Daniel Borges",LocalDate.of(2003,9,12), 32.50);
        fOperarios[1] = new Operarios("Bruno Travencolo" ,LocalDate.of(1976, 11, 06), 40.00);

        fVendedores[0] = new Vendedor("Luana Rodrigues", LocalDate.of(2004, 8, 1),1420.00,0.05);
        fVendedores[1] =  new Vendedor("Gabriela Goular", LocalDate.of(2005, 8, 13),1600.00,0.02);

        fChefes[0] = new Chefe("Eduarda Lopes",LocalDate.of(2001, 4, 24), 5400.80);
        fChefes[1] = new Chefe("Hanny Borges",LocalDate.of(2004,12,2), 6400.00 );
        
        for (Horistas aux: fHoristas)
            System.out.println(aux.toString());
        for (Operarios aux: fOperarios)
            System.out.println(aux.toString());
        for (Vendedor aux: fVendedores)
            System.out.println(aux.toString());
        for (Chefe aux: fChefes)
            System.out.println(aux.toString());
        System.out.println("================ Salario Calculado ================");
        fHoristas[1].calculaSalario(120);
        System.out.println(fHoristas[1].toString());
    }
}
