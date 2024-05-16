package colas;
import java.util.*;
  
public class PriorityQueueDemo {
    
      // Main Method
    public static void main(String args[])
    {
        // Creating empty priority queue
        PriorityQueue<Integer> pQueue = new PriorityQueue<Integer>();
        PriorityQueue<Integer> pQueue2 = new PriorityQueue<Integer>((i1,i2)-> i1.compareTo(i2)*-1);
        // Adding items to the pQueue using add()
        pQueue.add(4);
        pQueue.add(5);
        pQueue.add(3);
        pQueue.add(2);
        pQueue.add(1);
        
        
        pQueue2.addAll(pQueue);
        
        System.out.println();       
        

        System.out.println("Elemento de la cabecera con peek sin extraer "+pQueue.peek());
  
 
        // Printing the top element again
        
        print("Recorremos la cola modo normal extrayendo:",pQueue);
        
        
        
        System.out.println("Elemento de la cabecera cola Queue2, Comparator inverso, con peek sin extraer "+pQueue2.peek());
        
        print("Recorremos la cola queue2 modo normal extrayendo:",pQueue2);       
        
    }
    
    public static void print(String text, PriorityQueue<Integer> queue){
        System.out.println(text);
        while (!queue.isEmpty()) {
            System.out.print("| " + queue.poll() + " |");
        };
        System.out.println("\n");
    }
}