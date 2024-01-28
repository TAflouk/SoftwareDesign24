/*
* Author: TAflouk
* Date:2021-##-## --:--:--
* LastModifiedBy:TAflouk
* Last Modified time:2021-##-## --:--:--
*/

// --- IMPORTS ---
import java.util.Scanner;

public class check{
	String firstName;
	int yearOfBirth;
	double salary;
	String sayHi = "Hello ";

	public int calculateAge(int currentYear){
		return currentYear - yearOfBirth;

		}
	public double claculateTax(double taxPercentage){
		return (salary * taxPercentage);
		}
	public String printName(String sayHi){
		return sayHi + firstName;
		}

}