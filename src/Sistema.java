public class Sistema {
    
    //----------------------MENUS----------------------------------

    public static void menuInicial(){
        System.out.println("\n---- APOLAR ----");
        System.out.println("1 - USUARIO");
        System.out.println("2 - CORRETOR");
        System.out.println("0 - SAIR");
        System.out.println("----------------");
    }

    public static void menuUsuario(){
        System.out.println("\n---- MENU USUARIO ----");
        System.out.println("1 - LISTAR TODOS OS IMOVEIS");
        System.out.println("2 - BUSCAR");
        System.out.println("3 - BUSCAR ID");
        System.out.println("0 - SAIR");
        System.out.println("----------------------");
    }
    public static void menuBuscar(){
        System.out.println("\n---- BUSCAR ----");
        System.out.println("1 - CASA");
        System.out.println("2 - APARTAMENTO");
        System.out.println("3 - TERRENO");
        System.out.println("0 - SAIR");
        System.out.println("----------------");
    }

    public static void menuCorretor(){
        System.out.println("\n---- MENU CORRETOR ----");
        System.out.println("1 - ADICIONAR IMOVEL");
        System.out.println("2 - MODIFICAR IMOVEL");
        System.out.println("3 - LISTAR TODOS OS IMOVEIS");
        System.out.println("4 - BUSCAR");
        System.out.println("0 - SAIR");
        System.out.println("-----------------------");
    }

    public static void menuCadastrarImovel(){
        System.out.println("\n---- MENU DE CADASTRO DE IMOVEL ----");
        System.out.println("1 - CASA");
        System.out.println("2 - APARTAMENTO");
        System.out.println("3 - TERRENO");
        System.out.println("0 - SAIR");
        System.out.println("------------------------------------");
    }

    //-------------------------------------------------------------------


    public static void verificarOp(int op){
        int op2;
        int op3;
        int op4;
        int op5;
        int op6;

    // Seção escolha de entre usuario ou corretor (case 1 / case 2).

        switch (op) {
            case 1:
                System.out.print("NOME: ");
                String nomeCliente = Console.lerString();
                System.out.print("TELEFONE: ");
                String telefoneCliente = Console.lerString();
                System.out.print("CPF: ");
                String cpfCliente = Console.lerString();
                System.out.print("EMAIL: ");
                String emailCliente = Console.lerString();
                Cliente cliente = new Cliente(nomeCliente, cpfCliente, telefoneCliente, emailCliente);
                CadastroPessoa.cadastrarPessoa(cliente);
                System.out.println("\nCADASTRO REALIZADO COM SUCESSO!");

            // Seção inicializando o menu do usuario.

                menuUsuario();

                op2 = Console.lerInt();
                switch (op2) {

                // Listagem de todos os imoveis, com validação de existencia na memoria.

                    case 1:
                        if (CadastroImovel.getListaImoveis().size() == 0){
                            System.out.println("\nNÃO HÁ IMOVEIS DISPONÍVEIS");
                            return;
                        }
                        for (Imovel temp : CadastroImovel.getListaImoveis())
                            System.out.println(temp.toString());
                        break;

                // Menu para busca com escolha em base no tipo de residencia (Casa, Apartamento ou apenas o Terreno).
                    
                    case 2:
                        menuBuscar();
                        op3 = Console.lerInt();
                        switch (op3) {

                        // Validação de busca caso não haja imoveis registrados no sistema, junto com a relação de todas as Casas.
                        
                            case 1:
                                if (CadastroImovel.getListaImoveis().size() == 0){
                                    System.out.println("\nNÃO HÁ CASAS DISPONÍVEIS");
                                    return;
                                }
                                for (Imovel temp : CadastroImovel.getListaImoveis())
                                    if (temp.getTipoImovel().equals("CASA"))
                                    System.out.println(temp.toString());
                                break;

                        // Validação de busca caso não haja imoveis registrados no sistema, junto com a relação de todos os Apartamentos.

                            case 2:
                                if (CadastroImovel.getListaImoveis().size() == 0){
                                    System.out.println("\nNÃO HÁ APARTAMENTOS DISPONÍVEIS");
                                    return;
                                }
                                for (Imovel temp : CadastroImovel.getListaImoveis())
                                    if (temp.getTipoImovel().equals("APARTAMENTO"))
                                    System.out.println(temp.toString());
                                break;

                        // Validação de busca caso não haja imoveis registrados no sistema, junto com a relação de todos os Terrenos.

                            case 3:
                                if (CadastroImovel.getListaImoveis().size() == 0){
                                    System.out.println("\nNÃO HÁ TERRENOS DISPONÍVEIS");
                                    return;
                                }
                                for (Imovel temp : CadastroImovel.getListaImoveis())
                                    if (temp.getTipoImovel().equals("TERRENO"))
                                    System.out.println(temp.toString());
                                break;

                            case 0:
                                System.out.println("Saindo do sistema...");
                                break;
                        
                            default:
                                System.out.println("Opção inválida! Tente novamente...");
                                break;
                        }
                        break;

                // Busca pelo menu usuario, pesquisando pelo id da propriedade.

                    case 3:
                        System.out.print("INFORME O ID: ");
                        int id = Console.lerInt();
                        Imovel imovel = CadastroImovel.buscarImovel(id);
                        System.out.println(imovel.toString());
                        break;

                    case 0:
                        System.out.println("Saindo do sistema...");
                        break;

                    default:
                        System.out.println("Opção inválida! Tente novamente...");
                        break;
                }
                break;

        // Seção escolha de entre usuario ou corretor (case 1 / case 2).
        
            case 2:
                System.out.print("NOME: ");
                String nomeCorretor = Console.lerString();
                System.out.print("TELEFONE: ");
                String cpfCorretor = Console.lerString();
                System.out.print("MATRÍCULA: ");
                int matriculaCorretor = Console.lerInt();
                System.out.print("UNIDADE: ");
                String unidadeCorretor = Console.lerString();
                Corretor corretor = new Corretor(nomeCorretor, cpfCorretor, matriculaCorretor, unidadeCorretor);
                CadastroPessoa.cadastrarPessoa(corretor);
                System.out.println("\nCADASTRO REALIZADO COM SUCESSO!");

            // Menu Corretor sendo inicalizado.

                menuCorretor();

                op4 = Console.lerInt();
                switch (op4) {

                // Menu corretor cadastro de um imovel, tendo opções de criar propriedades distintas (Casa, Apartamento ou apenas Terreno).
                
                    case 1:
                        menuCadastrarImovel();
                        op5 = Console.lerInt();
                        switch (op5) {

                        // Cadastro opção Casa.

                            case 1:
                                System.out.println("\n---- CADASTRO CASA ----");
                                System.out.print("ENDEREÇO: ");
                                String enderecoCasa = Console.lerString();
                                System.out.print("PREÇO: ");
                                float precoCasa = Console.lerFloat();
                                System.out.print("M2: ");
                                float m2Casa = Console.lerFloat();
                                System.out.print("VENDA OU ALUGUEL?: ");
                                String tipoNegocioCasa = Console.lerString();
                                System.out.print("QUANTIDADE QUARTOS: ");
                                int quartoCasa = Console.lerInt();
                                System.out.print("QUANTIDADE BANHEIROS: ");
                                int banheiroCasa = Console.lerInt();
                                System.out.print("QUANTIDADE DE VAGAS: ");
                                int vagasCasa = Console.lerInt();
                                System.out.print("PREÇO CONDOMINIO: ");
                                float condominioCasa = Console.lerFloat();
                                System.out.print("QUANTIDADES DE ANDARES: ");
                                int andaresCasa = Console.lerInt();
                                System.out.print("ALTO, MÉDIO OU BAIXO PADRÃO?: ");
                                String padraoCasa = Console.lerString();
                                System.out.print("RESINDENCIAL OU COMERCIAL?: ");
                                String resiComerCasa = Console.lerString();
                                String quintal;
                                boolean quintalBool;
                                do {
                                    System.out.print("TEM QUINTAL? [S/N]: ");
                                    quintal = Console.lerString();
                                } while (!quintal.equals("S") && !quintal.equals("N"));
                                if (quintal.equals("S")){
                                    quintalBool = true;
                                }
                                else{
                                    quintalBool = false;
                                }
                                String piscina;
                                boolean piscinaBool;
                                do {
                                    System.out.print("TEM PISCINA? [S/N]: ");
                                    piscina = Console.lerString();
                                } while (!piscina.equals("S") && !piscina.equals("N"));
                                if (piscina.equals("S")){
                                    piscinaBool = true;
                                }
                                else{
                                    piscinaBool = false;
                                }
                                Casa casa = new Casa(enderecoCasa, precoCasa, m2Casa, tipoNegocioCasa, quartoCasa, banheiroCasa, vagasCasa, condominioCasa, andaresCasa, padraoCasa, resiComerCasa, quintalBool, piscinaBool);
                                CadastroImovel.cadastrarImovel(casa);
                                System.out.println("\nIMÓVEL CADASTRADO COM SUCESSO!");
                                System.out.print("-----------------------");
                                break;
                            
                        // Cadastro opção Apartamento.

                            case 2:
                                System.out.println("\n---- CADASTRO APARTAMENTO ----");
                                System.out.print("ENDEREÇO: ");
                                String enderecoApartamento = Console.lerString();
                                System.out.print("PREÇO: ");
                                float precoApartamento = Console.lerFloat();
                                System.out.print("M2: ");
                                float m2Apartamento = Console.lerFloat();
                                System.out.print("VENDA OU ALUGUEL?: ");
                                String tipoNegocioApartamento = Console.lerString();
                                System.out.print("QUANTIDADE QUARTOS: ");
                                int quartoApartamento = Console.lerInt();
                                System.out.print("QUANTIDADE BANHEIROS: ");
                                int banheiroApartamento = Console.lerInt();
                                System.out.print("QUANTIDADE DE VAGAS: ");
                                int vagasApartamento = Console.lerInt();
                                System.out.print("PREÇO CONDOMINIO: ");
                                float condominioApartamento = Console.lerFloat();
                                System.out.print("QUANTIDADES DE ANDARES: ");
                                int andaresApartamento = Console.lerInt();
                                System.out.print("ALTO, MÉDIO OU BAIXO PADRÃO?: ");
                                String padraoApartamento = Console.lerString();
                                System.out.print("RESINDENCIAL OU COMERCIAL?: ");
                                String resiComerApartamento = Console.lerString();
                                System.out.print("ANDAR: ");
                                int andar = Console.lerInt();
                                Apartamento ap = new Apartamento(enderecoApartamento, precoApartamento, m2Apartamento, tipoNegocioApartamento, quartoApartamento, banheiroApartamento, vagasApartamento, condominioApartamento, andaresApartamento, padraoApartamento, resiComerApartamento, andar);
                                CadastroImovel.cadastrarImovel(ap);
                                System.out.println("\nIMÓVEL CADASTRADO COM SUCESSO!");
                                System.out.print("-----------------------");
                                break;

                        // Cadastro opção Terreno.

                            case 3:
                                System.out.println("\n---- CADASTRO TERRENO ----");
                                System.out.print("ENDEREÇO: ");
                                String enderecoTerreno = Console.lerString();
                                System.out.print("PREÇO: ");
                                float precoTerreno = Console.lerFloat();
                                System.out.print("M2: ");
                                float m2Terreno = Console.lerFloat();
                                System.out.print("VENDA OU ALUGUEL?: ");
                                String tipoNegocioTerreno = Console.lerString();
                                Imovel imovel = new Imovel(enderecoTerreno, precoTerreno, m2Terreno, tipoNegocioTerreno);
                                CadastroImovel.cadastrarImovel(imovel);
                                System.out.println("\nIMÓVEL CADASTRADO COM SUCESSO!");
                                System.out.print("-----------------------");
                                break;

                            case 0:
                                System.out.println("Saindo do sistema...");
                                break;

                            default:
                                System.out.println("Opção inválida! Tente novamente...");
                                break;
                        }
                        break;
                    
                // Opção para poder alterar valores de atributos de algum imovel.

                    case 2:

                        

                        break;

                // Busca de todos os imóveis disponíveis, registrados no sistema.

                    case 3:

                        if (CadastroImovel.getListaImoveis().size() == 0){
                            System.out.println("\nNÃO HÁ IMOVEIS DISPONÍVEIS");
                            return;
                        }
                        for (Imovel temp : CadastroImovel.getListaImoveis())
                            System.out.println(temp.toString());
                        break;    

                // Busca de imoveis especificos por seu tipo (Casa, Apartamento ou apenas o Terreno).

                    case 4:

                        menuBuscar();
                        op6 = Console.lerInt();
                        switch (op6) {

                        // Validação de busca caso não haja imoveis registrados no sistema, junto com a relação de todas as Casas.
                        
                            case 1:
                                if (CadastroImovel.getListaImoveis().size() == 0){
                                    System.out.println("\nNÃO HÁ CASAS DISPONÍVEIS");
                                    return;
                                }
                                for (Imovel temp : CadastroImovel.getListaImoveis())
                                    if (temp.getTipoImovel().equals("CASA"))
                                    System.out.println(temp.toString());
                                break;

                        // Validação de busca caso não haja imoveis registrados no sistema, junto com a relação de todos os Apartamentos.

                            case 2:
                                if (CadastroImovel.getListaImoveis().size() == 0){
                                    System.out.println("\nNÃO HÁ APARTAMENTOS DISPONÍVEIS");
                                    return;
                                }
                                for (Imovel temp : CadastroImovel.getListaImoveis())
                                    if (temp.getTipoImovel().equals("APARTAMENTO"))
                                    System.out.println(temp.toString());
                                break;

                        // Validação de busca caso não haja imoveis registrados no sistema, junto com a relação de todos os Terrenos.

                            case 3:
                                if (CadastroImovel.getListaImoveis().size() == 0){
                                    System.out.println("\nNÃO HÁ TERRENOS DISPONÍVEIS");
                                    return;
                                }
                                for (Imovel temp : CadastroImovel.getListaImoveis())
                                    if (temp.getTipoImovel().equals("TERRENO"))
                                    System.out.println(temp.toString());
                                break;

                            case 0:
                                System.out.println("Saindo do sistema...");
                                break;
                        
                            default:
                                System.out.println("Opção inválida! Tente novamente...");
                                break;
                        }
                        break;

                    case 0:
                        System.out.println("Saindo do sistema...");
                        break;

                    default:
                        System.out.println("Opção inválida! Tente novamente...");
                        break;
                }
                break;

            case 0:
                System.out.println("Saindo do sistema...");
                break;
        
            default:
                System.out.println("Opção inválida! Tente novamente...");
                break;
        }
    }

// Método de execução do sistema

    public static void executar(){
        int op;
        do {
            menuInicial();
            op = Console.lerInt();
            verificarOp(op);
        } while (op != 0);
    }
    

}
