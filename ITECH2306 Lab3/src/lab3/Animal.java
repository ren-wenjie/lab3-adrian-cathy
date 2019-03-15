package lab3;

public class Animal {
	/**
	 * @author Adrian & Cathy 
	 *
	 */


		private String _breed;
		private String _name;
		private int _registrationID;
		private static int nextValidRegistrationID=1; 
		
		/**
		 * @param breed
		 * @param name
		 * registrationID - allocated automatically
		 */
		// default value
		
		Animal() {
			_name = null;
			_breed = "";
					
		}	
		
		
		// RegistrationID - allocated automatically, start with 1
		Animal(String name, String breed) {
	    	 _registrationID = nextValidRegistrationID++;
	    	 _breed = breed;
			 _name = name;
			 
		}
		
	     // getter and setter
		
			public void setName(String name) {
				_name = name;
			}
			
			public void breed(String breed) {
				_breed = breed;
			}
			
			public void setRegistrationID(int registrationID) {
				_registrationID = registrationID;
			}	
								
			public String getName() {
				return _name;
		    }

			public String getBreed(){
				return _breed;
			}
				
			public int registrationID() {
				return _registrationID;
			}
			
			// create a String description of an animal attributes 
		
		public String toString() {
			return "Animal [breed=" + _breed + ", name=" + _name + ", registrationID=" + _registrationID + "]";
		}
		
	}