package node;
import node.Node;

public class LinkList {

    private Node first;

    public void LinkList()
    {
        first = null;
    }

    public boolean isEmpty(){
        return (first==null);
    }


    public void insertFirst(int id, String str){

        Node newLink = new Node(str, id);
        newLink.next = first;
        first = newLink;
    }

    public Node deleteFirst(){

        Node temp = first; // Сохранение ссылки

        first = first.next; // Удаление: first->ссылка на второй элемент

        return temp; // Метод возвращает ссылку на удаленный элемент
    }

    ///Поиск элемента с заданным ключом
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
    ///Удаление элемента с заданным ключом
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

    public void insert(int id, String str){

        Node newLink = new Node(str,id);
        Node previous = null;

        Node current = first;

        while(current!=null){

            previous = current;
            current = current.next;

        }
        if (previous==null){
            first = newLink;
        }
        else {
            previous.next = newLink;
            newLink.next = current;
        }

    }


    public void printList(){

        Node current = first;

        while(current !=null){

            current.displayItem();
            current = current.next;

        }
    }

}
