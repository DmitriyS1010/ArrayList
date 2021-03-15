package task1;

public class IngredientForMeal {

    private Ingredient ingredient;
    private int quantity;


    public IngredientForMeal(Ingredient ingredient, int quantity) {
        this.setIngredient(ingredient);
        this.setQuantity(quantity);
    }

    public Ingredient getIngredient() {
        return ingredient;
    }

    public void setIngredient(Ingredient ingredient) {
        this.ingredient = ingredient;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "IngredientForMeal{" +
                "ingredient=" + ingredient +
                ", quantity=" + quantity +
                '}';
    }
}
