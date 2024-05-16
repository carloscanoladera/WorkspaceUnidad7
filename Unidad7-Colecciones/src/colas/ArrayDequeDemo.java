package colas;

import java.util.ArrayDeque;

public class ArrayDequeDemo {

    static ArrayDeque<Integer> deque;
    
    public static void main(String[] args) {
        // Crea un array vacio
        deque = new ArrayDeque<>();
        
        // usa metodo add() para agregar elementos 
        deque.add(45);
        deque.add(27);
        deque.add(98);
        deque.add(19);        
        print("ArrayDeque");
                
        deque.addFirst(99);
        print("Se agrega elemento 99 al principio");

        deque.addLast(77);
        print("Se agrega elemento 77 al final");
  
        //obtiene primer elemento de la cola
        int a = deque.getFirst();        
        //obtiene ultimo elemento de la cola
        int b = deque.getLast();        
        print("Primer elemento ["+a+"] .:. Ultimo elemento ["+b+"]");
        
        //elimina elementos
        deque.removeFirst();
        deque.removeLast();
        print("Elimina primer y ultimo elemento");        
        
        //obtiene primer elemento de la cola
        a = deque.peekFirst();
        //obtiene ultimo elemnto de la cola
        b = deque.peekLast();
        print("Primer elemento ["+a+"] Ultimo elemento ["+b+"]");
        
        //elimina y obtiene el primer elemento de la cola
        a = deque.pop();
        print("elimina Primer elemento ["+a+"]");
        
        deque.push(69);
        print("agrega elemento ["+69+"]");
        
        deque.removeLastOccurrence(98);
        print("elimina elemento ["+98+"]");
        
        System.out.println("Tamaño de la cola " + deque.size());        
    }
    
    
    public static void print(String text){
        System.out.println(text);
        deque.forEach((number) -> {
            System.out.print("| " + number + " |");
        });
        System.out.println("\n");
    }
    
}