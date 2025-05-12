package estacoes;

import caminhoes.CaminhaoPequeno;
import caminhoes.CaminhaoGrande;

public abstract class EstacaoTransferencia {
    protected String nome;
    protected int lixoArmazenado;

    public EstacaoTransferencia(String nome) {
        this.nome = nome;
        this.lixoArmazenado = 0;
    }

    public abstract void receberCaminhaoPequeno(CaminhaoPequeno caminhao);
    public abstract void descarregarParaCaminhaoGrande(CaminhaoGrande caminhao);

    // Getters
    public String getNome() { return nome; }
    public int getLixoArmazenado() { return lixoArmazenado; }
}