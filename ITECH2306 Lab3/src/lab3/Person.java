/**
 * 
 */
package lab3;
/**
 * @author Adrian Page and Cathy Wu
 *
 */
public class Person {
	String name;  // name of person
	String address; // address of person
	String postcode; // postcode of person's address
	String city;
	String phone;
	Animal pet; // associate a pet that is an Animal object with the Person
	private Course myCourse; // associate a Course object with the Person
	
	
	//constructor - special method called when new Person() is invoked
	
	Person() {
		this.name = "";
		this.address = "";
		this.city = "";
		this.postcode = "";
	    this.phone = "";
		this.pet = new Animal();
		this.myCourse = new Course();
	}
	
	// constructor - create Person given name, address and a Pet object
	/**
	 * @param name
	 * @param address
	 * @param city
	 * @param phone
	 * @param pet
	 * @param myCourse
	 * 
	 */
	public Person(String name, String address, String city, String postcode,String phone, Animal pet) {
		this.name = name;
		this.address = address;
		this.city = city;
		this.postcode = postcode;
		this.phone = phone;
		this.pet = pet;
	}
	
	public Person(String name, String address, String city, String postcode, Animal pet) {
		this.name =  name;
		this.address = address;
		this.city = city; 
		this.postcode = postcode;
		this.pet = pet;		
	}
	
	public Person(String name, String address, String postCode, String city, Course myCourse) {
		this.name = name;
		this.address = address;
		this.city = city; 
		this.myCourse = myCourse;
	}
	
	public Person(String name, String address, String postCode, String city, String phone,  Course myCourse) {
		this.name = name;
		this.address = address;
		this.city = city; 
		this.phone = phone;
		this.myCourse = myCourse;
	}
		
	/**	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String _name) {
		this.name = _name;
	}
	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}
	/**
	 * @param address the address to set
	 */
	public void setAddress(String _address) {
		this.address = _address;
	}
	/**
	 * @param city the city to set
	 */	
	
	public void setCity(String _city) {
		this.city = _city;
	}
	
	/**
	 * @param return the city 
	 */
		
	public String getCity() {
		return city;
	}
	
	/**
	 * @param postcode the postcode to set
	 */
	
	public void setPostcode (String _postcode) {
		this.postcode = _postcode;
		
	}
	
	/**
	 * @param return the postcode
	 */
		
	public String getPostcode() {
		return postcode;
	}
		
	
	/**
	 * @param _pet the pet animal to associate
	 */
	public void addAPet(Animal _pet) {
		this.pet = _pet;
		}
	
	public void addACourse(Course _myCourse) {
		this.myCourse = _myCourse;
		}

	
	@Override
	public String toString() {
		return "Person name= " + name + ", address= " + address + ", city= " + city + ", postcode= " + postcode + 
				",\n pet=" + pet  + "; enrolled course: " + myCourse; 
	}


}
