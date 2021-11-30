package util;
import model.Veiculo;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import java.time.LocalDate;

public class RelatorioFluxoOperation {

    public RelatorioFluxoOperation() {
        try {
            File myObj = new File("relatorio_"+ LocalDate.now() +".txt");
            System.out.println("============================================================");
            System.out.println("            | Status do Relatório de fluxo: | ");
            if (myObj.createNewFile()) {
                System.out.println("               Arquivo criado: " + myObj.getName());
            } else {
                System.out.println("              Arquivo já em funcionamento.               ");
            }
        } catch (IOException e) {
            System.out.println("                       Ocorreu um erro!                 ");
            e.printStackTrace();
        }
        System.out.println("============================================================");
        System.out.println("\n");
    }

    public void inserirVeiculoNoRelatorio(Veiculo veiculo) {
        try {
            FileWriter myWriter = new FileWriter("relatorio_"+ LocalDate.now() +".txt");
            myWriter.write(veiculo.toString());
            myWriter.close();
        } catch (IOException e) {
            System.out.println("Ocorreu um erro ao salvar relatorio.");
            e.printStackTrace();
        }
    }
}
