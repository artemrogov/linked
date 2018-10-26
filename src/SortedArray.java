import array.Node;
import array.SortedList;

public class SortedArray {


    public static void main(String[] args){

        int size = 8;

        Node[] linkArray = new Node[size];

       for (int i = 0;i<size; i++ ){

            int n = (int)(java.lang.Math.random()*99);

            Node newItem = new Node(n);

            linkArray[i] = newItem;

        }

       System.out.println("Не отсортированный массив: ");


        for (int j = 0; j<linkArray.length; j++){

            System.out.print(linkArray[j].getData() + " ");
        }

        System.out.println();

        SortedList sortedList = new SortedList(linkArray);



       for (int k = 0; k<size; k++){
            linkArray[k] = sortedList.remove();
        }

        System.out.println("Вывод отсортированного массива: ");

        for (int u = 0; u<size; u++){
            System.out.print(linkArray[u].getData() + " ");
        }

    }


}
