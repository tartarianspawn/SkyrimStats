package com.example.omarl.skyrimstats;

import java.util.ArrayList;

public class Potion {
    private String effect;
    ArrayList<String> ingredientList = new ArrayList<String>();

    /**
     * Makes a potion with the effect as the name
     * @param effect
     */
    public Potion(String effect){
        this.effect = effect;
    }

    /**
     * Adds an ingredient that can be used to make this potion
     * @param ingredient
     */
    public void addIngredient(String ingredient){
        ingredientList.add(ingredient);
    }

    public String toString(){
        return effect;
    }
}
