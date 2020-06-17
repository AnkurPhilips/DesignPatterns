package com.creational.prototype;

import java.util.HashMap;
import java.util.Map;

public class Registry {
    private Map<String,Item> items = new HashMap<>();

    public Registry(){
        loadItems();
    }

    private void loadItems() {

        //These are the prototypes which will be cloned to create multiple instances. This creates reusable parts of an object.

        Movie movie = new Movie();
        movie.setTitle("Basic Movie");
        movie.setPrice(24.99);
        movie.setRunTime("2 hours");

        items.put("Movie",movie);

        Book book = new Book();
        book.setTitle("Basic Book");
        book.setPrice(19.99);
        book.setNumberOfPages(335);

        items.put("Book", book);
    }

    public Item createItem(String type){
        Item item = null;
        try {
            item = (Item) items.get(type).clone();
        }
        catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
        return item;
    }
}
