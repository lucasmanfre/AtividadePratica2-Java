public class Apartamento extends ImovelConstruido{
    
    private int andar;
    
    public Apartamento(){
    }
   
    public Apartamento(String endereco, float preco, float m2, String tipoNegocio,
            int quarto, int banheiro, int vaga, float condominio, int pisos, String padrao, String resiComer,
            int andar) {
        super(endereco, preco, m2, tipoNegocio, quarto, banheiro, vaga, condominio, pisos, padrao,
                resiComer);
        setTipoImovel("APARTAMENTO");
        this.andar = andar;
    }

    public int getAndar() {
        return andar;
    }
    public void setAndar(int andar) {
        this.andar = andar;
    }
    
    @Override
    public String toString() {
        return super.toString() + 
        "\nANDAR: " + andar;
    }

}
