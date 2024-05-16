package colas;
import java.util.LinkedList;
import java.util.Queue;

public class PruebaQueue {

    public static void main(String[] args) {
        Queue<Integer> cola1 = new LinkedList<Integer>();
 
        cola1.add(3);
        cola1.add(1);
        cola1.add(2);
        cola1.add(4);
        cola1.add(1);
       

        
        print("Cola Con los elementos conforme llegan", cola1);
        
        System.out.println("Cantidad de elementos en la cola:" + cola1.size());
        System.out.println("Extraemos un elemento de la cola:" + cola1.poll());
        print("Tras extraer con poll ", cola1);
        System.out.println("Cantidad de elementos en la cola:" + cola1.size());
        System.out.println("Consultamos el primer elemento de la cola sin extraerlo:" + cola1.peek());
        print("Tras leer con peek no se extrae ", cola1);
        System.out.println("Cantidad de elementos en la cola:" + cola1.size());
        
        
        
        System.out.println("Extraemos uno a un cada elemento de la cola mientras no este vacía:");
        while (!cola1.isEmpty())
            System.out.print(cola1.poll() + "-");
        System.out.println();
        
        print("Imprimimos cola después de vaciarla y obtenemos vacío: ", cola1);
        
        

        Queue<Integer> cola2 = new LinkedList<Integer>();
        cola2.add(70);
        cola2.add(120);
        cola2.add(6);
        System.out.println("Imprimimos la cola de enteros");
        for (Integer elemento : cola2)
            System.out.print(elemento + "-");
        System.out.println();
        System.out.println("Borramos toda la cola");
        cola2.clear();
        System.out.println("Cantidad de elementos en la cola de enteros:" + cola2.size());
    }
    
    
    public static void print(String text, Queue<Integer> queue){
        System.out.println(text);
        queue.forEach((number) -> {
            System.out.print("| " + number + " |");
        });
        System.out.println("\n");
    }

}