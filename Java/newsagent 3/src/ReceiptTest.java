

import junit.framework.TestCase;

public class ReceiptTest extends TestCase 
{
	
	
	// Test#: 001
	// Test Objective: Test valid id >= 300
	// Test inputs: 1
	// Test excepected Outputs: true
	public void testvalidateIDnumber001() throws NewsagentExceptionHandler
	{
		int input = 1;
		Receipt r  = new  Receipt(); 
		try 
		{
			boolean results = r.validateIDnumber(input);
			assertEquals(true, results);
		}
		catch(Exception e)
		{
			fail();
			
		}
	}
	// Test#: 002
	// Test Objective: Test invalid id >= 300
	// Test inputs: -1
	// Test excepected Outputs: "You cannot enter a negative number"
	public void testvalidateIDnumber002() //throws NewsagentExceptionHandler
	{
		String excepectedOutputs = "You cannot enter a negative number";
		int input = -1;
		Receipt r  = new  Receipt(); 
		try 
		{
			boolean results = r.validateIDnumber(input);
			fail();
			
		}
		
		catch(NewsagentExceptionHandler e)
		{
			
			assertEquals(e.getMessage(), excepectedOutputs);
		}
	}
	
	// Test#: 003
	// Test Objective: Test valid id >= 300
	// Test inputs: 150
	// Test excepected Outputs: "You cannot enter a negative number"
	public void testvalidateIDnumber003() //throws NewsagentExceptionHandler
	{
		// String excepectedOutputs = "You cannot enter a negative number";
		int input = 150;
		Receipt r  = new  Receipt(); 
		try 
		{
			boolean results = r.validateIDnumber(input);
			assertEquals(true, results);
			
		}
		catch(NewsagentExceptionHandler e)
		{
			fail("Something went wrong!");
			
		}
		
	}
	//
	// Test#: 004
	// Test Objective: Test invalid id >= 300
	// Test inputs: 301
	// Test excepected Outputs: "You cannot enter a negative number"
	public void testvalidateIDnumber004() //throws NewsagentExceptionHandler
	{
		String excepectedOutputs = "You cannot go over 300";
		int input = 301;
		Receipt r  = new  Receipt(); 
		try 
		{
			boolean results = r.validateIDnumber(input);
			fail();
			
		}
		
		catch(NewsagentExceptionHandler e)
		{
			
			assertEquals(e.getMessage(), excepectedOutputs);
		}
	}
	
	// Test#: 005
	// Test Objective: Test invalid price
	// Test inputs: 6
	// Test excepected Outputs: "You cannot enter a negative number"
	public void testvalidatePrice005() //throws NewsagentExceptionHandler
	{
		String excepectedOutputs = "Enter a valid price less or equal to 5";
		double input = 6.;
		Receipt r  = new  Receipt(); 
		try 
		{
			boolean results = r.validatePrice(input);
			fail();
			
		}
		
		catch(NewsagentExceptionHandler e)
		{
			
			assertEquals(e.getMessage(), excepectedOutputs);
		}
	}
	
	// Test#: 006
	// Test Objective: Test invalid price
	// Test inputs: -1
	// Test excepected Outputs: "You cannot enter a negative number"
	public void testvalidatePrice006() //throws NewsagentExceptionHandler
	{
		String excepectedOutputs = "Enter a valid price greater than 0";
		double input = -1;
		Receipt r  = new  Receipt(); 
		try 
		{
			boolean results = r.validatePrice(input);
			fail();
			
		}
		
		catch(NewsagentExceptionHandler e)
		{
			
			assertEquals(e.getMessage(), excepectedOutputs);
		}
	}
	
