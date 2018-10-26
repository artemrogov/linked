package array;
import array.Node;

public class SortedList {

    private Node first;



    public SortedList(){
        first = null;
    }

    /**
     * конструктор
     * @param linkArr массив с данными
     */

    public SortedList(Node[] linkArr){

        first = null;

        for (int i = 0; i<linkArr.length; i++)
            insert(linkArr[i]);

    }

    public void insert(Node item){

        Node previous = null;
        Node current = first;

        while(current!=null && item.getData() > current.getData()){

            previous  = current;
            current = current.next;

        }
        if (previous==null)
            first = item;

        else
            previous.next = item;

        item.next = current;
    }

    /**
     * Возвращает и удаляет первую ссылку
     * @return
     */
    public Node remove(){

        Node temp = first;
        first = first.next;
        return temp;

    }

}
