import java.time.LocalDate;
import java.io.Serializable;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.io.IOException;
import java.util.Scanner;

    public class Universidade implements Serializable {
        public String nome;
        public String dataFundacao;
        public ArrayList<Disciplinas> disciplinas = new ArrayList<Disciplinas>();
        public ArrayList<Professor> professores = new ArrayList<Professor>();
        public ArrayList<Estudante> estudantes = new ArrayList<Estudante>();

        public Universidade(String nome, String dataFundacao) {
            this.nome = nome;
            this.dataFundacao = dataFundacao;
        }

        public String getDataFundacao() {
            return this.dataFundacao;
        }

        public void setDataFundacao(String data) {
            try {
                if(ValidacaoDataNasc.dataValida(data)) {
                    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                    LocalDate.parse(data, formatter);
                    this.dataFundacao = data;
                } else {
                    throw new IllegalArgumentException("Data de fundação deve estar no formato dd/mm/aaaa");
                }
            } catch(DateTimeParseException e) {
                throw new IllegalArgumentException("Data de fundação inválida.");
            }
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }
        public ArrayList<Disciplinas> getDisciplinas() {
            return disciplinas;
        }
        public ArrayList<Estudante> getEstudantes() {
            return estudantes;
        }
        public void setEstudantes(ArrayList<Estudante> estudantes) {
            this.estudantes = estudantes;
        }
        public ArrayList<Professor> getProfessores() {
            return professores;
        }

        //Fonte: https://stackoverflow.com/questions/2979383/how-to-clear-the-console-using-java
        public final static void clearConsole() {
            try {                if (System.getProperty("os.name").contains("Windows")) {
                    new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                } else {
                    System.out.print("\033\143");
                }
            } catch (IOException | InterruptedException ex) {}
        }

        public static void esperarTecla(Scanner scanner) {
            System.out.println("Pressione qualquer tecla para continuar...");
            scanner.nextLine();
        }

        public static int inicio(Scanner scanner, Universidade uni) {
            System.out.println(("===================================== Gestão da Universidade " + uni.getNome() + " ====================================="));
            System.out.println( ("Opções disponíveis: ") );
            System.out.println( ("0. Sair") );
            System.out.println( ("1. Consultar um aluno, professor, disciplina ou turma") );
            System.out.println( ("2. Cadastro de aluno, professor, disciplina ou turma") );
            System.out.println( ("3. Mudança cadastral nos dados de um aluno ou professor") );
            System.out.println( ("Digite a opção desejada: ") );
            int op = scanner.nextInt();
            scanner.nextLine();
            while(op < 0 || op > 3) {
                System.out.println( ("A opção deve estar 0 e 3. Digite novamente: ") );
                op = scanner.nextInt();
                scanner.nextLine();
            }
            return op;
        }
        public static int menuConsulta(Scanner scanner, Universidade uni) {
            int op;
            System.out.println( ("_*_*_*_*_*_*_*_*_*_*_* Menu de Consulta _*_*_*_*_*_*_*_*_*_*_*") );
            System.out.println( ("Opções disponíveis: ") );
            System.out.println( ("0. Sair") );
            System.out.println( ("1. Consultar um aluno") );
            System.out.println( ("2. Consultar um professor") );
            System.out.println( ("3. Consultar uma disciplina") );
            op = scanner.nextInt();
            scanner.nextLine();
            while(op < 0 || op > 3) {
                System.out.println( ("A opção deve estar 0 e 3. Digite novamente: ") );
                op = scanner.nextInt();
                scanner.nextLine();
            }
            return op;
        }

        public static int consultarAlunos(Scanner scanner, Universidade uni) {
            System.out.println( ("============ Consulta de alunos ============") );
            System.out.println( ("Opções: ") );
            System.out.println( ("0. Retornar ao menu de consulta") );
            System.out.println( ("1. Consultar todos os alunos da universidade") );
            System.out.println( ("2. Consultar todos os alunos de uma turma") );
            System.out.println( ("3. Consultar um aluno específico") );
            System.out.println("4. Disciplinas matriculadas de um aluno");
            int op;
            op = scanner.nextInt();
            scanner.nextLine();
            while(op < 0 || op > 4) {
                System.out.println( ("A opção deve estar 0 e 4. Digite novamente: ") );
                op = scanner.nextInt();
                scanner.nextLine();
            }
            return op;
        }

            public static int consultarProf(Scanner scanner, Universidade uni) {
            System.out.println( ("============ Consulta de professores ============") );
            System.out.println( ("Opções: ") );
            System.out.println( ("0. Retornar ao menu de consulta") );
            System.out.println( ("1. Consultar todos os professores da universidade") );
            System.out.println( ("2. Consultar todos os professores de uma disciplina") );
            System.out.println( ("3. Consultar um professor específico") );
            System.out.println("4. Consultar turmas lecionadas de um professor");
            int op;
            op = scanner.nextInt();
            scanner.nextLine();
            while(op < 0 || op > 4) {
                System.out.println( ("A opção deve estar 0 e 4. Digite novamente: ") );
                op = scanner.nextInt();
                scanner.nextLine();
            }
            return op;
        }

        public static int consultarDisc(Scanner scanner, Universidade uni) {
            System.out.println( ("============ Consulta de disciplinas ============") );
            System.out.println( ("Opções: ") );
            System.out.println( ("0. Retornar ao menu de consulta") );
            System.out.println( ("1. Consultar todas as disciplinas da universidade") );
            System.out.println( ("2. Consultar todas as turmas de uma disciplina") );
            int op;
            op = scanner.nextInt();
            scanner.nextLine();
            while(op < 0 || op > 2) {
                System.out.println( ("A opção deve estar 0 e 2. Digite novamente: ") );
                op = scanner.nextInt();
                scanner.nextLine();
            }
            return op;
        }

        public static int menuCadastro(Scanner scanner, Universidade uni) {
            int op;
            System.out.println( ("_*_*_*_*_*_*_*_*_*_*_* Menu de Cadastro _*_*_*_*_*_*_*_*_*_*_*") );
            System.out.println( ("Opções disponíveis: ") );
            System.out.println( ("0. Sair") );
            System.out.println( ("1. Cadastrar um aluno") );
            System.out.println( ("2. Cadastrar um professor") );
            System.out.println( ("3. Cadastrar uma disciplina") );
            System.out.println( ("4. Cadastrar uma turma") );
            op = scanner.nextInt();
            scanner.nextLine();
            while(op < 0 || op > 4) {
                System.out.println( ("A opção deve estar 0 e 4. Digite novamente: ") );
                op = scanner.nextInt();
                scanner.nextLine();
            }
            return op;
        }

        public static void cadastroAlunoGrad(Scanner scanner, Universidade uni) {
            System.out.println("Digite o nome: ");
            String nome = scanner.nextLine();
            System.out.println("Digite a data de nascimento: ");
            String data = scanner.nextLine();
            System.out.println("Digite o CPF: ");
            String cpf = scanner.nextLine();
            System.out.println("Digite o estágio do estudante: ");
            String est = scanner.nextLine();
            double cra;
            System.out.println("Digite o CRA do estudante: ");
            while(!scanner.hasNextDouble()) {
                System.out.println("Entrada inválida.");
                scanner.next();
            }
            cra = scanner.nextDouble();
            Estudante_Graduacao estud = new Estudante_Graduacao(nome, data, cpf, cra, est);
            while(!estud.isDataValida()) {
                System.out.println("Data inválida. Digite novamente no formato dd/mm/aaaa: ");
                data = scanner.nextLine();
                estud.mudaDataNasc(data);
            }
            while(!estud.isCPFValido()) {
                System.out.println(estud.getCPFErrorMessage() + "\nDigite novamente (xxx.xxx.xxx-xx):");
                cpf = scanner.nextLine();
                estud.mudaCPF(cpf);
            }
            while(!estud.isCRAValido()) {
                System.out.println(estud.getCRAErrorMessage() + "\nDigite o CRA novamente:");
                cra = scanner.nextDouble();
                scanner.nextLine();
            }
            System.out.println("Estudante de graduação " + estud.getNome() +  " cadastrado com sucesso!");
            System.out.println(estud.toString());
            uni.estudantes.add(estud);
        }


        public static void cadastroAlunoPosGrad(Scanner scanner, Universidade uni) {
            System.out.println("Digite o nome: ");
            String nome = scanner.nextLine();
            System.out.println("Digite a data de nascimento: ");
            String data = scanner.nextLine();
            System.out.println("Digite o CPF: ");
            String cpf = scanner.nextLine();
            System.out.println("Digite tema da pesquisa do estudante: ");
            String est = scanner.nextLine();
            System.out.println("Digite o CRA do estudante: ");
            double cra = scanner.nextDouble();
            scanner.nextLine();
            Estudante_PosGraduacao estud = new Estudante_PosGraduacao(nome, data, cpf, cra, est);
            while(!estud.isDataValida()) {
                System.out.println("Data inválida. Digite novamente no formato dd/mm/aaaa: ");
                data = scanner.nextLine();
                estud.mudaDataNasc(data);
            }
            while(!estud.isCPFValido()) {
                System.out.println(estud.getCPFErrorMessage() + "\nDigite novamente (xxx.xxx.xxx-xx):");
                cpf = scanner.nextLine();
                estud.mudaCPF(cpf);
            }
            while(!estud.isCRAValido()) {
                System.out.println(estud.getCRAErrorMessage() + "\nDigite o CRA novamente:");
                cra = scanner.nextDouble();
                scanner.nextLine();
            }
            System.out.println("Estudante de pós-graduação " + estud.getNome() +  " cadastrado com sucesso!");
            System.out.println(estud.toString());
            uni.estudantes.add(estud);
        }

        public static void cadastroProfessor(Scanner scanner, Universidade uni) {
            System.out.println("Digite o nome: ");
            String nome = scanner.nextLine();
            System.out.println("Digite a data de nascimento: ");
            String data = scanner.nextLine();
            System.out.println("Digite o CPF: ");
            String cpf = scanner.nextLine();
            System.out.println("Digite o inicio do contrato: ");
            String inicio = scanner.nextLine();
            System.out.println("Digite o departamento do professor: ");
            String dep = scanner.nextLine();
            Professor prof = new Professor(nome, data, cpf, dep, inicio, uni);
            while(!prof.isDataValida()) {
                System.out.println("Data inválida. Digite novamente no formato dd/mm/aaaa: ");
                data = scanner.nextLine();
                prof.mudaDataNasc(data);
            }
            while(!prof.isCPFValido()) {
                System.out.println(prof.getCPFErrorMessage() + "\nDigite novamente (xxx.xxx.xxx-xx):");
                cpf = scanner.nextLine();
                prof.mudaCPF(cpf);
            }
            while(!prof.isInicioContratoValido()) {
                System.out.println(prof.getInicioContratoErrorMessage() + "\nDigite novamente no formato dd/mm/aaaa:");
                inicio = scanner.nextLine();
                prof.mudaCPF(inicio);
            }
            System.out.println("Professor " + prof.getNome() +  " cadastrado com sucesso!");
            System.out.println(prof.toString());
            uni.professores.add(prof);
        }

        public static void cadastroDisciplina(Scanner scanner, Universidade uni) {
            System.out.println("Digite o nome da disciplina: ");
            String nome = scanner.nextLine();
            System.out.println("Código da disciplina: ");
            String cod = scanner.nextLine();
            System.out.println("Carga horária da disciplina: ");
            String carga = scanner.nextLine();
            Disciplinas disc = new Disciplinas(nome, cod, carga);
            System.out.println("Disciplina " + disc.getNome() + " - " + disc.getCodigo() + " criada com sucesso!");
            uni.disciplinas.add(disc);
        }

        public static void cadastroTurma(Scanner scanner, Universidade uni, Disciplinas disc, Professor tit, ArrayList<Estudante> aluns) {
            System.out.println("Digite o semestre da turma: ");
            int sem = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Ano da turma: ");
            int ano = scanner.nextInt();
            scanner.nextLine();
            Turma tur = new Turma();
            while(!tur.isAnoValido(ano)) {
                System.out.println(tur.getAnoErrorMessage() + "\nDigite o ano novamente: ");
                ano = scanner.nextInt();
                scanner.nextLine();
            }
            Turma turm = new Turma(sem, ano, tit, aluns);
            Universidade.esperarTecla(scanner);
            while(!turm.isSemestreValido()) {
                System.out.println(turm.getSemestreErrorMessage() + "\nDigite o semestre novamente: ");
                sem = scanner.nextInt();
                scanner.nextLine();
                turm.mudaSem(sem);
            }
            Universidade.esperarTecla(scanner);
            disc.setTurma(turm);
            System.out.println("Turma da disciplina " + disc.getNome() + " criada com sucesso!");
            Universidade.esperarTecla(scanner);
        }

        public static int[] displayEstudantes(Scanner scanner, Universidade uni, int quant) {
            System.out.println("~~~~~~~~~~~~~~~~~~~~~ Estudantes disponíveis ~~~~~~~~~~~~~~~~~~~~~");
            for(int i = 0; i < uni.estudantes.size(); i++) {
                System.out.println("CÓDIGO DO ESTUDANTE " + uni.estudantes.get(uni.estudantes.indexOf(uni.estudantes.get(i))).getNome() + ": " + uni.estudantes.indexOf(uni.estudantes.get(i)));
            }
            int[] a = new int[quant];
            for(int i = 0; i < quant; i++) {
                System.out.println("Digite o código do estudante " + i+1 + ":");
                a[i] = scanner.nextInt();
                scanner.nextLine();
            }
            return a;
        }

        public static Professor displayProfessores(Scanner scanner, Universidade uni) {
            System.out.println("~~~~~~~~~~~~~~~~~~~~~ Professores disponíveis ~~~~~~~~~~~~~~~~~~~~~");
            for(int i = 0; i < uni.professores.size(); i++) {
                System.out.println("CÓDIGO DO PROFESSOR: " + uni.professores.get(uni.professores.indexOf(uni.professores.get(i))).getNome() + ": " + uni.professores.indexOf(uni.professores.get(i)));
            }
            System.out.println("Digite o código do professor desejado: ");
            int ind = scanner.nextInt();
            scanner.nextLine();
            return uni.professores.get(ind);
        }

         public static Disciplinas displayDisc(Scanner scanner, Universidade uni) {
            System.out.println("~~~~~~~~~~~~~~~~~~~~~ Disciplinas disponíveis ~~~~~~~~~~~~~~~~~~~~~");
            for(int i = 0; i < uni.disciplinas.size(); i++) {
                System.out.println("CÓDIGO DA DISCIPLINA: " + uni.disciplinas.get(uni.disciplinas.indexOf(uni.disciplinas.get(i))).getNome() + ": " + uni.disciplinas.indexOf(uni.disciplinas.get(i)));
            }
            System.out.println("Digite o código da disciplina desejada: ");
            int ind = scanner.nextInt();
            scanner.nextLine();
            return uni.disciplinas.get(ind);
        }

        public static Estudante displayEstudantes(Scanner scanner, Universidade uni) {
            System.out.println("~~~~~~~~~~~~~~~~~~~~~ Estudantes disponíveis ~~~~~~~~~~~~~~~~~~~~~");
            for(int i = 0; i < uni.estudantes.size(); i++) {
                System.out.println("CÓDIGO DO ESTUDANTE " + uni.estudantes.get(uni.estudantes.indexOf(uni.estudantes.get(i))).getNome() + ": " + uni.estudantes.indexOf(uni.estudantes.get(i)));
            }
            System.out.println("Digite o código do estudante desejado: ");
            int ind = scanner.nextInt();
            scanner.nextLine();
            return uni.estudantes.get(ind);
        }

        public static int menuMudanca(Scanner scanner, Universidade uni) {
            int op;
            System.out.println( ("_*_*_*_*_*_*_*_*_*_*_* Mudança Cadastral _*_*_*_*_*_*_*_*_*_*_*") );
            System.out.println( ("Opções disponíveis: ") );
            System.out.println( ("0. Salvar e Sair") );
            System.out.println( ("1. Mudar informações de um aluno") );
            System.out.println( ("2. Mudar informações de um professor") );
            op = scanner.nextInt();
            scanner.nextLine();
            while(op < 0 || op > 2) {
                System.out.println( ("A opção deve estar 0 e 2. Digite novamente: ") );
                op = scanner.nextInt();
                scanner.nextLine();
            }
            return op;
        }

        public static boolean mudaAluno(Scanner scanner, Universidade uni, Estudante est) {
            System.out.println("Alterações disponíveis: \n0.Retornar \n1. Nome \n2. Data de nascimento \n3. CPF \n4. CRA");
            if(est instanceof Estudante_Graduacao) {
                System.out.print("\n5. Estágio");
            } else {
                System.out.print("\n5. Pesquisa");
            }
            System.out.println("\n6. Matricular em turma \n7. Desmatricular de turma");
            System.out.println("Digite o código da alteração que deseja realizar: ");
            int op = scanner.nextInt();
            scanner.nextLine();
            while(op < 0 || op > 7) {
                System.out.println( ("A opção deve estar 0 e 7. Digite novamente: ") );
                op = scanner.nextInt();
                scanner.nextLine();
            }
            switch(op) {
                default:
                    return false;
                case 0:
                    System.out.println("Retornando...");
                    return false;
                case 1:
                    System.out.println("Nome atual: " + est.getNome());
                    System.out.println("Digite o novo nome: ");
                    String nom = scanner.nextLine();
                    return est.mudaNome(nom);
                case 2:
                    System.out.println("Data de nascimento atual: " + est.getDataNasc());
                    System.out.println("Digite a nova data de nascimento: ");
                    String dat = scanner.nextLine();
                    while(!est.isDataValida(dat)) {
                        System.out.println("Data inválida. Digite novamente no formato dd/mm/aaaa: ");
                        dat = scanner.nextLine();
                    }
                    return est.mudaDataNasc(dat);
                case 3:
                    System.out.println("CPF atual: " + est.getCPF());
                    System.out.println("Digite o novo CPF: ");
                    String cpf = scanner.nextLine();
                    while(!est.isCPFValido(cpf)) {
                        System.out.println(est.getCPFErrorMessage() + "\nDigite novamente (xxx.xxx.xxx-xx):");
                        cpf = scanner.nextLine();
                    }
                    return est.mudaCPF(cpf);
                case 4:
                    System.out.println("CRA atual: " + est.getCRA());
                    System.out.println("Digite o novo CRA: ");
                    double cra = scanner.nextDouble();
                    scanner.nextLine();
                    while(!est.isCRAValido(cra)) {
                        System.out.println(est.getCRAErrorMessage() + "\nDigite novamente o CRA: ");
                        cra = scanner.nextDouble();
                        scanner.nextLine();
                    }
                    return est.mudaCRA(cra);
                case 5:
                    if(est instanceof Estudante_Graduacao) {
                        System.out.println("Estágio atual: " + (((Estudante_Graduacao)est).getEstagio()));
                        System.out.println("Digite o novo estágio: ");
                        String estagio = scanner.nextLine();
                        return ((Estudante_Graduacao)est).mudaEstagio(estagio);
                    } else {
                        System.out.println("Pesquisa atual: " + (((Estudante_PosGraduacao)est).getTemaPesquisa()));
                        System.out.println("Digite a nova pesquisa: ");
                        String pesq = scanner.nextLine();
                        return ((Estudante_PosGraduacao)est).mudaPesquisa(pesq);
                    }
                case 7:
                    System.out.println("Turmas em que o estudante está matriculado: ");
                    if(est.getTurmasMatriculadas().isEmpty()) {
                        System.out.println("Esse estudante ainda não está em nenhuma turma.");
                        return false;
                    } else {
                        for(int i = 0; i < est.getTurmasMatriculadas().size(); i++) {
                            System.out.println("CÓDIGO DA TURMA " + est.getTurmasMatriculadas().get(i).getVinculada().getNome() + " - " + est.getTurmasMatriculadas().get(i).getAno() + "." + est.getTurmasMatriculadas().get(i).getSemestre() +  ": " + i);
                    }
                    }
                    System.out.println("Digite o código da turma para se desmatricular: ");
                    int ind = scanner.nextInt();
                    scanner.nextLine();
                    return est.desmatriculaEstudanteEmTurma(est.getTurmasMatriculadas().get(ind));
                case 6:
                    System.out.println("Turmas em que o estudante está matriculado: ");
                    if(est.getTurmasMatriculadas().isEmpty()) {
                        System.out.println("Esse estudante ainda não está em nenhuma turma.");
                    } else {
                        for(int i = 0; i < est.getTurmasMatriculadas().size(); i++) {
                            System.out.println("CÓDIGO DA TURMA " + est.getTurmasMatriculadas().get(i).getVinculada().getNome() + " - " + est.getTurmasMatriculadas().get(i).getAno() + "." + est.getTurmasMatriculadas().get(i).getSemestre() +  ": " + i);
                        }
                    }
                    Disciplinas dis = Universidade.displayDisc(scanner, uni);
                    System.out.println("Turmas dessa disciplina: ");
                    if(dis.getTurmas().isEmpty()) {
                        System.out.println("Não há nenhuma turma nessa disciplina ainda.");
                        return false;
                    } else {
                        for(int i = 0; i < dis.getTurmas().size(); i++) {
                            System.out.println("CÓDIGO DA TURMA " + dis.getTurmas().get(i).getVinculada().getNome() + " - " + dis.getTurmas().get(i).getAno() + "." + dis.getTurmas().get(i).getSemestre() +  ": " + i);
                    }
                    }
                    System.out.println("Digite o código da turma para se matricular: ");
                    int ip = scanner.nextInt();
                    scanner.nextLine();
                    return est.matriculaEstudanteEmUmaDisciplina(dis.getTurmas().get(ip));

            }        
        }

        public static boolean mudaProfessor(Scanner scanner, Universidade uni, Professor prof) {
            System.out.println("Alterações disponíveis: \n0.Retornar \n1. Nome \n2. Data de nascimento \n3. CPF \n4. Departamento\n5. Cadastrar professor como titular em turma\n6. Desvincular professor de turma");
            System.out.println("Digite o código da alteração que deseja realizar: ");
            int op = scanner.nextInt();
            scanner.nextLine();
            while(op < 0 || op > 6) {
                System.out.println( ("A opção deve estar 0 e 6. Digite novamente: ") );
                op = scanner.nextInt();
                scanner.nextLine();
            }
            switch(op) {
                default:
                    return false;
                case 0:
                    System.out.println("Retornando...");
                    return false;
                case 1:
                    System.out.println("Nome atual: " + prof.getNome());
                    System.out.println("Digite o novo nome: ");
                    String nom = scanner.nextLine();
                    return prof.mudaNome(nom);
                case 2:
                    System.out.println("Data de nascimento atual: " + prof.getDataNasc());
                    System.out.println("Digite a nova data de nascimento: ");
                    String dat = scanner.nextLine();
                    while(!prof.isDataValida(dat)) {
                        System.out.println("Data inválida. Digite novamente no formato dd/mm/aaaa: ");
                        dat = scanner.nextLine();
                    }
                    return prof.mudaDataNasc(dat);
                case 3:
                    System.out.println("CPF atual: " + prof.getCPF());
                    System.out.println("Digite o novo CPF: ");
                    String cpf = scanner.nextLine();
                    while(!prof.isCPFValido(cpf)) {
                        System.out.println(prof.getCPFErrorMessage() + "\nDigite novamente (xxx.xxx.xxx-xx):");
                        cpf = scanner.nextLine();
                    }
                    return prof.mudaCPF(cpf);
                case 4:
                    System.out.println("Departamento atual: " + prof.getDepartamento());
                    System.out.println("Digite o novo departamento: ");
                    String dep = scanner.nextLine();
                    return prof.mudaDepartamento(dep);
                case 5:
                    System.out.println("Docência atual na(s) turma(s): ");
                    if(prof.getMinistradas().isEmpty()) {
                        System.out.println("Esse professor ainda não leciona em nenhuma turma.");
                    } else {
                        for(int i = 0; i < prof.getMinistradas().size(); i++) {
                        System.out.println("CÓDIGO DA TURMA " + prof.getMinistradas().get(i).getVinculada().getNome() + " - " + prof.getMinistradas().get(i).getAno() + "." + prof.getMinistradas().get(i).getAno() +  ": " + i);
                    }
                    }
                    Disciplinas dis = Universidade.displayDisc(scanner, uni);
                    System.out.println("Turmas dessa disciplina: ");
                    if(dis.getTurmas().isEmpty()) {
                        System.out.println("Ainda não há turmas dessa disciplina.");
                        return false;
                    } else {
                        for(int i = 0; i < dis.getTurmas().size(); i++) {
                        System.out.println("CÓDIGO DA TURMA " + dis.getTurmas().get(i).getVinculada().getNome() + " - " + dis.getTurmas().get(i).getAno() + "." + dis.getTurmas().get(i).getSemestre() +  ": " + i);
                    }
                    }
                    System.out.println("Digite o código da turma para se matricular: ");
                    int ind = scanner.nextInt();
                    scanner.nextLine();
                    return dis.getTurmas().get(ind).setProfTitular(prof);
                case 6:
                    System.out.println("Docência atual na(s) turma(s): ");
                    if(prof.getMinistradas().isEmpty()) {
                        System.out.println("Esse professor ainda não leciona em nenhuma turma.");
                        return false;
                    } else {
                        for(int i = 0; i < prof.getMinistradas().size(); i++) {
                            System.out.println("CÓDIGO DA TURMA " + prof.getMinistradas().get(i).getVinculada().getNome() + " - " + prof.getMinistradas().get(i).getAno() + "." + prof.getMinistradas().get(i).getAno() +  ": " + i);
                        }
                    }
                    System.out.println("Digite o código da turma para se desmatricular: ");
                    int in = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Qual professor ocupará o lugar do substituído?:");
                    Professor profnovo = Universidade.displayProfessores(scanner, uni);
                    return prof.getMinistradas().get(in).setProfTitular(profnovo);
            }
        }


    public static void main(String args[]) {
        Universidade ufu = Persist.lerUniversidadeArquivo("baseDedados");
        Scanner sc = new Scanner(System.in);
        int controle;
        int op;
        int op1;
        do {
            Universidade.clearConsole();
            op1 = Universidade.inicio(sc, ufu);
            switch(op1) {
                default:
                    break;
                case 0:
                    Persist.escreverUniversidade("baseDedados", ufu);
                    System.out.println( ("Saindo...") );
                    break;
                case 1:
                    do {
                        op = menuConsulta(sc, ufu);
                        switch (op) {
                            default:
                                break;
                            case 0:
                                System.out.println( ("Saindo da consulta...") );
                                break;
                            case 1:
                                do {
                                    controle = Universidade.consultarAlunos(sc, ufu);
                                    switch(controle) {
                                        case 0:
                                        System.out.println( ("Retornando...") );
                                        break;
                                        case 1:
                                        System.out.println( ("---------------------------- Todos os alunos da universidade " + ufu.getNome() + " ----------------------------") );
                                        System.out.println("===================== Discentes =====================");
                                        for (Estudante estudante: ufu.getEstudantes()){
                                            System.out.println(estudante.toString());
                                        }
                                        break;
                                        case 2:
                                            Disciplinas d = displayDisc(sc, ufu);
                                            if(d.getTurmas().isEmpty()) {
                                                System.out.println("Ainda não há turmas dessa disciplina.");
                                            } else {
                                                for(int i = 0; i < d.getTurmas().size(); i++) {
                                                    System.out.println("===================== Alunos da turma " + d.getCodigo() + " - " + d.getTurmas().get(i).getAno() + "." + d.getTurmas().get(i).getSemestre() + " =====================");
                                                    d.getTurmas().get(i).alunosDaTurma();
                                                }
                                            }
                                        break;
                                        case 3:
                                        Estudante estud = displayEstudantes(sc, ufu);
                                        System.out.println( ("---------------------------- Aluno  ----------------------------") );
                                        System.out.println(estud.toString());
                                            break;
                                        case 4:
                                            Estudante es = displayEstudantes(sc, ufu);
                                            if(es.getTurmasMatriculadas().isEmpty()) {
                                                System.out.println("Esse estudante ainda não está matriculado em nenhuma turma.");
                                            } else {
                                                for(int i = 0; i < es.getTurmasMatriculadas().size(); i++) {
                                                    System.out.println(es.getTurmasMatriculadas().get(i).getVinculada().getNome() + " - " + es.getTurmasMatriculadas().get(i).getVinculada().getCodigo() + " " + es.getTurmasMatriculadas().get(i).getAno() + "." + es.getTurmasMatriculadas().get(i).getSemestre());
                                                }
                                            }
                                            break;
                                    }
                                }while(controle != 0);
                                break;
                            case 2:
                                do {
                                    controle = Universidade.consultarProf(sc, ufu);
                                    switch(controle) {
                                        case 0:
                                            System.out.println( ("Retornando...") );
                                            break;
                                        case 1:
                                            System.out.println( ("---------------------------- Todos os professores da universidade " + ufu.getNome() + " ----------------------------") );
                                            for(Professor pro: ufu.getProfessores())
                                                System.out.println(pro.toString());
                                            break;
                                        case 2:
                                            Disciplinas dis = displayDisc(sc, ufu);
                                            System.out.println( ("---------------------------- Professores da disciplina " + dis.getNome() + " ----------------------------") );
                                            if(dis.getTurmas().isEmpty()) {
                                                System.out.println("Ainda não há turmas dessa disciplina.");
                                            } else {
                                                for(Turma tur: dis.getTurmas()){
                                                    System.out.println(tur.getProfTitular().toString());
                                                }
                                            }
                                            break;
                                        case 3:
                                            Professor proff = displayProfessores(sc, ufu);
                                            System.out.println( ("---------------------------- Professor " + proff.getNome() + " ----------------------------") );
                                            System.out.println(proff.toString());
                                            break;
                                        case 4:
                                            Professor profprof = displayProfessores(sc, ufu);
                                            if(profprof.getMinistradas().isEmpty()) {
                                                System.out.println("Esse professor ainda não leciona nenhuma turma.");
                                            } else {
                                                for(int i = 0; i < profprof.getMinistradas().size(); i++) {
                                                    System.out.println(profprof.getMinistradas().get(i).getVinculada().getNome() + " - " + profprof.getMinistradas().get(i).getVinculada().getCodigo() + " " + profprof.getMinistradas().get(i).getAno() + "." + profprof.getMinistradas().get(i).getSemestre());
                                                }
                                            }
                                            break;
                                    }
                                }while(controle != 0);
                                break;
                            case 3:
                                do {
                                    controle = Universidade.consultarDisc(sc, ufu);
                                    switch(controle) {
                                        case 0:
                                            System.out.println( ("Retornando...") );
                                            break;
                                        case 1:
                                            System.out.println(("---------------------------- Todas as disciplinas da universidade " + ufu.getNome() + " ----------------------------") );
                                            for(Disciplinas d : ufu.disciplinas) {
                                                System.out.println(d.toString());
                                            }
                                            break;
                                        case 2:
                                            Disciplinas disc = displayDisc(sc, ufu);
                                            System.out.println( ("---------------------------- Turmas da disciplina " + disc.getNome() + " ----------------------------") );
                                            if(disc.getTurmas().isEmpty()) {
                                                System.out.println("Ainda não há turmas dessa disciplina.");
                                            } else {
                                                for(Turma t : disc.getTurmas()) {
                                                    System.out.println(t.toString());
                                                }
                                            }
                                            break;
                                    }
                                }while(controle != 0);
                                break;
                        }
                        Universidade.esperarTecla(sc);
                    } while(op != 0);
                    break;
                case 2:
                    do {
                        op = Universidade.menuCadastro(sc, ufu);
                        switch (op) {
                            case 0:
                            System.out.println(("Saindo do menu de cadastro..."));
                            break;
                            case 1:
                            System.out.println("Será de graduação ou pós-graduação? Digite 1 para graduação ou 2 para pós-graduação: ");
                            int a = sc.nextInt();
                            sc.nextLine();
                            while(op < 1 || op > 2) {
                                System.out.println( ("A opção deve estar 1 e 2. Digite novamente: ") );
                                a = sc.nextInt();
                                sc.nextLine();
                            }
                            switch(a) {
                                case 1:
                                Universidade.cadastroAlunoGrad(sc, ufu);
                                Universidade.esperarTecla(sc);
                                break;
                                case 2:
                                Universidade.cadastroAlunoPosGrad(sc, ufu);
                                Universidade.esperarTecla(sc);
                                break;
                            }
                            break;
                            case 2:
                            Universidade.cadastroProfessor(sc, ufu);
                            Universidade.esperarTecla(sc);
                            break;
                            case 3:
                            Universidade.cadastroDisciplina(sc, ufu);
                            Universidade.esperarTecla(sc);
                            break;
                            case 4:
                            System.out.println("De qual disciplina será essa turma?: ");
                            Disciplinas dis = Universidade.displayDisc(sc, ufu);
                            System.out.println("Quantos estudantes deseja cadastrar na turma?: ");
                            int quant = sc.nextInt();
                            sc.nextLine();
                            int[] arrayCodigos = Universidade.displayEstudantes(sc, ufu, quant);
                            ArrayList<Estudante> alunosDisc = new ArrayList<Estudante>();
                            for(int i = 0; i < arrayCodigos.length; i++) {
                                alunosDisc.add(ufu.estudantes.get(arrayCodigos[i]));
                            }
                            System.out.println("Qual professor deseja cadastrar como professor titular dessa turma?");
                            Professor tit = displayProfessores(sc, ufu);
                            Universidade.cadastroTurma(sc, ufu, dis, tit, alunosDisc);
                            break;
                        }
                        break;
                    } while(op != 0);
                    break;
                case 3:
                    do {
                        op = Universidade.menuMudanca(sc, ufu);
                        switch (op) {
                            case 0:
                                System.out.println( ("Saindo do menu de mudanças cadastrais...") );
                                break;
                            case 1:
                                System.out.println("Qual estudante deseja realizar alterações cadastrais?: ");
                                Estudante est = Universidade.displayEstudantes(sc, ufu);
                                if(Universidade.mudaAluno(sc, ufu, est)) {
                                    System.out.println("Alteração realizada com sucesso!");
                                } else {
                                    System.out.println("Alteração não realizada. Tente novamente.");
                                }
                                Universidade.esperarTecla(sc);
                                break;
                            case 2:
                                System.out.println("Qual professor deseja realizar alterações cadastrais?: ");
                                Professor prof = Universidade.displayProfessores(sc, ufu);
                                if(Universidade.mudaProfessor(sc, ufu, prof)) {
                                    System.out.println("Alteração realizada com sucesso!");
                                } else {
                                    System.out.println("Alteração não realizada. Tente novamente.");
                                }
                                Universidade.esperarTecla(sc);
                                break;
                    }
                        Universidade.esperarTecla(sc);
                        break;
                    }while(op != 0);
            }

        } while(op1 != 0);
        sc.close();
    }
}