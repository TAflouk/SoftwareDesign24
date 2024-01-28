import junit.framework.TestCase;

public class PublicationTest extends TestCase 
{
	
//  ===============================   TESTING validateTitle   =============================================
	// Test#: 001
	// Test Obj: test valid title
	// Inputs: "Sunday"
	// Excepected output:
	public void testvalidateTitle001() 
	{
		Publication p = new Publication();
		String input = "Sunday";
		try
		{
			boolean res = p.validateTitle(input);
			assertEquals(true, res);
		}
		catch(NewsagentExceptionHandler e)
		
		{
			fail("something went wrong");
		}
	}
	
	// Test#: 002
	// Test Obj: test valid title
	// Inputs: ""
	// Excepected output:
	public void testvalidateTitle002() 
	{
		String input = "";
		String exc = "Title cannot be empty";
		Publication p = new Publication();
		try
		{
			p.validateTitle(input);
			fail("something went wrong");
			
		}
		catch(NewsagentExceptionHandler e)
		{
			assertEquals(e.getMessage(), exc);
		}
	}
	// Test#: 0020
	// Test Obj: test valid title
	// Inputs: ""
	// Excepected output:
	public void testvalidateTitle002B() 
	{
		String input = " ";
		String exc = "No spaces enter valid Title.";
		Publication p = new Publication();
		try
		{
			p.validateTitle(input);
			fail("something went wrong");
			
		}
		catch(NewsagentExceptionHandler e)
		{
			assertEquals(e.getMessage(), exc);
		}
	}

	// Test#: 003
	// Test Obj: test valid title
	// Inputs: "adsdjsandjlnasjld"
	// Excepected output: "Name is too long"
	public void testvalidateTitle003() 
	{
		String input = "adsdjsandjlnasjldsads";
		
		String exc = "Title is too long";
		Publication p = new Publication();
		try
		{
			p.validateTitle(input);
			fail("Something went wrong");
			
		}
		catch(NewsagentExceptionHandler e)
		{
			assertEquals(e.getMessage(), exc);
		}
	}
//  ===============================   TESTING validateIDNumber   =============================================
	// Test#: 004
	// Test Objective: Test valid 0 < id >= 300
	// Test inputs: 1
	// Test excepected Outputs: true
	public void testvalidateIDNumber004() //throws NewsagentExceptionHandler
	{
		int input = 1;
		Publication p  = new  Publication(); 
		try 
		{
			boolean results = p.validateIDNumber(input);
			assertEquals(true, results);
		}
		catch(NewsagentExceptionHandler e)
		{
			fail("Something went wrong");
			
		}
	}
	// Test#: 005
	// Test Objective: Test invalid id < 0
	// Test inputs: -1
	// Test excepected Outputs: "You cannot enter a negative number"
	public void testvalidateIDNumber005() //throws NewsagentExceptionHandler
	{
		String excepectedOutputs = "You cannot enter a negative number";
		int input = -1;
		Publication p  = new  Publication(); 
		try 
		{
			p.validateIDNumber(input);
			fail("Something went wrong");
		}
		catch(NewsagentExceptionHandler e)
		{
			assertEquals(e.getMessage(), excepectedOutputs);
		}
	}
	// Test#: 006
	// Test Objective: Test valid 0 < id >= 300
	// Test inputs: 150
	// Test excepected Outputs: "You cannot enter a negative number"
	public void testvalidateIDNumber006() //throws NewsagentExceptionHandler
	{
		// String excepectedOutputs = "You cannot enter a negative number";
		int input = 150;
		Publication p  = new  Publication();  
		try 
		{
			boolean results = p.validateIDNumber(input);
			assertEquals(true, results);
		}
		catch(NewsagentExceptionHandler e)
		{
			fail("Something went wrong!");
		}
	}
	//
	// Test#: 007
	// Test Objective: Test invalid id > 300
	// Test inputs: 301
	// Test excepected Outputs: "You cannot enter a negative number"
	public void testvalidateIDNumber007() //throws NewsagentExceptionHandler
	{
		String excepectedOutputs = "You cannot go over 300";
		int input = 301;
		Publication p  = new  Publication(); 
		try 
		{
			p.validateIDNumber(input);
			fail("Something went wrong");
		}
		
		catch(NewsagentExceptionHandler e)
		{	
			assertEquals(e.getMessage(), excepectedOutputs);
		}
	}
	
	

