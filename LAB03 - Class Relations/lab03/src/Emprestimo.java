public class Emprestimo {
    private Livro livro;
    private String dataEmprestimo;
    private String dataDevolucao;

    public Emprestimo(Livro livro,String dataEmprestimo, String dataDevolucao){
        this.livro = livro;
        this.dataEmprestimo = dataEmprestimo;
        this.dataDevolucao = dataDevolucao;
    }

    public Livro getLivro(){
        return livro;
    }
    public String getDataEmprestimo(){
        return dataEmprestimo;
    }
    public String getDataDevolucao(){
        return dataDevolucao;
    }
}
