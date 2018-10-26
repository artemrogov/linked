import sort.list.SortedList;

public class SortedListApp {


    public static void main(String[] args){

        SortedList list = new SortedList();

        list.insert(18);
        list.insert(10);
        list.insert(20);
        list.insert(5);
        list.insert(2);
        list.insert(30);

        list.displayList();


        list.remove();
        list.remove();
        list.remove();
        list.remove();

        list.displayList();




    }



}
