package com.kodilla.good.patterns.challenges;

public class Main {
    public static void main(String[] args) {
//        MovieStore movieStore = new MovieStore();
//
//        String moviesTranslations = movieStore.getMovies().entrySet().stream()
//                .flatMap(stringListEntry -> stringListEntry.getValue().stream())
//                .collect(Collectors.joining("!"));
//
//        System.out.println(moviesTranslations);

        OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever();
        OrderRequest orderRequest = orderRequestRetriever.retrieve();

        ProductOrderService productOrderService = new ProductOrderService(
                                            new SMSService(),
                                            new AllegroOrderService(),
                                            new AllegroProductsRepository());

        productOrderService.process(orderRequest);


    }


}
