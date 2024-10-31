public class Main {
    public static void main(String[] args) {
        
        Produto vetProduto[] = new Produto[3];
        Servico vetServico[] = new Servico[3];
        Cliente vetCliente[] = new Cliente[3];

        vetProduto[0]= new Produto(456);
        vetProduto[1]= new Produto(326);
        vetProduto[2]= new Produto(357);

        vetServico[0]= new Servico(45.3);
        vetServico[1]= new Servico(60.3);
        vetServico[2]= new Servico(20.6);

        vetCliente[0]= new Cliente("Lucas");
        vetCliente[1]= new Cliente("Hanny");	
        vetCliente[2]= new Cliente("Eduarda");

        for(Produto aux: vetProduto)
            System.out.println(aux.toString());
        for(Servico aux: vetServico)
            System.out.println(aux.toString());
        for(Cliente aux: vetCliente)
            System.out.println(aux.toString());

        Classificador clas = new Classificador();
        Classificavel ord[] = Classificador.ordena(vetProduto);
        
        System.out.println("+++++++++++++++++++++++++++++ ORDENADO++++++++++++++++++++++");
        
        for(Classificavel aux: ord)
        System.out.println(aux.toString());
        
        ord = Classificador.ordena(vetServico);
        for(Classificavel aux: ord)
        System.out.println(aux.toString());

        ord = Classificador.ordena(vetCliente);
        for(Classificavel aux: ord)
            System.out.println(aux.toString());
    }
}
