package domainusers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class GenerateUsers {

	public static Users generateRandomUser(int id) {

		return new Users(id, RandomFieldsGenerator.getRandomName(), RandomFieldsGenerator.getRandomLastName(),
				RandomFieldsGenerator.getAge(), RandomFieldsGenerator.getHours(),
				RandomFieldsGenerator.numConnections());
	}

	public static List<Users> returnUserList(int numUsers) {

		List<Users> list = new ArrayList<Users>(numUsers);

		for (int i = 0; i < numUsers; i++) {

			list.add(generateRandomUser(i));

		}

		return list;

	}

	public static Set<Users> returnUserSet(int numUsers) {

		Set<Users> set = new HashSet<Users>(numUsers);

		for (int i = 0; i < numUsers; i++) {

			set.add(generateRandomUser(i));

		}

		return set;

	}

	public static Map<Integer, Users> returnUserMap(int numUsers) {

		Map<Integer, Users> map = new HashMap<Integer, Users>(numUsers);

		for (int i = 0; i < numUsers; i++) {

			map.put(i, generateRandomUser(i));

		}

		return map;

	}

// key id as String

	public static Map<String, Users> returUSerMapKeyString(int numUsers) {

		Map<String, Users> map = new HashMap<String, Users>(numUsers);

		for (int i = 0; i < numUsers; i++) {

			map.put(Integer.toString(i), generateRandomUser(i));

		}

		return map;

	}

}
