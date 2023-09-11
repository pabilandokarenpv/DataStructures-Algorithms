class Node {
    public int iData; 
    public Node next; 

    public Node(int id) { 
        iData = id;
    }
}

class LinkList {
    private Node first; 

    public LinkList() { 
        first = null;
    }

    public Node find(int key) { 
        Node current = first;
        while (current != null && current.iData != key)
            current = current.next;
        return current;
    }

    public void displayList() { 
        for (Node current = first; current != null; current = current.next)
            System.out.println(current.iData); 
    }

    public void insertFirst(int key) { 

        Node newNode = new Node(key);

        newNode.next = first;

        first = newNode;
    }

    public Node delete(int key) {
        Node current = first;
        Node previous = null;

        while (current != null && current.iData != key) {
            previous = current;
            current = current.next;
        }

        
        if (current == null) {
            return null;
        }

        
        if (previous != null) {
            previous.next = current.next;
        } else {
            
            first = current.next;
        }

        return current;
    }
}

class LinkListApp {
    public static void main(String[] args) {
        LinkList theList = new LinkList(); 
        theList.insertFirst(22);
        theList.insertFirst(44);
        theList.insertFirst(66);
        Node d = theList.delete(44);
        d = theList.delete(88);
        theList.displayList(); 
    } 
}
