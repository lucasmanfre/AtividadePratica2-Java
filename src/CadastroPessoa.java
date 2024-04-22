import java.util.List;
import java.util.ArrayList;

public class CadastroPessoa {

    private static List<Pessoa> listaPessoas = new ArrayList<>();

    public static List<Pessoa> getListaPessoas() {
        return listaPessoas;
    }
    

    public static void cadastrarCliente(Pessoa pessoa){
        listaPessoas.add(pessoa);
    }

    public static Pessoa buscarCliente(String cpf){
        for(Pessoa temp : listaPessoas){
            if (temp.getCpf().equals(cpf)){
                return temp;
            }
        }
        return null;
    }

    public static void excluirCliente(String cpf){
        for(Pessoa temp : listaPessoas){
            if (temp.getCpf().equals(cpf)){
                listaPessoas.remove(temp);
            }
        }
    }
}
