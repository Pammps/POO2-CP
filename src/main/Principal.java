package main;

import model.Caminhao;
import model.Pacote;
import model.Veiculo;
import service.Rota;

public class Principal {
    public static void main(String[] args) {

        Veiculo caminhao = new Caminhao("ABC1234", 500, 6);

        Pacote pacote = new Pacote("BR999", 10.5);

        Rota rota = new Rota(pacote, caminhao);
        rota.iniciarEntrega();
    }
}