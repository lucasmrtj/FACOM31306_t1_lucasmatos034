import java.time.LocalDate;

public class Universidade {
    private String nomeUni;
    private LocalDate fundacao;
    private Estudante[] alunos;
    
    public Universidade(String nomeUni, LocalDate fundacao, Estudante alunos[]){
        this.nomeUni = nomeUni; 
        this.fundacao = fundacao;
        this.alunos = new Estudante[alunos.length];
        int i=0;
        for(Estudante aux: alunos){
            this.alunos[i] = aux;
            i++;
        }
    }
    public String relatorioAlunos(){
        int grad = 0, mest =0, dout = 0;
        for(Estudante aux: alunos){
            if(aux instanceof EstudanteDoutorado){
                dout++;
            }
            else if(aux instanceof EstudanteMestrado){
                mest++;
            }
            else if(aux instanceof EstudanteGraduacao){
                grad++;
            }
        }
        return "\nGraduacao: "+grad+ "\nMestrado: "+mest+"\nDoutorado: "+dout;
    }

    public void inserirAlunos(Estudante add[]){
        Estudante vetaux[] = new Estudante[this.alunos.length + add.length];
        int i = 0;
        for(Estudante aux: alunos){
            vetaux[i]= aux;
            i++;
        }
        for(Estudante aux: add){
            vetaux[i]= aux;
            i++;
        }
        this.alunos = null;
        this.alunos = vetaux;
    }

    public Estudante copiaAlunosPos(){
        Estudante vetaux[] = new Estudante[this.alunos.length];

    }

    public void printAlunos(){
        for(Estudante aux: alunos){
            aux.print();  
        }
    }

}
