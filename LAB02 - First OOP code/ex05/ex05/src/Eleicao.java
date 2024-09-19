public class Eleicao {

    private String nomeMun;
    private int votantes;
    private Candidatos vCandidatos[];


    public Eleicao(String nomeMu, int numvot, Candidatos vcandidatos[]){
        nomeMun = nomeMu;
        votantes = numvot;
        vCandidatos = vcandidatos;
    }
    public void ImprimeEleicao(){
        System.out.println(nomeMun);
        System.out.printf("%d\n\n", votantes);
        for(Candidatos aux : vCandidatos){
            aux.Imprime();
        }
    }


}