	// Test#: 007
	// Test Objective: Test invalid price
	// Test inputs: 1
	// Test excepected Outputs: "You cannot enter a negative number"
	public void testvalidatePrice007() //throws NewsagentExceptionHandler
	{
		//String excepectedOutputs = "Enter a valid price greater than 0";
		double input = 1;
		Receipt r  = new  Receipt(); 
		try 
		{
			boolean results = r.validatePrice(input);
			assertEquals(true, results);		
		}
		
		catch(NewsagentExceptionHandler e)
		{
			fail();
		}
	}
	
	// Test#: 008
	// Test Objective: Test invalid price
	// Test inputs: 5
	// Test excepected Outputs: "You cannot enter a negative number"
	public void testvalidatePrice008() //throws NewsagentExceptionHandler
	{
		//String excepectedOutputs = "Enter a valid price greater than 0";
		double input = 5;
		Receipt r  = new  Receipt(); 
		try 
		{
			boolean results = r.validatePrice(input);
			assertEquals(true, results);		
		}
		
		catch(NewsagentExceptionHandler e)
		{
			fail();
		}
	}
	

	
	// Test#: 009
	// Test Objective: Test valid date
	// Test inputs: 5
	// Test excepected Outputs: true
	public void testvalidateDate009()
	{
		int[] input = {1,1,2023};
		Receipt r  = new  Receipt();
		
		try 
		{
			boolean results = r.validateDate(input);
			assertEquals(true, results);		
		}
		
		catch(NewsagentExceptionHandler e)
		{
			fail();
		}
		
	}
	// Test#: 010
	// Test Objective: Test invalid day date
	// Test inputs: {0,1,2023}
	// Test excepected Outputs: true
	public void testvalidateDate010()
	{
		int[] input = {0,1,2023};
		Receipt r  = new  Receipt();
		String excepectedOutputs = "Enter a valid day, day cannot belwo 1";
		try 
		{
			boolean results = r.validateDate(input);
			fail();
		}
		
		catch(NewsagentExceptionHandler e)
		{
			
			assertEquals(e.getMessage(), excepectedOutputs);
		}
	}
	
	// Test#: 011
	// Test Objective: Test invalid month  date
	// Test inputs: {1,0,2023}
	// Test excepected Outputs: true
	public void testvalidateDate011()
	{
		int[] input = {1,0,2023};
		Receipt r  = new  Receipt();
		String excepectedOutputs = "Enter a valid month, month cannot belwo 1";
		try 
		{
			boolean results = r.validateDate(input);
			fail();
		}
		
		catch(NewsagentExceptionHandler e)
		{
			
			assertEquals(e.getMessage(), excepectedOutputs);
		}
	}
	
	// Test#: 012
	// Test Objective: Test invalid month  date
	// Test inputs: {1,2,2024}
	// Test excepected Outputs: "Enter a valid year under CURRENT date"
	public void testvalidateDate012()
	{
		int[] input = {1,2,2024};
		Receipt r  = new  Receipt();
		String excepectedOutputs = "Enter a valid year under CURRENT date";
		try 
		{
			boolean results = r.validateDate(input);
			fail();
		}
		
		catch(NewsagentExceptionHandler e)
		{
			
			assertEquals(e.getMessage(), excepectedOutputs);
		}
	}
	
	// Test#: 013
	// Test Objective: Test invalid month  date
	// Test inputs: {1,2,2025}
	// Test excepected Outputs: 
	public void testvalidateDate013()
	{
		int[] input = {1,2,2025};
		Receipt r  = new  Receipt();
		String excepectedOutputs = "Enter a valid year under CURRENT date";
		try 
		{
			boolean results = r.validateDate(input);
			fail();
		}
		
		catch(NewsagentExceptionHandler e)
		{
			
			assertEquals(e.getMessage(), excepectedOutputs);
		}
	}
	
