class Node
{
    int dData; // data item
    Node next; // next link in list
    Node previous; // previous link in list

    public Node(int data) // constructor
    {
        dData = data; 
    }

} // end class Link

class CircularDoublyLinked
{
    private Node head; // ref to head item
    private Node tail; // ref to tail item
    int size;
// -------------------------------------------------------------
    public CircularDoublyLinked() // constructor
    {
        head = null; // no items on list yet
        tail = null;
        size=0;
    }
    
    public void insertFirst(int dd) // insert at front of list
    {
        Node newLink = new Node(dd); // make new link
        if( head ==null ) { // if empty list,
            tail = newLink; // newLink <-- tail
            head = newLink; // head --> newLink
            newLink.next=head;
            newLink.previous=tail;
        }
        else {
            head.previous = newLink; // newLink <-- old head
            newLink.next = head; // newLink --> old head          
            head = newLink; // head --> newLink            
            newLink.previous=tail;
            tail.next=head;
            
        }
          size++;
          System.out.println("data Added "+ dd);
        
    }
    
    public void insertLast(int dd) // insert at end of list
    {
        Node newLink = new Node(dd); // make new link
        if( head ==null) {// if empty list,
           head = newLink; // head --> newLink
           tail = newLink; // newLink <-- tail
           newLink.next=head;
           newLink.previous=tail;
        }
        else
        {
            /*
            tail.next = newLink; // old tail --> newLink
            newLink.previous = tail; // old tail <-- newLink
            tail = newLink; // newLink <-- tail           
            newLink.next=head;
            head.previous=tail;
            tail = newLink; // newLink <-- tail
            */
            
              Node current=head;
	    while(current!= tail){
		current=current.next;	
	    }
	    current.next=newLink;
            newLink.previous = current; 
            newLink.next=head;
            head.previous=newLink;
            tail = newLink; 
            
        }
             size++;
             System.out.println("data Added "+ dd);
    }
    
    public void deleteFirst() // delete head link
    { 
        Node temp = head;
        if(head.next == null) { // if only one item
            tail = null; // null <-- tail
            head=null;
        }
        else {
            
            head.next.previous = tail; // null <-- old next
            tail.next =head.next;
            head = head.next; // head --> old next
            
            
        }
        System.out.println("data Deleted "+ temp.dData);
        size-- ;
    }
    
    public void deleteLast() // delete tail link
    { 
            int temp = tail.dData;
            if(head.next == null) {// if only one item
            head = null; // head --> null
            tail=null;
            }
            else {
              /*  
            tail.previous.next = head; // old previous --> null
            head.next.previous= tail;
            tail = tail.previous; // old previous <-- tail
                */
                
                Node current=head;       
                while(current.next !=tail){              
                current =current.next;
                }
                current.next=head;
                head.previous=current;
                tail=current;
                size-- ;
                
             
            }
               System.out.println("data Deleted "+ temp);
               size-- ;
    }
    
    
     public void displayForward()
    {
         System.out.print("\nCircular Singly Linked List with forward= ");
           System.out.print(head.dData+" ");
                Node current=head.next;
        while(current != head) // until end of list, //head
        {
            System.out.print(current.dData + " ");
            current = current.next; // move to next link
        }
            System.out.println("    ");
    }
     
     
}

public class CircularDoubelyLinkedList {

   
    public static void main(String[] args) {
       
        CircularDoublyLinked App =new CircularDoublyLinked();
        
        
        App.insertFirst(50);
        App.insertFirst(40);
        App.insertFirst(30);
                
         App.insertLast(60);
         App.insertLast(70);
         App.insertLast(80);
         
        App.displayForward();
        App.deleteFirst();
        App.deleteLast();
        App.deleteLast();
        
        App.displayForward();
        
        /*
        App.displayBackward();
        */
    }
    
}
