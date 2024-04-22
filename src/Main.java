public class Main {
    
    public static void main(String[] args) {
         Casa casa = new Casa("Rua Flores", 10000, 100, "Venda", 4, 2, 3, 1000, 3, "Médio", "Residencial", true, true );
         CadastroImovel.cadastrarImovel(casa);
         Apartamento ap = new Apartamento("Rua Julio", 30000, 50, "Aluguel", 2, 1, 1, 300, 1, "Baixo", "Residencial", 1201);
        CadastroImovel.cadastrarImovel(ap);
        Imovel imovel = new Imovel("Av Manoel Ribas", 1000000, 500, "Venda");
        CadastroImovel.cadastrarImovel(imovel);
        // System.out.println(casa.toString());
        // int id;
        // id = Console.lerInt();
        // Imovel imovel2 = CadastroImovel.buscarImovel(id);
        // System.out.println(imovel2.toString());
        Sistema.executar();
    }

}
