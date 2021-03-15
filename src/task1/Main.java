package task1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Ingredient ingredient = new Ingredient("чай", Measurements.грамм, "Зеленый");
        Ingredient ingredient1 = new Ingredient("кофе", Measurements.грамм, "Арабика");
        Ingredient ingredient2 = new Ingredient("малина", Measurements.кг, "Украина");
        Ingredient ingredient3 = new Ingredient("молоко", Measurements.милилитр, "Украина");


        IngredientForMeal ingredientForMeal = new IngredientForMeal(ingredient, 20);
        IngredientForMeal ingredientForMeal1 = new IngredientForMeal(ingredient1, 30);
        IngredientForMeal ingredientForMeal2 = new IngredientForMeal(ingredient2, 4);
        IngredientForMeal ingredientForMeal3 = new IngredientForMeal(ingredient, 50);


        ArrayList<IngredientForMeal> ing1 = new ArrayList<>();
        ing1.add(ingredientForMeal);
        ing1.add(ingredientForMeal2);

        ArrayList<IngredientForMeal> ing2 = new ArrayList<>();
        ing2.add(ingredientForMeal1);
        ing2.add(ingredientForMeal3);

        Meal meal = new Meal("Чай с малиной", ing1, "легкий чай с малиной", 25, new Time(0, 5));

        Meal meal1 = new Meal("кофе с молоком", ing2, "крепкий кофе с молоком", 40, new Time(0, 10));


        //System.out.println(meal);

        Order order = new Order();
        order.addMeal(meal);
        order.addMeal(meal1);

        System.out.println(order);
        Order order1 = new Order();
        order.addMeal(meal);
        order.addMeal(meal1);


        Orders orders = new Orders();
        orders.Add(order);
        orders.Add(order1);

        orders.Finish(1);

        System.out.println(orders);
        
    }
}
