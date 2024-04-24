public class Sistema {
    
    //----------------------MENUS----------------------------------

    public static void menuInicial(){
        System.out.println("\n---- APOLAR ----");
        System.out.println("1 - USUARIO");
        System.out.println("2 - CORRETOR");
        System.out.println("0 - SAIR");
        System.out.println("----------------");
    }

    public static void menuCadastro(){
        System.out.println("---- JÁ POSSUI CADASTRO? ----");
        System.out.println("1 - SIM");
        System.out.println("2 - NÃO");
        System.out.println("-----------------------------");
    }

    public static void cadastroUsuario(){
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
    }

    public static void cadastroCorretor(){
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
        System.out.println("5 - EXCLUIR IMOVEIS");
        System.out.println("0 - SAIR");
        System.out.println("-----------------------");
    }

    public static void menuExcluir(){
        System.out.println("\n---- MENU EXCLUIR ----");
        System.out.println("1 - EXLUIR POR ID");
        System.out.println("2 - EXCLUIR TODOS");
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

    public static void cadastroTerreno(){
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
    }

    public static void cadastroAp(){
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
    }

    public static void cadastroCasa(){
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
            quintal.toUpperCase();
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
            piscina.toUpperCase();
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
    }

    public static Imovel buscarId(){
        Imovel imovel;
        do {
            System.out.print("INFORME O ID: ");
            int id = Console.lerInt();
            imovel = CadastroImovel.buscarImovel(id);
            if (imovel == null){
                System.out.println("ID INFORMADO INEXISTENTE, TENTE NOVAMENTE..");
            }
        } while (imovel == null);
        return imovel;
    }

    public static void menuAlteracaoTerreno(){
        System.out.println("\n---- ALTERAR INFORMAÇÕES ----");
        System.out.println("1 - ENDEREÇO");
        System.out.println("2 - PREÇO");
        System.out.println("3 - M2");
        System.out.println("4 - VENDA/ALUGUEL");
        System.out.println("0 - SAIR");
        System.out.println("-----------------------------");
    }

    public static void menuAlteracaoAp(){
        System.out.println("\n---- ALTERAR INFORMAÇÕES ----");
        System.out.println("1 - ENDEREÇO");
        System.out.println("2 - PREÇO");
        System.out.println("3 - M2");
        System.out.println("4 - VENDA/ALUGUEL");
        System.out.println("5 - QUARTOS");
        System.out.println("6 - BANHEIROS");
        System.out.println("7 - VAGAS");
        System.out.println("8 - PREÇO CONDOMINIO");
        System.out.println("9 - QUANTIDADES DE ANDARES");
        System.out.println("10 - ALTO/MÉDIO/BAIXO PADRÃO");
        System.out.println("11 - RESINDENCIAL/COMERCIAL");
        System.out.println("12 - ANDAR");
        System.out.println("0 - SAIR");
        System.out.println("-----------------------------");
    }

    public static void menuAlteracaoCasa(){
        System.out.println("\n---- ALTERAR INFORMAÇÕES ----");
        System.out.println("1 - ENDEREÇO");
        System.out.println("2 - PREÇO");
        System.out.println("3 - M2");
        System.out.println("4 - VENDA/ALUGUEL");
        System.out.println("5 - QUARTOS");
        System.out.println("6 - BANHEIROS");
        System.out.println("7 - VAGAS");
        System.out.println("8 - PREÇO CONDOMINIO");
        System.out.println("9 - QUANTIDADES DE ANDARES");
        System.out.println("10 - ALTO/MÉDIO/BAIXO PADRÃO");
        System.out.println("11 - RESINDENCIAL/COMERCIAL");
        System.out.println("12 - QUINTAL");
        System.out.println("13 - PISCINA");
        System.out.println("0 - SAIR");
        System.out.println("-----------------------------");
    }

    //-------------------------------------------------------------------


    public static void verificarOp(int op){
        int op2;
        int op3;
        int op4;
        int op5;
        int op6;
        int op7;
        int op8;
        int op9;

    // Seção escolha de entre usuario ou corretor (case 1 / case 2).

        switch (op) {
            case 1:
                menuCadastro();
                op8 = Console.lerInt();
                switch (op8) {
                    case 1:
                        break;

                    case 2:
                        cadastroUsuario();
                        break;
                
                    default:
                        System.out.println("Opção inválida! Tente novamente...");
                        break;
                }

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
                                System.out.println("Voltando ao menu principal...");
                                break;
                        
                            default:
                                System.out.println("Opção inválida! Tente novamente...");
                                break;
                        }
                        break;

                // Busca pelo menu usuario, pesquisando pelo id da propriedade.

                    case 3:
                        Imovel imovel;
                        imovel = buscarId();
                        System.out.println(imovel.toString());
                        break;

                    case 0:
                        System.out.println("Voltando ao menu principal...");
                        break;

                    default:
                        System.out.println("Opção inválida! Tente novamente...");
                        break;
                }
                break;

        // Seção escolha de entre usuario ou corretor (case 1 / case 2).
        
            case 2:
                menuCadastro();
                op8 = Console.lerInt();
                switch (op8) {
                    case 1:
                        break;

                    case 2:
                        cadastroCorretor();
                        break;
                
                    default:
                        System.out.println("Opção inválida! Tente novamente...");
                        break;
                }

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
                                cadastroCasa();
                                break;
                            
                        // Cadastro opção Apartamento.

                            case 2:
                                cadastroAp();
                                break;

                        // Cadastro opção Terreno.

                            case 3:
                                cadastroTerreno();
                                break;

                            case 0:
                                System.out.println("Voltando ao menu principal...");
                                break;

                            default:
                                System.out.println("Opção inválida! Tente novamente...");
                                break;
                        }
                        break;
                    
                // Opção para poder alterar valores de atributos de algum imovel.

                    case 2:
                    Imovel imovel;
                    imovel = buscarId();
                    String tipoAlterar = imovel.getTipoImovel();
                    if (tipoAlterar.equals("TERRENO")){
                        menuAlteracaoTerreno();
                        op7 = Console.lerInt();
                        switch (op7) {
                            case 1:
                                String enderecoAlterar = Console.lerString();
                                imovel.setEndereco(enderecoAlterar);
                                System.out.println("ALTERAÇÃO REALIZADA COM SUCESSO!");
                                break;

                            case 2:
                                float precoAlterar = Console.lerFloat();
                                imovel.setPreco(precoAlterar);
                                System.out.println("ALTERAÇÃO REALIZADA COM SUCESSO!");
                                break;

                            case 3:
                                int m2Alterar = Console.lerInt();
                                imovel.setM2(m2Alterar);
                                System.out.println("ALTERAÇÃO REALIZADA COM SUCESSO!");
                                break;

                            case 4:
                                String tipoNegocioAlterar = Console.lerString();
                                imovel.setTipoImovel(tipoNegocioAlterar);
                                System.out.println("ALTERAÇÃO REALIZADA COM SUCESSO!");
                                break;

                            case 0:
                                System.out.println("Voltando ao menu principal...");
                                break;

                            default:
                                System.out.println("Opção inválida! Tente novamente...");
                                break;
                        }
                    }
                    else if (tipoAlterar.equals("APARTAMENTO")){
                        Apartamento ap = (Apartamento)imovel;// força passar os valores de uma variavel Imovel para uma variavel ap
                        menuAlteracaoAp();
                        op7 = Console.lerInt();
                        switch (op7) {
                            case 1:
                                String enderecoAlterar = Console.lerString();
                                ap.setEndereco(enderecoAlterar);
                                System.out.println("ALTERAÇÃO REALIZADA COM SUCESSO!");
                                break;

                            case 2:
                                float precoAlterar = Console.lerFloat();
                                ap.setPreco(precoAlterar);
                                System.out.println("ALTERAÇÃO REALIZADA COM SUCESSO!");
                                break;

                            case 3:
                                int m2Alterar = Console.lerInt();
                                ap.setM2(m2Alterar);
                                System.out.println("ALTERAÇÃO REALIZADA COM SUCESSO!");
                                break;

                            case 4:
                                String tipoNegocioAlterar = Console.lerString();
                                ap.setTipoImovel(tipoNegocioAlterar);
                                System.out.println("ALTERAÇÃO REALIZADA COM SUCESSO!");
                                break;

                            case 5:
                                int quartoAlterar = Console.lerInt();
                                ap.setQuarto(quartoAlterar);
                                System.out.println("ALTERAÇÃO REALIZADA COM SUCESSO!");
                                break;

                            case 6:
                                int banheiroAlterar = Console.lerInt();
                                ap.setBanheiro(banheiroAlterar);
                                System.out.println("ALTERAÇÃO REALIZADA COM SUCESSO!");
                                break;

                            case 7:
                                int vagaAlterar = Console.lerInt();
                                ap.setVaga(vagaAlterar);
                                System.out.println("ALTERAÇÃO REALIZADA COM SUCESSO!");
                                break;

                            case 8:
                                float condominioAlterar = Console.lerFloat();
                                ap.setCondominio(condominioAlterar);
                                System.out.println("ALTERAÇÃO REALIZADA COM SUCESSO!");
                                break;

                            case 9:
                                int pisosAlterar = Console.lerInt();
                                ap.setPisos(pisosAlterar);
                                System.out.println("ALTERAÇÃO REALIZADA COM SUCESSO!");
                                break;

                            case 10:
                                String padraoAlterar = Console.lerString();
                                ap.setPadrao(padraoAlterar);
                                System.out.println("ALTERAÇÃO REALIZADA COM SUCESSO!");
                                break;

                            case 11:
                                String resiComerAlterar = Console.lerString();
                                ap.setResiComer(resiComerAlterar);
                                System.out.println("ALTERAÇÃO REALIZADA COM SUCESSO!");
                                break;

                            case 12:
                                int andarAlterar = Console.lerInt();
                                ap.setAndar(andarAlterar);
                                System.out.println("ALTERAÇÃO REALIZADA COM SUCESSO!");
                                break;

                            case 0:
                                System.out.println("Voltando ao menu principal...");
                                break;
                         
                            default:
                                System.out.println("Opção inválida! Tente novamente...");
                                break;
                         }  
                    }
                    else{
                        Casa casa = (Casa)imovel;// força passar os valores de uma variavel Imovel para uma variavel Casa
                        menuAlteracaoCasa();
                        op7 = Console.lerInt();
                        switch (op7) {
                            case 1:
                                String enderecoAlterar = Console.lerString();
                                casa.setEndereco(enderecoAlterar);
                                System.out.println("ALTERAÇÃO REALIZADA COM SUCESSO!");
                                break;

                            case 2:
                                float precoAlterar = Console.lerFloat();
                                casa.setPreco(precoAlterar);
                                System.out.println("ALTERAÇÃO REALIZADA COM SUCESSO!");
                                break;

                            case 3:
                                int m2Alterar = Console.lerInt();
                                casa.setM2(m2Alterar);
                                System.out.println("ALTERAÇÃO REALIZADA COM SUCESSO!");
                                break;

                            case 4:
                                String tipoNegocioAlterar = Console.lerString();
                                casa.setTipoImovel(tipoNegocioAlterar);
                                System.out.println("ALTERAÇÃO REALIZADA COM SUCESSO!");
                                break;

                            case 5:
                                int quartoAlterar = Console.lerInt();
                                casa.setQuarto(quartoAlterar);
                                System.out.println("ALTERAÇÃO REALIZADA COM SUCESSO!");
                                break;

                            case 6:
                                int banheiroAlterar = Console.lerInt();
                                casa.setBanheiro(banheiroAlterar);
                                System.out.println("ALTERAÇÃO REALIZADA COM SUCESSO!");
                                break;

                            case 7:
                                int vagaAlterar = Console.lerInt();
                                casa.setVaga(vagaAlterar);
                                System.out.println("ALTERAÇÃO REALIZADA COM SUCESSO!");
                                break;

                            case 8:
                                float condominioAlterar = Console.lerFloat();
                                casa.setCondominio(condominioAlterar);
                                System.out.println("ALTERAÇÃO REALIZADA COM SUCESSO!");
                                break;

                            case 9:
                                int pisosAlterar = Console.lerInt();
                                casa.setPisos(pisosAlterar);
                                System.out.println("ALTERAÇÃO REALIZADA COM SUCESSO!");
                                break;

                            case 10:
                                String padraoAlterar = Console.lerString();
                                casa.setPadrao(padraoAlterar);
                                System.out.println("ALTERAÇÃO REALIZADA COM SUCESSO!");
                                break;

                            case 11:
                                String resiComerAlterar = Console.lerString();
                                casa.setResiComer(resiComerAlterar);
                                System.out.println("ALTERAÇÃO REALIZADA COM SUCESSO!");
                                break;

                            case 12:
                                String quintalAlterar;
                                boolean quintalBoolAlterar;
                                do {
                                    System.out.print("TEM QUINTAL? [S/N]: ");
                                    quintalAlterar = Console.lerString();
                                    quintalAlterar.toUpperCase();
                                } while (!quintalAlterar.equals("S") && !quintalAlterar.equals("N"));
                                if (quintalAlterar.equals("S")){
                                    quintalBoolAlterar = true;
                                }
                                else{
                                    quintalBoolAlterar = false;
                                }
                                casa.setQuintal(quintalBoolAlterar);
                                System.out.println("ALTERAÇÃO REALIZADA COM SUCESSO!");
                                break;

                            case 13:
                                String piscinaAlterar;
                                boolean piscinaBoolAlterar;
                                do {
                                    System.out.print("TEM PISCINA? [S/N]: ");
                                    piscinaAlterar = Console.lerString();
                                    piscinaAlterar.toUpperCase();
                                } while (!piscinaAlterar.equals("S") && !piscinaAlterar.equals("N"));
                                if (piscinaAlterar.equals("S")){
                                    piscinaBoolAlterar = true;
                                }
                                else{
                                    piscinaBoolAlterar = false;
                                }
                                casa.setPiscina(piscinaBoolAlterar);
                                System.out.println("ALTERAÇÃO REALIZADA COM SUCESSO!");
                                break;
                            
                            case 0:
                                System.out.println("Voltando ao menu principal...");
                                break;
                         
                            default:
                                System.out.println("Opção inválida! Tente novamente...");
                                break;
                         }
                    }          
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
                                System.out.println("Voltando ao menu principal...");
                                break;
                        
                            default:
                                System.out.println("Opção inválida! Tente novamente...");
                                break;
                        }
                        break;

                    case 5:
                        menuExcluir();
                        op9 = Console.lerInt();
                        Imovel imovelExcluir;
                        switch (op9) {
                            case 1:
                                imovelExcluir = buscarId();
                                CadastroImovel.excluirImovel(imovelExcluir);
                                System.out.println("IMÓVEL EXCLUIDO COM SUCESSO!");
                                break;
                            
                            case 2:
                                String confirm;
                                do {
                                    System.out.println("-----------------------");
                                    System.out.print("VOCE TEM CERTEZA? [S/N]");
                                    confirm = Console.lerString();
                                    System.out.println("-----------------------");
                                } while (!confirm.equals("S") && !confirm.equals("N"));
                                if (confirm.equals("S")){
                                    CadastroImovel.excluirTodosImoveis();
                                    System.out.println("TODOS OS IMÓVEIS FORAM EXCLUIDOS COM SUCESSO!");
                                }
                                else{
                                    break;

                                }
                                break;

                            default:
                                System.out.println("Opção inválida! Tente novamente...");
                                break;

                            case 0:
                                System.out.println("Voltando ao menu principal...");
                                break;
                        }

                        break;
                        
                        
                    case 0:
                        System.out.println("Voltando ao menu principal...");
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
