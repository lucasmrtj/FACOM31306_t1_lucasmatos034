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
    public void BuscaPatrimonio(){
        Candidatos maior = vCandidatos[0];
        double total = 0, i = 0;
        for(Candidatos aux : vCandidatos){
            if(maior.BuscaBens() < aux.BuscaBens()){
                maior = aux;
            } 
            i++;
            total += aux.BuscaBens();
        }
        
        double percentual = (maior.BuscaBens())/(total/(i*100))  ;
        maior.Imprime();
        System.out.printf("Tem um patimonio %f porcento maior que a media",percentual);
    }


}
