package node;

public class Node {

    private String strData;
    private int numberData;

    public Node next;

    public Node(String strData){
        this.strData = strData;
    }

    public Node(String strData, int numberData){

        this.strData = strData;
        this.numberData = numberData;

    }

    public String getStrData(){

        return this.strData;
    }

    public int getId(){

        return this.numberData;

    }

    public void displayItem(){

        System.out.println("id: " + this.getId() + "name: " + this.getStrData());

    }



}
