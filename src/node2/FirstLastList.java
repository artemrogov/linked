package node2;
import node.Node;
public class FirstLastList {

    private Node first; // ссылка на первый элемент
    private Node last; // ссылка на последний элемент


    public FirstLastList(){
        first = null;   // Список пока не содержит элементов
        last = null;
    }

    public boolean isEmpty(){  // true, Если список пуст
        return first==null;
    }

    /**
     * Вставка элемента в начало списка
     * @param id идентификатор элемента списка
     * @param data название элемента списка
     */
    public void insertFirst(int id, String  data) {
        Node newNode = new Node(data, id);

        if (isEmpty())
            last = newNode;
        newNode.next = first;
        first = newNode;

    }

    /**
     * Вставка элемента в конец списка
     * @param id идентификатор элемента списка
     * @param data название элемента списка
     */

    public void insertLast(int id, String data){
        Node newNode = new Node(data, id);
        if (isEmpty())
            first = newNode;
        else
            last.next = newNode;
        last = newNode;
    }

    /**
     * Удаление первого элемента списка
     * (предполагается, что список не пуст)
     * @return temp
     */
    public int deleteFirst(){
        int temp = first.getId();
        if (first.next == null)
            last = null;
        first = first.next;

        return temp;
    }

    /**
     * Вывод элементов списка
     */
    public void displayList(){

        Node current = first;

        while(current!=null){
            current.displayItem();
            current = current.next;
        }
    }

    public boolean insertAfter(int key, int id, String name){

        Node current = first;
        /**
         * Пока не будет найденно совпадение
         */
        while(current.getId()!=key){

            current = current.next; //переход к следующему элементу

            if (current == null){

                return false; // Ключ не найден

            }

        }

        Node newLink = new Node(name, id);

        if (current==last) {
            newLink.next = null;
            last = newLink;
        }
        else {
            newLink.next = current.next;
            current.next.previous = newLink;
        }

        newLink.previous = current;
        current.next = newLink;

        return true;

    }

}
