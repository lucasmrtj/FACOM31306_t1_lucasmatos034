public class EstudanteGraduacao extends Estudante {
    private String tituloTCC;

    public EstudanteGraduacao(String nome, String endereco, String tituloTCC) {
        super(nome, endereco);
        this.tituloTCC = tituloTCC;
    }

    public void print() {
        super.print();
        System.out.println("EstudanteGraduacao{" +
                "tituloTCC='" + tituloTCC + '\'' +
                '}');
    }
    public void print(boolean veri) {
        super.print();
        if(veri){
            System.out.println("\nEstudanteGraduacao\n" +
                "tituloTCC: " + tituloTCC );
        }
        else{
            System.out.println("; EstudanteGraduacao; " +
             tituloTCC + "; ");

        }
    }


    public String getTituloTCC() {
        return tituloTCC;
    }

    public void setTituloTCC(String tituloTCC) {
        this.tituloTCC = tituloTCC;
    }
}
