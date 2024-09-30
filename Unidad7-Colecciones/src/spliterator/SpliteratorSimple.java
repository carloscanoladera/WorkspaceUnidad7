package spliterator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Spliterator;

public class SpliteratorSimple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub// ArrayList con tamaño
		ArrayList<Integer> lista = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));

		Spliterator<Integer> si = lista.spliterator();
		si.forEachRemaining(n -> System.out.println(n));
	

	}

}
