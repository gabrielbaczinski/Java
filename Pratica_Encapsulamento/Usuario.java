package Pratica_Encapsulamento;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Usuario {
    Scanner sc = new Scanner(System.in);

    private String nome;
    private String telefone;
    private String cpf;
    private float renda;
    private boolean verificao;


    public Usuario() {
        nome = "";
        telefone = null;
        cpf = null;
        renda = 0;
    }

    public void setNome() {
        System.out.println("Informe seu nome completo: ");
        String input = sc.nextLine();
        nome = input.toUpperCase();
    }

    public void setTelefone() {
        verificao = true;
        while (verificao) {
            System.out.print("Informe seu telefone: ");
            String input = sc.nextLine();
            if (isTelefoneValid(input)) {
                telefone = formatarTelefone(input);
                verificao = false;
            } else {
                System.out.println("Telefone inválido. Por favor, insira um telefone válido.");
            }
        }
    }

    private boolean isTelefoneValid(String telefone) {
        telefone = telefone.replaceAll("\\D", "");
        String telefoneRegex = "^\\d{11}$";
        Pattern pattern = Pattern.compile(telefoneRegex);
        Matcher matcher = pattern.matcher(telefone);
        return matcher.matches();
    }

    private String formatarTelefone(String telefone) {
        telefone = telefone.replaceAll("\\D", "");

        if (telefone.length() != 11) {
            return telefone;
        }
        return "(" + telefone.substring(0, 2) + ") " +
                telefone.substring(2, 7) + "-" +
                telefone.substring(7);
    }

    public void setCpf() {
        verificao = true;
        while (verificao) {
            System.out.print("Informe seu CPF: ");
            String input = sc.nextLine();
            if (isCpfValid(input)) {
                cpf = formatarCpf(input);
                verificao = false;
            } else {
                System.out.println("CPF inválido. Por favor, insira um CPF válido.");
            }
        }
    }

    private boolean isCpfValid(String cpf) {
        cpf = cpf.replaceAll("\\D", "");
        String cpfRegex = "^\\d{11}$";
        Pattern pattern = Pattern.compile(cpfRegex);
        Matcher matcher = pattern.matcher(cpf);
        return matcher.matches();
    }


    private String formatarCpf(String cpf) {
        cpf = cpf.replaceAll("\\D", "");

        if (cpf.length() != 11) {
            return cpf;
        }

        return cpf.substring(0, 3) + "." +
                cpf.substring(3, 6) + "." +
                cpf.substring(6, 9) + "-" +
                cpf.substring(9);
    }

    public void setRenda() {
        System.out.print("Informe sua renda R$: ");
        renda = sc.nextFloat();
    }

    public String getNome() {
        System.out.println("Nome: " + nome);
        return nome;
    }

    public String getTelefone() {
        System.out.println("Telefone: " + telefone);
        return telefone;
    }

    public String getCpf() {
        System.out.println("CPF: " + cpf);
        return cpf;
    }

    public float getRenda() {
        System.out.println("Renda: R$ " + renda);
        return renda;
    }

    public static void mostrarExtrato(int caseNumber) {
        LocalDateTime agora = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
    }
}
