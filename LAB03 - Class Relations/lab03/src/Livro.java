public class Livro {
    private String titulo;
    private String autor;
    private String id; 

    public Livro(String titulo, String autor, String id){
        this.titulo = titulo;
        this.autor = autor;
        this.id = id;
    }
    public String getTitulo() {
        return titulo;
    }
    public String getAutor() {
        return autor;
    }
    public String getId() {
        return id;
    }
}
