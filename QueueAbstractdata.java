class Node{
    int data;
    Node next;
    
    public Node(int data){
       this.data=data;
       this.next=null;
    }
}
class Queue{
    Node front;
    Node rear;
    int Size;
    public Queue(){
       front=rear=null;
       Size=0;
}
public void enqueue(int data){
       Node newNode =newNode(data);
    if (rear==null){
        front=rear=newNode;
    } else {
      rear.next=newNode;
      rear=newNode;
      }
      Size ++;
    }
      public int dequeue(){
      if (isEmpty()){
          throw new RuntimeException ("Queue is empty");
      }
      int data =front.data;
      front=front.next;
      if (front==null)
{
      rear=null;
      }
      Size--;
      return data;
      }
      public boolean isEmpty(){
             return front==null;
      }
      public int peek(){
         if (isEmpty()){
            throw new RuntimeException ("Queue is Empty");
         }
          return front.data;
      }
      public int size(){
          return Size;
      }
}
      public class Queue{
          public static void main (String [] args){
             Queue queue= new Queue();
             queue.enqueue(10); 
             queue.enqueue(20);
             queue.enqueue(30);
             System.out.println("Queue size:"+ queue.size());
             System.out.println("Front element:"+ queue.peek());
             System.out.println("Dequeued element:"+ queue.dequeue());
             System.out.println("Queue size :"+queue.size());
             }
}
 


 
             
      

















