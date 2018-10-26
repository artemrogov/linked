import node.*;

public class AppMain2 {

    public static void main(String args[]){

        LinkList list = new LinkList();

        list.insertFirst(1,"root");
        list.insertFirst(2,"Джинсы");
        list.insertFirst(3,"Майка");
        list.insertFirst(4,"Футболка");
        list.insertFirst(5,"Кросовки");

        list.printList(); // вывод элементов списка

        ///Поиск э-та с заданным ключом:
        Node findElement = list.find(2);

        if (findElement!=null){
            System.out.println("Найден элемент:  " + findElement.getId()+ " "+ findElement.getStrData());
        }
        else {
            System.out.println("Элемент не найден с ключом!");
        }

        Node deleteItem4 = list.delete(4); // удаление элемента списка по его ключу

        if (deleteItem4!=null){

            System.out.println("Вы удалили элемент: " + deleteItem4.getId() + " " + deleteItem4.getStrData());
        }
        else {
            System.out.println("Нет такого элемента");
        }

        list.printList(); // вывод элементов списка

        //вставка в связной список

        System.out.println();

        //вывод результатов на экран:
        list.printList();

    }
}
