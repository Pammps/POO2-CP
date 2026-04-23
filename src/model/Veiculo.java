package model;

public abstract class Veiculo {
    private String placa;
    private double capacidadeCarga;

    public Veiculo(String placa, double capacidadeCarga) {
        this.placa = placa;
        setCapacidadeCarga(capacidadeCarga);
    }

    public String getPlaca() {
        return placa;
    }

    public double getCapacidadeCarga() {
        return capacidadeCarga;
    }

    public void setCapacidadeCarga(double capacidadeCarga) {
        if (capacidadeCarga < 0) {
            throw new IllegalArgumentException("Capacidade não pode ser negativa");
        }
        this.capacidadeCarga = capacidadeCarga;
    }
}