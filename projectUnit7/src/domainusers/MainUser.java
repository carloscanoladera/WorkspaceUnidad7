package domainusers;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class MainUser {

	public static void main(String[] args) {

		System.out.println("Generate List");

		List<Users> list = GenerateUsers.returnUserList(10000);

		list.forEach((u) -> System.out.println(u));

		// reverse and natural order

		System.out.println("Generate set");

		Set<Users> setUsuarios = GenerateUsers.returnUserSet(100);

		setUsuarios.forEach(System.out::println);

		System.out.println("Generate map");

		Map<Integer, Users> mapUsuarios = GenerateUsers.returnUserMap(50);

		System.out.println("Usuarios map");
		mapUsuarios.values().forEach(System.out::println);

		System.out.println("Claves map");
		mapUsuarios.keySet().forEach((id) -> {
			System.out.print(id + ", ");
			System.out.flush();
		});
	}

}
