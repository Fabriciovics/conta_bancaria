package conta_bancaria;

import conta_bancaria.model.Conta;
import conta_bancaria.util.Cores;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {

        //Instanciar objeto da classe Conta
        Conta c1 = new Conta(1, 123, 1,"Aylla",500000);

        //Visualizar
        c1.visualizar();

        //Sacar
        c1.sacar(100);
        c1.visualizar();
        //Depositar
        c1.depositar(1000);
        c1.visualizar();
        //ALterar propriedade
        c1.setTitular("Aylla Scaglia");
        c1.visualizar();

        Scanner leia = new Scanner(System.in);

        int opcao;

        while (true) {
            System.out.println(Cores.TEXT_CYAN_BOLD + Cores.ANSI_BLACK_BACKGROUND);
            System.out.println();
            System.out.println("*****************************************************");
            System.out.println("                                                     ");
            System.out.println(Cores.TEXT_GREEN+"                BANCO DO BRAZIL COM Z                ");
            System.out.println(Cores.TEXT_CYAN_BOLD +"                                                     ");
            System.out.println("*****************************************************");
            System.out.println("                                                     ");
            System.out.println(Cores.TEXT_RED_BOLD+"            1 - Criar Conta                          ");
            System.out.println("            2 - Listar todas as Contas               ");
            System.out.println("            3 - Buscar Conta por Numero              ");
            System.out.println("            4 - Atualizar Dados da Conta             ");
            System.out.println("            5 - Apagar Conta                         ");
            System.out.println("            6 - Sacar                                ");
            System.out.println("            7 - Depositar                            ");
            System.out.println("            8 - Transferir valores entre Contas      ");
            System.out.println("            9 - Sair                                 ");
            System.out.println("                                                     ");
            System.out.println(Cores.TEXT_CYAN_BOLD +"*****************************************************");
            System.out.print(Cores.TEXT_GREEN+"Entre com a opção desejada:                         ");
            System.out.println(Cores.TEXT_GREEN + Cores.ANSI_BLACK_BACKGROUND);

            opcao = leia.nextInt();

            if (opcao == 9) {
                System.out.print("\nBanco do Brazil com Z - O seu Futuro começa aqui!");
                sobre();
                leia.close();
                System.exit(0);
            }

            switch (opcao) {
                case 1:
                    System.out.println("Criar Conta\n\n");

                    break;
                case 2:
                    System.out.println("Listar todas as Contas\n\n");

                    break;
                case 3:
                    System.out.println("Consultar dados da Conta - por número\n\n");

                    break;
                case 4:
                    System.out.println("Atualizar dados da Conta\n\n");

                    break;
                case 5:
                    System.out.println("Apagar a Conta\n\n");

                    break;
                case 6:
                    System.out.println("Saque\n\n");

                    break;
                case 7:
                    System.out.println("Depósito\n\n");

                    break;
                case 8:
                    System.out.println("Transferência entre Contas\n\n");

                    break;
                default:
                    System.out.println("\nOpção Inválida!\n");
                    break;
            }
        }
    }

    public static void sobre() {
        System.out.println("\n*********************************************************");
        System.out.println("Projeto Desenvolvido por: ");
        System.out.println("Fabricio Soares - fabricios@genstudents.org");
        System.out.println("github.com/Fabriciovics/conta_bancaria");
        System.out.println("*********************************************************");
    }

}