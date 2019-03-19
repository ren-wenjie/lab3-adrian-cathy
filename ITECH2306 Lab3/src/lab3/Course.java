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
		setValidDays(true);
		setName(null);
		setNumberOfDays(0);
		setPrice(0.0);
	}
	
	Course (String name, int days, double price) {
		setValidDays(true);
		setName(name);
		setNumberOfDays(days);
		setPrice(price);
		
	}

	public boolean GetValidDays() {
		return _validDays;
	}

	public void setValidDays(boolean _validDays) {
		this._validDays = _validDays;
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
			setValidDays(false);
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
		if (GetValidDays() == true) {
			return "Anson recently enrolled into " + _name +" which takes " + _numberOfDays +" days to complete and it costs " + _price + ".";
		}
		else
		{
			return "Course days are invalid";
		}
		
		
	}
}
