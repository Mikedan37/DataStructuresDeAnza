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
 *  Things changed: add,subtract methods improved and added if statements to check if dollar
 *  and pound methods are the same when addding so no type mismatching. Also made empty abstract
 *  to allow dollar and pound to be used and moved around
 */

abstract class Currency {
	// Two Integer attributes
	private int unit, fraction;
	
	// Dont need pre or post documentation for constructors or destructors
	public Currency(){	
		unit = 0;
		fraction = 0;
	} 
	
	public Currency(double z) {
		unit = (int) z;
		fraction = (int)(z*100)%100;
	}
	
	public Currency(Currency x) {
		unit = x.unit;
		fraction = x.fraction;
	}
	
	// Java doesn't have a destructure it uses garbage collection 
	
	/*
	 * The purpose of these two methods is to be a getter for the Unit and Fraction attributes of this class
	 * Pre: No input
	 * Post: returns unit or fraction respectivly
	 */
	
	public int getUnit() {
		return unit;
	}
	
	public int getFraction() {
		return fraction;
	}
	
	/* 
	 * The purpose of these two methods is to be a setter for the Unit and Fraction attributes of this class
	 * Pre: No input
	 * Post: Sets unit or fraction respectivly
	 */
	
	public void setUnit(int unit) {
		this.unit = unit;
	}

	public void setFraction(int fraction) {
		this.fraction = fraction;
	}
    
	/*
	 * The purpose of this method is to add the fractional and unit values inside two currency objects together
	 * Pre: Currency x,y - two objects of type currency
	 * Post: returns the object once two objects are added together (Look for more info at Dollar/Pound child classes)
	 */
	
	public Currency add(Currency a, Currency b) {
		return a;
	}

	/*
	 * The purpose of this method is to subtract the fractional and unit values inside two currency objects together
	 * Pre: Currency x,y - two objects of type currency
	 * Post: returns the object once two objects are subtracted together (Look for more info at Dollar/Pound child classes)
	 */

//	public Currency subtract(Currency a, Currency b) {
//	     double one = a.getUnit()+(double)a.getFraction()/100;
//	     double two = b.getUnit()+(double)b.getFraction()/100;
//	     if (one>=two) {
//	     if(a.getClass() == b.getClass()) {
//	     Currency x = new Dollar(one-two);
//	     return x;
//	     }
//	     if(a.getClass() == b.getClass()) {
//	     Currency x = new Pound(one-two);
//	     return x;
//	     }
//	   }
//	 System.out.println("You cannot be negative!");
//	 return a;
//	}
	
	/*
	 * Algorithm isEqual(Currency x, Currency y)
	 * 
	 * The purpose of this method is to compare if both input objects are equal
	 * Pre: Currency x,y - two objects of type currency
	 * Post: return true or false
	 * 
	 * if(unit value of x is equal to unit value of y and fraction value x is equal to fraction value y)
	 *  return true
	 * end if
	 * return false
	 * 
	 */
	
	public boolean isEqual(Currency x, Currency y){
	    if (x.getUnit() == y.getUnit() && x.getFraction() == y.getFraction()) {
		return true;
		}
		return false;
	}
	
	/*
	 * Algorithm isGreater(Currency x, Currency y)
	 * 
	 * The purpose of this method is to compare which input object of the same currency is greater
	 * Pre: Currency x,y - two objects of type currency
	 * Post: return true or false
	 * 
	 * if(unit value of x is greater to unit value of y and fraction value x is greater to fraction value y)
	 *  return true
	 * end if
	 * return false
	 * 
	 */
	
         public boolean isGreater(Currency x, Currency y){
    	 if (x.getUnit() > y.getUnit() || x.getUnit() >= y.getUnit() && x.getFraction() > y.getFraction()) {
		return true;
		}
		return false;
	}
    
         /*
          * The purpose of this method is to print out the name and value of the currency
          * Pre: No input
          * Post: see in child classes
          */
    
    public void print(){
    	
    }
	
    // empty abstract methods to allow dollar and currency objects to interact with currency parent class
    // All above must be instance methods and not static
}