	// Test#: 004
	// Test Objective: Test valid name
	// Test inputs: "Taha"
	// Test excepected Outputs: true
	public void testvalidateAuthor008() throws NewsagentExceptionHandler
	{
		String input = "Taha";
		Publication p  = new  Publication(); 
		try 
		{
			boolean results = p.validateAuthor(input);
			assertEquals(true, results);
		}
		catch(Exception e)
		{
			fail("Something went wrong");
		}
	}
	// Test#: 009
	// Test Objective: Test invalid author
	// Test inputs: "Taha"
	// Test excepected Outputs: true
	public void testvalidateAuthor009() throws NewsagentExceptionHandler
	{
		String input = "";
		Publication p  = new  Publication();
		String exce = "Author Cannot be empty";
		try 
		{
			p.validateAuthor(input);
			fail("Something went wrong");
		}
		catch(Exception e)
		{
			assertEquals(e.getMessage(), exce);
			
		}
	}
	
	// Test#: 010
	// Test Objective: Test invalid author
	// Test inputs: "asjdnskjdbsakbdkjbas"
	// Test excepected Outputs: true
	public void testvalidateAuthor0010() throws NewsagentExceptionHandler
	{
		String input = "asjdnskjdbsakbdkjbas";
		Publication p  = new  Publication();
		String exce = "Author is too long";
		try 
		{
			p.validateAuthor(input);
			fail("Something went wrong");
		}
		catch(Exception e)
		{
			assertEquals(e.getMessage(), exce);
			
		}
	}
	
	// Test#: 011
	// Test Objective: Test valid author name
	// Test inputs: "asjdnskjdbsakbdkjbas"
	// Test excepected Outputs: true
	public void testvalidateAuthor0011() throws NewsagentExceptionHandler
	{
		String input = "as";
		Publication p  = new  Publication();
		String exce = "Author is too short";
		try 
		{
			p.validateAuthor(input);
			fail("Something went wrong");
		}
		catch(Exception e)
		{
			assertEquals(e.getMessage(), exce);
			
		}
	}
//  ===============================   TESTING validatePrice   =============================================
		// Test#: 012
		// Test Objective: Test invalid price
		// Test inputs: 6
		// Test excepected Outputs: "You cannot enter a negative number"
		public void testvalidatePrice012()
		{
			String excepectedOutputs = "Enter a valid price less or equal to 5";
			double input = 6.;
			Publication p  = new  Publication(); 
			try 
			{
				p.validatePrice(input);
				fail("Something went wrong");
				
			}
			
			catch(NewsagentExceptionHandler e)
			{
				assertEquals(e.getMessage(), excepectedOutputs);
			}
		}
		
		// Test#: 0013
		// Test Objective: Test invalid price
		// Test inputs: -1
		// Test excepected Outputs: "You cannot enter a negative number"
		public void testvalidatePrice013()
		{
			String excepectedOutputs = "Enter a valid price greater than 0";
			double input = -1;
			Publication p  = new  Publication();
			try 
			{
				p.validatePrice(input);
				fail("Something went wrong");				
			}
			
			catch(NewsagentExceptionHandler e)
			{
				
				assertEquals(e.getMessage(), excepectedOutputs);
			}
		}
		
		// Test#: 014
		// Test Objective: Test invalid price
		// Test inputs: 1
		// Test excepected Outputs: "You cannot enter a negative number"
		public void testvalidatePrice0014()
		{
			double input = 1;
			Publication p  = new  Publication();
			try 
			{
				boolean results = p.validatePrice(input);
				assertEquals(true, results);		
			}
			
			catch(NewsagentExceptionHandler e)
			{
				fail("Something went wrong");
			}
		}
		