	// Test#: 014
	// Test Objective: Test invalid month  date
	// Test inputs: {1,2,2023}
	// Test excepected Outputs: 
	public void testvalidateDate014()
	{
		int[] input = {1,13,2023};
		Receipt r  = new  Receipt();
		String excepectedOutputs = "Enter a valid month belwo 12";
		try 
		{
			r.validateDate(input);
			fail();
		}
		
		catch(NewsagentExceptionHandler e)
		{
			
			assertEquals(e.getMessage(), excepectedOutputs);
		}
	}
	
	// Test#: 015
	// Test Objective: Test invalid day  date
	// Test inputs: {32,2,2023}
	// Test excepected Outputs: Enter a valid day belwo 31
	public void testvalidateDate015()
	{
		int[] input = {32,12,2023};
		Receipt r  = new  Receipt();
		String excepectedOutputs = "Enter a valid day belwo 31";
		try 
		{
			r.validateDate(input);
			fail();
		}
		
		catch(NewsagentExceptionHandler e)
		{
			
			assertEquals(e.getMessage(), excepectedOutputs);
		}
	}
	
	//validateTime()
	// Test#: 016
	// Test Objective: Test invalid day  date
	// Test inputs: {32,2,2023}
	// Test excepected Outputs: Enter a valid day belwo 31
	public void testvalidateDate016()
	{
		int[] input = {32,12,2023};
		Receipt r  = new  Receipt();
		String excepectedOutputs = "Enter a valid day belwo 31";
		try 
		{
			r.validateDate(input);
			fail();
		}
		
		catch(NewsagentExceptionHandler e)
		{
			
			assertEquals(e.getMessage(), excepectedOutputs);
		}
	}
	
	//validateTime()
	// Test#: 017
	// Test Objective: Test invalid day  time
	// Test inputs: {32,2,2023}
	// Test excepected Outputs: Enter valid hours cannot be negative
	public void testvalidateTime017()
	{
		int[] input = {-1,1,1};
		Receipt r  = new  Receipt();
		String excepectedOutputs = "Enter valid hours cannot be negative";
		try 
		{
			r.validateTime(input);
			fail();
		}
		
		catch(NewsagentExceptionHandler e)
		{
			
			assertEquals(e.getMessage(), excepectedOutputs);
		}
	}
	//validateTime()
	// Test#: 018
	// Test Objective: Test invalid day  date
	// Test inputs: {1,-1,1}
	// Test excepected Outputs: Enter valid hours cannot be negative
	public void testvalidateTime018()
	{
		int[] input = {1,-1,1};
		Receipt r  = new  Receipt();
		String excepectedOutputs = "Enter a valid minutes cannot be negative";
		try 
		{
			r.validateTime(input);
			fail();
		}
		
		catch(NewsagentExceptionHandler e)
		{
			
			assertEquals(e.getMessage(), excepectedOutputs);
		}
	}
	
	//validateTime()
	// Test#: 018
	// Test Objective: Test invalid time
	// Test inputs: {1,1,-1}
	// Test excepected Outputs:Enter valid seconds cannot be negative
	public void testvalidateTime019()
	{
		int[] input = {1,1,-1};
		Receipt r  = new  Receipt();
		String excepectedOutputs = "Enter valid seconds cannot be negative";
		try 
		{
			r.validateTime(input);
			fail();
		}
		
		catch(NewsagentExceptionHandler e)
		{
			
			assertEquals(e.getMessage(), excepectedOutputs);
		}
	}
	//Enter valid hours over 24
	
	//validateTime()
	// Test#: 020
	// Test Objective: Test invalid time
	// Test inputs: {25,1,1}
	// Test excepected Outputs: Enter valid hours belwo 24
	public void testvalidateTime020()
	{
		int[] input = {25,1,2};
		Receipt r  = new  Receipt();
		String excepectedOutputs = "Enter valid hours belwo 24";
		try 
		{
			r.validateTime(input);
			fail();
		}
		
		catch(NewsagentExceptionHandler e)
		{
			
			assertEquals(e.getMessage(), excepectedOutputs);
		}
	}
	
