package br.com.caelum.ingresso.validacao;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;


import br.com.caelum.ingresso.model.Filme;

public class TestaStreams {

	public static void main(String[] args) {
		Filme f1 = new Filme("Terminador", Duration.ofHours(1), "Ação", null);
		Filme f2 = new Filme("Predador", Duration.ofHours(1), "Drama", null);
		Filme f3 = new Filme("Duro de Matar", Duration.ofHours(1), "Drama", null);

		List<Filme> filmes = Arrays.asList(f1, f2, f3);

		System.out.println("Filmes:");
//		filmes.stream().forEachOrdered(f -> System.out.println(f.getNome()));
		filmes.stream()
			.map(f -> f.getNome())
			.forEach(System.out::println);

		System.out.println("- - - - - -");

		System.out.println("Dramas:");
		filmes.stream()
			.filter(f -> "Drama".equals(f.getGenero()))
			.map(f -> f.getNome())
			.sorted()
			.forEach(System.out::println);
	}
}