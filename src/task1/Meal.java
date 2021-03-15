package task1;

import java.util.ArrayList;

public class Meal {


    private String nameOfMeal;
    private ArrayList<IngredientForMeal> ingredients;
    private String desc;
    private int quantityOfCalories;
    private Time time;

    public Meal(String nameOfMeal, ArrayList<IngredientForMeal> ingredients, String desc, int quantityOfCalories, Time time) {
        this.nameOfMeal = nameOfMeal;
        this.ingredients = ingredients;
        this.desc = desc;
        this.quantityOfCalories = quantityOfCalories;
        this.time = time;
    }

    public String getNameOfMeal() {
        return nameOfMeal;
    }

    public void setNameOfMeal(String nameOfMeal) {
        this.nameOfMeal = nameOfMeal;
    }

    public ArrayList<IngredientForMeal> getIngredients() {
        return ingredients;
    }

    public void setIngredients(ArrayList<IngredientForMeal> ingredients) {
        this.ingredients = ingredients;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getQuantityOfCalories() {
        return quantityOfCalories;
    }

    public void setQuantityOfCalories(int quantityOfCalories) {
        this.quantityOfCalories = quantityOfCalories;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "Meal{" +
                "nameOfMeal='" + nameOfMeal + '\'' +
                ", ingredients=" + ingredients +
                ", desc='" + desc + '\'' +
                ", quantityOfCalories=" + quantityOfCalories +
                ", time=" + time +
                '}';
    }
}
