package com.fasttrack;

import lombok.Getter;

@Getter

public class Quote {

    private int id = 0;
    private String author;
    private String quote;
    private boolean favourite;

    public Quote() {

    }

    public Quote(String author, String quote, int id) {
        this.author = author;
        this.quote = quote;
        this.id = id;
    }

    public Quote(int id, String author, String quote, boolean favourite) {
        this.id = id;
        this.author = author;
        this.quote = quote;
        this.favourite = favourite;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setFavourite(boolean favourite) {
        this.favourite = favourite;
    }

    @Override
    public String toString() {
        return "Quote{" +
                "id=" + id +
                ", author='" + author + '\'' +
                ", quote='" + quote + '\'' +
                ", favourite=" + favourite +
                '}';
    }
}
