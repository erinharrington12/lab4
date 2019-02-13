/**
 * Testing class for Product object
 *
 * @author Stephen Thung, references previous code from Dr.Fagg, Taner Davis
 * @version 2018-08-25
 */
public class AnimalTest {

	/**
	 * Test the empty Animal constructor and the getters
	 */
	public void emptyConstructorTest() throws AssertException {
		// Use the default constructor
		Animal animal = new Animal();

		// The name should be "noname", color "unknown", height and weight 0.
		Assert.assertEquals("unknown", animal.getColor());
		Assert.assertEquals("noname", animal.getName());
		Assert.assertEquals(0, animal.getHeight(), 0.01);
		Assert.assertEquals(0, animal.getWeight(), 0.01);
	}

	// TODO: test full constructor, getters, and toString

	public void fullConstructorTest() throws AssertException {
		
		// Use the full constructor
		// Format of color, name, weight, height
		Animal fullAnimal = new Animal("Purple", "Ophelia", 175.4, 58.6);

		// Test to see if the constructor works with information instead of default
		// Assert.assertEquals(Message_to_display_if_test_fails, expectedValue,
		// actualResultFromCode)

		Assert.assertEquals("Purple", fullAnimal.getColor());
		Assert.assertEquals("Ophelia", fullAnimal.getName());
		Assert.assertEquals(175.4, fullAnimal.getWeight(), 0.1);
		Assert.assertEquals(58.6, fullAnimal.getHeight(), 0.1);
		
	}
}
