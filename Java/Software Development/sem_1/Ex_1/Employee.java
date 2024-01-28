/*
* Author: TAflouk
* Date:2021-##-## --:--:--
* LastModifiedBy:TAflouk
* Last Modified time:2021-##-## --:--:--
*/

// ---IMPORTS---


//---CLASSES---
class Employee {
	// Attributes...
	String name;
	int yearOfBirth;
	double salary;

	// Actions like Functions/Methods in Python
	public int calculateAge(int currentYear)
	{
		return currentYear-yearOfBirth;
	}
	// Method calculates tax
	public double calculateTax(double taxPercentage)
	{
		return salary*taxPercentage;
	}
}


