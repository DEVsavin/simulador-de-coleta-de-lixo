public class ConfiguracaoSimulacao {
    public int[] capacidadesPequenos = {2000, 4000, 8000, 10000}; // kg
    public int capacidadeGrande = 20000;

    public int tempoMinViagemPico = 5;
    public int tempoMaxViagemPico = 10;
    public int tempoMinViagemNormal = 2;
    public int tempoMaxViagemNormal = 6;

    public int maxViagensPequeno = 10;

    public int[] geracaoMinimaLixo = {500, 400, 300, 600, 350}; // por zona
    public int[] geracaoMaximaLixo = {1000, 900, 800, 1200, 950};

    public int tempoMaxEsperaPequeno = 15; // em minutos
    public int toleranciaEsperaGrande = 10; // em minutos
}
