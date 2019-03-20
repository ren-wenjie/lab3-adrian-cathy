/**
 * 
 */
package lab3;

/**
 * @author kkeogh
 *  This is a class used to test my Council information system classes
 */
public class TestDriverClass {

	/**
	 * @param Cathy & Adrian
	 */
	 
	public static void main(String[] args) {
	 // create test case 1 - a person owning a pet dog
	 Animal myPet = new Animal("CockerSpaniel", "Fido");
	 Person p1 = new Person("Cathy", "25 Boak Avenue,", "Buninyong VIC ", "3357", myPet);
	 p1.addAPet(myPet);
	 System.out.println("I have a person object : " + p1.toString());
	 
	 // create test case 2 - another person owing a pet dog
	 Person p2 = new Person("Adrian", "12 curly avenue", " Mount Clear VIC", "3350", myPet);
	 Animal anotherPet = new Animal("Labrador", "Sue");
	 p2.addAPet(anotherPet);
	 System.out.println("I have a second person object : " + p2);
	 
	 Course myCourse = new Course("Java", 15, 1000.00);
	 Person p3 = new Person("Anson", "25 Boak Avenue", " Buninyong VIC", "3357", myCourse);
	 p2.addACourse(myCourse);
	 System.out.println("I have a third person object : " + p3.toString());
	}

}
