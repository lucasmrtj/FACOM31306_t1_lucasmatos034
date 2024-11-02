import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.time.DateTimeException;
import java.time.LocalDate;

public class FaceFriends {
    static boolean verificaIntervalo(int ini,int fim, int entrada){
        if(entrada<ini || entrada>fim){
            System.out.println("Entrada invalida");
            return false;
        }
        else
            return true;
    }
    static void opcoes(){
        System.out.println(
            "=================== MENU ===================\n"+
            "\n1.Inserir um contato"+
            "\n2.Imprimir todos os contatos"+
            "\n3.Imprimir somente os familiares"+
            "\n4.Imprimir somente os amigos"+
            "\n5.Imprimir somente os colegas de trabalho"+
            "\n6.Imprimir os MELHORES amigos, os IRMÃOS e os COLEGAS de trabalho"+
            "\n7.Imprimir os dados de um contato"+
            "\n0.Sair");
    }
    static Contato inserir() throws IOException {
        int controle = 0;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println(
            "============DEFINA O TIPO DE CONTATO=============\n"+
            "1.Amigos\n"+
            "2.Familia\n"+
            "3.Trabalho");
        do{
            controle = Integer.parseInt(reader.readLine());
        }while(!verificaIntervalo(1, 3, controle));
        
        Contato novo = null;
        String apelido, nome, email;
        int dia, mes, ano, veri = 0 ;
        LocalDate aniversario = LocalDate.of(1,1,1);
        System.out.print("Digite o apelido: ");
        apelido = reader.readLine();
        System.out.print("Digite o nome: ");
        nome = reader.readLine();
        System.out.print("Digite o email: ");
        email = reader.readLine();

        do{
            veri=0;
            System.out.print("Digite o dia do aniversario: ");
            dia = Integer.parseInt(reader.readLine());
            System.out.print("Digite o mes do aniversario: ");
            mes = Integer.parseInt(reader.readLine());
            System.out.print("Digite o ano do aniversario: ");
            ano = Integer.parseInt(reader.readLine());
            try{
                aniversario = LocalDate.of(ano, mes, dia);
            }
            catch(DateTimeException e){
                System.out.println("Data invalida! Tente novamente!");
                veri = 1;
            }
        }while(veri == 1);

        switch (controle) {
            case 1: //Amigos
                System.out.print("Digite o grau de amizade: (1= melhor amigo; 2 = amigo; 3 = conhecido)"); 
                int grau = 0;
                do{
                    grau = Integer.parseInt(reader.readLine());
                }while (!verificaIntervalo(1, 3, grau));
                novo = new Amigos(apelido, nome, email, aniversario, grau);
                break;
            case 2: //Familia
                System.out.print("Digite o tipo de parentesco: ");                 
                String tipo = reader.readLine();
                novo = new Familia(apelido, nome, email, aniversario, tipo); 
                break;
            case 3: //Trabalho
                System.out.print("Digite o tipo de relacao: ");                 
                String realacao = reader.readLine();
                novo = new Familia(apelido, nome, email, aniversario, realacao); 
                break;
        }
        return novo;
    }
    public static void main(String[] args) throws IOException {
        ArrayList<Contato> vet = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int controle = 10;

        do{
            opcoes();
            do{
                controle = Integer.parseInt(reader.readLine());
            }while(!verificaIntervalo(0, 7, controle));
            switch (controle) {
                case 1:
                    vet.add(inserir());
                    break;
                case 2:
                    System.out.println("===================== Lista de Contatos =====================");
                    for(Contato aux: vet){
                        System.out.println(aux.imprimirContato());
                    }
                    break;
                case 3:
                    System.out.println("===================== Lista de Familiares =====================");
                    for(Contato aux: vet){
                        if(aux instanceof Familia){
                            System.out.println(aux.imprimirContato());    
                        }
                    }
                    break;
                case 4:
                    System.out.println("===================== Lista de Amigos =====================");
                    for(Contato aux: vet){
                        if(aux instanceof Amigos){
                            System.out.println(aux.imprimirContato());    
                        }
                    }
                    break;
                case 5:
                    System.out.println("===================== Lista de Colegas De Trabalho =====================");
                    for(Contato aux: vet){
                        if(aux instanceof Trabalho){
                            System.out.println(aux.imprimirContato());    
                        }
                    }
                    break;
                case 6:
                    System.out.println("==================== Lista de Melhores amigos, irmaos e colegas ==================="); 
                    for(Contato aux: vet){
                        if(aux instanceof Trabalho){
                            if(((Trabalho)aux).getTipo().equals("colega"))
                            System.out.println(aux.imprimirContato());    
                        }
                        if(aux instanceof Familia){
                            if(((Familia)aux).getParentesco().equals("irmão")){
                                System.out.println(aux.imprimirContato());
                            }
                        }
                        if(aux instanceof Amigos){
                            if(((Amigos)aux).getGrau() == 1){
                                System.out.println(aux.imprimirContato());
                            }
                        }
                    }
                    break;
                case 7:
                    int pos=0;
                    System.out.print("Digite a posicao do contato: ");
                    do{
                        pos = Integer.parseInt(reader.readLine());
                    }while(!verificaIntervalo(0, vet.size(), pos));

                    System.out.println("================= Contato na posicao solicitada ==============="+
                    vet.get(pos).imprimirContato());

                    break;
                default:
                    System.out.println("Encerrando...");
                    break;
            }
            

        }while(controle != 0);


    }
}