	//validateTime()
	// Test#: 021
	// Test Objective: Test invalid time
	// Test inputs: {2,61,2}
	// Test excepected Outputs: Enter valid minutes belwo 60
	public void testvalidateTime021()
	{
		int[] input = {2,61,2};
		Receipt r  = new  Receipt();
		String excepectedOutputs = "Enter valid minutes belwo 60";
		try 
		{
			r.validateTime(input);
			fail();
		}
		
		catch(NewsagentExceptionHandler e)
		{
			
			assertEquals(e.getMessage(), excepectedOutputs);
		}
	}
	
	// Test#: 022
	// Test Objective: Test invalid day  time
	// Test inputs: {1,1,61}
	// Test excepected Outputs: Enter valid minutes belwo 60
	public void testvalidateTime022()
	{
		int[] input = {1,1,61};
		Receipt r  = new  Receipt();
		String excepectedOutputs = "Enter valid seconds belwo 60";
		try 
		{
			r.validateTime(input);
			fail();
		}
		
		catch(NewsagentExceptionHandler e)
		{
			
			assertEquals(e.getMessage(), excepectedOutputs);
		}
	}
	// Test#: 023
	// Test Objective: Test valid time  date
	// Test inputs: {1,1,1}
	// Test excepected Outputs: Enter valid minutes belwo 60
	public void testvalidateTime023()
	{
		int[] input = {1,1,1};
		Receipt r  = new  Receipt();
		//String excepectedOutputs = "Enter valid seconds belwo 60";
		try 
		{
			boolean results = r.validateTime(input);
			assertEquals(true, results );
			
		}
		
		catch(NewsagentExceptionHandler e)
		{
			fail();
		}
	}
	
	// Test#: 024
	// Test Objective: Test valid time  date
	// Test inputs: {12,30,30}
	// Test excepected Outputs: true
	public void testvalidateTime024()
	{
		int[] input = {12,30,30};
		Receipt r  = new  Receipt();
		try 
		{
			boolean results = r.validateTime(input);
			assertEquals(true, results );	
		}
		catch(NewsagentExceptionHandler e)
		{
			fail();
		}
	}
	
	
	// Test#: 025
	// Test Objective: Test invalid balance
	// Test inputs: 1
	// Test excepected Outputs: "Enter valid number belwo 1000"
	public void testvalidateBalance025()
	{
		String excp = "Enter valid number belwo 1";
		double input = -1.;
		Receipt r  = new  Receipt();
		try 
		{
			r.validateBalance(input);
			fail();
		}
		catch(NewsagentExceptionHandler e)
		{
			
			assertEquals(e.getMessage(), excp );
		}
	}
	
	// Test#: 026
	// Test Objective: Test invalid balance
	// Test inputs: 1001
	// Test excepected Outputs: "Enter valid number belwo 1000"
	public void testvalidateBalance026()
	{
		String excp = "Enter valid number over 1000";
		double input = 1001.;
		Receipt r  = new  Receipt();
		try 
		{
			r.validateBalance(input);
			fail();
		}
		catch(NewsagentExceptionHandler e)
		{
			
			assertEquals(e.getMessage(), excp );
		}
	}
	
	// Test#: 027
	// Test Objective: Test valid balance
	// Test inputs: 500
	// Test excepected Outputs: "Enter valid number belwo 1000"
	public void testvalidateBalance027()
	{
		double input = 500.;
		Receipt r  = new  Receipt();
		try 
		{
			boolean results = r.validateBalance(input);
			assertEquals(true, results );
		}
		catch(NewsagentExceptionHandler e)
		{
			
			fail();
		}
	}
	
	
	
