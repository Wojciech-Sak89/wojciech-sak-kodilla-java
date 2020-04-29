package com.kodilla.good.patterns.challenges;

import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        MovieStore movieStore = new MovieStore();

        String moviesTranslations = movieStore.getMovies().entrySet().stream()
                .flatMap(stringListEntry -> stringListEntry.getValue().stream())
                .collect(Collectors.joining("!"));

        System.out.println(moviesTranslations);

    }


}
