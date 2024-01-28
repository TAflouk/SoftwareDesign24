

import junit.framework.TestCase;

public class NewsagentTest extends TestCase {
	
	//Test Number : 
	//Test Objective : 
	//Test Type (UAT or JUnit) :
	//Input(s) :
	//Expected Output(s) : 
	//Test Procedure (for UAT) :


	public void testNewsagent() {
		fail("No code written");
	}
	
	//Test Number : 1
	//Test Objective : Test valid newsagent name > 0 and < 25
	//Test Type (UAT or JUnit) : JUnit
	//Input(s) : newsagentName = "John Murphy"
	//Expected Output(s) : true
	public void testValidateName001() {
		fail("No code written");	
		}
	
	//Test Number : 2
	//Test Objective : Test newsagent name in range <= 0 and > minInt
	//Test Type (UAT or JUnit) : JUnit
	//Input(s) : newsagentName = ""
	//Expected Output(s) : false
	public void testValidateName002() {
		fail("No code written");
	}
	
	//Test Number : 3
	//Test Objective : Test newsagent name in range >= 25 and < maxInt
	//Test Type (UAT or JUnit) : JUnit
	//Input(s) : newsagentName = "Harry Jacksonvilleeeeeeee"
	//Expected Output(s) : false
	public void testValidateName003() {
		fail("No code written");
	}
	
	//Test Number : 4
	//Test Objective : Test IdNumber in range > 0 and < maxInt
	//Test Type (UAT or JUnit) : JUnit
	//Input(s) : IdNumber = 1
	//Expected Output(s) : true
	public void testValidateId001() {
		fail("No code written");
	}
	
	//Test Number : 5
	//Test Objective : Test IdNumber in range <= 0 and > minInt
	//Test Type (UAT or JUnit) : JUnit
	//Input(s) : IdNumber = -1
	//Expected Output(s) : false
	public void testValidateId002() {
		fail("No code written");
	}
	
	//Test Number : 6
	//Test Objective : Test create newsagent with valid arguments
	//Test Type (UAT or JUnit) : JUnit
	//Input(s) : idNumber = 2, newsagentName = "Joe Bloggs"
	//Expected Output(s) : Newsagent object
	public void testCreateNewsagent001() {
		fail("No code written");
	}
	
	//Test Number : 7
	//Test Objective : Test create newsagent with valid newsagentName and invalid idNumber
	//Test Type (UAT or JUnit) : JUnit
	//Input(s) : idNumber = -6, newsagentName = "Sarah Jones"
	//Expected Output(s) : message = "Newsagent could not be created. Please provide a valid name and id number"
	public void testCreateNewsagent002() {
		fail("No code written");
	}
	
	//Test Number : 8
	//Test Objective : Test create newsagent with invalid newsagentName and valid idNumber
	//Test Type (UAT or JUnit) : JUnit
	//Input(s) : idNumber = 1, newsagentName = ""
	//Expected Output(s) : message = "Newsagent could not be created. Please provide a valid name and id number"
	public void testCreateNewsagent003() {
		fail("No code written");
	}
	
	
	//Test Number :  9
	//Test Objective : Test update newsagent
	//Test Type (UAT or JUnit) : JUnit
	//Input(s) : idNumber = 2, newsagentName = "Eoghan Daly"
	//Expected Output(s) : Updated newsagent object
	public void testUpdateNewsagent001() {
		fail("No code written");
	}
	
	//Test Number :  10
	//Test Objective : Test update newsagent with one argument
	//Test Type (UAT or JUnit) : JUnit
	//Input(s) : idNumber = 2
	//Expected Output(s) : "Newsagent could not be updated. Please provide a valid name and id number"
	public void testUpdateNewsagent002() {
		fail("No code written");
	}
	
	//Test Number :  11
	//Test Objective : Test update newsagent with one argument
	//Test Type (UAT or JUnit) : JUnit
	//Input(s) : newsagentName = "Sasha Brown"
	//Expected Output(s) : "Newsagent could not be updated. Please provide a valid name and id number"
	public void testUpdateNewsagent003() {
		fail("No code written");
	}
	
	//Test Number :  12
	//Test Objective : Test update newsagent with one valid argument
	//Test Type (UAT or JUnit) : JUnit
	//Input(s) : newsagentName = "Sasha Brown", idNumber = 0
	//Expected Output(s) : "Newsagent could not be updated. Please provide a valid name and id number"
	public void testUpdateNewsagent004() {
		fail("No code written");
	}
	
	//Test Number :  12
	//Test Objective : Test update newsagent with invalid arguments
	//Test Type (UAT or JUnit) : JUnit
	//Input(s) : newsagentName = "Sasha Brownijjjjjjjjjjjjjjjjjjjjjjjjj", idNumber = 0
	//Expected Output(s) : "Newsagent could not be updated. Please provide a valid name and id number"
	public void testUpdateNewsagent005() {
		fail("No code written");
	}
	
	
	//Test Number : 13
	//Test Objective : Test deleteNewsagent
	//Test Type (UAT or JUnit) : Junit
	//Input(s) : idNumber = 1
	//Expected Output(s) : Newsagent object with id 1 deleted
	public void testDeleteNewsagent001() {
		fail("No code written");
	}
	
	//Test Number : 14
	//Test Objective : Test deleteNewsagent
	//Test Type (UAT or JUnit) : Junit
	//Input(s) : idNumber = 0
	//Expected Output(s) : message = "Please provide a valid id"
	public void testDeleteNewsagent002() {
		fail("No code written");
	}
	
	
	//Test Number : 15
	//Test Objective : Test readNewsagent
	//Test Type (UAT or JUnit) : Junit
	//Input(s) : idNumber = 1
	//Expected Output(s) : newsagent object with id 1 returned
	public void testReadNewsagent001() {
		fail("No code written");
	}
	
	//Test Number : 15
	//Test Objective : Test readNewsagent
	//Test Type (UAT or JUnit) : Junit
	//Input(s) : idNumber = 0
	//Expected Output(s) :message = "Please provide a valid id"
	public void testReadNewsagent002() {
		fail("No code written");
	}
	
	//Test Number : 16
	//Test Objective : Test valid newsagent phoneNumber is an int = 10 digits
	//Test Type (UAT or JUnit) : JUnit
	//Input(s) : phoneNumber = 0831234567
	//Expected Output(s) : true
	public void testValidatePhoneNumber001() {
		fail("No code written");	
		}
	
	//Test Number : 17
	//Test Objective : Test invalid newsagent phoneNumber is an int < 10 digits
	//Test Type (UAT or JUnit) : JUnit
	//Input(s) : phoneNumber = 08312345
	//Expected Output(s) : false
	public void testValidatePhoneNumber002() {
		fail("No code written");	
		}
	
	//Test Number : 18
	//Test Objective : Test invalid newsagent phoneNumber is an int > 10 digits
	//Test Type (UAT or JUnit) : JUnit
	//Input(s) : phoneNumber = 0831234567890
	//Expected Output(s) : false
	public void testValidatePhoneNumber003() {
		fail("No code written");	
		}

}