	// Test#: 028
	// Test Objective: Test testvalidateDriverIDnumebr010 invalid id >= 300
	// Test inputs: invalid ""
	// Test excepected Outputs: "You cannot enter a negative number"
	public void testvalidateCustomerName028() 
	{
		String excepectedOutputs = "Customer name cannot be empty";
		String input = "";
		Receipt r  = new  Receipt();
		try 
		{
			r.validateCustomerName(input);
			fail("Something went wrong!");
			
		}
		
		catch(NewsagentExceptionHandler e)
		{
			
			assertEquals(e.getMessage(), excepectedOutputs);
		}
	}
	// Test#: 012
	// Test Objective: Test testvalidateDriverIDnumebr010 invalid id >= 300
	// Test inputs: invalid "£####"
	// Test excepected Outputs: "You cannot enter a negative number"
	public void testvalidateCustomerName029() 
	{
		String excepectedOutputs = "Customer name contains invalid characters";
		String input = "£####";
		Receipt r  = new  Receipt();
		try 
		{
			r.validateCustomerName(input);
			fail("Something went wrong!");
			
		}
		
		catch(NewsagentExceptionHandler e)
		{
			
			assertEquals(e.getMessage(), excepectedOutputs);
		}
	}
	
	// Test#: 013
	// Test Objective: Test testvalidateDriverIDnumebr010 invalid id >= 300
	// Test inputs: invalid ""
	// Test excepected Outputs: "You cannot enter a negative number"
	public void testvalidateCustomerName030() 
	{
		String excepectedOutputs = "Customer name is too long";
		String input = "asdsadasdsadsaddwhevehvshdhsdhkbksdcbdbkhcbdhcskhdchdskhcvsdhvckdsvhcvskdhvchdsvhcvsdvhcvdshjcvhdv";
		Receipt r  = new  Receipt();
		try 
		{
			r.validateCustomerName(input);
			fail("Something went wrong!");
			
		}
		catch(NewsagentExceptionHandler e)
		{
			
			assertEquals(e.getMessage(), excepectedOutputs);
		}
	}
	// Test#: 014
	// Test Objective: Test testvalidateDriverIDnumebr010 invalid id >= 300
	// Test inputs: invalid "taha"
	// Test excepected Outputs: "You cannot enter a negative number"
	public void testvalidateCustomerName031() 
	{
		String input = "taha";
		Receipt r  = new  Receipt(); 
		try 
		{
			boolean results  = r.validateCustomerName(input);
			assertEquals(true, results);
		}
		
		catch(NewsagentExceptionHandler e)
		{
			fail("Something went wrong!");
		}
	}
	// Test#: 032
	// Test Objective: Test testvalidateDriverIDnumebr010 invalid id >= 300
	// Test inputs: invalid "ta"
	// Test excepected Outputs: "You cannot enter a negative number"
	public void testvalidateCustomerName032() 
	{
		    String expectedOutputs = "Enter a valid name more than 2 letters";
		    String input = "ol";
		    Receipt r  = new  Receipt();
		    try 
		    {
		        r.validateCustomerName(input);
		        fail("Something went wrong!");
		    }
		    catch(NewsagentExceptionHandler e)
		    {
		        assertEquals(e.getMessage(), expectedOutputs);
		    }
	}
	// Test#: 033
	// Test Objective: Test testvalidateDriverIDnumebr010 invalid id >= 300
	// Test inputs: invalid "taha"
	// Test excepected Outputs: "You cannot enter a negative number"
	public void testvalidateCustomerName033() 
	{
		String input = "Tamer";
		Receipt r  = new  Receipt(); 
		try 
		{
			boolean results  = r.validateCustomerName(input);
			assertEquals(true, results);
		}
		
		catch(NewsagentExceptionHandler e)
		{
			fail("Something went wrong!");
		}
	}
	
