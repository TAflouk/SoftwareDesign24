package leapYearCalc_package;

public class LeapYearCalc 
{
	final int YEARMIN = 1;
	final int YEARMAX = 9999;
	final char GREGORIAN = 'g';
	final char STANDERD = 's';
	private int year;
	
	private char answer;
	
public LeapYearCalc(int year) 
{		
		this.year = year;	
}
public LeapYearCalc(char answer)
{
	this.answer = answer;
}




public boolean validateYear() throws ExceptionHandler
{
	boolean yearResult = false;
	if(this.year > YEARMAX) {
		throw new ExceptionHandler("you have entered above the max");
	}
	else if (this.year < YEARMIN) {
		throw new ExceptionHandler("you have entered below the min");
	}
	else if(this.year >= YEARMIN && this.year <= YEARMAX) {
		yearResult = true;
	}
	return yearResult;
}



public boolean validateLeapYearCalcType() throws ExceptionHandler
	{
		boolean leapYearCalcType = false;
		if (this.answer != STANDERD || this.answer != GREGORIAN) {
			throw new ExceptionHandler("you have not enterd the corecct answer");
		}
		if (this.answer == STANDERD || this.answer == GREGORIAN ) {
			leapYearCalcType = true;
		}
		return leapYearCalcType;
	
	}
public boolean validateLeapYearCalcStanderd() throws ExceptionHandler
{
	boolean leapYearResultS = false;
	if (this.answer == STANDERD) {

		if(this.year % 4 == 0) {
			leapYearResultS = true;
		}
		else if(this.year % 4 != 0) {
			leapYearResultS = false;
		}
	}
	return leapYearResultS;
}
public boolean validateLeapYearCalcGregorian() throws ExceptionHandler
{
	boolean leapYearResultG = false;
	if (this.answer == GREGORIAN) {
		if(this.year % 400 == 0) {
			leapYearResultG = true;
		}
		else if(this.year % 400 != 0) {
			leapYearResultG = false;
		}
	}
	return leapYearResultG;
}


}
