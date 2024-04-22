public class Cliente extends Pessoa{
    
    private String telefone;
    private String email;
    
    public Cliente() {
    }
    public Cliente(String nome, String cpf, String telefone, String email) {
        super(nome, cpf);
        this.telefone = telefone;
        this.email = email;
    }
    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    

}
