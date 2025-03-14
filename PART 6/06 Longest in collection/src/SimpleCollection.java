/**
 * @author SEB
 */

import java.util.ArrayList;

public class SimpleCollection {
    private String name;
    private ArrayList<String> elements;

    public SimpleCollection (String givenName) {
        this.name = givenName;
        this.elements = new ArrayList<>();
    }

    public void add(String el) {
        this.elements.add(el);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }

    public String longest () {
        if (this.elements.isEmpty()) {
            return null;
        }

        String longest = "";
        for (String string : elements) {
            if (string.length() > longest.length()) {
                longest = string;
            }
        }

        return longest;
    }
}