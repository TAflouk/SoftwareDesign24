import java.time.LocalDate;

import java.util.ArrayList;
import java.util.Arrays;

import junit.framework.TestCase;
/**
 * @Author TAflouk
 * @Date 01-09-23
 * @LastModified 21-11-23
 * @Time 22:30
 */

public class DeliveryDocketTest extends TestCase {
	
	 //       ===============================   TESTING validateIDNumber   =============================================
		// Test#: 001
		// Test Objective: Test valid id >= 300
		// Test inputs: 1
		// Test excepected Outputs: true
		public void testvalidateIDNumber001()
		{
			int input = 1;
			DeliveryDocket d  = new  DeliveryDocket(); 
			try 
			{
				boolean results = d.validateDocketIDNumber(input);
				assertEquals(true, results);
			}
			catch(Exception e)
			{
				fail("Something went wrong");
			}
		}
	
		// Test#: 002
		// Test Objective: Test invalid id >= 300
		// Test inputs: -1
		// Test excepected Outputs: "You cannot enter a negative number"
		public void testvalidateIDNumber002() 
		{
			String name = "Delivery Docket ";
			String excepectedOutputs = name+"ID must be a positive number";
			int input = -1;
			DeliveryDocket d  = new  DeliveryDocket(); 
			try 
			{
				d.validateDocketIDNumber(input);
				fail("Something went wrong");
				
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
		public void testvalidateIDNumber003() 
		{
			// String excepectedOutputs = "You cannot enter a negative number";
			int input = 150;
			DeliveryDocket d  = new  DeliveryDocket(); 
			try 
			{
				boolean results = d.validateDocketIDNumber(input);
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
		public void testvalidateIDNumber004() 
		{
			String name = "Delivery Docket ";
			String excepectedOutputs = name+"ID must be less than or equal to 300";
			int input = 301;
			DeliveryDocket d  = new  DeliveryDocket(); 
			try 
			{
				d.validateDocketIDNumber(input);
				fail("Something went wrong");
				
			}
			
			catch(NewsagentExceptionHandler e)
			{
				
				assertEquals(e.getMessage(), excepectedOutputs);
			}
		}
		// Test#: 005
		// Test Objective: Test invalid id >= 300
		// Test inputs: 400
		// Test excepected Outputs: "ID must be less than or equal to 300"
		public void testvalidateIDNumber005() 
		{
			String name = "Delivery Docket ";
			String excepectedOutputs = name+ "ID must be less than or equal to 300";
			int input = 400;
			DeliveryDocket d  = new  DeliveryDocket(); 
			try 
			{
				d.validateDocketIDNumber(input);
				fail("Something went wrong");
			}
			catch(NewsagentExceptionHandler e)
			{
				assertEquals(e.getMessage(), excepectedOutputs);
			}
		}
		
		// Test#: 006
		// Test Objective: Test invalid id >= 300
		// Test inputs: 300
		// Test excepected Outputs: true
		public void testvalidateIDNumber006() 
		{
			int input = 300;
			DeliveryDocket d  = new  DeliveryDocket(); 
			try 
			{
				boolean res = d.validateDocketIDNumber(input);
				assertEquals(true,res );
			}
			catch(NewsagentExceptionHandler e)
			{
				fail("Something went wrong");
			}
		}
		// Test#: 007
		// Test Objective: Test invalid id >= 300
		// Test inputs: 0
		// Test excepected "ID cannot be null"
		public void testvalidateIDNumber007() 
		{
			String name = "Delivery Docket ";
			String excepectedOutputs =name+ "ID cannot be 0";
			int input = 0;
			DeliveryDocket d  = new  DeliveryDocket(); 
			try 
			{
				d.validateDocketIDNumber(input);
				fail("Something went wrong");
				
			}
			
			catch(NewsagentExceptionHandler e)
			{
				assertEquals(e.getMessage(), excepectedOutputs);
			}
		}
		 //       ===============================   TESTING validateDriverIDnumebr   =============================================
		
		// Test#: 008
		// Test Objective: Test valid id >= 300
		// Test inputs: 1
		// Test excepected Outputs: true
		public void testvalidateDriverIDnumebr008() throws NewsagentExceptionHandler
		{
			
			int input = 1;
			DeliveryDocket d  = new  DeliveryDocket(); 
			try 
			{
				boolean results = d.validateDriverIDnumebr(input);
				assertEquals(true, results);
			}
			catch(Exception e)
			{
				fail("Something went wrong");
			}
		}
	
		// Test#: 009
		// Test Objective: Test invalid id >= 300
		// Test inputs: -1
		// Test excepected Outputs: "You cannot enter a negative number"
		public void testvalidateDriverIDnumebr009() 
		{
			String name = "Delivery Driver ";
			String excepectedOutputs = name+"ID must be a positive number";
			int input = -1;
			DeliveryDocket d  = new  DeliveryDocket(); 
			try 
			{
				d.validateDriverIDnumebr(input);
				fail("Something went wrong");
				
			}
			
			catch(NewsagentExceptionHandler e)
			{
				
				assertEquals(e.getMessage(), excepectedOutputs);
			}
		}
		// Test#: 010
		// Test Objective: Test valid id >= 300
		// Test inputs: 150
		// Test excepected Outputs: "You cannot enter a negative number"
		public void testvalidateDriverIDnumebr010() 
		{
			// String excepectedOutputs = "You cannot enter a negative number";
			int input = 150;
			DeliveryDocket d  = new  DeliveryDocket(); 
			try 
			{
				boolean results = d.validateDriverIDnumebr(input);
				assertEquals(true, results);
				
			}
			catch(NewsagentExceptionHandler e)
			{
				fail("Something went wrong!");
				
			}
			
		}
		//
		// Test#: 011
		// Test Objective: Test invalid id >= 300
		// Test inputs: 301
		// Test excepected Outputs: "You cannot enter a negative number"
		public void testvalidateDriverIDnumebr011()
		{
			String name = "Delivery Driver ";
			String excepectedOutputs = name+"ID must be less than or equal to 300";
			int input = 301;
			DeliveryDocket d  = new  DeliveryDocket(); 
			try 
			{
				d.validateDriverIDnumebr(input);
				fail("Something went wrong");
				
			}
			
			catch(NewsagentExceptionHandler e)
			{
				
				assertEquals(e.getMessage(), excepectedOutputs);
			}
		}
		// Test#: 012
		// Test Objective: Test invalid id >= 300
		// Test inputs: 400
		// Test excepected Outputs: "ID must be less than or equal to 300"
		public void testvalidateDriverIDnumebr012() 
		{
			String name = "Delivery Driver ";
			String excepectedOutputs = name+"ID must be less than or equal to 300";
			int input = 400;
			DeliveryDocket d  = new  DeliveryDocket(); 
			try 
			{
				d.validateDriverIDnumebr(input);
				fail("Something went wrong");
			}
			catch(NewsagentExceptionHandler e)
			{
				assertEquals(e.getMessage(), excepectedOutputs);
			}
		}
		
		// Test#: 013
		// Test Objective: Test invalid id >= 300
		// Test inputs: 300
		// Test excepected Outputs: true
		public void testvalidateDriverIDnumebr013() 
		{
			int input = 300;
			DeliveryDocket d  = new  DeliveryDocket(); 
			try 
			{
				boolean res = d.validateDriverIDnumebr(input);
				assertEquals(true,res );
			}
			catch(NewsagentExceptionHandler e)
			{
				fail("Something went wrong");
			}
		}
		// Test#: 014
		// Test Objective: Test invalid id >= 300
		// Test inputs: 0
		// Test excepected "ID cannot be null"
		public void testvalidateDriverIDnumebr014()
		{
			String name = "Delivery Driver ";
			String excepectedOutputs = name+"ID cannot be 0";
			int input = 0;
			DeliveryDocket d  = new  DeliveryDocket(); 
			try 
			{
				d.validateDriverIDnumebr(input);
				fail("Something went wrong");
			}
			catch(NewsagentExceptionHandler e)
			{
				assertEquals(e.getMessage(), excepectedOutputs);
			}
		}
		
		 //       ===============================   TESTING validateCustomerName  =============================================
		
		
		
		// Test#: 015
		// Test Objective: Test invalid name
		// Test inputs: ""
		// Test excepected "Customer Name cannot be null"
		public void testvalidateCustomerName015() 
		{
			String excepectedOutputs = "Customer Name cannot be null";
			String input = "";
			DeliveryDocket d  = new  DeliveryDocket(); 
			try 
			{
				d.validateCustomerName(input);
				fail("Something went wrong");
			}
			catch(NewsagentExceptionHandler e)
			{
				assertEquals(e.getMessage(), excepectedOutputs);
			}
		}
		
		// Test#: 016
		// Test Objective: Test invalid name
		// Test inputs: "  "
		// Test excepected "Customer Name cannot be empty"
		public void testvalidateCustomerName016() 
		{
			String excepectedOutputs = "Customer Name cannot be empty";
			String input = "  ";
			DeliveryDocket d  = new  DeliveryDocket(); 
			try 
			{
				d.validateCustomerName(input);
				fail("Something went wrong");
			}
			catch(NewsagentExceptionHandler e)
			{
				assertEquals(e.getMessage(), excepectedOutputs);
			}
		}
		
		// Test#: 017
		// Test Objective: Test invalid name
		// Test inputs: " "
		// Test excepected "Customer Name cannot be empty"
		public void testvalidateCustomerName017()
		{
			String excepectedOutputs = "Customer Name cannot be empty";
			String input = " ";
			DeliveryDocket d  = new  DeliveryDocket(); 
			try 
			{
				d.validateCustomerName(input);
				fail("Something went wrong");
			}
			catch(NewsagentExceptionHandler e)
			{
				assertEquals(e.getMessage(), excepectedOutputs);
			}
		}
		// Test#: 018
		// Test Objective: Test invalid name
		// Test inputs: "sajdhsajdhjsadjsajdbjksabdkjbsadbkjsabdkjbsakjd"
		// Test excepected "Enter a valid name with fewer than " + 15 + " characters"
		public void testvalidateCustomerName018() 
		{
			String excepectedOutputs = "Enter a valid name with fewer than " + 15 + " characters";
			String input = "sajdhsajdhjsadjsajdbjksabdkjbsadbkjsabdkjbsakjd";
			DeliveryDocket d  = new  DeliveryDocket(); 
			try 
			{
				d.validateCustomerName(input);
				fail("Something went wrong");
			}
			catch(NewsagentExceptionHandler e)
			{
				assertEquals(e.getMessage(), excepectedOutputs);
			}
		}
		
		// Test#: 019
		// Test Objective: Test invalid name
		// Test inputs: "s1234"
		// Test excepected output: "Enter a valid name with only letters from 'a' to 'z'"
		public void testvalidateCustomerName019() 
		{
			String excepectedOutputs = "Enter a valid name with only letters from 'a' to 'z'";
			String input = "s1234";
			DeliveryDocket d  = new  DeliveryDocket(); 
			try 
			{
				d.validateCustomerName(input);
				fail("Something went wrong");
			}
			catch(NewsagentExceptionHandler e)
			{
				assertEquals(e.getMessage(), excepectedOutputs);
			}
		}
		
		// Test#: 020
		// Test Objective: Test invalid name
		// Test inputs: "s1234"
		// Test excepected output: "Enter a valid name with only letters from 'a' to 'z'"
		public void testvalidateCustomerName020() 
		{
			String excepectedOutputs = "Enter a valid name with only letters from 'a' to 'z'";
			String input = "1234";
			DeliveryDocket d  = new  DeliveryDocket(); 
			try 
			{
				d.validateCustomerName(input);
				fail("Something went wrong");
			}
			catch(NewsagentExceptionHandler e)
			{
				assertEquals(e.getMessage(), excepectedOutputs);
			}
		}
		
		// Test#: 021
		// Test Objective: Test invalid name
		// Test inputs: "#####"
		// Test excepected output: "Enter a valid name with only letters from 'a' to 'z'"
		public void testvalidateCustomerName021() 
		{
			String excepectedOutputs = "Enter a valid name with only letters from 'a' to 'z'";
			String input = "#####";
			DeliveryDocket d  = new  DeliveryDocket(); 
			try 
			{
				d.validateCustomerName(input);
				fail("Something went wrong");
			}
			catch(NewsagentExceptionHandler e)
			{
				assertEquals(e.getMessage(), excepectedOutputs);
			}
		}
		
		// Test#: 021
		// Test Objective: Test invalid name
		// Test inputs: "ss"
		// Test excepected output: "Enter a valid name with at least 3 letters"
		public void testvalidateCustomerName022() 
		{
			String excepectedOutputs = "Enter a valid name with at least 3 letters";
			String input = "ss";
			DeliveryDocket d  = new  DeliveryDocket(); 
			try 
			{
				d.validateCustomerName(input);
				fail("Something went wrong");
			}
			catch(NewsagentExceptionHandler e)
			{
				assertEquals(e.getMessage(), excepectedOutputs);
			}
		}
		// Test#: 023
		// Test Objective: Test invalid name
		// Test inputs: "s"
		// Test excepected output: "Enter a valid name with at least 3 letters"
		public void testvalidateCustomerName023() 
		{
			String excepectedOutputs = "Enter a valid name with at least 3 letters";
			String input = "s";
			DeliveryDocket d  = new  DeliveryDocket(); 
			try 
			{
				d.validateCustomerName(input);
				fail("Something went wrong");
			}
			catch(NewsagentExceptionHandler e)
			{
				assertEquals(e.getMessage(), excepectedOutputs);
			}
		}
		
		// Test#: 024
		// Test Objective: Test invalid name
		// Test inputs: "Taha"
		// Test excepected output: "Enter a valid name with at least 3 letters"
		public void testvalidateCustomerName024() 
		{
			String input = "Taha";
			DeliveryDocket d  = new  DeliveryDocket(); 
			try 
			{
				boolean res = d.validateCustomerName(input);
				assertEquals(true, res);
				
			}
			catch(NewsagentExceptionHandler e)
			{
				fail("Something went wrong");
			}
		}
		 //       ===============================   TESTING validateCustomerID   =============================================
		
		// Test#: 025
		// Test Objective: Test valid id must be  <= 300
		// Test inputs: 1
		// Test excepected Outputs: true
		public void testvalidateCustomerID025() throws NewsagentExceptionHandler
		{
			
			int input = 1;
			DeliveryDocket d  = new  DeliveryDocket(); 
			try 
			{
				boolean results = d.validateDriverIDnumebr(input);
				assertEquals(true, results);
			}
			catch(Exception e)
			{
				fail("Something went wrong");
			}
		}
	
		// Test#: 027
		// Test Objective: Test invalid id >= 300
		// Test inputs: -1
		// Test excepected Outputs: "You cannot enter a negative number"
		public void testvalidateCustomerID026() 
		{
			String name = "Delivery Driver ";
			String excepectedOutputs = name+"ID must be a positive number";
			int input = -1;
			DeliveryDocket d  = new  DeliveryDocket(); 
			try 
			{
				d.validateDriverIDnumebr(input);
				fail("Something went wrong");
				
			}
			
			catch(NewsagentExceptionHandler e)
			{
				
				assertEquals(e.getMessage(), excepectedOutputs);
			}
		}
		// Test#: 027
		// Test Objective: Test valid id >= 300
		// Test inputs: 150
		// Test excepected Outputs: "You cannot enter a negative number"
		public void testvalidateCustomerID027() 
		{
			// String excepectedOutputs = "You cannot enter a negative number";
			int input = 150;
			DeliveryDocket d  = new  DeliveryDocket(); 
			try 
			{
				boolean results = d.validateDriverIDnumebr(input);
				assertEquals(true, results);
				
			}
			catch(NewsagentExceptionHandler e)
			{
				fail("Something went wrong!");
				
			}
			
		}
		//
		// Test#: 028
		// Test Objective: Test invalid id >= 300
		// Test inputs: 301
		// Test excepected Outputs: "You cannot enter a negative number"
		public void testvalidateCustomerID028()
		{
			String name = "Delivery Driver ";
			String excepectedOutputs = name+"ID must be less than or equal to 300";
			int input = 301;
			DeliveryDocket d  = new  DeliveryDocket(); 
			try 
			{
				d.validateDriverIDnumebr(input);
				fail("Something went wrong");
				
			}
			
			catch(NewsagentExceptionHandler e)
			{
				
				assertEquals(e.getMessage(), excepectedOutputs);
			}
		}
		// Test#: 029
		// Test Objective: Test invalid id >= 300
		// Test inputs: 400
		// Test excepected Outputs: "ID must be less than or equal to 300"
		public void testvalidateCustomerID029() 
		{
			String name = "Delivery Driver ";
			String excepectedOutputs = name+"ID must be less than or equal to 300";
			int input = 400;
			DeliveryDocket d  = new  DeliveryDocket(); 
			try 
			{
				d.validateDriverIDnumebr(input);
				fail("Something went wrong");
			}
			catch(NewsagentExceptionHandler e)
			{
				assertEquals(e.getMessage(), excepectedOutputs);
			}
		}
		
		// Test#: 030
		// Test Objective: Test invalid id >= 300
		// Test inputs: 300
		// Test excepected Outputs: true
		public void testvalidateCustomerID030() 
		{
			int input = 300;
			DeliveryDocket d  = new  DeliveryDocket(); 
			try 
			{
				boolean res = d.validateDriverIDnumebr(input);
				assertEquals(true,res );
			}
			catch(NewsagentExceptionHandler e)
			{
				fail("Something went wrong");
			}
		}
		// Test#: 031
		// Test Objective: Test invalid id >= 300
		// Test inputs: 0
		// Test excepected Output:"ID cannot be null"
		public void testvalidateCustomerID031()
		{
			String name = "Delivery Driver ";
			String excepectedOutputs = name+"ID cannot be 0";
			int input = 0;
			DeliveryDocket d  = new  DeliveryDocket(); 
			try 
			{
				d.validateDriverIDnumebr(input);
				fail("Something went wrong");
			}
			catch(NewsagentExceptionHandler e)
			{
				assertEquals(e.getMessage(), excepectedOutputs);
			}
		}
		 //       ===============================   TESTING validatePrice   =============================================
		
		// Test#: 032
		// Test Objective: Test invalid id >= 300
		// Test inputs: 0
		// Test excepected Output:"ID cannot be null"
		public void testvalidatePrice032()
		{
			String excepectedOutputs = "Price cannot be 0";
			double input = 0;
			DeliveryDocket d  = new  DeliveryDocket(); 
			try 
			{
				d.validatePrice(input);
				fail("Something went wrong");
			}
			catch(NewsagentExceptionHandler e)
			{
				assertEquals(e.getMessage(), excepectedOutputs);
			}
		}
		
		// Test#: 033
		// Test Objective: Test invalid Price > MAX_PRICE
		// Test inputs: 0
		// Test excepected Output: "Price must be less than or equal to 5"
		public void testvalidatePrice033()
		{
			String excepectedOutputs = "Price must be less than or equal to 5";
			double input = 5.4;
			DeliveryDocket d  = new  DeliveryDocket(); 
			try 
			{
				d.validatePrice(input);
				fail("Something went wrong");
			}
			catch(NewsagentExceptionHandler e)
			{
				assertEquals(e.getMessage(), excepectedOutputs);
			}
		}
		// Test#: 034
		// Test Objective: Test invalid Price < 0
		// Test inputs: -2
		// Test excepected Output: "Price must be a positive number"
		public void testvalidatePrice034()
		{
			String excepectedOutputs = "Price must be a positive number";
			double input = -2;
			DeliveryDocket d  = new  DeliveryDocket(); 
			try 
			{
				d.validatePrice(input);
				fail("Something went wrong");
			}
			catch(NewsagentExceptionHandler e)
			{
				assertEquals(e.getMessage(), excepectedOutputs);
			}
		}
		// Test#: 035
		// Test Objective: Test invalid Price < 0
		// Test inputs: -1
		// Test excepected Output: "Price must be a positive number"
		public void testvalidatePrice035()
		{
			String excepectedOutputs = "Price must be a positive number";
			double input = -1;
			DeliveryDocket d  = new  DeliveryDocket(); 
			try 
			{
				d.validatePrice(input);
				fail("Something went wrong");
			}
			catch(NewsagentExceptionHandler e)
			{
				assertEquals(e.getMessage(), excepectedOutputs);
			}
		}
		
		// Test#: 036
		// Test Objective: Test invalid Price > 0
		// Test inputs: .3
		// Test excepected Output: "Price must be a positive number"
		public void testvalidatePrice036()
		{
			double input = .3;
			DeliveryDocket d  = new  DeliveryDocket(); 
			try 
			{
				boolean res = d.validatePrice(input);
				assertEquals(true, res);
				
			}
			catch(NewsagentExceptionHandler e)
			{
				fail("Something went wrong");
			}
		}
		
		// Test#: 037
		// Test Objective: Test invalid Price > 0
		// Test inputs: 3
		// Test excepected Output: "Price must be a positive number"
		public void testvalidatePrice037()
		{
			double input = 3;
			DeliveryDocket d  = new  DeliveryDocket(); 
			try 
			{
				boolean res = d.validatePrice(input);
				assertEquals(true, res);	
			}
			catch(NewsagentExceptionHandler e)
			{
				fail("Something went wrong");
			}
		}
		
		//       ===============================   TESTING validateDate   =============================================
		
		// Test#: 038
		// Test Objective: Test invalid day 
		// Test inputs: {21,11,2023}
		// Test excepected Output: true
		public void testvalidateDate038()
		{
			int[] input = {30,11,2023};
			DeliveryDocket d  = new  DeliveryDocket(); 
			try 
			{
				boolean res = d.validateDate(input);
				assertEquals(true, res);	
			}
			catch(NewsagentExceptionHandler e)
			{
				fail("Something went wrong");
			}
		}
		// Test#: 039
		// Test Objective: Test valid month
		// Test inputs: {21,11,2023}
		// Test excepected Output: true
		public void testvalidateDate039()
		{
			int[] input = {30,11,2023};
			DeliveryDocket d  = new  DeliveryDocket(); 
			try 
			{
				boolean res = d.validateDate(input);
				assertEquals(true, res);	
			}
			catch(NewsagentExceptionHandler e)
			{
				fail("Something went wrong");
			}
		}
		
		// Test#: 040
		// Test Objective: Test valid year
		// Test inputs: {21,11,2023}
		// Test excepected Output: true
		public void testvalidateDate040()
		{
			int[] input = {30,11,2023};
			DeliveryDocket d  = new  DeliveryDocket(); 
			try 
			{
				boolean res = d.validateDate(input);
				assertEquals(true, res);	
			}
			catch(NewsagentExceptionHandler e)
			{
				fail("Something went wrong");
			}
		}
		
		// Test#: 041
		// Test Objective: Test invalid day
		// Test inputs: {21,11,2023}
		// Test excepected Output: "Price must be a positive number"
		public void testvalidateDate041()
		{
			int[] input = {0,11,2023};
			String exOutput =  "Day must be between 1 and 31";
			DeliveryDocket d  = new  DeliveryDocket(); 
			try 
			{
				d.validateDate(input);
				fail("Something went wrong");
				
			}
			catch(NewsagentExceptionHandler e)
			{
				assertEquals(e.getMessage(), exOutput);	
			}
		}
		
		// Test#: 042
		// Test Objective: Test invalid day
		// Test inputs: {21,11,2023}
		// Test excepected Output: "Price must be a positive number"
		public void testvalidateDate042()
		{
			int[] input = {32,1,2023};
			String exOutput =  "Day must be between 1 and 31";
			DeliveryDocket d  = new  DeliveryDocket(); 
			try 
			{
				d.validateDate(input);
				fail("Something went wrong");
				
			}
			catch(NewsagentExceptionHandler e)
			{
				assertEquals(e.getMessage(), exOutput);	
			}
		}
		
		// Test#: 043
		// Test Objective: Test invalid day
		// Test inputs: {21,11,2023}
		// Test excepected Output: "Month must be between 1 and 31"
		public void testvalidateDate043()
		{
			int[] input = {31,0,2023};
			String exOutput =  "Month must be between 1 and 12";
			DeliveryDocket d  = new  DeliveryDocket(); 
			try 
			{
				d.validateDate(input);
				fail("Something went wrong");
				
			}
			catch(NewsagentExceptionHandler e)
			{
				assertEquals(e.getMessage(), exOutput);	
			}
		}
		// Test#: 043
		// Test Objective: Test invalid day
		// Test inputs: {21,11,2023}
		// Test excepected Output: "Month must be between 1 and 31"
		public void testvalidateDate044()
		{
			int[] input = {31,13,2023};
			String exOutput =  "Month must be between 1 and 12";
			DeliveryDocket d  = new  DeliveryDocket(); 
			try 
			{
				d.validateDate(input);
				fail("Something went wrong");
				
			}
			catch(NewsagentExceptionHandler e)
			{
				assertEquals(e.getMessage(), exOutput);	
			}
		}
		// Test#: 043
		// Test Objective: Test invalid year
		// Test inputs: {21,11,2023}
		// Test excepected Output: "Month must be between 1 and 31"
		public void testvalidateDate045()
		{
			int[] input = {31,12,0};
			String exOutput = "Year must be a positive number";
			DeliveryDocket d  = new  DeliveryDocket(); 
			try 
			{
				d.validateDate(input);
				fail("Something went wrong");
				
			}
			catch(NewsagentExceptionHandler e)
			{
				assertEquals(e.getMessage(), exOutput);	
			}
		}
		// Test#: 046
		// Test Objective: Test invalid year
		// Test inputs:  {31,12,2024};
		// Test excepected Output: "Please enter the current date: " + currentDate;
		public void testvalidateDate046()
		{
			LocalDate currentDate = LocalDate.now();
			int[] input = {31,12,2024};
			String exOutput = "Please enter the current date: " + currentDate;
			DeliveryDocket d  = new  DeliveryDocket(); 
			try 
			{
				d.validateDate(input);
				fail("Something went wrong");
				
			}
			catch(NewsagentExceptionHandler e)
			{
				assertEquals(e.getMessage(), exOutput);	
			}
		}
		// Test#: 047
		// Test Objective: Test invalid day
		// Test inputs: {3,12,2024};
		// Test excepected Output: "Please enter the current date: " + currentDate;
		public void testvalidateDate047()
		{
			LocalDate currentDate = LocalDate.now();
			int[] input = {3,12,2024};
			String exOutput = "Please enter the current date: " + currentDate;
			DeliveryDocket d  = new  DeliveryDocket(); 
			try 
			{
				d.validateDate(input);
				fail("Something went wrong");
				
			}
			catch(NewsagentExceptionHandler e)
			{
				assertEquals(e.getMessage(), exOutput);	
			}
		}
		// Test#: 048
		// Test Objective: Test invalid Month
		// Test inputs: {3,12,2024};
		// Test excepected Output: "Please enter the current date: " + currentDate;
		public void testvalidateDate048()
		{
			LocalDate currentDate = LocalDate.now();
			int[] input = {21,2,2023};
			String exOutput = "Please enter the current date: " + currentDate;
			DeliveryDocket d  = new  DeliveryDocket(); 
			try 
			{
				d.validateDate(input);
				fail("Something went wrong");
			}
			catch(NewsagentExceptionHandler e)
			{
				assertEquals(e.getMessage(), exOutput);	
			}
		}
		// Test#: 049
		// Test Objective: Test invalid Month
		// Test inputs: {21,2,2023,2};
		// Test excepected Output: "Please enter the current date: " + currentDate;
		public void testvalidateDate049()
		{
			LocalDate currentDate = LocalDate.now();
			int[] input = {21,2,2023,2};
			String exOutput = "Invalid time format. Expected an array of three integers: [day, month, year]";
			DeliveryDocket d  = new  DeliveryDocket(); 
			try 
			{
				d.validateDate(input);
				fail("Something went wrong");
			}
			catch(NewsagentExceptionHandler e)
			{
				assertEquals(e.getMessage(), exOutput);	
			}
		}
		// Test#: 050
		// Test Objective: Test invalid Month
		// Test inputs: {2};
		// Test excepected Output:"Invalid time format. Expected an array of three integers: [day, month, year]";
		public void testvalidateDate050()
		{
			LocalDate currentDate = LocalDate.now();
			int[] input = {2};
			String exOutput = "Invalid time format. Expected an array of three integers: [day, month, year]";
			DeliveryDocket d  = new  DeliveryDocket(); 
			try 
			{
				d.validateDate(input);
				fail("Something went wrong");
			}
			catch(NewsagentExceptionHandler e)
			{
				assertEquals(e.getMessage(), exOutput);	
			}
		}
		
		//       ===============================   TESTING validateTime   =============================================
		// Test#: 051
		// Test Objective: Test invalid Month
		// Test inputs: {-1,2,14};
		// Test excepected Output: "Hour must be between 0 and 23"
		public void testvalidateTime051()
		{			
			int[] input = {-1,2,14};
			String exOutput = "Hour must be between 0 and 23";
			DeliveryDocket d  = new  DeliveryDocket(); 
			try 
			{
				d.validateTime(input);
				fail("Something went wrong");
			}
			catch(NewsagentExceptionHandler e)
			{
				assertEquals(e.getMessage(), exOutput);	
			}
		}
		// Test#: 052
		// Test Objective: Test invalid Month
		// Test inputs: {60,2,14};
		// Test excepected Output: "Please enter the current date: " + currentDate;
		public void testvalidateTime052()
		{			
			int[] input = {60,2,14};
			String exOutput = "Hour must be between 0 and 23";
			DeliveryDocket d  = new  DeliveryDocket(); 
			try 
			{
				d.validateTime(input);
				fail("Something went wrong");
			}
			catch(NewsagentExceptionHandler e)
			{
				assertEquals(e.getMessage(), exOutput);	
			}
		}
		
		// Test#: 053
		// Test Objective: Test invalid Month
		// Test inputs: {0,-1,14};
		// Test excepected Output: "Minute must be between 0 and 59";
		public void testvalidateTime053()
		{			
			int[] input = {0,-1,14};
			String exOutput = "Minute must be between 0 and 59";
			DeliveryDocket d  = new  DeliveryDocket(); 
			try 
			{
				d.validateTime(input);
				fail("Something went wrong");
			}
			catch(NewsagentExceptionHandler e)
			{
				assertEquals(e.getMessage(), exOutput);	
			}
		}
		// Test#: 054
		// Test Objective: Test invalid Month
		// Test inputs: {0,60,14};
		// Test excepected Output: "Minute must be between 0 and 59";
		public void testvalidateTime054()
		{			
			int[] input = {0,60,14};
			String exOutput = "Minute must be between 0 and 59";
			DeliveryDocket d  = new  DeliveryDocket(); 
			try 
			{
				d.validateTime(input);
				fail("Something went wrong");
			}
			catch(NewsagentExceptionHandler e)
			{
				assertEquals(e.getMessage(), exOutput);	
			}
		}
		
		// Test#: 055
		// Test Objective: Test invalid second
		// Test inputs: {0,-1,14};
		// Test excepected Output: "Second must be between 0 and 59";
		public void testvalidateTime055()
		{			
			int[] input = {0,6,-1};
			String exOutput = "Second must be between 0 and 59";
			DeliveryDocket d  = new  DeliveryDocket(); 
			try 
			{
				d.validateTime(input);
				fail("Something went wrong");
			}
			catch(NewsagentExceptionHandler e)
			{
				assertEquals(e.getMessage(), exOutput);	
			}
		}
		// Test#: 056
		// Test Objective: Test invalid second
		// Test inputs: {0,-1,60};
		// Test excepected Output: "Second must be between 0 and 59";
		public void testvalidateTime056()
		{			
			int[] input = {0,6,60};
			String exOutput = "Second must be between 0 and 59";
			DeliveryDocket d  = new  DeliveryDocket(); 
			try 
			{
				d.validateTime(input);
				fail("Something went wrong");
			}
			catch(NewsagentExceptionHandler e)
			{
				assertEquals(e.getMessage(), exOutput);	
			}
		}
		// Test#: 057
		// Test Objective: Test valid second
		// Test inputs: {0,-1,60};
		// Test excepected Output: true
		public void testvalidateTime057()
		{			
			int[] input = {0,6,6};
			DeliveryDocket d  = new  DeliveryDocket(); 
			try 
			{
				boolean res = d.validateTime(input);
				assertEquals(true, res);
			}
			catch(NewsagentExceptionHandler e)
			{
				fail("Something went wrong");
				
			}
		}
		
		// Test#: 058
		// Test Objective: Test valid second
		// Test inputs: {0,2,60};
		// Test excepected Output: true
		public void testvalidateTime058()
		{			
			int[] input = {0,6,6};
			DeliveryDocket d  = new  DeliveryDocket(); 
			try 
			{
				boolean res = d.validateTime(input);
				assertEquals(true, res);
			}
			catch(NewsagentExceptionHandler e)
			{
				fail("Something went wrong");
				
			}
		}
		//       ===============================   TESTING validateStateNumber   =============================================
		// Test#: 059
		// Test Objective: Test valid StateNumber
		// Test inputs: 1
		// Test excepected Output: true
		public void testvalidateStateNumber059()
		{			
			int input = 1;
			DeliveryDocket d  = new  DeliveryDocket(); 
			try 
			{
				boolean res = d.validateStateNumber(input);
				assertEquals(true, res);
			}
			catch(NewsagentExceptionHandler e)
			{
				fail("Something went wrong");
				
			}
		}
		// Test#: 060
		// Test Objective: Test valid StateNumber
		// Test inputs: 50
		// Test excepected Output: true
		public void testvalidateStateNumber060()
		{			
			int input = 50;
			DeliveryDocket d  = new  DeliveryDocket(); 
			try 
			{
				boolean res = d.validateStateNumber(input);
				assertEquals(true, res);
			}
			catch(NewsagentExceptionHandler e)
			{
				fail("Something went wrong");
				
			}
		}
		// Test#: 061
		// Test Objective: Test invalid StateNumber
		// Test inputs: 0
		// Test excepected Output: true
		public void testvalidateStateNumber061()
		{			
			int input = 0;
			DeliveryDocket d  = new  DeliveryDocket();
			String exOutput = "State number must be greater than 0";
			try 
			{
				boolean res = d.validateStateNumber(input);
				fail("Something went wrong");
			}
			catch(NewsagentExceptionHandler e)
			{
				assertEquals(e.getMessage(), exOutput);
				
				
			}
		}
		// Test#: 062
		// Test Objective: Test invalid StateNumber
		// Test inputs: 0
		// Test excepected Output: "State number must be greater than 0"
		public void testvalidateStateNumber062()
		{			
			int input = 0;
			DeliveryDocket d  = new  DeliveryDocket();
			String exOutput = "State number must be greater than 0";
			try 
			{
				boolean res = d.validateStateNumber(input);
				fail("Something went wrong");
			}
			catch(NewsagentExceptionHandler e)
			{
				assertEquals(e.getMessage(), exOutput);
				
				
			}
		}
		
		// Test#: 063
		// Test Objective: Test invalid StateNumber
		// Test inputs: 51
		// Test excepected Output: true
		public void testvalidateStateNumber063()
		{			
			int input = 51;
			DeliveryDocket d  = new  DeliveryDocket();
			String exOutput = "State number must be less than " + d.getMAX_STATE_NUMBER();
			try 
			{
				boolean res = d.validateStateNumber(input);
				fail("Something went wrong");
			}
			catch(NewsagentExceptionHandler e)
			{
				assertEquals(e.getMessage(), exOutput);
			}
		}
		//       ===============================   TESTING validateCustomerHomeAddress   =============================================

		// Test#: 064
		// Test Objective: Test valid country
		// Test inputs: "ballinasloe", "galway","Ireland"
		// Test excepected Output: true
		public void testvalidateCustomerHomeAddress064()
		{
			String[] input = {"ballinasloe", "galway","Ireland"};
			DeliveryDocket d  = new  DeliveryDocket();
			try 
			{
				boolean res = d.validateCustomerHomeAddress(input[0],input[1],input[2]);
				assertEquals(true, res);
			}
			catch(NewsagentExceptionHandler e)
			{
				fail("Something went wrong");
				
			}
		}
			
			// Test#: 065
			// Test Objective: Test valid country
			// Test inputs: "Ballina", "Mayo","Ireland" 
			// Test excepected Output: true
			public void testvalidateCustomerHomeAddress065()
			{			
				String[] input = {"Ballina", "Mayo","Ireland" };
				DeliveryDocket d  = new  DeliveryDocket();
				try 
				{
					boolean res = d.validateCustomerHomeAddress(input[0],input[1],input[2]);
					assertEquals(true, res);
				}
				catch(NewsagentExceptionHandler e)
				{
					fail("Something went wrong");
					
				}
			}
		
				// Test#: 066
				// Test Objective: Test invalid Address
				// Test inputs: (" ", "Mayo","Ireland")
				// Test excepected Output: "Ballina", "Mayo","Ireland" 
				public void testvalidateCustomerHomeAddress066()
				{			
					String[] input = {" ", "Mayo","Ireland" };
					DeliveryDocket d  = new  DeliveryDocket();
					String exOutput = "Invalid Address. It should not contain spaces.";

					try 
					{
						d.validateCustomerHomeAddress(input[0],input[1],input[2]);
						fail("Something went wrong");
					}
					catch(NewsagentExceptionHandler e)
					{
						assertEquals(e.getMessage(), exOutput);
						
						
					}
				}
				
				// Test#: 067
				// Test Objective: Test invalid City
				// Test inputs: "Ballina", " ","Ireland"
				// Test excepected Output: 
				public void testvalidateCustomerHomeAddress067()
				{			
					String[] input = {"Ballina", " ","Ireland"  };
					DeliveryDocket d  = new  DeliveryDocket();
					String exOutput = "Invalid City. It should not contain spaces.";

					try 
					{
						d.validateCustomerHomeAddress(input[0],input[1],input[2]);
						fail("Something went wrong");
					}
					catch(NewsagentExceptionHandler e)
					{
						assertEquals(e.getMessage(), exOutput);
						
						
					}
				}

				// Test#: 068
				// Test Objective: Test invalid Country
				// Test inputs:  ("Ballymahon", "Mayo"," ")
				// Test excepected Output: "Invalid Country. It should not contain spaces."
				public void testvalidateCustomerHomeAddress068()
				{			
					String[] input = {"Ballymahon", "Mayo"," "};
					DeliveryDocket d  = new  DeliveryDocket();
					String exOutput = "Invalid Country. It should not contain spaces.";

					try 
					{
						d.validateCustomerHomeAddress(input[0],input[1],input[2]);
						fail("Something went wrong");
					}
					catch(NewsagentExceptionHandler e)
					{
						assertEquals(e.getMessage(), exOutput);
					}
				}
				
				// Test#: 069
				// Test Objective: Test invalid Address
				// Test inputs: "Ballymahon", "Mayo"," "
				// Test excepected Output: "Invalid Address. It should not be empty."
				public void testvalidateCustomerHomeAddress069()
				{			
					String[] input = {"", "Mayo","Ireland"};
					DeliveryDocket d  = new  DeliveryDocket();
					String exOutput = "Invalid Address. It should not be empty.";

					try 
					{
						d.validateCustomerHomeAddress(input[0],input[1],input[2]);
						fail("Something went wrong");
					}
					catch(NewsagentExceptionHandler e)
					{
						assertEquals(e.getMessage(), exOutput);
					}
				}
				
				// Test#: 070
				// Test Objective: Test invalid City
				// Test inputs: "swasd","","asdasda"}
				// Test excepected Output: "Invalid City. It should not be empty."
				public void testvalidateCustomerHomeAddress070()
				{			
					String[] input = {"swasd","","asdasda"};
					DeliveryDocket d  = new  DeliveryDocket();
					String exOutput = "Invalid City. It should not be empty.";

					try 
					{
						d.validateCustomerHomeAddress(input[0],input[1],input[2]);
						fail("Something went wrong");
					}
					catch(NewsagentExceptionHandler e)
					{
						assertEquals(e.getMessage(), exOutput);
					}
				}
				
				// Test#: 071
				// Test Objective: Test invalid StateNumber
				// Test inputs: {" ","55","px","6" };
				// Test excepected Output: "Invalid Country. It should not be empty."
				public void testvalidateCustomerHomeAddress071()
				{			
					String[] input = {"Tahas", "Mayos",""};
					String exOutput = "Invalid Country. It should not be empty.";
					
					try 
					{
						DeliveryDocket d  = new  DeliveryDocket();
						d.validateCustomerHomeAddress(input[0],input[1],input[2]);
						fail();
					}
					catch(NewsagentExceptionHandler e)
					{
						assertEquals(e.getMessage(), exOutput);

					}
				}
				
				// Test#: 072
				// Test Objective: Test invalid Address
				// Test inputs: {"#####", "Mayos","Sirilanka"};
				// Test excepected Output: Invalid Address. It should contain only letters (a-z or A-Z).
				public void testvalidateCustomerHomeAddress072()
				{			
					String[] input = {"#####", "Mayos","Sirilanka"};
					String exOutput = "Invalid Address. It should contain only letters (a-z or A-Z).";
					
					try 
					{
						DeliveryDocket d  = new  DeliveryDocket();
						d.validateCustomerHomeAddress(input[0],input[1],input[2]);
						fail();
					}
					catch(NewsagentExceptionHandler e)
					{
						assertEquals(e.getMessage(), exOutput);

					}
				}
				
				// Test#: 073
				// Test Objective: Test invalid City
				// Test inputs: {"Tuam", "#####","Sirilanka"};
				// Test excepected Output: Invalid Address. It should contain only letters (a-z or A-Z).
				public void testvalidateCustomerHomeAddress073()
				{			
					String[] input = {"Tuam", "#####","Sirilanka"};
					String exOutput = "Invalid City. It should contain only letters (a-z or A-Z).";
					
					try 
					{
						DeliveryDocket d  = new  DeliveryDocket();
						d.validateCustomerHomeAddress(input[0],input[1],input[2]);
						fail();
					}
					catch(NewsagentExceptionHandler e)
					{
						assertEquals(e.getMessage(), exOutput);

					}
				}
				
				// Test#: 074
				// Test Objective: Test invalid Country
				// Test inputs: {"Tuam", "Sirilanka","#####"};
				// Test excepected Output: Invalid Address. It should contain only letters (a-z or A-Z).
				public void testvalidateCustomerHomeAddress074()
				{			
					String[] input = {"Tuam", "Sirilanka","#####"};
					String exOutput = "Invalid Country. It should contain only letters (a-z or A-Z).";
					
					try 
					{
						DeliveryDocket d  = new  DeliveryDocket();
						d.validateCustomerHomeAddress(input[0],input[1],input[2]);
						fail();
					}
					catch(NewsagentExceptionHandler e)
					{
						assertEquals(e.getMessage(), exOutput);

					}
				}
				
				// Test#: 075
				// Test Objective: Test invalid Address
				// Test inputs: {"sadygasygasgidgaisgdidsadasbdfhksbdkbskdjb", "Sirilanka","Germany"};
				// Test excepected Output: Invalid Address. It should contain only letters (a-z or A-Z).
				public void testvalidateCustomerHomeAddress075()
				{			
					String[] input = {"sadygasygasgidgaisgdidsadasbdfhksbdkbskdjb", "Sirilanka","Germany"};
					String exOutput = "Invalid Address. It should have a length less than or equal to 40.";
					
					try 
					{
						DeliveryDocket d  = new  DeliveryDocket();
						d.validateCustomerHomeAddress(input[0],input[1],input[2]);
						fail();
					}
					catch(NewsagentExceptionHandler e)
					{
						assertEquals(e.getMessage(), exOutput);

					}
				}
				
				// Test#: 076
				// Test Objective: Test invalid city
				// Test inputs: {"Tuam", "#####","Sirilanka"};
				// Test excepected Output: Invalid Address. It should contain only letters (a-z or A-Z).
				public void testvalidateCustomerHomeAddress076()
				{			
					String[] input = {"Pickatshu", "sadygasygasgidgaisgdidsadasbdfhksbdkbskdjb","Germany"};
					String exOutput = "Invalid City. It should have a length less than or equal to 40.";
					
					try 
					{
						DeliveryDocket d  = new  DeliveryDocket();
						d.validateCustomerHomeAddress(input[0],input[1],input[2]);
						fail();
					}
					catch(NewsagentExceptionHandler e)
					{
						assertEquals(e.getMessage(), exOutput);

					}
				}
				
				// Test#: 077
				// Test Objective: Test invalid country
				// Test inputs: {"Pickatshu", "Tango","sadygasygasgidgaisgdidsadasbdfhksbdkbskdjb"};
				// Test excepected Output: Invalid Address. It should contain only letters (a-z or A-Z).
				public void testvalidateCustomerHomeAddress077()
				{			
					String[] input = {"Pickatshu", "Tango","sadygasygasgidgaisgdidsadasbdfhksbdkbskdjb"};
					String exOutput = "Invalid Country. It should have a length less than or equal to 40.";
					
					try 
					{
						DeliveryDocket d  = new  DeliveryDocket();
						d.validateCustomerHomeAddress(input[0],input[1],input[2]);
						fail();
					}
					catch(NewsagentExceptionHandler e)
					{
						assertEquals(e.getMessage(), exOutput);

					}
				}
				// Test#: 078
				// Test Objective: Test invalid address
				// Test inputs: {"Pickatshu", "Tango","sadygasygasgidgaisgdidsadasbdfhksbdkbskdjb"};
				// Test excepected Output: Invalid Address. It should contain only letters (a-z or A-Z).
				public void testvalidateCustomerHomeAddress078()
				{			
					String[] input = {"HI", "Tango","sadygasyga"};
					String exOutput = "Invalid Address. It should not be less than 4 letters.";
					
					try 
					{
						DeliveryDocket d  = new  DeliveryDocket();
						d.validateCustomerHomeAddress(input[0],input[1],input[2]);
						fail();
					}
					catch(NewsagentExceptionHandler e)
					{
						assertEquals(e.getMessage(), exOutput);

					}
				}
				// Test#: 078
				// Test Objective: Test invalid address
				// Test inputs: {"Pickatshu", "Tango","sadygasygasgidgaisgdidsadasbdfhksbdkbskdjb"};
				// Test excepected Output: Invalid Address. It should contain only letters (a-z or A-Z).
				public void testvalidateCustomerHomeAddress079()
				{			
					String[] input = {"Tango", "HI","sadygasyga"};
					String exOutput = "Invalid City. It should not be less than 4 letters.";
					
					try 
					{
						DeliveryDocket d  = new  DeliveryDocket();
						d.validateCustomerHomeAddress(input[0],input[1],input[2]);
						fail();
					}
					catch(NewsagentExceptionHandler e)
					{
						assertEquals(e.getMessage(), exOutput);

					}
				}
				// Test#: 080
				// Test Objective: Test invalid address
				// Test inputs: {"Pickatshu", "Tango","sadygasygasgidgaisgdidsadasbdfhksbdkbskdjb"};
				// Test excepected Output: Invalid Address. It should contain only letters (a-z or A-Z).
				public void testvalidateCustomerHomeAddress080()
				{			
					String[] input = {"Tango", "HIeed","ew"};
					String exOutput = "Invalid Country. It should not be less than 4 letters.";
					
					try 
					{
						DeliveryDocket d  = new  DeliveryDocket();
						d.validateCustomerHomeAddress(input[0],input[1],input[2]);
						fail();
					}
					catch(NewsagentExceptionHandler e)
					{
						assertEquals(e.getMessage(), exOutput);

					}
				}
//       ===============================   TESTING validateCustomerBalance   =============================================
				
				// Test#: 080
				// Test Objective: Test invalid balance
				// Test inputs: 0
				// Test excepected Output: Balance cannot be 0
				public void testvalidaterCustomerBalance081()
				{			
					int input = 0;
					String exOutput = "Balance cannot be 0";
					
					try 
					{
						DeliveryDocket d  = new  DeliveryDocket();
						d.validateCustomerBalance(input);
						fail();
					}
					catch(NewsagentExceptionHandler e)
					{
						assertEquals(e.getMessage(), exOutput);

					}
				}
				// Test#: 082
				// Test Objective: Test invalid balance
				// Test inputs: -1
				// Test excepected Output: Balance cannot be negative number.
				public void testvalidaterCustomerBalance082()
				{			
					int input = -1;
					String exOutput = "Balance cannot be negative number.";
					
					try 
					{
						DeliveryDocket d  = new  DeliveryDocket();
						d.validateCustomerBalance(input);
						fail();
					}
					catch(NewsagentExceptionHandler e)
					{
						assertEquals(e.getMessage(), exOutput);

					}
				}
				// Test#: 083
				// Test Objective: Test invalid balance
				// Test inputs: 301
				// Test excepected Output: Balance cannot be negative number.
				public void testvalidaterCustomerBalance083()
				{			
					DeliveryDocket d  = new  DeliveryDocket();
					int input = 301;
					double maxBalance = d.getMAX_BALANCE();
					String exOutput = "Balance cannot greater than "+maxBalance;
					
					try 
					{
						
						d.validateCustomerBalance(input);
						fail();
					}
					catch(NewsagentExceptionHandler e)
					{
						assertEquals(e.getMessage(), exOutput);

					}
				}
				// Test#: 084
				// Test Objective: Test invalid balance
				// Test inputs: 300
				// Test excepected Output: Balance cannot be negative number.
				public void testvalidaterCustomerBalance084()
				{			
					DeliveryDocket d  = new  DeliveryDocket();
					int input = 300;
					double maxBalance = d.getMAX_BALANCE();					
					try 
					{
						
						boolean res = d.validateCustomerBalance(input);
						assertEquals(res, d.validateCustomerBalance(maxBalance));
					}
					catch(NewsagentExceptionHandler e)
					{
						fail("Something went wrong");
						

					}
				}
// ------------------------------------- TESTING validateCustomerPublicationName  -------------------------------

				

				// Test#: 015
				// Test Objective: Test invalid name
				// Test inputs: ""
				// Test excepected "Customer Name cannot be null"
				public void testvalidateCustomerPublicationName085() 
				{
					String excepectedOutputs = "Customer Name cannot be null";
					String input = "";
					DeliveryDocket d  = new  DeliveryDocket(); 
					try 
					{
						d.validateCustomerPublicationName(input);
						fail("Something went wrong");
					}
					catch(NewsagentExceptionHandler e)
					{
						assertEquals(e.getMessage(), excepectedOutputs);
					}
				}
				
				// Test#: 016
				// Test Objective: Test invalid name
				// Test inputs: "  "
				// Test excepected "Customer Name cannot be empty"
				public void testvalidateCustomerPublicationName086() 
				{
					String excepectedOutputs = "Customer Name cannot be empty";
					String input = "  ";
					DeliveryDocket d  = new  DeliveryDocket(); 
					try 
					{
						d.validateCustomerPublicationName(input);
						fail("Something went wrong");
					}
					catch(NewsagentExceptionHandler e)
					{
						assertEquals(e.getMessage(), excepectedOutputs);
					}
				}
				
				// Test#: 017
				// Test Objective: Test invalid name
				// Test inputs: " "
				// Test excepected "Customer Name cannot be empty"
				public void testvalidateCustomerPublicationName087()
				{
					String excepectedOutputs = "Customer Name cannot be empty";
					String input = " ";
					DeliveryDocket d  = new  DeliveryDocket(); 
					try 
					{
						d.validateCustomerPublicationName(input);
						fail("Something went wrong");
					}
					catch(NewsagentExceptionHandler e)
					{
						assertEquals(e.getMessage(), excepectedOutputs);
					}
				}
				// Test#: 018
				// Test Objective: Test invalid name
				// Test inputs: "sajdhsajdhjsadjsajdbjksabdkjbsadbkjsabdkjbsakjd"
				// Test excepected "Enter a valid name with fewer than " + 15 + " characters"
				public void testvalidateCustomerPublicationName088() 
				{
					String excepectedOutputs = "Enter a valid name with fewer than " + 15 + " characters";
					String input = "sajdhsajdhjsadjsajdbjksabdkjbsadbkjsabdkjbsakjd";
					DeliveryDocket d  = new  DeliveryDocket(); 
					try 
					{
						d.validateCustomerPublicationName(input);
						fail("Something went wrong");
					}
					catch(NewsagentExceptionHandler e)
					{
						assertEquals(e.getMessage(), excepectedOutputs);
					}
				}
				
				// Test#: 019
				// Test Objective: Test invalid name
				// Test inputs: "s1234"
				// Test excepected output: "Enter a valid name with only letters from 'a' to 'z'"
				public void testvalidateCustomerPublicationName089() 
				{
					String excepectedOutputs = "Enter a valid name with only letters from 'a' to 'z'";
					String input = "s1234";
					DeliveryDocket d  = new  DeliveryDocket(); 
					try 
					{
						d.validateCustomerPublicationName(input);
						fail("Something went wrong");
					}
					catch(NewsagentExceptionHandler e)
					{
						assertEquals(e.getMessage(), excepectedOutputs);
					}
				}
				
				// Test#: 020
				// Test Objective: Test invalid name
				// Test inputs: "s1234"
				// Test excepected output: "Enter a valid name with only letters from 'a' to 'z'"
				public void testvalidateCustomerPublicationName090() 
				{
					String excepectedOutputs = "Enter a valid name with only letters from 'a' to 'z'";
					String input = "1234";
					DeliveryDocket d  = new  DeliveryDocket(); 
					try 
					{
						d.validateCustomerPublicationName(input);
						fail("Something went wrong");
					}
					catch(NewsagentExceptionHandler e)
					{
						assertEquals(e.getMessage(), excepectedOutputs);
					}
				}
				
				// Test#: 021
				// Test Objective: Test invalid name
				// Test inputs: "#####"
				// Test excepected output: "Enter a valid name with only letters from 'a' to 'z'"
				public void testvalidateCustomerPublicationName091() 
				{
					String excepectedOutputs = "Enter a valid name with only letters from 'a' to 'z'";
					String input = "#####";
					DeliveryDocket d  = new  DeliveryDocket(); 
					try 
					{
						d.validateCustomerPublicationName(input);
						fail("Something went wrong");
					}
					catch(NewsagentExceptionHandler e)
					{
						assertEquals(e.getMessage(), excepectedOutputs);
					}
				}
				
				// Test#: 021
				// Test Objective: Test invalid name
				// Test inputs: "ss"
				// Test excepected output: "Enter a valid name with at least 3 letters"
				public void testvalidateCustomerPublicationName92() 
				{
					String excepectedOutputs = "Enter a valid name with at least 3 letters";
					String input = "ss";
					DeliveryDocket d  = new  DeliveryDocket(); 
					try 
					{
						d.validateCustomerPublicationName(input);
						fail("Something went wrong");
					}
					catch(NewsagentExceptionHandler e)
					{
						assertEquals(e.getMessage(), excepectedOutputs);
					}
				}
				// Test#: 023
				// Test Objective: Test invalid name
				// Test inputs: "s"
				// Test excepected output: "Enter a valid name with at least 3 letters"
				public void testvalidateCustomerPublicationName093() 
				{
					String excepectedOutputs = "Enter a valid name with at least 3 letters";
					String input = "s";
					DeliveryDocket d  = new  DeliveryDocket(); 
					try 
					{
						d.validateCustomerPublicationName(input);
						fail("Something went wrong");
					}
					catch(NewsagentExceptionHandler e)
					{
						assertEquals(e.getMessage(), excepectedOutputs);
					}
				}
				
				// Test#: 024
				// Test Objective: Test invalid name
				// Test inputs: "Taha"
				// Test excepected output: "Enter a valid name with at least 3 letters"
				public void testvalidateCustomerPublicationName094() 
				{
					String input = "Taha";
					DeliveryDocket d  = new  DeliveryDocket(); 
					try 
					{
						boolean res = d.validateCustomerPublicationName(input);
						assertEquals(true, res);
						
					}
					catch(NewsagentExceptionHandler e)
					{
						fail("Something went wrong");
					}
				}
}
