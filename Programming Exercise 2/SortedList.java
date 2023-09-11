
import java.util.Iterator;
import java.util.Random;

public class SortedList<Item extends Comparable<Item>> implements Iterable<Item> {

    private class Node {
        Item item;
        Node next;
    }

    private Node first;

    public Iterator<Item> iterator() {
        return new Iterator<Item>() {
            Node node = first;

            public boolean hasNext() {
                return (node != null);
            }

            public Item next() {
                Item item = node.item;
                node = node.next;
                return item;
            }
        };
    }

    public String toString() {
        StringBuilder str = new StringBuilder();
        for (Item s : this) {
            str.append(s).append(" -> ");
        }
        return str.toString();
    }

    public void insertInOrder(Item item) {
        Node newNode = new Node();
        newNode.item = item;

        if (first == null || item.compareTo(first.item) <= 0) {
            
            newNode.next = first;
            first = newNode;
            return;
        }

        Node current = first;
        while (current.next != null && item.compareTo(current.next.item) > 0) {
            current = current.next;
        }

        newNode.next = current.next;
        current.next = newNode;
    }

    public static void main(String[] args) {
        SortedList<Integer> list = new SortedList<Integer>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            list.insertInOrder(random.nextInt(200));
        }
        System.out.println(list);
    }
}
