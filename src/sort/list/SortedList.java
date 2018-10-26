package sort.list;
import node.Node;

public class SortedList {

    private Node first;

    public SortedList(){
        first = null;
    }

    public boolean isEmpty(){
        return (first==null);
    }

    public void insert(int key){

        Node newNode = new Node(key);
        Node previous = null;
        Node current = first;

        while(current!=null && key>current.getId()){
            previous = current;
            current = current.next;
        }

        if(previous==null){
            first = newNode;
        }
        else {
            previous.next = newNode;
        }
        newNode.next = current;
    }

    /**
     * Удаление первого элемента
     * @return temp
     */
    public Node remove(){

        Node temp = first;
        first = first.next;

        return temp;
    }

    public void displayList(){

        Node current = first;

        while(current!=null){
            current.displayItem();
            current = current.next;
        }

        System.out.println();
    }

}
