/**
 * Test class
 */

public class EquipmentTest {
	/**
	 * Tests basic equipment
	 * 
	 * @throws AssertException
	 */

	public EquipmentTest() throws AssertException {
		String other = "Batarang/5,5.0,5.0,A boomerang for bats";
		Equipment equip = new Equipment(other);

		Assert.assertEquals("Batarang/5,5.0,5.0,A boomerang for bats", equip.getName() + "/" + equip.getCount() + ","
				+ equip.getTotalWeight() + "," + equip.getTotalPrice() + "," + equip.getDescription());

	}

	/**
	 * Test toString method in Equipment class
	 * 
	 * @throws AssertException
	 */
	public void equipmentToStringTest() throws AssertException {

		// Creates parameter for method
		String other = "Batarang/5,5.0,5.0,A boomerang for bats";
		
		// Creates new object to test
		Equipment equip = new Equipment(other);

		Assert.assertEquals("Name: Batarang, Number: 5, Weight: 5.00 lbs, Price: $5.00 - A boomerang for bats",
				equip.toString());
	}
	
	/**
	 * Test equals method in Equipment class
	 * 
	 * @throws AssertException
	 */
	
	public void equalsTest() throws AssertException {
		String other = "Batarang/5,5.0,5.0,A boomerang for bats";
		Equipment bat = new Equipment(other);
	
		Object bomb = "Bat Shark Repellent/3,3.0,3.0,Shark repelling bat spray";
		
		bat.equals(bomb);
		
		
	}
}