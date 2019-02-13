
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
}