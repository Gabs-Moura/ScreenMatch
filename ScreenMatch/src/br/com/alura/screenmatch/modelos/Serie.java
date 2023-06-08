package br.com.alura.screenmatch.modelos;

public class Serie extends Titulo{
    private int temporadas;
    private boolean ativa;
    private int epPorTemp;
    private int minPorEp;


    public Serie(String nome, int anoDeLancamento) {
        super(nome, anoDeLancamento);
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public void setEpPorTemp(int epPorTemp) {
        this.epPorTemp = epPorTemp;
    }

    public void setMinPorEp(int minPorEp) {
        this.minPorEp = minPorEp;
    }

    @Override
    public int getDuracaoEmMinutos() {
        return temporadas * epPorTemp * minPorEp;
    }

    @Override
    public String toString() {
        return "Série: " + this.getNome() + " (" + this.getAnoDeLancamento() + ")";
    }
}
