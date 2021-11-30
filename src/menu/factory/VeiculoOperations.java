package menu.factory;

import model.Veiculo;
import model.Veiculos;
import util.RelatorioFluxoOperation;
import java.time.LocalDateTime;
import java.util.Scanner;

public class VeiculoOperations {

    public void adicionarVeiculo() {
        try {
            RelatorioFluxoOperation relatorio = new RelatorioFluxoOperation();
            Scanner s = new Scanner(System.in);
            var cond = 1;
            while (cond != 0) {
                System.out.println("------------------------------------------------------");
                System.out.println("  |--------------CADASTRE UM VEÍCULO:--------------|");
                System.out.println("------------------------------------------------------");
                System.out.println("\n");
                Veiculos listaDeVeiculos = Veiculos.getInstance();
                Veiculo veiculo = new Veiculo();

                System.out.println("Escolha o tipo do veículo: ");
                System.out.println("=======================================================");
                System.out.println("1- para CARRO ");
                System.out.println("2- para MOTO ");
                System.out.println("3- para ÔNIBUS ");
                System.out.println("=======================================================");
                System.out.println("\n");
                switch (s.nextInt()) {
                    case 1:
                        veiculo.setTipoVeiculo("Carro");
                    case 2:
                        veiculo.setTipoVeiculo("Moto");
                    case 3:
                        veiculo.setTipoVeiculo("Onibus");
                    default:
                        veiculo.setTipoVeiculo("Carro");
                }

                System.out.println("Digite a placa do veículo: ");
                veiculo.setPlaca(s.next());
                veiculo.setData_ent(LocalDateTime.now());


                listaDeVeiculos.entradaVeic(veiculo);

                relatorio.inserirVeiculoNoRelatorio(veiculo);

                System.out.println(listaDeVeiculos.veiculoArrayList);
                System.out.println("\n");
                System.out.println("            Veículo ADICIONADO com sucesso!!           ");
                System.out.println("\n");

                System.out.println("- Se deseja sair aperte 0(ZERO)");
                System.out.println("- Se deseja cadastrar mais algum veículo, digite 1(UM)");
                cond = s.nextInt();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void removerVeiculo() {
        Scanner s = new Scanner(System.in);
        Veiculos listaDeVeiculos = Veiculos.getInstance();
        RelatorioFluxoOperation relatorio = new RelatorioFluxoOperation();

        var cond = 1;
        System.out.println("------------------------------------------------------");
        System.out.println("  |--------------REMOVER UM VEÍCULO:--------------|");
        System.out.println("------------------------------------------------------");
        System.out.println("\n");
        while (cond != 0) {
            System.out.println("- Digite a placa de um veiculo se deseja remover: \n- Ou digite 0 (ZERO) para sair sem remover nenhum veiculo: ");
            String opcao = s.next();
            if (!opcao.equals("0")) {
                listaDeVeiculos.veiculoArrayList.forEach(veiculo -> {
                    if (veiculo.getPlaca().equals(opcao)){
                        veiculo.setData_saida(LocalDateTime.now());

                        relatorio.inserirVeiculoNoRelatorio(veiculo);
                    }
                });
                listaDeVeiculos.veiculoArrayList.removeIf(veiculo -> veiculo.getPlaca().equals(opcao));
                System.out.println("            Veículo REMOVIDO com sucesso!!             ");
                System.out.println("\n");
                continue;
            } else {
                cond = 0;
            }
        }
    }
    public void gerenciamentoVagas() {
        Veiculos listaDeVeiculos = Veiculos.getInstance();
        System.out.println("                   OCUPAÇÃO DE VAGAS:                     ");
        System.out.println("                           " + listaDeVeiculos.veiculoArrayList.size() + "/50");
        System.out.println("============================================================");
        System.out.println("                   Total de carros: " + countVeiculoByType("Carro"           ));
        System.out.println("                   Total de motos: " + countVeiculoByType("Moto"             ));
        System.out.println("                   Total de onibus: " + countVeiculoByType("Onibus"          ));
        System.out.println("============================================================");
    }

    public void listarVeiculos() {
        System.out.println("============================================================");
        System.out.println("                    LISTA DE VEÍCULOS:                     ");
        if (Veiculos.getInstance().veiculoArrayList.size() > 0) {
            System.out.println("\n");
            System.out.println(Veiculos.getInstance().veiculoArrayList.toString());
        } else {
            System.out.println("          Nenhum veículo estacionado no momento!");
        }
        System.out.println("============================================================");
        System.out.println("\n");
    }

    public int countVeiculoByType(String tipo) {

        int veiculoCont = 0;
        for (Veiculo veiculo : Veiculos.getInstance().veiculoArrayList) {
            if (veiculo.getTipoVeiculo().equals(tipo)) {
                veiculoCont ++;
            }
        }

        return veiculoCont;
    }

    public void relatorioDeFluxo() {}
}
