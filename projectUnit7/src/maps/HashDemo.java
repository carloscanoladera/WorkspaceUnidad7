package maps;

public class HashDemo {
	    public static void main(String[ ] args) {
	        String key = "superman";
	        int size = 15;
	        System.out.println("Key: " + key);
	        int hashCode = key.hashCode();
	        System.out.println("HashCode: " + hashCode);
	        System.out.println("HashCode (Binario): " + Integer.toBinaryString(hashCode));
	        int h;
	        int hash = (h = key.hashCode()) ^ (h >>> 16);
	        System.out.println("Hash: " + hash);
	        System.out.println("Hash (Binario): " + Integer.toBinaryString(hash));
	        System.out.println("Tamaño (Binario): " + Integer.toBinaryString(size));
	        int x = size & hash;
	        System.out.println("Posicion: " + x);
	        System.out.println(Integer.toBinaryString(x));
	        
	        // Key: superman
	        // HashCode: -1673281537
	        // HashCode (Binary): 10011100010000111011111111111111
	        // Hash: -1673321540
	        // Hash (Binario): 10011100010000110010001110111100
	        // Tamaño (Binario): 1111
	        // Posicion: 12
	        // 1100
	        
	        
	        
	        
	    }
	}


