public class Produto {
    private String nomeProd;
    private double preco;
    private int quantidade;

    public Produto(){
        
    }
    public Produto(String nome, double prec, int quant){
        nomeProd = nome;
        preco = prec;
        quantidade = quant; 
    }
    public void atualizaQantidade(int quant){
        if(quant>=0){
            quantidade = quant;
        }
    }
    public void atualizaPreco(double porcentagem){
        if(porcentagem != 0.00){
            preco += (porcentagem/100)*preco;
        }
    }
    public void imprime(){
        System.out.println(nomeProd);
        System.out.printf("Preco:%.2f\n",preco);
        System.out.printf("Quantidade:%d\n",
        quantidade);
        System.err.println("-----------------------------------------------");
    }
    public String BuscaNome(){
        return nomeProd;
    }
}

