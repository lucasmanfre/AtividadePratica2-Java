public class Casa extends ImovelConstruido{
    
    private boolean quintal;
    private boolean piscina;

// Construtores

    public Casa(){
    }
    
    public Casa(String endereco, float preco, float m2, String tipoNegocio, int quarto,
            int banheiro, int vaga, float condominio, int pisos, String padrao, String resiComer, boolean quintal,
            boolean piscina) {
        super(endereco, preco, m2, tipoNegocio, quarto, banheiro, vaga, condominio, pisos, padrao,
                resiComer);
        setTipoImovel("CASA");
        this.quintal = quintal;
        this.piscina = piscina;
    }

// Gets n Setters

    public boolean isQuintal() {
        return quintal;
    }
    public void setQuintal(boolean quintal) {
        this.quintal = quintal;
    }
    public boolean isPiscina() {
        return piscina;
    }
    public void setPiscina(boolean piscina) {
        this.piscina = piscina;
    }

// toString
    
    @Override
    public String toString() {
        return super.toString() + 
        "\nQUINTAL: " + quintal +
        "\nPISCINA: " + piscina;
    }
}
