package domainusers;

import java.util.Random;

public class RandomFieldsGenerator {

	private static final String names[] = { "ANTONIO", "MANUEL", "JOSE", "FRANCISCO", "DAVID", "JUAN", "JOSE ANTONIO",
			"JAVIER", "DANIEL", "JOSE LUIS", "FRANCISCO JAVIER", "CARLOS", "JESUS", "ALEJANDRO", "FRANCISCA", "LUCIA",
			"MARIA ISABEL", "MARIA JOSE", "ANTONIA", "DOLORES", "SARA", "PAULA", "ELENA", "MARIA LUISA", "RAQUEL" };

	private static final String lastnames[] = { "Garcia", "Gonzalez", "Rodriguez", "Fernandez", "Lopez", "Martinez",
			"Sanchez", "Perez", "Gomez", "Martin", "Jimenez", "Ruiz", "Hernandez", "Diaz", "Moreno", "Muñoz",
			"Alvarez", "Romero", "Alonso", "Gutierrez", "Navarro", "Torres", "Dominguez", "Vazquez", "Ramos", "Gil",
			"Ramirez", "Serrano", "Blanco", "Molina", "Morales", "Suarez", "Ortega", "Delgado", "Castro", "Ortiz",
			"Rubio", "Marin", "Sanz", "Nuñez", "Iglesias", "Medina", "Garrido", "Cortes", "Castillo", "Santos" };

	private static int randomNumber(int min, int max) {
		return new Random().nextInt(max + 1) - min;

	}

	private static double randomReal(double min, double max) {
		return new Random().nextDouble() * (max - min) + min;

	}

	public static String getRandomName() {

		return names[randomNumber(0, names.length - 1)];
	}

	public static String getRandomLastName() {

		return lastnames[randomNumber(0, lastnames.length - 1)] + " "
				+ lastnames[randomNumber(0, lastnames.length - 1)];
	}

	public static int getAge() {

		return randomNumber(18, 100);
	}

	public static double getHours() {

		return randomReal(0.0, 200.0);
	}

	public static int numConnections() {

		return randomNumber(1, 500);
	}
}