	  // Test# 034
    // Test Objective: Test valid input values
    // Test inputs: Valid values for the constructor parameters
    // Test expected Outputs: Ensure that the constructor sets the values correctly
    public void testReceiptConstructor034() {
        int idNumber = 123;
        String customerName = "John Doe";
        int customerID = 456;
        double price = 19.99;
        int[] date = {1, 1, 2023};
        int[] time = {12, 30, 0};
        String home = "123 Main St";
        double balance = 100.0;
        String publicationName = "Daily News";
        String name = "taha";

        Receipt receipt = new Receipt(idNumber, customerName, customerID, price, date, time, home, balance, publicationName,name);

        assertEquals(idNumber, receipt.getIdNumber());
        assertEquals(customerName, receipt.getCustomerName());
        assertEquals(customerID, receipt.getCustomerID());
        assertEquals(price, receipt.getPrice(), 0.001);  // Using delta for double comparison
        assertEquals(date, receipt.getDate());
        assertEquals(time, receipt.getTime());
        assertEquals(home, receipt.getHomeAddress());
        assertEquals(balance, receipt.getBalance(), 0.001);
        assertEquals(publicationName, receipt.getPublicationName());
    }
    
	// Test#: 035
	// Test Objective: Test testvalidateDriverIDnumebr010 invalid id >= 300
	// Test inputs: valid 12,hr,12,er
	// Test excepected Outputs: "You cannot enter a negative number"
	public void testvalidateHomeAddress035() 
	{
		
	    int input1 = 12;
	    String input2 = "hr";
	    int input3 = 12;
	    String input4 = "er";
		Receipt r  = new  Receipt(); 
		try 
		{
			boolean results  = r.validateHomeAddress(input1);
			assertEquals(true, results);
		}
		catch(NewsagentExceptionHandler e)
		{
			fail("Something went wrong!");
		}
	}
	
	
	// Test#: 036
	// Test Objective: Test validateHomeAddress invalid
	// Test inputs: invalid 120,hr,12,er
	// Test excepected Outputs: "You cannot enter a negative number"
	
	public void testvalidateHomeAddress036() 
	{
		String expected = "Enter a valid Eircode number below 100";
	    int input1 = 120;
	    String input2 = "hr";
	    int input3 = 12;
	    String input4 = "er";
	    
	    Receipt r = new Receipt();

	    try {
	        r.validateHomeAddress(input1);
	        fail("Expected NewsagentExceptionHandler to be thrown, but it did not occur.");
	    } 
	    catch (NewsagentExceptionHandler e) 
	    {

	        assertEquals(e.getMessage(),expected );
	    }
	}
	
	// Test#: 036
	// Test Objective: Test validateHomeAddress invalid
	// Test inputs: invalid 12, ,12,er
	// Test excepected Outputs: "Please Do not enter spaces ENTER VALID EIRCODE"
	
	public void testvalidateHomeAddress037() 
	{
		String expected = "Please Do not enter spaces ENTER VALID EIRCODE";
	    int input1 = 10;
	    String input2 = " ";
	    int input3 = 12;
	    String input4 = "er";
	    
	    Receipt r = new Receipt();

	    try {
	        r.validateHomeAddress(input2);
	        fail("Expected NewsagentExceptionHandler to be thrown, but it did not occur.");
	    } 
	    catch (NewsagentExceptionHandler e) 
	    {

	        assertEquals(e.getMessage(),expected );
	    }
	}
	
	// Test#: 036
	// Test Objective: Test validateHomeAddress invalid
	// Test inputs: invalid 12, ,12,er
	// Test excepected Outputs: "You cannot enter a negative number"
	
	public void testvalidateHomeAddress038() 
	{
		String expected = "Enter a valid Eircode 2 Letters";
	    int input1 = 10;
	    String input2 = "uuu";
	    int input3 = 12;
	    String input4 = "er";
	    
	    Receipt r = new Receipt();

	    try {
	        r.validateHomeAddress(input2);
	        fail("Expected NewsagentExceptionHandler to be thrown, but it did not occur.");
	    } 
	    catch (NewsagentExceptionHandler e) 
	    {

	        assertEquals(e.getMessage(),expected );
	    }
	}
	
