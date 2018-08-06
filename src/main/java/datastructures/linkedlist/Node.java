package datastructures.linkedlist;

public class Node {

    private int data;
    private Node link;


    public Node(int data, Node link) {
        this.data = data;
        this.link = link;
    }

    public Node()
    {
        this.data = 0;
        this.link = null;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node getLink() {
        return link;
    }

    public void setLink(Node link) {
        this.link = link;
    }



    @Override
    public String toString() {
        return "Node{" +
                "data=" + data +
                ", link=" + link +
                '}';
    }

}
