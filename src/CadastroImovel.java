import java.util.List;
import java.util.ArrayList;

public class CadastroImovel {
    
    private static List<Imovel> listaImoveis = new ArrayList<>();

    public static List<Imovel> getListaImoveis() {
        return listaImoveis;
    }

    public static void cadastrarImovel(Imovel imovel){
        listaImoveis.add(imovel);
    }

    public static Imovel buscarImovel(int id){
        for (Imovel temp : listaImoveis){
            if (temp.getId() == id){
                return temp;
            }
        }
        return null;
    }

    public static void excluirImovel(int id){
        for (Imovel temp : listaImoveis){
            if (temp.getId() == id){
                listaImoveis.remove(temp);
            }
        }
    }

}
