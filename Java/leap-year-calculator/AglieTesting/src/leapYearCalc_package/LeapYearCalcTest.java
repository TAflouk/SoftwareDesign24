package leapYearCalc_package;


import junit.framework.TestCase;

public class LeapYearCalcTest extends TestCase {
	
	
	//Test No: 001
	//Objective: validate valid yearInput in the validateYear method in LeapYearCalc class  
	//Input(s): year = 2000
	//Expected Output: true,  
	
	public void testValidateYear001()
	{
		LeapYearCalc testObj = new LeapYearCalc(2000);
		try {
			boolean results = testObj.validateYear();
			assertEquals(true, results);
		}
		catch(ExceptionHandler e) {
			fail("Exception not excepted");
		}
		
	}
	
	//Test No: 002
	//Objective: validate valid yearInput ranges below YEARMIN in the validateYear method in LeapYearCalc class  
	//Input(s): year = -1
	//Expected Output: true,  
	
	public void testValidateYear002()
	{
		LeapYearCalc testObj = new LeapYearCalc(-1);
		try {
			boolean results = testObj.validateYear();
			fail("Exception unexpected");
		}
		catch(ExceptionHandler e) {
			assertEquals("you have entered below the min",e.getMessage());
		}
		
	}
	
	//Test No: 003
	//Objective: validate valid yearInput  ranges above YEARMAX in the validateYear method in LeapYearCalc class  
	//Input(s): year = 10000
	//Expected Output: true,  
	
	public void testValidateYear003()
	{
		LeapYearCalc testObj = new LeapYearCalc(10000);
		try {
			boolean results = testObj.validateYear();
			fail("Exception unexpected");
		}
		catch(ExceptionHandler e) {
			assertEquals("you have entered above the max",e.getMessage());
		}
		
	}
	
	//Test No: 004
	//Objective: validate valid answerInput in the validateLeapYearCalcType method in LeapYearCalc class  
	//Input(s): answer = 'r'
	//Expected Output: true,  
	
	public void testvalidateLeapYearCalcType001()
	{
		LeapYearCalc testObj = new LeapYearCalc( 'r');
		try {
			boolean results = testObj.validateLeapYearCalcType();
			fail("Exception unexpected");
		}
		catch(ExceptionHandler e) {
			assertEquals("you have not enterd the corecct answer",e.getMessage());
		}
		
	}
	
	//Test No: 005
	//Objective: validate valid answerInput in the validateLeapYearCalcType method in LeapYearCalc class  
	//Input(s): answer = 's'
	//Expected Output: true,  
	
	public void testvalidateLeapYearCalcType002()
	{
		LeapYearCalc testObj = new LeapYearCalc('s');
		try {
			boolean results = testObj.validateLeapYearCalcType();
			assertEquals(true, results);
		}
		catch(ExceptionHandler e) {
			fail("Exception not excepted");
		}
		
	}
	
	//Test No:006
	//Objective: validate valid answerInput to be true in the validateLeapYearCalcStanderd method in LeapYearCalc class  
	//Input(s): answer = 's', year = 2000
	//Expected Output: true, 
	
	public void testvalidateLeapYearCalcStanderd001() 
	{
		LeapYearCalc testObjtype = new LeapYearCalc('s');
		LeapYearCalc testobjyear = new LeapYearCalc(2000);
		try{
			boolean results = testObjtype.validateLeapYearCalcType() && testobjyear.validateLeapYearCalcType() ;	
			assertEquals(true, results);
		}
		catch(ExceptionHandler e) {
			fail("Exception not excepted");

		}

	}
	
	//Test No: 007
	//Objective: validate valid answerInput to be false in the validateLeapYearCalcStanderd method in LeapYearCalc class  
	//Input(s): answer = 's', year = 1999
	//Expected Output: false, 
	
	public void testvalidateLeapYearCalcStanderd002() 
	{
		LeapYearCalc testObjtype = new LeapYearCalc('s');
		LeapYearCalc testobjyear = new LeapYearCalc(1999);
		try{
			boolean results = testObjtype.validateLeapYearCalcType() && testobjyear.validateLeapYearCalcType() ;	
			assertEquals(false, results);
		}
		catch(ExceptionHandler e) {
			fail("Exception not excepted");

		}

	}
	
	//Test No: 008
	//Objective: validate valid answerInput to be true in the validateLeapYearCalcGregorian method in LeapYearCalc class  
	//Input(s): answer = 'g', year = 2024
	//Expected Output: true, 
	
	public void testvalidateLeapYearCalcGregorian001() 
	{
		LeapYearCalc testObjtype = new LeapYearCalc('g');
		LeapYearCalc testobjyear = new LeapYearCalc(2024);
		try{
			boolean results = testObjtype.validateLeapYearCalcType() && testobjyear.validateLeapYearCalcType() ;	
			assertEquals(true, results);
		}
		catch(ExceptionHandler e) {
			fail("Exception not excepted");

		}

	}
	
	//Test No: 009
	//Objective: validate valid answerInput to be false in the validateLeapYearCalcGregorian method in LeapYearCalc class  
	//Input(s): answer = 'g', year = 1900
	//Expected Output: false, 
	
	public void testvalidateLeapYearCalcGregorian002() 
	{
		LeapYearCalc testObjtype = new LeapYearCalc('g');
		LeapYearCalc testobjyear = new LeapYearCalc(1900);
		try{
			boolean results = testObjtype.validateLeapYearCalcType() && testobjyear.validateLeapYearCalcType() ;	
			assertEquals(false, results);
		}
		catch(ExceptionHandler e) {
			fail("Exception not excepted");

		}

	}

	
}
