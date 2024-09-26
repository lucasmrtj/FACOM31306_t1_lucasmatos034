public class Usuario {
    private String nome;
    private String cpf;
    private Emprestimo emprestimos [];

    public Usuario(String nome, String cpf){  
        this.nome = nome;
        this.cpf = cpf; 
        emprestimos = new Emprestimo[0];    
    }
    public String getNome(){
        return nome;
    }
    public String getCpf(){
        return cpf;
    }
    public Emprestimo[] getEmprestimos(){
        return emprestimos;
    }

    public void emprestarLivro(Livro livro, String dtEmprestimo, String dtDevolucao){
        Emprestimo emprestimo = new Emprestimo(livro, dtEmprestimo, dtDevolucao);
        Emprestimo ux[] = new Emprestimo[emprestimos.length+1];
        int i = 0;
        for(Emprestimo aux:emprestimos){
            ux[i]= aux;
            i++;
        }
        ux[emprestimos.length]= emprestimo;
        emprestimos = ux;
    }

    public void devolverLivro (Livro livro){
        int veri = 0;
        for(Emprestimo aux:emprestimos){
            if(aux.getLivro()==livro){
                veri = 1;
            }
        }
        if (veri==1){
            Emprestimo ux[] = new Emprestimo[emprestimos.length-1];
            int i = 0;
            for(Emprestimo aux:emprestimos){
                if(aux.getLivro()!=livro){
                    ux[i]= aux;
                    i++;
                }
            }
            emprestimos = ux;
        }
    }

}
