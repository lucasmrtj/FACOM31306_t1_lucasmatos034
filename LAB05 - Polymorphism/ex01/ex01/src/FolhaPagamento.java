public class FolhaPagamento {
    public static void imprimeFolha(Funcionario funcionarios[] ){
        funcionarios[0].calculaSalario(120.00);
        funcionarios[1].calculaSalario(160.00);
        funcionarios[2].calculaSalario(5000.00);
        funcionarios[3].calculaSalario(6000.00);
        funcionarios[4].calculaSalario(30000.00);
        funcionarios[5].calculaSalario(45000.00);
        funcionarios[6].calculaSalario();
        funcionarios[7].calculaSalario();
        for(Funcionario aux : funcionarios ){
            System.out.println("=======================Folha de Pagamento =================");
            System.out.println(aux.toString());

        }
    }
}
