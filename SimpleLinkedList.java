class Node{
    int data;
    Node next;
}
public class SimpleLinkedList {
    public static void main(String[] args){
        Node first=new Node();
        Node second=new Node();
        Node third=new Node();
        first.data=10;
        second.data=20;
        third.data=30;
        first.next=second;
        second.next=third;
        third.next=null;
        Node current =first;
        while(current!=null){
            System.out.print(current.data +"->");
            current=current.next;
        
        }
        System.out.println("null");
        
    }
    
}
