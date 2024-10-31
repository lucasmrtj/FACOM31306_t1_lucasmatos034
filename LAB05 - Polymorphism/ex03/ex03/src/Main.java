import java.time.LocalDate;
public class Main {
    public static void main(String[] args) {


        Estudante[] alunos = new Estudante[4];

        alunos[0] = new EstudanteGraduacao("Maria", "Rua Maio", "Java is funny");
        
        alunos[1] = new EstudantePosGrad("Ailton","Rua 31 de fevereiro","Engenharia","Banco de Dados");
        
        alunos[2]= new EstudanteMestrado("Carla","Rua Primavera","Medicina","Vacinas de RNA", "academico","Anticorpos");
        
        alunos[3] = new EstudanteDoutorado("Bruno","Rua Inverno","Tecnologia","Processamento de Imagens","Carros Inteligentes");
        
        Universidade univer = new Universidade("Universidade Federal de Uberlândia", LocalDate.of(1975,5,26), alunos);

        System.out.println(univer.relatorioAlunos());
        univer.printAlunos();
        
        alunos = null;
        alunos = new Estudante[5];

        alunos[0] = new EstudanteGraduacao("Pedro", "Rua Sol", "C++ is powerful"); 

        alunos[1] = new EstudantePosGrad("Beatriz","Rua Lua","Direito","Direitos Humanos");

        alunos[2] = new EstudanteMestrado("Lucas","Rua Flores","Biologia","Genética","Pesquisador","Mutações Genéticas"); 

        alunos[3] = new EstudanteDoutorado("Fernanda","Rua Estrelas","Economia","Finanças","Mercado Financeiro");

        alunos[4] = new EstudanteGraduacao("Joana", "Rua Nuvens", "Python is easy");

        univer.inserirAlunos(alunos);
        System.out.println(univer.relatorioAlunos());
        univer.printAlunos();

        
        /*
         * 
         Estudante e = new Estudante("Carlos","Rua 1o de Abril");
         Estudante e2 = new Estudante("Carlos","Rua 1o de Abril");
         Estudante eg2 = new EstudanteGraduacao("Maria", "Rua Maio", "Java is funny");
         Estudante ep2 = new EstudantePosGrad("Ailton","Rua 31 de fevereiro","Engenharia",
         "Banco de Dados");
         Estudante epm2 = new EstudanteMestrado("Carla","Rua Primavera","Medicina",
         "Vacinas de RNA", "Anticorpos","academico");
         Estudante epd2 = new EstudanteDoutorado("Bruno","Rua Inverno",
         "Tecnologia","Processamento de Imagens","Carros Inteligentes");
         
         
         
         eg2.print();
         System.out.println( ((EstudanteGraduacao) eg2).getTituloTCC());
         System.out.println( ((EstudanteGraduacao) e2).getTituloTCC());
         Estudante[] ev = new Estudante[4];
         ev[0] = eg;
         ev[1] = epd2;
         ev[2] = epm2;
         ev[3] = e;
         for (Estudante i : ev){
                i.print();
                
                if (i instanceof EstudanteGraduacao){
                        System.out.println("\n");
                        ((EstudanteGraduacao) i).getTituloTCC();
                }
        }
        */
        

    }
}
