public class Corretor extends Pessoa{
    
    private int matricula;
    private String unidade;
    
    public Corretor() {
    }
    public Corretor(String nome, String cpf, int matricula, String unidade) {
        super(nome, cpf);
        this.matricula = matricula;
        this.unidade = unidade;
    }
    public int getMatricula() {
        return matricula;
    }
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    public String getUnidade() {
        return unidade;
    }
    public void setUnidade(String unidade) {
        this.unidade = unidade;
    }

    
}
