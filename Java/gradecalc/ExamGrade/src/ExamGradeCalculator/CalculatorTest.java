package ExamGradeCalculator;

import junit.framework.TestCase;
public class CalculatorTest extends TestCase 
{
	//Test No: 1
	//Objective: Test valid exam marks
	//Input(s): examMarks = 0
	//Expected Output: true 
	public void testvalidateExamMarks001() throws MyExceptionHandler
	{
		try
		{
			int excpected = 0;
			Calculator calculator = new Calculator();
			boolean results = calculator.validateExamMarks(excpected);
			assertEquals(true, results);
		}

		catch(MyExceptionHandler e)
		{
			fail("Something went wrong"+ e.getMessage());
		}
	}
	
	//Test No: 2
	//Objective: Test invalid exam marks
	//Input(s): examMarks = -1
	//Expected Output: "You cannot enter a negative number!"
	public void testvalidateExamMarks002() throws MyExceptionHandler
	{
		int excpected = -1;
		try
		{
			
			Calculator calculator = new Calculator();
			boolean results = calculator.validateExamMarks(excpected);
			assertEquals("You cannot enter a negative number!", results);	
		}
		catch(MyExceptionHandler e)
		{
			fail("Something went wrong"+ e.getMessage());
		}

	}
//	
	//Test No: 3
	//Objective: Test valid exam marks
	//Input(s): examMarks = 75
	//Expected Output: false
	public void testvalidateExamMarks003() throws MyExceptionHandler
	{
		int excpected = 75;
		Calculator calculator = new Calculator();
		boolean results = calculator.validateExamMarks(excpected);
		assertEquals(true, results);
	}
	
	//Test No: 4
	//Objective: Test invalid exam marks
	//Input(s): examMarks = 76
	//Expected Output: "You cannot go above 25!"
	public void testvalidateExamMarks004()throws MyExceptionHandler
	{
		int excpected = 76;
		Calculator calculator = new Calculator();

		try 
		{
			boolean results = calculator.validateExamMarks(excpected);
			assertEquals("You cannot go above 25!", results);
		}
		catch(MyExceptionHandler e)
		{
			fail();
		}
	}
	
	//Test No: 5
	//Objective: Test valid coursework marks
	//Input(s): examMarks = 0
	//Expected Output: true
	public void testvalidateCourseworkMarks001()throws MyExceptionHandler
	{
		int excpected = 0;
		Calculator calculator = new Calculator();
		try {
		boolean results = calculator.validateCourseworkMarks(excpected);
		assertEquals(true, results);
		}
		catch (MyExceptionHandler e) {
			// TODO Auto-generated catch block
			fail();
		}
		
	}
	
	//Test No: 6
	//Objective: Test invalid coursework marks
	//Input(s): examMarks = -1
	//Expected Output: "You cannot enter a negative number!"
	public void testvalidateCourseworkMarks002()throws MyExceptionHandler
	{
		int excpected = -1;
		Calculator calculator = new Calculator();
		try
		{
			boolean results = calculator.validateCourseworkMarks(excpected);
			assertEquals("You cannot enter a negative number!", results);
		}
		catch(MyExceptionHandler e)
		{
			fail("You cannot enter a negative number!");
		}
	}
	
	//Test No: 7
	//Objective: Test valid coursework marks
	//Input(s): examMarks = 25
	//Expected Output: true
	public void testvalidateCourseworkMarks003()throws MyExceptionHandler
	{
		int excpected = 25;
		Calculator calculator = new Calculator();
		boolean results;
		try {
			results = calculator.validateCourseworkMarks(excpected);
			assertEquals(true, results);
		} 
		catch (MyExceptionHandler e) 
		{
			fail();
		}
		
	}
	
	//Test No: 8
	//Objective: Test invalid coursework marks
	//Input(s): examMarks = 26
	//Expected Output: "You cannot go above 25!"
	public void testvalidateCourseworkMarks004()throws MyExceptionHandler
	{
		int excpected = 26;
		Calculator calculator = new Calculator();
		try 
		{
		boolean results = calculator.validateCourseworkMarks(excpected);
		assertEquals("You cannot go above 25!", results);
		
		}
		catch(Exception e)
		{
			fail();
		}
	}

}
