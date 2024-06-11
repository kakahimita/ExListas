package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Filmes;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class PrincipalComListas {
    public static void main(String[] args) {


        Filmes meuFilme = new Filmes("jengiskan", 2015);
        meuFilme.avalia(9);
        Filmes outroFilme = new Filmes("Aventura de verdade", 2045);
        outroFilme.avalia(6);
        Filmes filmeDopaulo = new Filmes("dogville", 2000);
        filmeDopaulo.avalia(10);
        Serie lost = new Serie("Lost", 2000);


        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(meuFilme);
        lista.add(outroFilme);
        lista.add(filmeDopaulo);
        lista.add(lost);

        for (Titulo titulo : lista) {
            System.out.println(titulo.getNome());
            if (titulo instanceof Filmes filme) {
                System.out.println("Classificação " + filme.getClassificacao());
            }
        }

        ArrayList<String> buscarPorArtista = new ArrayList<>();
        buscarPorArtista.add("Adam");
        buscarPorArtista.add("Caqueline");
        buscarPorArtista.add("Baulo");
        buscarPorArtista.add("Duis");
        System.out.println(buscarPorArtista);

        Collections.sort(buscarPorArtista);
        System.out.println("Depois da ordenação");
        System.out.println(buscarPorArtista);
        System.out.println("Lista de titulos ordenados");
        Collections.sort(lista);
        System.out.println(lista);
        lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        System.out.println("Ordenando por ano");
        System.out.println(lista);




        

    }
}
