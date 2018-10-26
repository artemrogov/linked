package node;
import node.Node;

public class LinkList {

    private Node first; // Ссылка на первый элемент

    /**
     * Конструктор
     * Список пока не содержит элементов
     */
    public void LinkList()
    {

        first = null;
    }

    /**
     *
     * @return true если список пуст
     */
    public boolean isEmpty(){
        return (first==null);
    }

    /**
     * Вставляет новый элемент в начало списка. В этой позиции вставка выполняется проще всего, потому что first уже
     * уже указывает на первый элемент. Для того, чтобы вставить новый элемент, достаточно присвоить полю next созданного
     * объекта ссылку на предыдущий первый элемент, а затем изменить поле first так, чтобы оно указывало на только что
     * вставленный элемент.
     * @param id идентификатор элемента списка
     * @param str название элемента списка
     */
    public void insertFirst(int id, String str){

        Node newLink = new Node(str, id);
        newLink.next = first;
        first = newLink;
    }

    /**
     * Данный метод отсоединяет первый элемент, для чего в поле first заносится ссылка на второй элемент
     * который находится по значению поля next в первом элементе
     * @return temp ссылка на удаленный элемент
     */
    public Node deleteFirst(){

        Node temp = first; // Сохранение ссылки

        first = first.next; // Удаление: first->ссылка на второй элемент

        return temp; // Метод возвращает ссылку на удаленный элемент
    }

    /**
     *
     * @param key идентификатор элемента списка
     * @return current возврат найденного элмента
     */
    public Node find(int key){

        Node current = first;

        while(current.getId() != key ){

            if (current.next == null){
                return null;
            }
            else {
                current = current.next;
            }

        }
        return current;
    }

    /**
     * Удаляет элемент списка по его идентификатору
     * Этот метод должен хранить ссылку не только на текущий элемент списка(current), но
     * и на предыдущий элемент(previous). Это необходимо из-за того. что при удалении текущего элемента метод
     * должен связать предыдущий элемент со следующим. Для того чтобы обратиться к предыдущему элементу, необходимо
     * сохранить ссылку на него
     * @param key идентификатор элемента списка
     * @return current Возвращает удаленный элемент
     */
    public Node delete(int key){

        Node current = first;

        Node previous = first;

        while(current.getId() !=key){

            if (current.next == null){
                return null;
            }
            else {
                previous = current;
                current = current.next;
            }
        }
        if (current == first){
            first = first.next;
        }
        else {
            previous.next = current.next;
        }

        return current;

    }




    public void printList(){

        Node current = first;

        while(current !=null){

            current.displayItem();
            current = current.next;

        }
    }

}
