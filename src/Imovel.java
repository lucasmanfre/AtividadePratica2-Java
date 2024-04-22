import java.util.Random;

public class Imovel {
    
    private String endereco;
    private float preco;
    private float m2;
    private String tipoNegocio;
    private String tipoImovel;
    private int id;

// Construtores

    public Imovel(){
    }

    public Imovel(String endereco, float preco, float m2, String tipoNegocio) {
        Random idAleatorio = new Random();
        this.id = idAleatorio.nextInt(1000);
        this.endereco = endereco;
        this.preco = preco;
        this.m2 = m2;
        this.tipoNegocio = tipoNegocio;
        this.tipoImovel = "TERRENO";
    }

// Gets n Setters

    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public float getPreco() {
        return preco;
    }
    public void setPreco(float preco) {
        this.preco = preco;
    }
    public float getM2() {
        return m2;
    }
    public void setM2(float m2) {
        this.m2 = m2;
    }
    public String getTipoNegocio() {
        return tipoNegocio;
    }
    public void setTipoNegocio(String tipoNegocio) {
        this.tipoNegocio = tipoNegocio;
    }
    public String getTipoImovel() {
        return tipoImovel;
    }
    public void setTipoImovel(String tipoImovel) {
        this.tipoImovel = tipoImovel;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
// toString

    @Override
    public String toString() {
        return "\nID: " + id +
        "\nTipo de Propriedade: " + tipoImovel +
        "\nENDEREÇO: " + endereco +
        "\nÁrea: " + m2 + "/m2" + 
        "\nEstá disponível para " + tipoNegocio;
    }
    
}
