public class EstatisticasSimulacao {
    private int lixoTotalColetado = 0;
    private int totalViagens = 0;
    private int tempoTotalEspera = 0;
    private int caminhõesGrandesUsados = 0;

    public void registrarColeta(int quantidade) {
        lixoTotalColetado += quantidade;
    }

    public void registrarViagem() {
        totalViagens++;
    }

    public void registrarEspera(int tempo) {
        tempoTotalEspera += tempo;
    }

    public void registrarNovoCaminhaoGrande() {
        caminhõesGrandesUsados++;
    }

    public void imprimirResumo() {
        System.out.println("Lixo total coletado: " + lixoTotalColetado + "kg");
        System.out.println("Total de viagens: " + totalViagens);
        System.out.println("Tempo médio de espera: " + (totalViagens > 0 ? tempoTotalEspera / totalViagens : 0) + " minutos");
        System.out.println("Caminhões grandes utilizados: " + caminhõesGrandesUsados);
    }
}
