import java.util.List;
import java.util.ArrayList;

public class CadastroImovel {
    
    private static List<Casa> listaImoveis = new ArrayList<>();

    public static void cadastrar(Imovel imovel){
        listaImoveis.add(imovel);
    }

    public static void buscar(String tipo){
        for (Imovel temp : listaImoveis) {
            if (tipo == "C"){
                listaImoveis
            }
        }
    }

}
