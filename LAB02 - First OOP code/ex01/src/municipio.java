public class municipio{
public static void main(String[] args) {
        
        Candidatos a, b ,c ;
    
        a = new Candidatos();
        b = new Candidatos();
        c = new Candidatos();

        a.name = "ADEMAR CANDIDO DA SILVA";
        a.nascimento = "23/06/1966";
        a.genero = 'M';
        a.bens = 1007500.00;
        a.reeleicao = false;
        a.partido = 13;
        a.cargo = "Vereador";

        b.name = "ALMIRO ALVES DE LIMA";
        b.nascimento = "11/01/1974";
        b.genero = 'M';
        b.bens = 2124876.61;
        b.reeleicao = false;
        b.partido = 20;
        b.cargo = "Vice-Prefeito";

        c.name = "GIVANILDO TRUMI";
        c.nascimento = "16/06/1976";
        c.genero = 'M';
        c.bens =  237950.00;
        c.reeleicao = true;
        c.partido = 11;
        c.cargo = "Prefeito";
        
        System.out.printf(" %s \n %s \n %c \n %f \n %b \n %d \n %s\n \n", a.name, a.nascimento, a.genero, a.bens, a.reeleicao, a.partido,a.cargo);
        
        System.out.printf(" %s \n %s \n %c \n %f \n %b \n %d \n %s \n \n",b.name, b.nascimento, b.genero, b.bens, b.reeleicao, b.partido,b.cargo);

        System.out.printf(" %s \n %s \n %c \n %f \n %b \n %d \n %s",c.name, c.nascimento, c.genero, c.bens, c.reeleicao, c.partido,c.cargo);

        //Boa Esperança do Iguaçu Código: 4103024
        
    }

}