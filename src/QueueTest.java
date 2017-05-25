import java.util.Scanner;

public class QueueTest {
    public static void queueTest() {
        CollectionQueue <String> queueCollection = new CollectionQueue<>();
        Scanner input = new Scanner(System.in);
        queueCollection.printMenu();
        boolean test;
        System.out.println("Введите элементы коллекции.");
        do {
            String choice = input.nextLine();
            if (choice.equals("y")) {
                test = false;
                queueCollection.queueElem();
                return;
            }

            if (choice.equals("Y")) {
                test = false;
                queueCollection.queueElem();
                return;

            } else {
                queueCollection.addObject(choice);
                queueCollection.queueElem();
                test = true;
            }
        }
        while (test=true);

    }

}
