import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int nTimes = 0;
        System.out.println("Entre com a quantidade de Times:");
        nTimes = scanner.nextInt();
        scanner.nextLine();
        Time vetTimes[] = new Time[nTimes];
        Jogador jogAux[]= new Jogador[3];
        String nometime;
        for(int i = 0; i < nTimes; i++){
            System.out.println("Entre com o nome do time:");
            nometime = scanner.nextLine();
            for(int j = 0; j <2; j++){
                String nome;
                double altura,peso;
                int idade;

                System.out.println("Entre com o nome do jogador:");
                nome = scanner.nextLine();
                System.out.println("Entre com a idade do jogador:");
                idade = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Entre com a altura do jogador:");
                String alturaStr = scanner.nextLine().replace(",", ".");
                altura = Double.parseDouble(alturaStr);
                System.out.println("Entre com o peso do jogador:");
                String pesoStr = scanner.nextLine().replace(",", ".");
                peso = Double.parseDouble(pesoStr);
                jogAux[j] = new Jogador(nome,idade,altura,peso);
            }
            int opcao;
            System.out.println("Deseja entrar com o jogador substituto? Sim(1) Nao(0)");
            opcao = scanner.nextInt();
            scanner.nextLine();
            if(opcao == 1){
                String nome;
                double altura,peso;
                int idade;

                System.out.println("Entre com o nome do jogador:");
                nome = scanner.nextLine();
                System.out.println("Entre com a idade do jogador:");
                idade = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Entre com a altura do jogador:");
                String alturaStr = scanner.nextLine().replace(",", ".");
                altura = Double.parseDouble(alturaStr);
                System.out.println("Entre com o peso do jogador:");
                String pesoStr = scanner.nextLine().replace(",", ".");
                peso = Double.parseDouble(pesoStr);
                jogAux[2] = new Jogador(nome,idade,altura,peso);

                vetTimes[i] = new Time(nometime,jogAux[0],jogAux[1],jogAux[2]); 
            }
            else {
                vetTimes[i] = new Time(nometime,jogAux[0],jogAux[1]); 
            }
        }
        jogAux = null;
        for(int i=0;i<nTimes;i++) {
            System.out.println("Time " + i);
            System.out.println(vetTimes[i].toString());
        }
        int med = vetTimes[0].calculaMediaIdade(), pos = 0;
        for(int i = 1;i<nTimes;i++) {
            if (med<vetTimes[i].calculaMediaIdade()){
                med = vetTimes[i].calculaMediaIdade();
                pos = i;
            }
        }
        System.out.println("Time com maior media:");
        System.out.println(vetTimes[pos].toString());
        vetTimes = null;
        scanner.close();
    }   
}
