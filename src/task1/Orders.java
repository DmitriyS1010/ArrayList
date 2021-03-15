package task1;

import java.util.ArrayList;

public class Orders {

    private ArrayList<Order> orders;
    private int idCount;

    public Orders() {
        orders = new ArrayList<>();
        idCount = 0;
    }


    public void Remove(int id) {
        for (int i = 0; i < orders.size(); i++) {
            if (id == orders.get(i).getId()) {
                orders.remove(i);
            }
        }
    }

    public void Finish(int id) {
        for (int i = 0; i < orders.size(); i++) {
            if (id == orders.get(i).getId()) {
                orders.get(i).setDone(true);
                return;
            }
        }
    }


    public void Add(Order order) {
        order.setId(++idCount);
        orders.add(order);
    }


    public Orders searchByTitle(String title) {

        Orders temp = new Orders();


        for (int i = 0; i < orders.size(); i++) {
            for (Meal meal : orders.get(i).getMeals()) {
                if (meal.getNameOfMeal().contains(title)) {
                    temp.Add(orders.get(i));

                }


            }


        }


        return temp;
    }

   public Orders falseOrders(){
        Orders temp = new Orders();

       for (int i = 0; i <orders.size() ; i++) {
           if (orders.get(i).isDone()==false){

               temp.Add(orders.get(i));
           }


       }



        return temp;
   }

    @Override
    public String toString() {
        return "Orders{" +
                "orders=" + orders +
                ", idCount=" + idCount +
                '}';
    }
}