	// Test#: 036
	// Test Objective: Test validateHomeAddress invalid
	// Test inputs: invalid 12,rr,120,er
	// Test excepected Outputs: "You cannot enter a negative number"
	
	public void testvalidateHomeAddress039() 
	{
		String expected = "Enter a valid Eircode number below 100";
	    int input1 = 10;
	    String input2 = "rr";
	    int input3 = 120;
	    String input4 = "er";
	    
	    Receipt r = new Receipt();

	    try {
	        r.validateHomeAddress(input3);
	        fail("Expected NewsagentExceptionHandler to be thrown, but it did not occur.");
	    } 
	    catch (NewsagentExceptionHandler e) 
	    {

	        assertEquals(e.getMessage(),expected );
	    }
	}
	
	// Test#: 036
	// Test Objective: Test validateHomeAddress invalid
	// Test inputs: invalid 12,rr,120,er
	// Test excepected Outputs: "You cannot enter a negative number"
	
	public void testvalidateHomeAddress040() 
	{
		String expected = "Please Do not enter spaces ENTER VALID EIRCODE";
	    int input1 = 10;
	    String input2 = "rr";
	    int input3 = 12;
	    String input4 = "";
	    
	    Receipt r = new Receipt();

	    try {
	        r.validateHomeAddress(input4);
	        fail("Expected NewsagentExceptionHandler to be thrown, but it did not occur.");
	    } 
	    catch (NewsagentExceptionHandler e) 
	    {
	        assertEquals(e.getMessage(),expected );
	    }
	}
	// Test#: 036
	// Test Objective: Test validateHomeAddress invalid
	// Test inputs: invalid 12,rr,120,er
	// Test excepected Outputs: "You cannot enter a negative number"
	
	public void testvalidateHomeAddress041() 
	{
		String expected = "Please Do not enter spaces ENTER VALID EIRCODE";
	    int input1 = 10;
	    String input2 = "rr";
	    int input3 = 12;
	    String input4 = "  ";
	    
	    Receipt r = new Receipt();

	    try {
	        r.validateHomeAddress(input4);
	        fail("Expected NewsagentExceptionHandler to be thrown, but it did not occur.");
	    } 
	    catch (NewsagentExceptionHandler e) 
	    {
	        assertEquals(e.getMessage(),expected );
	    }
	}
    
	// Test#: 036
	// Test Objective: Test validateHomeAddress invalid
	// Test inputs: invalid 12,rr,120,er
	// Test excepected Outputs: "You cannot enter a negative number"
	
	public void testvalidateHomeAddress042() 
	{
		String expected = "Enter a valid Eircode 2 Letters";
	    int input1 = 10;
	    String input2 = "rr";
	    int input3 = 12;
	    String input4 = "www";
	    
	    Receipt r = new Receipt();

	    try {
	        r.validateHomeAddress(input4);
	        fail("Expected NewsagentExceptionHandler to be thrown, but it did not occur.");
	    } 
	    catch (NewsagentExceptionHandler e) 
	    {
	        assertEquals(e.getMessage(),expected );
	    }
	}
	
	// Test#: 036
	// Test Objective: Test validateHomeAddress invalid
	// Test inputs: invalid 12,rr,120,er
	// Test excepected Outputs: "You cannot enter a negative number"
	
	public void testvalidateHomeAddress043() 
	{
		String expected = "Please Do not enter spaces ENTER VALID EIRCODE";
	    int input1 = 10;
	    String input2 = "rr";
	    int input3 = 12;
	    String input4 = "";
	    
	    Receipt r = new Receipt();

	    try {
	        r.validateHomeAddress(input4);
	        fail("Expected NewsagentExceptionHandler to be thrown, but it did not occur.");
	    } 
	    catch (NewsagentExceptionHandler e) 
	    {
	        assertEquals(e.getMessage(),expected );
	    }
	}
	

}
	
