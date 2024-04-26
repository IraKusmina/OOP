package Seminar02HW;

import java.util.ArrayList;
import java.util.List;

public class Main {
   
    public static void main(String[] args) {
        Market market = new Market();

        List<Actor> humans = new ArrayList<>();
    
        humans.add(new Human("Tom"));
        humans.add(new Human("Kate"));
        humans.add(new Human("Jhon"));
        humans.add(new Human("Julia"));
        
    
        for (Actor people : humans) {
            market.acceptToMarket(people);
            market.takeInQueue(people);
        }
        market.takeOrders();
        market.giveOrders();
        market.takeOrders();

        market.takeOrders();
        market.giveOrders();
        
        market.releaseFromMarket(humans);
    }
}
