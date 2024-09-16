package Spotify;

public class Usuario {
    private String nome;
    private String email;
    private String senha;
    private String dataNascimento;
    private String genero;

    public Usuario(String nome, String email, String senha, String dataNascimento, String genero) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.dataNascimento = dataNascimento;
        this.genero = genero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public String getGenero() {
        if (genero.equals("1")) {
            return "Masculino";
        } else if (genero.equals("2")) {
            return "Feminino";
        } else {
            return "Outro";
        }
    }

}

