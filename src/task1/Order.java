package task1;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.TimeZone;

public class Order {



    private int id;
    private Calendar timeOfOrder;
    private ArrayList<Meal> meals;
    private boolean isDone;


public Order(){

    this.isDone=false;
    meals=new ArrayList<>();
   this.timeOfOrder=Calendar.getInstance(TimeZone.getTimeZone("UTC"));


}


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Calendar getTimeOfOrder() {
        return timeOfOrder;
    }

    public void setTimeOfOrder(Calendar timeOfOrder) {
        this.timeOfOrder = timeOfOrder;
    }

    public ArrayList<Meal> getMeals() {
        return meals;
    }

    public void setMeals(ArrayList<Meal> meals) {
        this.meals = meals;
    }

    public boolean isDone() {
        return isDone;
    }

    public void setDone(boolean done) {
        isDone = done;
    }



    public void addMeal(Meal meal){
this.meals.add(meal);


    }

public void  remove(String title){

    for (int i = 0; i <meals.size() ; i++) {

        if (title.equalsIgnoreCase(meals.get(i).getNameOfMeal())){

            meals.remove(i);
        }


    }


}


    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", timeOfOrder=" + timeOfOrder +
                ", meals=" + meals +
                ", isDone=" + isDone +
                '}';
    }
}
