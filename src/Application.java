import interfaces.Transportation;
import model.*;

public class Application {

    private static final int WUHAN_TO_BEIJING_COST = 500;

    public static void main(String[] args) {
        // Question 1
        Cock cock = new Cock();
        Hen hen = new Hen();
        Chicken chicken = new Chicken();
        for (int cockNumber = 0; cockNumber <= 20; cockNumber++) {
            for (int henNumber = 0; henNumber <= 33; henNumber++) {
                int chickenNumber = 100 - cockNumber - henNumber;
                if (chickenNumber % 3 != 0) {
                    continue;
                }
                if (cock.money() * cockNumber + hen.money() * henNumber + chicken.money() * chickenNumber == 100) {
                    System.out.println("cock:" + cockNumber + " hen:" + henNumber + " chicken:" + chickenNumber);
                }
            }
        }
        // Question 2
        Transportation car = new Car();
        if (car.cost() <= WUHAN_TO_BEIJING_COST) {
            System.out.println("Xiaoming can choose car.");
        } else {
            System.out.println("Xiaoming can't choose car.");
        }
        Transportation bus = new Bus();
        if (bus.cost() <= WUHAN_TO_BEIJING_COST) {
            System.out.println("Xiaoming can choose bus.");
        } else {
            System.out.println("Xiaoming can't choose bus.");
        }
        Transportation train = new Train();
        if (train.cost() <= WUHAN_TO_BEIJING_COST) {
            System.out.println("Xiaoming can choose train.");
        } else {
            System.out.println("Xiaoming can't choose train.");
        }
        Transportation plane = new Plane();
        if (plane.cost() <= WUHAN_TO_BEIJING_COST) {
            System.out.println("Xiaoming can choose plane.");
        } else {
            System.out.println("Xiaoming can't choose plane.");
        }
    }
}
