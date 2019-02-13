
/**
 * Testing class for Zoo class
 * 
 * @author Erin Harrington, references from AnimalTest class, Stephen Thung
 * @version 2018-02-12
 */

public class ZooTest {

	/**
	 * Test the getTotalHeight method
	 */

	public void getTotalHeightTest() throws AssertException {

		/**
		 * Create Zoo object and populate with animals
		 * 
		 * Format of color, name, weight, height
		 */
		Animal a = new Animal("Green", "Chester", 350.0, 40);
		Animal b = new Animal("Orange", "Tony", 200.5, 15);

		Zoo zoo = new Zoo(3);
		zoo.addAnimal(a); // Gorilla
		zoo.addAnimal(b); // Tiger

		// Test for total height

		Assert.assertEquals(55, zoo.getTotalHeight(), 0.01);

	}

	public boolean toStringTest() throws AssertException {

		/**
		 * Create Zoo object and populate with animals
		 * 
		 * Format of color, name, weight, height
		 */
		Animal a = new Animal("Green", "Chester", 350.0, 40);
		Animal b = new Animal("Orange", "Tony", 200.5, 15);

		Zoo zoo = new Zoo(5);
		zoo.addAnimal(a); // Gorilla
		zoo.addAnimal(b); // Tiger

		// Create test variables

		String expectedAnimals = "These animals live in the zoo: \nChester, a Green-colored animal. 350.0 pounds, 40.0 inches\n"
				+ "Tony, a Orange-colored animal. 200.5 pounds, 15.0 inches\n\n";

		// Test toString method in Zoo class

		if (expectedAnimals.contentEquals(zoo.toString())) {
			return true;
		} else {
			return false;

		}
	}
}