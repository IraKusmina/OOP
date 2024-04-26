package Seminar02HW;

import java.util.LinkedList;
import java.util.List;

public class Market {

    LinkedList<Actor> queue = new LinkedList<>();

    void acceptToMarket(Actor actor){
        System.out.println("Покупатель " + actor.getName() + " зашел в магазин");
    }

    void releaseFromMarket(List<Actor> actors){
        System.out.println("Покупатели покидают магазин");
    }
    //Отдать заказ
    void giveOrders(){
        if (!queue.isEmpty()){
            Actor currenActor = queue.get(0);
            if (!currenActor.isMakeOrder() && currenActor.isTakeOrder()){
                currenActor.setMakeOrder(true);
                System.out.println("Покупатель " + currenActor.getName() + " забрал свой заказ");
            }
            else {
                System.out.println("Покупатель " + currenActor.getName() + " не делал заказ");
                queue.remove(0);
            }
        }
        else{
            System.out.println("Очередь отстутствует");
        }
    }
    //Сделать заказ
    void takeOrders(){
        if (!queue.isEmpty()){
            Actor currenActor = queue.get(0);
            if (!currenActor.isTakeOrder){
                currenActor.setTakeOrder(true);
                System.out.println("Покупатель " + currenActor.getName() + " создал заказ");
                queue.remove(0);
            }
        }
        else {
            System.out.println("Очередь отстутствует");
        }
    }

    void takeInQueue(Actor actor){
        queue.add(actor);
        System.out.println("Покупатель " + actor.getName() +" встал в очередь");
    }

    void releaseFromQueue(Actor actor){
        if (!queue.isEmpty())
            if (queue.contains(actor)){
                queue.remove(actor);
                System.out.println("Покупатель " + actor.getName() +" вышел из очереди");
            }
            else{
                System.out.println("Покупатель " + actor.getName() +" не находится в очереди");
            }
        else {
            System.out.println("Очередь отстутствует");
        }
    }
}
