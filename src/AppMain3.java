import node2.FirstLastList;

public class AppMain3 {

    public static void main(String[] args){

        FirstLastList list = new FirstLastList();

        //вставка в начало списка:

        list.insertFirst(1,"Первый элемент");
        list.insertFirst(2,"Второй элемент");
        list.insertFirst(3,"Третий элемент");

        //вставка в конец списка:

        list.insertLast(4,"Последний элемент 1");
        list.insertLast(5, "последний элемент 2");
        list.insertLast(6, "Последний элемент 3");

        ////отображение списка:

       // list.displayList();

        /**
         * Удаление первых трех элементов:
         */

        list.deleteFirst();
        list.deleteFirst();
        list.deleteFirst();

        System.out.println();//

       // list.displayList();// вывести результат

        /**
         * Вставим новый элемент после 4 элемента
         */
        list.insertAfter(4,9, "Вставка нового элемента");
        list.insertAfter(9,10,"Еще один новый элемент!");

        list.displayList();// вывести результат

    }
}
