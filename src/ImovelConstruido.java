public class ImovelConstruido extends Imovel {

    private int quarto;
    private int banheiro;
    private int vaga;
    private float condominio;
    private int pisos;
    private String padrao;
    private String resiComer;

    // Construtores

    public ImovelConstruido() {
    }

    public ImovelConstruido(String endereco, float preco, float m2, String tipoNegocio, int quarto,
            int banheiro, int vaga, float condominio, int pisos, String padrao, String resiComer) {
        super(endereco, preco, m2, tipoNegocio);
        this.quarto = quarto;
        this.banheiro = banheiro;
        this.vaga = vaga;
        this.condominio = condominio;
        this.pisos = pisos;
        this.padrao = padrao;
        this.resiComer = resiComer;
    }

    // Gets n Setters

    public int getQuarto() {
        return quarto;
    }

    public void setQuarto(int quarto) {
        this.quarto = quarto;
    }

    public int getBanheiro() {
        return banheiro;
    }

    public void setBanheiro(int banheiro) {
        this.banheiro = banheiro;
    }

    public int getVaga() {
        return vaga;
    }

    public void setVaga(int vaga) {
        this.vaga = vaga;
    }

    public float getCondominio() {
        return condominio;
    }

    public void setCondominio(float condominio) {
        this.condominio = condominio;
    }

    public int getPisos() {
        return pisos;
    }

    public void setPisos(int pisos) {
        this.pisos = pisos;
    }

    public String getPadrao() {
        return padrao;
    }

    public void setPadrao(String padrao) {
        this.padrao = padrao;
    }

    public String getResiComer() {
        return resiComer;
    }

    public void setResiComer(String resiComer) {
        this.resiComer = resiComer;
    }

    // toString

    @Override
    public String toString() {
        return super.toString() +
                "\nQUARTO(S): " + quarto +
                "\nBANHEIRO(S): " + banheiro +
                "\nVAGA(S): " + vaga +
                "\nVALOR CONDOMÍNIO: " + condominio +
                "\nANDARES: " + pisos +
                "\n" + padrao + " padrão" +
                "\nTIPO DO IMÓVEL: " + resiComer;
    }
}
