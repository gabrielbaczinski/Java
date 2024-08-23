package Pratica_Encapsulamento;
import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean loop = true;
        Banco banco = new Banco();
        Usuario usuario = new Usuario();

        while (loop) {
            String menu = """
                    ┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓
                    │         Bem-vindo, Usuário!          │
                    ┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛
                    │ 1 - Cadastro                         │
                    │ 2 - Sacar                            │
                    │ 3 - Depositar                        │
                    │ 4 - Verificar Saldo                  │
                    │ 5 - Alterar info pessoais            │
                    │ 6 - Acessar dados                    │
                    │ 7 - Sair                             │
                    ┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛""";
            System.out.println(menu);
            System.out.print("O que deseja fazer? ");
            int escolha_menu = sc.nextInt();

            switch (escolha_menu) {
                case 1:
                    usuario.setNome();
                    usuario.setCpf();
                    usuario.setTelefone();
                    usuario.setRenda();
                    break;

                case 2:
                    banco.sacar();
                    break;

                case 3:
                    banco.depositar();
                    break;

                case 4:
                    banco.getSaldo();
                    break;

                case 5:
                    boolean loopInfo = true;
                    while (loopInfo) {
                        String menuInfo = """
                                ┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓
                                │        Atualização Cadastral          │
                                ┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛
                                │ 1 - Telefone                          │
                                │ 2 - Renda                             │
                                │ 3 - Voltar                            │
                                ┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛""";
                        System.out.println(menuInfo);
                        System.out.print("O que deseja fazer? ");
                        int escolha_info = sc.nextInt();
                        switch (escolha_info) {
                            case 1:
                                usuario.setTelefone();
                                break;
                            case 2:
                                usuario.setRenda();
                                break;
                            case 3:
                                System.out.println("Voltando...");
                                loopInfo = false;
                                break;
                            default:
                                System.out.println("Opção inválida. Tente novamente.");
                                break;
                        }
                    }

                case 6:
                    LocalDateTime agora = LocalDateTime.now();
                    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
                    String dataHoraFormatada = agora.format(formatter);


                    System.out.println("EXTRATO - " + dataHoraFormatada);
                    usuario.getNome();
                    usuario.getCpf();
                    usuario.getTelefone();
                    usuario.getRenda();
                    banco.getSaldo();
                    System.out.println();
                    break;

                case 7:
                    System.out.println("Obrigado por utilizar o programa!");
                    loop = false;
                    break;
            }
        }
    }
}