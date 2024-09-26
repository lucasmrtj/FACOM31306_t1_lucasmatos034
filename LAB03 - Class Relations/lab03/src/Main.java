public class Main {
    public static void main(String[] args) {
        // Criação de objetos
        Livro livros[] = new Livro[10];
        
        livros[0] = new Livro("O Senhor dos Anéis", "J.R.R. Tolkien", "978-0618053267");
        livros[1] = new Livro("Harry Potter e a Pedra Filosofal", "J.K. Rowling", "978-0747532699");
        livros[2] = new Livro("1984", "George Orwell", "978-0451524935");
        livros[3] = new Livro("O Pequeno Príncipe", "Antoine de Saint-Exupéry", "978-0156010037");
        livros[4] = new Livro("Dom Casmurro", "Machado de Assis", "978-8501062694");
        livros[5] = new Livro("O Hobbit", "J.R.R. Tolkien", "978-0618053267");
        livros[6] = new Livro("A Guerra dos Tronos", "George R.R. Martin", "978-0553573422");
        livros[7] = new Livro("O Nome da Rosa", "Umberto Eco", "978-0140137684");
        livros[8] = new Livro("Orgulho e Preconceito", "Jane Austen", "978-0141439518");
        livros[9] = new Livro("A Divina Comédia", "Dante Alighieri", "978-0140445347");


        Usuario usuarios[]= new Usuario[3];
        usuarios[0] = new Usuario("João da Silva", "12345678900");
        usuarios[1] = new Usuario("Maria Santos", "98765432100");
        usuarios[2] = new Usuario("Pedro Rodrigues", "11122233344");


        // Empréstimo do livro
        usuarios[0].emprestarLivro(livros[2], "24/08/2024", "24/11/2024");
        usuarios[0].emprestarLivro(livros[1], "27/08/2024", "27/11/2024");
        usuarios[0].emprestarLivro(livros[4], "30/08/2024", "30/11/2024");

        usuarios[1].emprestarLivro(livros[6], "24/08/2024", "24/11/2024");

        usuarios[2].emprestarLivro(livros[0], "27/08/2024", "27/11/2024");
        usuarios[2].emprestarLivro(livros[7], "30/08/2024", "30/11/2024");

        // Impressão de informações

        for(int i = 0; i <usuarios.length; i++){
            System.out.println("Usuário: " + usuarios[i].getNome());
            System.out.println("\nLivros emprestados:\n ");
            for(int j = 0; j < usuarios[i].getEmprestimos().length; j++){
                System.out.println(usuarios[i].getEmprestimos()[j].getLivro().getTitulo());
                System.out.println(usuarios[i].getEmprestimos()[j].getDataEmprestimo());
                System.out.println(usuarios[i].getEmprestimos()[j].getDataDevolucao());
                System.out.println("--------------------------------------------------------------");
            }
        }
       
        // Devolução do livro
        usuarios[2].devolverLivro(livros[0]);
         
        System.out.println("Devolução do livro:");
        System.out.println("Usuário: " + usuarios[2].getNome());
        System.out.println("\nLivros emprestados:\n ");
         for(int j = 0; j < usuarios[2].getEmprestimos().length; j++){
            System.out.println(usuarios[2].getEmprestimos()[j].getLivro().getTitulo());
            System.out.println(usuarios[2].getEmprestimos()[j].getDataEmprestimo());
            System.out.println(usuarios[2].getEmprestimos()[j].getDataDevolucao());
            System.out.println("--------------------------------------------------------------");
        }
    }
}
