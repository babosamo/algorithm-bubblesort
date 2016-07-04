public class Main {

    public static void main(String[] args) {
        Node node = initNode(7);
        showNodeValue(node);
        System.out.println("bubble sorting !!! \n\n");
        node = bubbleSort(node);
        System.out.println("\nbubble sort finish!!! \n");
        showNodeValue(node);
    }

    public static Node initNode(int n){

        Node startNode = new Node();
        int value = (int) (Math.random() * n);
        startNode.setValue(value);
        Node prev = startNode;
        for(int i = 0; i < n ; i ++){
            Node node = new Node();
            value = (int) (Math.random() * n);
            node.setValue(value);
            prev.setNextNode(node);
            prev = node;

        }
        return startNode;
    }

    public static void showNodeValue(Node node){
        Node currentNode = node;

        while(currentNode.getNextNode() != null){
            System.out.print(currentNode .getValue()  + " <- ");
            currentNode = currentNode.getNextNode();
        }
        System.out.println(currentNode.getValue());
    }

    public static Node bubbleSort(Node node){
        Node header = node;
        boolean isChanged = true;
        if(node != null && node.getNextNode() != null){
            int i = 0;
            while(isChanged) {
                Node prevNode = null;
                Node current = header;
                Node nextNode = current.getNextNode();
                isChanged = false;
                while (!current.isLast()) {
                    if (current.getValue() > nextNode.getValue()) {
                        if (header == current) {
                            header = nextNode;
                        } else {
                            prevNode.setNextNode(nextNode);
                        }
                        current.setNextNode(nextNode.getNextNode());
                        nextNode.setNextNode(current);
                        isChanged = true;
                        current = nextNode;
                    }
                    prevNode = current;
                    current = prevNode.getNextNode();
                    nextNode = current.getNextNode();
                }
                System.out.println("[ " + i + "] cycle finished" );
                i++;
                showNodeValue(header);
            }

        }
        return header;
    }
}
