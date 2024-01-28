/*
* Author: TAflouk
* Date:2021-##-## --:--:--
* LastModifiedBy:TAflouk
* Last Modified time:2021-##-## --:--:--
*/





// --- CLASSES ---
public class Dondor_Methods
{
	public static void main(String[] args)
	{
		double sum_1 = __add__(2,12);
		double sum_2 = __sub__(2,12);
		double sum_3 = __mul__(2,12);
		double sum_4 = __div__(1,2);


		System.out.println(sum_4);
	}
	public static double __add__(double firstNumber, double secondNumber)
	{
		return firstNumber + secondNumber ;
	}
	public static double __sub__(double firstNumber, double secondNumber)
	{
		return firstNumber - secondNumber ;
		}
	public static long __mul__(long firstNumber , long secondNumber)
	{
		return firstNumber * secondNumber ;
		}
	public static double __div__(double firstNumber , double secondNumber)
	{
		return firstNumber / secondNumber ;
	}
}