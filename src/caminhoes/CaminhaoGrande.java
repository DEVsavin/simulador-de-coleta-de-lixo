package caminhoes;

public abstract class CaminhaoGrande {
    protected int capacidadeMaxima = 20000;
    protected int cargaAtual;
    protected int viagensRealizadas;

    public void carregar(int quantidade) {
        cargaAtual += quantidade;
        if (cargaAtual > capacidadeMaxima) {
            cargaAtual = capacidadeMaxima;
        }
    }

    public boolean prontoParaPartir() {
        return cargaAtual >= capacidadeMaxima;
    }

    public void descarregar() {
        System.out.println("Caminhão grande partiu para o aterro com " + cargaAtual + "kg.");
        viagensRealizadas++;
        cargaAtual = 0;
    }

    public int getViagensRealizadas() {
        return viagensRealizadas;
    }
}