		// Test#: 015
		// Test Objective: Test invalid price
		// Test inputs: 5
		// Test excepected Outputs: "You cannot enter a negative number"
		public void testvalidatePrice015()
		{
			double input = 5;
			Publication p  = new  Publication();
			try 
			{
				boolean results = p.validatePrice(input);
				assertEquals(true, results);		
			}
			
			catch(NewsagentExceptionHandler e)
			{
				fail("Something went wrong");
			}
		}
//      ===============================   TESTING validateFrequency   =============================================

		// Test#: 016
		// Test Objective: Test invalid freq
		// Test inputs: ""
		// Test excepected Outputs: "Please do not enter an EMPTY day"
		public void testvalidateFrequency016() //throws NewsagentExceptionHandler
		{
			String excepectedOutputs = "Please do not enter an EMPTY day";
			String input = "";
			Publication p  = new  Publication();
			try 
			{
				p.validateFrequency(input);
				fail("Something went wrong");
						
			}
			
			catch(NewsagentExceptionHandler e)
			{
				assertEquals(e.getMessage(), excepectedOutputs);
			}
		}
		
		// Test#: 017
		// Test Objective: Test invalid freq
		// Test inputs: ""
		// Test excepected Outputs: "Please do not enter an EMPTY day"
		public void testvalidateFrequency017() //throws NewsagentExceptionHandler
		{
			String excepectedOutputs = "Enter one of the following days \"Monday\", \"Tuesday\", \"Wednesday\", \"Thursday\", \"Friday\", \"Saturday\", \"Sunday\"";
			String input = "asdaad";
			Publication p  = new  Publication();
			try 
			{
				p.validateFrequency(input);
				fail("Something went wrong");
						
			}
			
			catch(NewsagentExceptionHandler e)
			{
				assertEquals(e.getMessage(), excepectedOutputs);
			}
		}
		// Test#: 018
		// Test Objective: Test valid freq
		// Test inputs: ""
		// Test excepected Outputs: true
		public void testvalidateFrequency018() 
		{
			String input = "monday";
			Publication p  = new  Publication();
			try 
			{
				boolean results = p.validateFrequency(input);
				assertEquals(true, results);	
			}
			
			catch(NewsagentExceptionHandler e)
			{
				fail("Something went wrong");
			}
		}
		// Test#: 019
		// Test Objective: Test valid freq
		// Test inputs: "tueSday"
		// Test excepected Outputs: true
		public void testvalidateFrequency019() 
		{
			String input = "tueSday";
			Publication p  = new  Publication();
			try 
			{
				boolean results = p.validateFrequency(input);
				assertEquals(true, results);
			}
			catch(NewsagentExceptionHandler e)
			{
				fail("Something went wrong");
			}
		}
		// Test#: 020
		// Test Objective: Test invalid freq
		// Test inputs: ""
		// Test excepected Outputs: "Frequency cannot be empty"
		public void testvalidateFrequency020()
		{
			String excepectedOutputs = "Frequency cannot be empty";
			String input = " ";
			Publication p  = new  Publication();
			try 
			{
				p.validateFrequency(input);
				fail("Something went wrong");		
			}
			catch(NewsagentExceptionHandler e)
			{
				assertEquals(e.getMessage(), excepectedOutputs);
			}
		}
		
		// Test#: 021
		// Test Objective: Test invalid freq
		// Test inputs: "  "
		// Test excepected Outputs: "Frequency cannot be empty"
		public void testvalidateFrequency021() 
		{
			String excepectedOutputs = "Frequency cannot be empty";
			String input = "  ";
			Publication p  = new  Publication();
			try 
			{
				p.validateFrequency(input);
				fail("Something went wrong");		
			}
			catch(NewsagentExceptionHandler e)
			{
				assertEquals(e.getMessage(), excepectedOutputs);
			}
		}
}
