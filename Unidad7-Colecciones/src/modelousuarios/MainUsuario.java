package modelousuarios;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class MainUsuario {
	
	
	public static void main(String[] args) {
		
		System.out.println("Generamos lista");
		
		List<Usuario> lista = GeneraUsuarios.devueveUsuariosLista(10000);
		
		lista.forEach((u)-> System.out.println(u));
		
		
		
		// Ordenar la lista de manera directa e inversa
		
			
		
		
		
		System.out.println("Generamos set");
		
		Set<Usuario> setUsuarios = GeneraUsuarios.devueveUsuariosSet(100);
		
		setUsuarios.forEach(System.out::println);
		
		
		System.out.println("Generamos map");	
		
		
		Map<Integer,Usuario> mapUsuarios = GeneraUsuarios.devueveUsuariosMap(50);
	
		
		System.out.println("Usuarios map");	
		mapUsuarios.values().forEach(System.out::println);
		
		
		System.out.println("Claves map");	
		mapUsuarios.keySet().forEach((id) -> {System.out.print(id + ", ");
											   System.out.flush();});
	}

}
