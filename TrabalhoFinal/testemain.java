/*

  
  public class testemain {
    public static void main(String[] args) {
        
    Universidade uni = new Universidade("ufu", "12/11/1976");
    //Universidade.popularUni(test);
    
            Professor aux = new Professor("Carlos Sergio", "12/11/1975", "700.179.826-69", "Facom", "15/12/2018", uni);
            uni.professores.add(aux);
            aux = new Professor("Maria da Silva", "05/03/1982", "876.543.210-06", "Fafich", "20/01/2021", uni);
            uni.professores.add(aux);
            aux = new Professor("João Paulo", "28/07/1968", "123.456.789-09", "Farmácia", "10/06/2018", uni);
            uni.professores.add(aux);
            aux = new Professor("Ana Beatriz", "18/10/1990", "987.654.321-00", "Medicina", "01/09/2023", uni);
            uni.professores.add(aux);
            aux = new Professor("Pedro Henrique", "02/04/1979", "456.789.012-02", "Engenharia", "18/03/2019", uni);
            uni.professores.add(aux);
            aux = new Professor("Laura Santos", "25/12/1985", "789.012.345-02", "Direito", "05/07/2022", uni);
            uni.professores.add(aux);
            aux = new Professor("Ricardo Almeida", "11/06/1995", "321.654.987-08", "Ciências", "28/11/2020", uni);
            uni.professores.add(aux);
            aux = new Professor("Juliana Oliveira", "09/09/1972", "654.321.987-04", "Educação Física", "15/04/2017", uni);
            uni.professores.add(aux);
            aux = new Professor("Rafael Costa", "17/08/1988", "147.258.369-60", "Música", "30/05/2023", uni);
            uni.professores.add(aux);
            aux = new Professor("Camila Ferreira", "22/05/1992", "581.364.792-70", "Letras", "20/10/2016", uni);
            uni.professores.add(aux);
            Estudante est = new Estudante_Graduacao("Lucas Matos", "05/04/2006", "540.544.334-33", 86.3, "QTI");
            uni.estudantes.add(est);
            est = new Estudante_Graduacao("Maria Silva", "12/11/2005", "123.456.789-09", 78.9, "fisk");
            uni.estudantes.add(est);
            est = new Estudante_Graduacao("João Souza", "28/07/2004", "987.654.321-00", 92.5, "Drumind edificios");
            uni.estudantes.add(est);
            est = new Estudante_Graduacao("Ana Santos", "15/03/2007", "456.789.012-02", 81.2, "UBS");
            uni.estudantes.add(est);
            est = new Estudante_Graduacao("Pedro Oliveira", "02/09/2006", "789.012.345-02", 75.0, "VTR");
            uni.estudantes.add(est);
            est = new Estudante_Graduacao("Laura Almeida", "21/06/2005", "321.654.987-08", 95.8, "Sankha");
            uni.estudantes.add(est);
            est = new Estudante_Graduacao("Ricardo Costa", "18/10/2007", "654.321.987-04", 88.1, "Drogasil");
            uni.estudantes.add(est);
            est = new Estudante_Graduacao("Juliana Ferreira", "05/05/2004", "147.258.369-60", 72.7, "Lar Doce");
            uni.estudantes.add(est);
            est = new Estudante_Graduacao("Rafael Santos", "11/12/2006", "581.364.792-70", 90.0, "NTT Data");
            uni.estudantes.add(est);
            est = new Estudante_Graduacao("Camila Costa", "29/08/2005", "258.369.147-81", 84.6, "Lumini");
            uni.estudantes.add(est);
            Estudante_PosGraduacao grad = new Estudante_PosGraduacao("Maria Luiza", "15/06/2002", "658.658.453-53", 59.3, "Arodinamica das vacas");
            uni.estudantes.add(grad);
            grad = new Estudante_PosGraduacao("João Pedro", "20/03/1998", "123.456.789-09", 82.1, "Desenvolvimento de algoritmos de aprendizado de máquina para diagnóstico médico");
            uni.estudantes.add(grad);
            grad = new Estudante_PosGraduacao("Ana Clara", "01/11/2000", "987.654.321-00", 75.5, "O papel da biodiversidade na mitigação das mudanças climáticas");
            uni.estudantes.add(grad);
            grad = new Estudante_PosGraduacao("Pedro Henrique", "10/07/1999", "456.789.012-02", 90.8, "Análise da eficiência energética em edifícios sustentáveis");
            uni.estudantes.add(grad);
            grad = new Estudante_PosGraduacao("Laura Beatriz", "25/12/2001", "789.012.345-02", 68.2, "Estudos sobre a influência da mídia social no comportamento do consumidor");
            uni.estudantes.add(grad);
            grad = new Estudante_PosGraduacao("Ricardo Silva", "18/05/1997", "321.654.987-08", 85.9, "Investigação sobre novas terapias para doenças neurodegenerativas");
            uni.estudantes.add(grad);
            grad = new Estudante_PosGraduacao("Juliana Oliveira", "08/09/1996", "654.321.987-04", 78.0, "Modelagem matemática de sistemas ecológicos");
            uni.estudantes.add(grad);
            grad = new Estudante_PosGraduacao("Rafael Santos", "15/04/2001", "147.258.369-60", 92.3, "O impacto da globalização na economia brasileira");
            uni.estudantes.add(grad);
            grad = new Estudante_PosGraduacao("Camila Souza", "22/10/2000", "581.364.792-70", 71.6, "Desenvolvimento de novos materiais para aplicações em energia renovável");
            uni.estudantes.add(grad);
            grad = new Estudante_PosGraduacao("Daniel Ferreira", "03/02/1999", "258.369.147-81", 88.7, "Estudos sobre a diversidade genética de espécies ameaçadas de extinção");
            uni.estudantes.add(grad);
    
            Disciplinas dis = new Disciplinas("POO","GBC3452","60");
            uni.disciplinas.add(dis);
            dis = new Disciplinas("Banco de Dados", "GBC3453", "60");
            uni.disciplinas.add(dis);
            dis = new Disciplinas("Redes de Computadores", "GBC3454", "120");
            uni.disciplinas.add(dis);
            dis = new Disciplinas("Sistemas Operacionais", "GBC3455", "60");
            uni.disciplinas.add(dis);
            dis = new Disciplinas("Engenharia de Software", "GBC3456", "120");
            uni.disciplinas.add(dis);
            dis = new Disciplinas("Inteligência Artificial", "GBC3457", "60");
            uni.disciplinas.add(dis);
            
            uni.disciplinas.get(0).setTurma(2, 2024, uni.professores.get(0), null);
                uni.disciplinas.get(0).getTurma(0).matriculaUmAluno(uni.estudantes.get(0));
                uni.disciplinas.get(0).getTurma(0).matriculaUmAluno(uni.estudantes.get(3));
                uni.disciplinas.get(0).getTurma(0).matriculaUmAluno(uni.estudantes.get(4));
                
            uni.disciplinas.get(1).setTurma(1, 2024, uni.professores.get(2), null);
                uni.disciplinas.get(1).getTurma(0).matriculaUmAluno(uni.estudantes.get(5));
                uni.disciplinas.get(1).getTurma(0).matriculaUmAluno(uni.estudantes.get(4));
                uni.disciplinas.get(1).getTurma(0).matriculaUmAluno(uni.estudantes.get(0));
                
            uni.disciplinas.get(2).setTurma(1, 2024, uni.professores.get(1),null);
            
            uni.disciplinas.get(3).setTurma(2, 2024, uni.professores.get(0), null);
                uni.disciplinas.get(3).getTurma(0).matriculaUmAluno(uni.estudantes.get(1));
                uni.disciplinas.get(3).getTurma(0).matriculaUmAluno(uni.estudantes.get(4));
                uni.disciplinas.get(3).getTurma(0).matriculaUmAluno(uni.estudantes.get(2));
            uni.disciplinas.get(4).setTurma(1, 2024, uni.professores.get(2), null); 
            
    
    Persist.escreverUniversidade("baseDedados", uni);
    
    Universidade ufu = Persist.lerUniversidadeArquivo("baseDedados");
    for(Professor aux1 : ufu.professores)
    System.out.println(aux1.toString());
    
    for(Estudante aux1 : ufu.estudantes)
    System.out.println(aux1.toString());
    for(Disciplinas di : ufu.disciplinas){
        System.out.println(di.toString());
        if(di.getTurmas()!=null){
            System.out.println("turmas:");
            for(Turma tur : di.getTurmas()){
                System.out.println(tur.toString());
                tur.alunosDaTurma();
            }
        }
    }
    
}

}

 * 
 */




