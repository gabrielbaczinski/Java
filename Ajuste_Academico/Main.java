package Ajuste_Academico;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean loop = true;
        boolean loop_disc = true;

        while (loop) {
            String menu = """
                    ┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓
                    │       Bem-vindo, Secretária!         │
                    ┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛
                    │ 1 - Matricular aluno                 │
                    │ 2 - Trancar matéria                  │
                    │ 3 - Lista aluno p/Disciplina         │
                    │ 4 - Pesquisar disciplina             │
                    │ 5 - Pesquisar aluno                  │
                    │ 6 - Alterar dados cadastrais         │
                    │ 7 - Sair                             │
                    ┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛""";
            System.out.println(menu);
            System.out.print("O que deseja fazer? ");
            int escolha_menu = sc.nextInt();

            switch (escolha_menu) {
                case 1:
                    Aluno a = new Aluno();
                    while (loop_disc) {
                        String menu_disc = """
                                ┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓
                                │       Selecione a disciplina         │
                                ┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛
                                │ 1 - Programação Orientada a Objetos  │
                                │ 2 - Estrutura de Dados               │
                                │ 3 - XP Criativa                      │
                                │ 4 - Web Development                  │
                                │ 5 - Banco de dadaos                  │
                                │ 6 - Voltar                           │
                                ┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛""";
                        System.out.println(menu_disc);
                        System.out.print("Selecione uma disciplina para a matrícula: ");
                        int escolha_disc = sc.nextInt();
                        sc.nextLine();

                        if (escolha_disc == 1) {
                            Disciplina poo = new Disciplina("POO", "Noite", 6, "Bloco 5", new Professor("Marina", 3200));
                            System.out.print("Digite o nome do Aluno: ");
                            String nome = sc.nextLine();
                            a.setAluno(nome);
                            System.out.print("Digite a matrícula do Aluno: ");
                            int matricula = sc.nextInt();
                            a.setMatricula(matricula);
                            sc.nextLine();
                            poo.adicionarAluno(a);
                            System.out.println(poo.printAlunos());
                        }
                        break;
                    }
                case 2:
                    break;

                case 3:
                    break;

                case 4:
                    break;

                case 5:
                    System.out.println("Obrigado por utilizar o programa!");
                    loop = false;
                    break;
            }
        }
    }
}