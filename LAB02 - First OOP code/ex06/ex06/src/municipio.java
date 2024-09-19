public class municipio{
public static void main(String[] args) {
        
    Candidatos vCandidatos []= new Candidatos[3] ;

    vCandidatos[0]= new Candidatos("ADEMAR CANDIDO DA SILVA", "23/06/1966",'M',1007500.00, false, 13, "Vereador");
    vCandidatos[1] = new Candidatos("ALMIRO ALVES DE LIMA", "11/01/1974", 'M', 2124876.61, false, 20,"Vice-Prefeito");
    vCandidatos[2] = new Candidatos("GIVANILDO TRUMI", "16/06/1976", 'M', 237950.00, true, 11, "Prefeito");
    //Boa Esperança do Iguaçu Código: 4103024
    
    Eleicao vEleicao[] = new Eleicao[2];
    
    vEleicao[0] = new Eleicao("Boa Esperança do Iguaçu", 2550, vCandidatos);

    vCandidatos = null;
    
    vCandidatos = new Candidatos[5];
    vCandidatos[0]= new Candidatos("JORGE LUIZ SANTIN", "20/04/1963",'M',99205.47, true, 55, "Prefeito");
    vCandidatos[1] = new Candidatos("ADILSOM PINTO","11/01/1974", 'M', 367500.00, false, 44123,"Vereador");
    vCandidatos[2] = new Candidatos("VANDERLEI CENTENARO", "02/09/1976", 'M', 543700.00, false, 15, "Vice-prefeito");
    vCandidatos[3] = new Candidatos("ALINE PINNO", "10/04/1994", 'F', 5000.00, false, 40555, "Vereador");
    vCandidatos[4] = new Candidatos("CABO BELLAN", "25/08/1977", 'M', 1520000.00, true, 55190, "Vereador");
    
    //Barracao
    vEleicao[1] = new Eleicao("Barracao", 9759, vCandidatos);
    
    for(Eleicao aux : vEleicao){
        aux.ImprimeEleicao();
        System.out.println("------------------------------------------------------");
    }

    vEleicao[1].BuscaPatrimonio();
        
}
}