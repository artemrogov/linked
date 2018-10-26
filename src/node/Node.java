package node;

/**
 *
 * @author Artem Rogov
 */
public class Node {

    private String strData; // название элемента списка

    private int numberData; // идентификатор элемента

    public Node next; // следующий элемент в списке

    public Node previous; // Предыдущий элемент в списке

    private long dataInt; // числовые данные


    public Node(int key){
        this.numberData = key;
    }

    public Node(long dd){ this.dataInt = dd;}

    public Node(int key, long dd) { this.numberData = key; this.dataInt = dd;}

    /**
     * Конструктор, который принимает только один параметр:
     * @param strData Название элемента
     */
    public Node(String strData){
        this.strData = strData;
    }

    /**
     * Конструктор, который принимает следующие параметры, для
     * инициализации нового элемента в списке.
     *
     * @param strData название элемента
     * @param numberData идентификатор элемента
     */
    public Node(String strData, int numberData){

        this.strData = strData;
        this.numberData = numberData;

    }

    /**
     *
     * @return strData возврат названия элемента списка
     */
    public String getStrData(){

        return this.strData;
    }

    /**
     *
     * @return numberData возврат идентификатора элемента списка
     */
    public int getId(){

        return this.numberData;

    }

    /**
     * Выводит на экран элемент списка
     */
    public void displayItem(){

        System.out.println("id: " + this.getId() + " name: " + this.getStrData());

    }

    public long getDataInt(){

        return this.dataInt;

    }


}
