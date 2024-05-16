package genericos;

public class MetodosGenericos {
	
	public static <T,U> void imprime(T arg1, U arg2) {
		
		
		System.out.println(arg1+ "\n" + arg2);

		
	}
	
	public static <T extends Number,U extends Number> boolean compara(T a, U b) {
		
		return a.equals(b);
		
	}

	public static <T extends Number> T numero(T num) {
		
		
		return num;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		imprime (5, "");
	
		numero(7.0f);
		
		compara(5,Integer.valueOf(5));
		
		numero(Double.valueOf(5.0));
	}

}
