package model;

import java.time.LocalDateTime;

public class Veiculo {

    public String placa;
    private LocalDateTime data_ent;
    private LocalDateTime data_saida;
    private String tipoVeiculo;

    public Veiculo() {}

    public Veiculo(String placa, LocalDateTime data_ent, LocalDateTime data_saida, String tipoVeiculo) {
        this.placa = placa;
        this.data_ent = data_ent;
        this.data_saida = data_saida;
        this.tipoVeiculo = tipoVeiculo;
    }

    public LocalDateTime getData_saida() {
        return data_saida;
    }

    public void setData_saida(LocalDateTime data_saida) {
        this.data_saida = data_saida;
    }

    public String getTipoVeiculo() {
        return tipoVeiculo;
    }

    public void setTipoVeiculo(String tipoVeiculo) {
        this.tipoVeiculo = tipoVeiculo;
    }

    public static int readInt(String s) {
        return 0;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public LocalDateTime getData_ent() {
        return data_ent;
    }

    public void setData_ent(LocalDateTime data_ent) {
        this.data_ent = data_ent;
    }

    @Override
    public String toString() {
        return "Veiculo{" +
                "placa='" + placa + '\'' +
                ", data_ent=" + data_ent +
                ", data_saida=" + data_saida +
                ", tipoVeiculo='" + tipoVeiculo + '\'' +
                '}';
    }
}