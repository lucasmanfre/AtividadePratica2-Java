public class Sistema {
    
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

    public static void verificarOp(int op){
        int op2;
        int op3;
        int op4;
        int op5;
        switch (op) {
            case 1:
                System.out.print("NOME: ");
                String nome = Console.lerString();
                System.out.print("TELEFONE: ");
                String telefone = Console.lerString();
                System.out.print("CPF: ");
                String cpf = Console.lerString();
                System.out.print("EMAIL: ");
                String email = Console.lerString();
                Cliente cliente = new Cliente(nome, cpf, telefone, email);
                CadastroPessoa.cadastrarPessoa(cliente);
                System.out.println("\nCADASTRO REALIZADO COM SUCESSO!");
                menuUsuario();
                op2 = Console.lerInt();
                switch (op2) {
                    case 1:
                        if (CadastroImovel.getListaImoveis().size() == 0){
                            System.out.println("\nNÃO HÁ IMOVEIS DISPONÍVEIS");
                            return;
                        }
                        for (Imovel temp : CadastroImovel.getListaImoveis())
                            System.out.println(temp.toString());
                        break;
                    
                    case 2:
                        menuBuscar();
                        op3 = Console.lerInt();
                        switch (op3) {
                            case 1:
                                if (CadastroImovel.getListaImoveis().size() == 0){
                                    System.out.println("\nNÃO HÁ CASAS DISPONÍVEIS");
                                    return;
                                }
                                for (Imovel temp : CadastroImovel.getListaImoveis())
                                    if (temp.getTipoImovel().equals("CASA"))
                                    System.out.println(temp.toString());
                                break;

                            case 2:
                                if (CadastroImovel.getListaImoveis().size() == 0){
                                    System.out.println("\nNÃO HÁ APARTAMENTOS DISPONÍVEIS");
                                    return;
                                }
                                for (Imovel temp : CadastroImovel.getListaImoveis())
                                    if (temp.getTipoImovel().equals("APARTAMENTO"))
                                    System.out.println(temp.toString());
                                break;
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
            case 2:
                System.out.print("NOME: ");
                String nome2 = Console.lerString();
                System.out.print("TELEFONE: ");
                String cpf2 = Console.lerString();
                System.out.print("MATRÍCULA: ");
                int matricula = Console.lerInt();
                System.out.print("UNIDADE: ");
                String unidade = Console.lerString();
                Corretor corretor = new Corretor(nome2, cpf2, matricula, unidade);
                CadastroPessoa.cadastrarPessoa(corretor);
                System.out.println("\nCADASTRO REALIZADO COM SUCESSO!");
                menuCorretor();
                op4 = Console.lerInt();
                switch (op4) {
                    case 1:
                        menuCadastrarImovel();
                        op5 = Console.lerInt();
                        switch (op5) {
                            case 1:
                                System.out.println("\n---- CADASTRO CASA ----");
                                System.out.print("ENDEREÇO: ");
                                String endereco = Console.lerString();
                                System.out.print("PREÇO: ");
                                float preco = Console.lerFloat();
                                System.out.print("M2: ");
                                float m2 = Console.lerFloat();
                                System.out.print("VENDA OU ALUGUEL?: ");
                                String tipoNegocio = Console.lerString();
                                System.out.print("QUANTIDADE QUARTOS: ");
                                int quarto = Console.lerInt();
                                System.out.print("QUANTIDADE BANHEIROS: ");
                                int banheiro = Console.lerInt();
                                System.out.print("QUANTIDADE DE VAGAS: ");
                                int vagas = Console.lerInt();
                                System.out.print("PREÇO CONDOMINIO: ");
                                float condominio = Console.lerFloat();
                                System.out.print("QUANTIDADES DE ANDARES: ");
                                int andares = Console.lerInt();
                                System.out.print("ALTO, MÉDIO OU BAIXO PADRÃO?: ");
                                String padrao = Console.lerString();
                                System.out.print("RESINDENCIAL OU COMERCIAL?: ");
                                String resiComer = Console.lerString();
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
                                Casa casa = new Casa(endereco, preco, m2, tipoNegocio, quarto, banheiro, vagas, condominio, andares, padrao, resiComer, quintalBool, piscinaBool);
                                CadastroImovel.cadastrarImovel(casa);
                                System.out.println("\nIMÓVEL CADASTRADO COM SUCESSO!");
                                System.out.print("-----------------------");
                                break;
                            
                            case 2:
                                System.out.println("\n---- CADASTRO APARTAMENTO ----");
                                System.out.print("ENDEREÇO: ");
                                String endereco2 = Console.lerString();
                                System.out.print("PREÇO: ");
                                float preco2 = Console.lerFloat();
                                System.out.print("M2: ");
                                float m22 = Console.lerFloat();
                                System.out.print("VENDA OU ALUGUEL?: ");
                                String tipoNegocio2 = Console.lerString();
                                System.out.print("QUANTIDADE QUARTOS: ");
                                int quarto2 = Console.lerInt();
                                System.out.print("QUANTIDADE BANHEIROS: ");
                                int banheiro2 = Console.lerInt();
                                System.out.print("QUANTIDADE DE VAGAS: ");
                                int vagas2 = Console.lerInt();
                                System.out.print("PREÇO CONDOMINIO: ");
                                float condominio2 = Console.lerFloat();
                                System.out.print("QUANTIDADES DE ANDARES: ");
                                int andares2 = Console.lerInt();
                                System.out.print("ALTO, MÉDIO OU BAIXO PADRÃO?: ");
                                String padrao2 = Console.lerString();
                                System.out.print("RESINDENCIAL OU COMERCIAL?: ");
                                String resiComer2 = Console.lerString();
                                System.out.print("ANDAR: ");
                                int andar = Console.lerInt();
                                Apartamento ap = new Apartamento(endereco2, preco2, m22, tipoNegocio2, quarto2, banheiro2, vagas2, condominio2, andares2, padrao2, resiComer2, andar);
                                CadastroImovel.cadastrarImovel(ap);
                                System.out.println("\nIMÓVEL CADASTRADO COM SUCESSO!");
                                System.out.print("-----------------------");
                                break;

                            case 3:
                                System.out.println("\n---- CADASTRO TERRENO ----");
                                System.out.print("ENDEREÇO: ");
                                String endereco3 = Console.lerString();
                                System.out.print("PREÇO: ");
                                float preco3 = Console.lerFloat();
                                System.out.print("M2: ");
                                float m23 = Console.lerFloat();
                                System.out.print("VENDA OU ALUGUEL?: ");
                                String tipoNegocio3 = Console.lerString();
                                Imovel imovel = new Imovel(endereco3, preco3, m23, tipoNegocio3);
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
                    
                    case 2:
                        break;

                    case 3:
                        break;

                    case 4:
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

    public static void executar(){
        int op;
        do {
            menuInicial();
            op = Console.lerInt();
            verificarOp(op);
        } while (op != 0);
    }
    

}
