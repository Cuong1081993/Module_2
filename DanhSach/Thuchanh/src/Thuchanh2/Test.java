package Thuchanh2;

public class Test {
    public static void main(String[] args) {
        System.out.println("===Test===");
        MyLinkedList ll = new MyLinkedList(10);
        ll.addFirst(11);
        ll.addFirst(12);
        ll.addFirst(13);
        ll.add(2,3);
        ll.add(3,5);
        ll.printList();
    }
}
