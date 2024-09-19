public class Programa {
    public static void ordena(Produto vetProduto[]){
        Produto aux;
        int pos;
        for(int i=0; i<vetProduto.length; i++){
            pos = i;
            for (int j = i+1; j <vetProduto.length; j++){
                if(vetProduto[pos].BuscaNome().compareTo( vetProduto[j].BuscaNome())>0){
                    pos = j;
                }
            } 
            aux = vetProduto[i];
            vetProduto[i] = vetProduto[pos];
            vetProduto[pos] = aux; 
        }
    }
    public static void main(String[] args) {
        Produto vetProduto [] = new Produto[10];

        vetProduto [0] = new Produto("Sal", 5.00, 200);
        vetProduto [1] = new Produto("Macarrao", 3.50, 300);
        vetProduto [2] = new Produto("Molho de tomate", 2.75, 150);
        vetProduto [3] = new Produto("Sabonete", 2.30, 500);
        vetProduto [4] = new Produto("Pasta de dente", 12.00, 500);
        vetProduto [5] = new Produto("Azeitona", 10.00, 220);
        vetProduto [6] = new Produto("Requeijao", 23.00, 100);
        vetProduto [7] = new Produto("Farinha de trigo", 4.70, 350);
        vetProduto [8] = new Produto("Vinagre", 7.00, 600);
        vetProduto [9] = new Produto("Oleo", 6.80, 450);

        for(Produto aux: vetProduto){
            aux.imprime();
        }
        ordena(vetProduto);
        System.out.println("\n\n\n ORDENADO\n\n\n");
        for(Produto aux: vetProduto){
            aux.imprime();
        }

        System.out.println("mudando em 15% o valor do vinagre");
        vetProduto[9].imprime();
        vetProduto[9].atualizaPreco(15.0);
        vetProduto[9].imprime();

        System.out.println("mudando para 2 a quantidade do sal");
        vetProduto[8].imprime();
        vetProduto[8].atualizaQantidade(2);
        vetProduto[8].imprime();
    }
}
