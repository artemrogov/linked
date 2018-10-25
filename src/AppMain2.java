import node.*;

public class AppMain2 {

    public static void main(String args[]){

        LinkList list = new LinkList();

        list.insertFirst(1,"root");
        list.insertFirst(2,"Джинсы");
        list.insertFirst(3,"Майка");
        list.insertFirst(4,"Футболка");
        list.insertFirst(5,"Кросовки");

        list.printList();

        ///Поиск э-та с заданным ключом:
        Node findElement = list.find(2);

        if (findElement!=null){
            System.out.println("Найден элемент:  " + findElement.getId()+ " "+ findElement.getStrData());
        }
        else {
            System.out.println("Элемент не найден с ключом!");
        }

        Node deleteItem4 = list.delete(4);

        if (deleteItem4!=null){

            System.out.println("Вы удалили элемент: " + deleteItem4.getId() + " " + deleteItem4.getStrData());
        }
        else {
            System.out.println("Нет такого элемента");
        }

        list.printList();

        //вставка в связной список

        System.out.println();

        //Создание и вставка нового элемента в СС
        list.insert(8,"New Element");

        //вывод результатов на экран:
        list.printList();

    }
}
