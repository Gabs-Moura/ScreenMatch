package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class PrincipalComListas {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("Vingadores: Ultimato",2019);
        meuFilme.avalia(10);
        Filme outroFilme = new Filme("Avatar",2023);
        outroFilme.avalia(7);
        var filmeGabriel = new Filme("GabsMoura: O Filme",2023);
        filmeGabriel.avalia(10);
        Serie greys = new Serie("Grey's Anatomy",2005);

        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(meuFilme);
        lista.add(outroFilme);
        lista.add(filmeGabriel);
        lista.add(greys);

        for (Titulo item: lista) {
            System.out.println(item.getNome());
            if(item instanceof Filme filme && filme.getClassificacao() > 2){
                System.out.println("Classificação " + filme.getClassificacao());
            }
        }

        ArrayList<String> buscaPorArtista = new ArrayList<>();
        buscaPorArtista.add("Adam Sandler");
        buscaPorArtista.add("Gabriel Moura");
        buscaPorArtista.add("Alura: O Filme");

        Collections.sort(buscaPorArtista);
        System.out.println(buscaPorArtista);

        Collections.sort(lista);
        System.out.println("Ordenado alfabeticamente:");
        System.out.println(lista);
        lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        System.out.println("Ordenado por ano de lancamento:");
        System.out.println(lista);
    }
}
