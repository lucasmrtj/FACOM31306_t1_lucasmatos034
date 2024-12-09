import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public abstract class Persist {
     public static void escreverUniversidade(String nomeArq, Universidade ob) {
            try (FileOutputStream arq = new FileOutputStream(nomeArq); ObjectOutputStream os = new ObjectOutputStream(arq)) {
                os.writeObject(ob);
                System.out.println("Dados salvos com sucesso no arquivo: " + nomeArq);

            } catch (IOException e) {
                System.err.println("Erro ao escrever no arquivo: " + nomeArq);
                e.printStackTrace();
            }
        }
        public static Universidade lerUniversidadeArquivo(String nomeArq){
            try{
                FileInputStream arq = new FileInputStream(nomeArq);
                ObjectInputStream is = new ObjectInputStream(arq);
                Universidade univ = (Universidade) is.readObject();
                is.close();
                arq.close();
                return univ;
            }catch(IOException e){
                System.out.println("Arquivo inconsistente: "+ e);
                return null;
            }catch(ClassNotFoundException e){
                System.out.println("Erro ao ler o arquivo: "+ e);
                return null;
            }catch(Exception e){
                System.out.println("Erro inesperado ao ler arquivo: "+ e);
                return null;
            }
        }
}