public class Pessoa {
    
    private String nome;
    private String cpf;

// Construtores

    public Pessoa(){
    }
    
    public Pessoa(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

// Gets n Setters

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    @Override
    public String toString() {
        return "\nNome: " + getNome() +
        "\nCpf: " + getCpf();
    }

    
}
