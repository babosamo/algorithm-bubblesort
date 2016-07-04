/**
 * Created by babosamo on 2016. 7. 1..
 */
public class Node {

    private int value;
    private Node nextNode;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Node getNextNode() {
        return nextNode;
    }

    public void setNextNode(Node nextNode) {
        this.nextNode = nextNode;
    }

    public boolean isLast(){
        if(nextNode == null){
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }
}
