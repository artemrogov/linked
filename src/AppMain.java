import node.Node;

public class AppMain {

    public static void main(String[] args){

        /**
         * простой пример, простой список
         */

        Node item1 = new Node("Root",10);
        Node item2 = new Node("Item 2",20);
        Node item3 = new Node("Item 3",10);
        Node itemEnd = new Node("End Item", 10);

        item1.next = item2;
        item2.next = item3;
        item3.next = itemEnd;

        ///вставка в начало

        //сохранение ссылки на список
        Node oldFirstItem = item1;

        ///создание нового объекта
        item1 = new Node("New Root");

        // связывание со старым элементом
        item1.next = oldFirstItem;

        //вставка в конец списка:

        Node oldEndItem = itemEnd;

        Node lastNewItem = new Node("New Last Item");

        oldEndItem.next = lastNewItem;


        //удаление из начала СС:
        item1 = item1.next;


        /**
         * Вывод содержимого списка:
         */

        while(item1!=null){
            System.out.println(item1.getStrData());
            item1 = item1.next;
        }

    }
}
