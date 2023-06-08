package br.com.alura.screenmatch.modelos;

import br.com.alura.screenmatch.calculos.Classificacao;

public class Episodio implements Classificacao {
    private int numero;
    private String nome;
    private Serie serie;
    private int totalVizualizacoes;

    public void setTotalVizualizacoes(int toralVizualizacoes) {
        this.totalVizualizacoes = toralVizualizacoes;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setSerie(Serie serie) {
        this.serie = serie;
    }

    @Override
    public int getClassificacao() {
        if (totalVizualizacoes > 100){
            return 4;
        } else{
            return 2;
        }
    }
}
