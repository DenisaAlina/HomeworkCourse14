package com.fasttrack;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        QuoteService quoteService = new QuoteService(ReadingFromFile.readingAllQuotes("File/quotes.txt"));
        System.out.println(quoteService.getAllQuotes());
        System.out.println(quoteService.getQuotesForAuthor("Napoleon Hill"));
        System.out.println(quoteService.getAuthors());
        quoteService.setFavourite(5420);
        quoteService.setFavourite(1);
        System.out.println(quoteService.getFavourites());
        System.out.println(quoteService.getRandomQuote());
    }
}
