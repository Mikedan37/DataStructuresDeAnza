package Lab3;


/*   
 *  Name Block:
 *  Lab Number: Lab 2
 *  Name: Michael Danylchuk, Maxim Manokhin
 *  Team: 1
 *  The purpose of this assignment is to demonstrate our understanding of polymorphism, encapsulation
 *  and classes by creating a currency simulator that can add compare and manipulate objects
 */

/*
 *  Things that were changed: Add, Subtract, IsGreater, IsEqual, method was removed an only in Currency class, 
 *  Creatend empty abstract Methods
 */

public class Dollar extends Currency {
// Non public String Attribute which contains name of Dollar 
private String type = "Dollar";
	
	//Dont need pre or post documentation for constructors or destructors
	public Dollar(double d) {
	// Auto generated
	}
	
	public Dollar() {
	// Auto generated	
	}
	
	// String attribute method
	public String getType() {
		return type;
	}
	
	public Currency add(Currency a, Currency b) {
	    if(super.getClass() == a.getClass()) {
	    Currency x = new Dollar(((a.getUnit()+b.getUnit())*100+a.getFraction()+b.getFraction())/100.0);
	    return x;
	    }else {
	    return a;
	    }
	}
	
	public Currency subtract(Currency a, Currency b) {
	     double one = a.getUnit()+(double)a.getFraction()/100;
	     double two = b.getUnit()+(double)b.getFraction()/100;
	     if (one>=two) {
	     if(a.getClass() == b.getClass()) {
	     Currency x = new Dollar(one-two);
	     return x;
	     }
	   }
	 System.out.println("You cannot be negative!");
	 return a;
	}
	
	/*
         * The purpose of this method is to print out the name and components of the currency
         * Pre: No input
         * Post: prints unit and fractional values of Dollar object and name dollar
         */
	
	public void print() {
		System.out.print(this.getUnit()+"."+this.getFraction()+" "+ type + " ");
	}
		
	
}
