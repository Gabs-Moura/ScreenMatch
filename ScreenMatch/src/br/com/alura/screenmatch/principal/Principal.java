package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculos.FiltroRecomendacao;
import br.com.alura.screenmatch.modelos.Episodio;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("Vingadores: Ultimato",2019);
        meuFilme.setDuracaoEmMinutos(182);
        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(10);
        meuFilme.avalia(9.5);
        System.out.println("Total de avaliações: " + meuFilme.getTotalDeAvaliacoes());
        System.out.println(meuFilme.pegaMedia());


        Serie greys = new Serie("Grey's Anatomy",2005);


        greys.exibeFichaTecnica();
        greys.setTemporadas(19);
        greys.setEpPorTemp(26);
        greys.setMinPorEp(45);
        System.out.println("Duração para maratonar Grey's Anatomy -> " + greys.getDuracaoEmMinutos());


        Filme outroFilme = new Filme("Avatar",2023);
        outroFilme.setDuracaoEmMinutos(200);
        outroFilme.exibeFichaTecnica();


        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(meuFilme);
        calculadora.inclui(outroFilme);
        calculadora.inclui(greys);
        System.out.println(calculadora.getTempoTotal());


        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(meuFilme);


        Episodio episodio = new Episodio();
        episodio.setNumero(23);
        episodio.setSerie(greys);
        episodio.setTotalVizualizacoes(3000);
        filtro.filtra(episodio);


        var filmeGabriel = new Filme("GabsMoura: O Filme",2023);


        filmeGabriel.avalia(10);
        filmeGabriel.setDuracaoEmMinutos(200);
        filmeGabriel.exibeFichaTecnica();


        ArrayList<Filme> listaDeFilmes = new ArrayList<>();
        listaDeFilmes.add(meuFilme);
        listaDeFilmes.add(outroFilme);
        listaDeFilmes.add(filmeGabriel);
        System.out.println("Tamanho da lista " + listaDeFilmes.size());
        System.out.println("Primeiro filme " + listaDeFilmes.get(0));
        System.out.println(listaDeFilmes);
    }
}
