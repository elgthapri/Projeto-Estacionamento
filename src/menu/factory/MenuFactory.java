package menu.factory;
import java.util.Scanner;
public class MenuFactory {

    public MenuFactory() {
        int opcao = 0;
        Scanner in = new Scanner(System.in);
        VeiculoOperations veiculoOperations = new VeiculoOperations();
        do {
            System.out
                    .println(  "\n                       MENU                    ");
            System.out.println("\n     ===========================================");
            System.out.println("    |     1 - Adicionar Veículo                 | ");
            System.out.println("    |     2 - Remover Veículo                   | ");
            System.out.println("    |     3 - Gerenciamento de vagas            | ");
            System.out.println("    |     4 - Listar Veiculos                   | ");
            System.out.println("    |     0 - Sair                              | ");
            System.out.println("     ===========================================\n");
            System.out.println("                Selecione uma opção:              ");

            opcao = in.nextInt();
            System.out.println("--------------------------------------------------");
            System.out.print("\n");
            switch (opcao) {
                case 1:
                    veiculoOperations.adicionarVeiculo();
                    continue;
                case 2:
                    veiculoOperations.removerVeiculo();
                    continue;
                case 3:
                    veiculoOperations.gerenciamentoVagas();
                    continue;
                case 4:
                    veiculoOperations.listarVeiculos();
                    continue;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção Inválida!");
                    continue;
            }
        } while (opcao != 0);
    }
}
