public class BancoDeDados {
    public static void bd(){

        Casa casa = new Casa("Alphaville Graciosa, 550", 5411000, 550, "Venda", 4, 2, 6, 5000, 2, "Alto", "Residencial", true, true );
        CadastroImovel.cadastrarImovel(casa);
        Casa casa2 = new Casa("Rua Alagoas, 1221", 800000, 232, "Venda", 3, 2, 5, 0, 1, "Médio", "Residencial", true, false );
        CadastroImovel.cadastrarImovel(casa2);
        Casa casa3 = new Casa("Rua Maringá, 222", 1500, 50, "Aluguel", 2, 1, 2, 0, 1, "Baixo", "Residencial", false, false );
        CadastroImovel.cadastrarImovel(casa3);

        Apartamento ap = new Apartamento("Rua Julia Wanderley, 473", 4500, 106, "Aluguel", 2, 2, 1, 962, 1, "Médio", "Residencial", 1201);
        CadastroImovel.cadastrarImovel(ap);
        Apartamento ap2 = new Apartamento("Avenida Tupi", 17000, 647, "Aluguel", 0, 2, 0, 0, 2, "Baixo", "Comercial", 0);
        CadastroImovel.cadastrarImovel(ap2);
        Apartamento ap3 = new Apartamento("Rua Alferes Ângelo Sampaio, 2525", 1849000, 199, "Venda", 3, 3, 2, 1200, 1, "Alto", "Residencial", 1002);
        CadastroImovel.cadastrarImovel(ap3);

        Imovel imovel = new Imovel("Av Manoel Ribas", 1000000, 500, "Venda");
        CadastroImovel.cadastrarImovel(imovel);
    }
}
