package modelousuarios;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class GeneraUsuarios {
	
	
	
	public static Usuario generaUsuarioAleatorio(int id) {
		
		
		return new Usuario(id, 
				GeneraCamposAleatorios.getNombreAleatorio(),
				GeneraCamposAleatorios.getApellidosAleatorio(),
				GeneraCamposAleatorios.getEdad(),
				GeneraCamposAleatorios.getHoras(),
				GeneraCamposAleatorios.numConexiones())
		 ;
	}
	
public static List<Usuario> devueveUsuariosLista(int numUsuarios) {
		
		
	List<Usuario> list = new ArrayList<Usuario> (numUsuarios);
	
	
	for (int i= 0 ; i<numUsuarios ; i++) {
		
		
		
		list.add(generaUsuarioAleatorio(i));
		
	}
	
	return list;
		
		
	}
	
public static Set<Usuario> devueveUsuariosSet(int numUsuarios) {
		
		
		
Set<Usuario> set = new HashSet<Usuario>(numUsuarios);
	
	
	for (int i= 0 ; i<numUsuarios ; i++) {
		
		
		
		set.add(generaUsuarioAleatorio(i));
		
	}
	
	return set;
		
		
	}
	
	
public static Map<Integer,Usuario> devueveUsuariosMap(int numUsuarios) {
		
	
		
Map<Integer, Usuario> map = new HashMap<Integer,Usuario>(numUsuarios);
	
	
	for (int i= 0 ; i<numUsuarios ; i++) {
		
		
		
		map.put(i,generaUsuarioAleatorio(i));
		
	}
	
	return map;
		
		
	}
	
// Clave va a ser nombre y apellidos separado por un espacio

public static Map<String,Usuario> devueveUsuariosMapClaveString(int numUsuarios) {
	
	
Map<String, Usuario> map = new HashMap<String,Usuario>(numUsuarios);
	
	
	for (int i= 0 ; i<numUsuarios ; i++) {
		
		
		
		map.put(Integer.toString(i),generaUsuarioAleatorio(i));
		
	}
	
	return map;
		
		
	}
	

}




