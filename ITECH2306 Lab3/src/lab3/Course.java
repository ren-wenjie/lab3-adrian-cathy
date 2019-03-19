package lab3;

import javax.swing.JOptionPane;

public class Course {
	 // data or instance variables for object Course
	private String _name;
	private int _numberOfDays;
	private double _price;
	private boolean _validDays;
	// associate a Course object with the Person

	Course() {
		_name = null;
		_numberOfDays = 0;
		_price = 0.0;
		_validDays = true;
	}
	
	Course (String name, int days, double price) {
		_name = name;
		_numberOfDays = days;
		_price = price;
		_validDays = true;
	}

	// name the name, length and price of the course	
	public void setName(String name) {
		_name = name;
	}
	
	// if number of day is over 10 days then simply not accept 
	public void setNumberOfDays(int numberOfDays) {
	
		if(numberOfDays >= 1 && numberOfDays <=10)
		{
			_numberOfDays = numberOfDays;
		}
		else
		{
			_validDays = false;
		}
						
								
	}
	
	public void setPrice(double price) {
		_price = price;
	}					
						
	public String getName() {
	return _name;
    }

	public int getNumberOfDays() {
		return _numberOfDays;
	}
	
	public double getPrice() {
		return _price;
	}
	public String toString ()
	{
		if (_validDays == true) {
			return "Anson recently enrolled into " + _name +" which takes " + _numberOfDays +" days to complete and it costs " + _price + ".";
		}
		else
		{
			return "Course days are invalid";
		}
		
		
	}
}
