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

        
        Estudante [] vetposgrad = univer.copiaAlunosPos();
        System.out.println("======================== copia alunos pos===================");
        for(Estudante aux: vetposgrad){
            if(aux != null){
                aux.print();
            }
        }
        /*
         *Nao e possivel utilizar o metodo em um vetor de Estudantes pois o metodo nao foi definido na superclasse Estudante, logo o polimorfismo nao é aplicavel
        */ 

         System.out.println("======================== printf bool ===================");
         for(Estudante aux: vetposgrad){
            if(aux!=null)
            aux.print(false);
        }

        /*Agora é possivel compilar o codigo entretanto, a classe Estudante de Pós-gradução ainda esta imprimindo no padrao antigo.*/
        
    }
}
