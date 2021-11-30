package model;

import java.util.ArrayList;
//Singleton
public final class Veiculos {
    private static Veiculos instance;
    public ArrayList<Veiculo> veiculoArrayList;
    private Veiculo veiculo;


    public static synchronized Veiculos getInstance() {
        if (instance == null) {
            instance = new Veiculos();
        }

        return instance;
    }

    public Veiculos() {
        this.veiculoArrayList = new ArrayList<Veiculo>();
    }

    public Veiculos(ArrayList<Veiculo> veiculoArrayList) {
        this.veiculoArrayList = veiculoArrayList;
    }

    public void entradaVeic(Veiculo veiculo) {
       veiculoArrayList.add(veiculo);
    }

    public void saidaVeic(Veiculo veiculo) {
        veiculoArrayList.remove(veiculo);
    }


    public void imprimirTicket() {

    }

    @Override
    public String toString() {
        return "Veiculos{" +
                "veiculoArrayList=" + veiculoArrayList +
                '}';
    }
}
