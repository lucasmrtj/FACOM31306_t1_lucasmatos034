public class EstudanteDoutorado extends EstudantePosGrad {
    String tituloTese;

    public EstudanteDoutorado(String nome, String endereco, String formacao,
                              String linhadDePesquisa, String tituloTese) {
        super(nome, endereco, formacao, linhadDePesquisa);
        this.tituloTese = tituloTese;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("EstudanteDoutorado{" +
                "tituloTese='" + tituloTese + '\'' +
                '}');

    }
    public void print(boolean veri) {
        super.print();
        if(veri){
            System.out.println("\nEstudanteDoutorado\n" +
            "tituloTese: " + tituloTese + '\n');
        }
        else{
            System.out.println("; EstudanteDoutorado; " +
             tituloTese + ';');
        }

    }

    public String getTituloTese() {
        return tituloTese;
    }

    public void setTituloTese(String tituloTese) {
        this.tituloTese = tituloTese;
    }
}
