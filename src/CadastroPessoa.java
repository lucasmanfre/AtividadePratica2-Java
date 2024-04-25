import java.util.List;
import java.util.ArrayList;

public class CadastroPessoa {

    private static List<Pessoa> listaPessoas = new ArrayList<>();

    public static List<Pessoa> getListaPessoas() {
        return listaPessoas;
    }
    

    public static void cadastrarPessoa(Pessoa pessoa){
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

    public static Pessoa buscarCorretor(int matricula){
        for(Pessoa temp : listaPessoas){
            Corretor c = (Corretor)temp;
            if (c.getMatricula() == matricula){
                return c;
            }
        }
        return null;
    }
}
