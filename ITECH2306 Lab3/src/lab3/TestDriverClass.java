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
	 * @param args
	 */
	
	public static void main(String[] args) {
		// create test case 1 - a person owning a pet dog
		Person p1 = new Person( "25 somewhere Street","Kathleen","2000");
		Animal myPet = new Animal("CockerSpaniel","Fido");
		p1.addAPet(myPet);
		System.out.println("I have a person object : " + p1.toString());
		
		// create test case 2 - another person owing a pet dog
		Person p2 = new Person("12 curly avenue","Fred", "3350");
		Animal anotherPet = new Animal("Labrador","Sue");
		Course c2 = new Course("Test Course", 11,1000.0); //Test course with too many days
		p2.addAPet(anotherPet);
		p2.addCourse(c2);
		System.out.println("I have a second person object : " + p2 + c2);
		

	}

}
