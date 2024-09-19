public class municipio{
public static void main(String[] args) {
        
    Candidatos vCandidatos []= new Candidatos[3] ;

    vCandidatos[0]= new Candidatos("ADEMAR CANDIDO DA SILVA", "23/06/1966",'M',1007500.00, false, 13, "Vereador");
    vCandidatos[1] = new Candidatos("ALMIRO ALVES DE LIMA", "11/01/1974", 'M', 2124876.61, false, 20,"Vice-Prefeito");
    vCandidatos[2] = new Candidatos("GIVANILDO TRUMI", "16/06/1976", 'M', 237950.00, true, 11, "Prefeito");
     

    for(Candidatos aux: vCandidatos)
     aux.Imprime();
    }
    //Boa Esperança do Iguaçu Código: 4103024

}