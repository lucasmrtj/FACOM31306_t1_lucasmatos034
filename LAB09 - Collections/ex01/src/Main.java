import java.util.ArrayList;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {

        ArrayList<Estudante> vetdina = new ArrayList<Estudante>();

        Estudante m = new EstudanteGraduacao("Maria", "Rua Maio", "Java is funny");
        vetdina.add(m);
        m = new EstudanteMestrado("Carla","Rua Primavera","Medicina","Vacinas de RNA", "academico","Anticorpos");
        vetdina.add(m);
        m = new EstudanteDoutorado("Bruno","Rua Inverno","Tecnologia","Processamento de Imagens","Carros Inteligentes");
        vetdina.add(m);
        m = new EstudanteDoutorado("Ailton","Rua 31 de fevereiro","Engenharia","Banco de Dados","gerenciamento demografico");
        vetdina.add(m);

        System.out.println("================= Array List =================");
        for(Estudante aux: vetdina){
                aux.print();
        }
        vetdina.remove(2);
        System.out.println("\n|||||||||||||||||Removendo: posicao 2 |||||||||||||||");
        for(Estudante aux: vetdina){
                aux.print();
        }

        TreeSet<Estudante> arv = new TreeSet<Estudante>();

        m = new EstudanteGraduacao("Maria", "Rua Maio", "Java is funny");
        arv.add(m);
        m = new EstudanteMestrado("Carla","Rua Primavera","Medicina","Vacinas de RNA", "academico","Anticorpos");
        arv.add(m);
        m = new EstudanteDoutorado("Bruno","Rua Inverno","Tecnologia","Processamento de Imagens","Carros Inteligentes");
        arv.add(m);
        m = new EstudanteDoutorado("Ailton","Rua 31 de fevereiro","Engenharia","Banco de Dados","gerenciamento demografico");
        arv.add(m);

        
        


    }
}
