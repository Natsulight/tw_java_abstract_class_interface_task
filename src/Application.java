import model.Chicken;
import model.Cock;
import model.Hen;

public class Application {

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
    }
}
