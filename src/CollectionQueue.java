import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class CollectionQueue<E> {
    Queue<E> queue = new LinkedList<E>();
    Scanner elem = new Scanner(System.in);
    int size;

    public void printMenu() {
        System.out.println("Задайте размер коллекции: ");
        System.out.println("1: по умолчанию 16.");
        System.out.println("2: по указанию пользователя.");
        optionMenu();
    }

    public void optionMenu(){
        String a = elem.next();
        switch (a) {
            case "1":
                fixedSize();
                break;
            case "2":
                specifiedSize();
                break;
            default:
                notSize();
                break;
        }
    }

    public E addObject(E object) {
        if (queue.size() < size) {
            queue.offer(object);
        }else {
            queue.poll();
            queue.offer(object);
        }
        return object;
    }

    public void queueElem(){
        System.out.println(queue + " - выход \"Y\"");
    }

    public void fixedSize(){
        size = 16;
    }

    public void specifiedSize(){
        System.out.println("Введите размер: ");
        if (elem.hasNextInt()) {
            size = elem.nextInt();
            System.out.println("Размер коллекции [" + size + "], после инициализации не меняется.");
        }
    }

    public void notSize(){
        System.out.println("Не корректный ввод, еще раз: ");
        optionMenu();

    }
}