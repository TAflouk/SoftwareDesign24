package Newsagent;

import junit.framework.TestCase;

public class InvoiceTest extends TestCase {
    // Test#: 001
    // Test Objective: testing valid id number
    // Test inputs: 1
    // Expected output: true
    public void testvalidateId001() {
        Invoice invoice = new Invoice();

        try {
            int input = 1;
            boolean result = invoice.validateId(input);
            assertEquals(true, result);
        } catch (NewsagentExceptionHandler e) {
            fail("Something went wrong");
        }
    }

    // Test#: 002
    // Test Objective: testing invalid id number
    // Test inputs: 0
    // Expected output: Enter valid id over 0
    public void testvalidateId002() {
        Invoice invoice = new Invoice();
        String expected = "Enter valid id over 0";
        try {
            int input = 0;
            boolean result = invoice.validateId(input);
            assertFalse(result);
        } catch (NewsagentExceptionHandler e) {
            assertEquals(e.getMessage(), expected);
        }
    }

    // Test#: 003
    // Test Objective: testing invalid id number
    // Test inputs: 301
    // Expected output: Please enter a valid number below 300
    public void testvalidateId003() {
        Invoice invoice = new Invoice();
        String expected = "Please enter a valid number below 300";
        try {
            int input = 301;
            boolean result = invoice.validateId(input);
            assertFalse(result);
        } catch (NewsagentExceptionHandler e) {
            assertEquals(e.getMessage(), expected);
        }
    }

    // Test#: 004
    // Test Objective: testing valid id number
    // Test inputs: 150
    // Expected output: true
    public void testvalidateId004() {
        Invoice invoice = new Invoice();

        try {
            int input = 150;
            boolean result = invoice.validateId(input);
            assertEquals(true, result);
        } catch (NewsagentExceptionHandler e) {
            fail("Something went wrong");
        }
    }

    // Test#: 005
    // Test Objective: testing invalid id number
    // Test inputs: -1
    // Expected output: Enter valid id over 0
    public void testvalidateId005() {
        Invoice invoice = new Invoice();
        String expected = "Enter valid id over 0";
        try {
            int input = -1;
            boolean result = invoice.validateId(input);
            assertFalse(result);
        } catch (NewsagentExceptionHandler e) {
            assertEquals(e.getMessage(), expected);
        }
    }

    // Test#: 006
    // Test Objective: testing valid id number
    // Test inputs: 300
    // Expected output: true
    public void testvalidateId006() {
        Invoice invoice = new Invoice();

        try {
            int input = 300;
            boolean result = invoice.validateId(input);
            assertEquals(true, result);
        } catch (NewsagentExceptionHandler e) {
            fail("Something went wrong");
        }
    }

    // Test#: 007
    // Test Objective: testing invalid id number
    // Test inputs: -100
    // Expected output: Enter valid id over 0
    public void testvalidateId007() {
        Invoice invoice = new Invoice();
        String expected = "Enter valid id over 0";
        try {
            int input = -100;
            boolean result = invoice.validateId(input);
            assertFalse(result);
        } catch (NewsagentExceptionHandler e) {
            assertEquals(e.getMessage(), expected);
        }
    }

    // Test#: 008
    // Test Objective: testing valid id number
    // Test inputs: 299
    // Expected output: true
    public void testvalidateId008() {
        Invoice invoice = new Invoice();

        try {
            int input = 299;
            boolean result = invoice.validateId(input);
            assertEquals(true, result);
        } catch (NewsagentExceptionHandler e) {
            fail("Something went wrong");
        }
    }

    // Test#: 009
    // Test Objective: Validate a valid delivery driver name
    // Test inputs: "John Doe"
    // Expected output: true
    public void testvalidateDeliveryDriverName009() {
        Invoice invoice = new Invoice();

        try {
            String input = "John Doe";
            boolean result = invoice.validateDeliveryDriverName(input);
            assertEquals(true, result);
        } catch (NewsagentExceptionHandler e) {
            fail("Something went wrong");
        }
    }

    // Test#: 010
    // Test Objective: Validate a valid customer name
    // Test inputs: "John Doe"
    // Expected output: true
    public void testvalidateCustomerName010() {
        Invoice invoice = new Invoice();

        try {
            String input = "John Doe";
            boolean result = invoice.validateCustomerName(input);
            assertEquals(true, result);
        } catch (NewsagentExceptionHandler e) {
            fail("Something went wrong");
        }
    }

    // Test#: 011
    // Test Objective: Reject an empty name
    // Test inputs: ""
    // Expected output: True
    public void testvalidateRejectEmptyName011() {
        Invoice invoice = new Invoice();

        try {
            String input = "";
            boolean result = invoice.validateDeliveryDriverName(input);
            assertTrue(result);
        } catch (NewsagentExceptionHandler e) {
            // Expected behavior
        }
    }

    // Test#: 012
    // Test Objective: Reject a name with numbers
    // Test inputs: "John123"
    // Expected output: True
    public void testvalidateRejectNameWithNumbers012() {
        Invoice invoice = new Invoice();

        try {
            String input = "John123";
            boolean result = invoice.validateCustomerName(input);
            assertTrue(result);
        } catch (NewsagentExceptionHandler e) {
            // Expected behavior
        }
    }

    // Test#: 013
    // Test Objective: Reject a name with special characters
    // Test inputs: "John*Doe"
    // Expected output: True
    public void testvalidateRejectNameWithSpecialCharacters013() {
        Invoice invoice = new Invoice();

        try {
            String input = "John*Doe";
            boolean result = invoice.validateCustomerName(input);
            assertTrue(result);
        } catch (NewsagentExceptionHandler e) {
            // Expected behavior
        }
    }

    // Test#: 014
    // Test Objective: Reject a name with extra spaces
    // Test inputs: "  john Doe  "
    // Expected output: True
    public void testvalidateRejectNameWithSpaces014() {
        Invoice invoice = new Invoice();

        try {
            String input = "  john Doe  ";
            boolean result = invoice.validateCustomerName(input);
            assertTrue(result);
        } catch (NewsagentExceptionHandler e) {
            // Expected behavior
        }
    }

    // Test#: 015
    // Test Objective: Reject a name with excessive length
    // Test inputs: "john doe john doe john doe"
    // Expected output: True
    public void testvalidateRejectNameWithExcessiveLength015() {
        Invoice invoice = new Invoice();

        try {
            String input = "john doe john doe john doe";
            boolean result = invoice.validateDeliveryDriverName(input);
            assertTrue(result);
        } catch (NewsagentExceptionHandler e) {
            // Expected behavior
        }
    }

    // Test#: 016
    // Test Objective: Reject a name with invalid characters
    // Test inputs: "john!doe"
    // Expected output: True
    public void testvalidateRejectNameWithInvalidCharacters016() {
        Invoice invoice = new Invoice();

        try {
            String input = "john!doe";
            boolean result = invoice.validateCustomerName(input);
            assertTrue(result);
        } catch (NewsagentExceptionHandler e) {
            // Expected behavior
        }
    }
    
    

 // Test#: 017
 // Test Objective: Verify valid home address
 // Test inputs: "123 auburn,Athlone, Ireland"
 // Expected output: true
 public void testvalidateHomeAddress017() {
     Invoice invoice = new Invoice();
     String address = "123 auburn";
     String city = "Athlone";
     String country = "Ireland";
     try {
         boolean result = invoice.validateHomeAddress(address, city, country);
         assertEquals(true, result);
     } catch (NewsagentExceptionHandler e) {
         fail("Something went wrong");
     }
 }

 // Test#: 018
 // Test Objective: Verify valid home address
 // Test inputs: "Town centre, Athlone, Ireland"
 // Expected output: true
 public void testvalidateHomeAddress018() {
     Invoice invoice = new Invoice();
     String address = "Town centre";
     String city = "Athlone";
     String country = "Ireland";
     try {
         boolean result = invoice.validateHomeAddress(address, city, country);
         assertEquals(true, result);
     } catch (NewsagentExceptionHandler e) {
         fail("Something went wrong");
     }
 }

 // Test#: 019
 // Test Objective: Verify valid home address
 // Test inputs: "Garrycastle, Athlone, Ireland"
 // Expected output: true
 public void testvalidateHomeAddress019() {
     Invoice invoice = new Invoice();
     String address = "Garrycastle";
     String city = "athlone";
     String country = "Ireland";
     try {
         boolean result = invoice.validateHomeAddress(address, city, country);
         assertEquals(true, result);
     } catch (NewsagentExceptionHandler e) {
         fail("Something went wrong");
     }
 }

 // Test#: 020
 // Test Objective: Verify invalid home address
 // Test inputs: "", "City", "Country"
 // Expected output: "Home address cannot be empty"
 public void testvalidateHomeAddress020() {
     Invoice invoice = new Invoice();
     String address = "";
     String city = "";
     String country = "Ireland";
     String expectedMessage = "Home address cannot be empty";
     try {
         invoice.validateHomeAddress(address, city, country);
         fail();
     } catch (NewsagentExceptionHandler e) {
         assertEquals(e.getMessage(), expectedMessage);
     }
 }

 // Test#: 021
 // Test Objective: Verify invalid home address
 // Test inputs: "Athlone", "", "Country"
 // Expected output: "City address cannot be empty"
 public void testvalidateHomeAddress021() {
     Invoice invoice = new Invoice();
     String address = "Athlone";
     String city = "";
     String country = "Ireland";
     String expectedMessage = "City address cannot be empty";
     try {
         invoice.validateHomeAddress(address, city, country);
         fail();
     } catch (NewsagentExceptionHandler e) {
         assertEquals(e.getMessage(), expectedMessage);
     }
 }

 // Test#: 022
 // Test Objective: Verify invalid home address
 // Test inputs: "Athlone", "Galway", ""
 // Expected output: "Country address cannot be empty"
 public void testvalidateHomeAddress022() {
     Invoice invoice = new Invoice();
     String address = "Athlone";
     String city = "Galway";
     String country = "";
     String expectedMessage = "Country address cannot be empty";
     try {
         invoice.validateHomeAddress(address, city, country);
         fail();
     } catch (NewsagentExceptionHandler e) {
         assertEquals(e.getMessage(), expectedMessage);
     }
 }



//Test#: 023
//Test Objective: Verify valid home address
//Test inputs: "House 123, 456 Auburn St", "Galway", "Country"
//Expected output: true
public void testvalidateHomeAddress023() {
  Invoice invoice = new Invoice();
  String address = "House 123, 456 Auburn St";
  String city = "Galway";
  String country = "Country";
  try {
      boolean result = invoice.validateHomeAddress(address, city, country);
      assertEquals(true, result);
  } catch (NewsagentExceptionHandler e) {
      fail("Something went wrong");
  }
}

//Test#: 024
//Test Objective: Verify invalid home address
//Test inputs: "dasdasdasdjasgvdgusavdugasguydgaysgdyiagsiydgiasgdyigaisgdiyasgdgyiasgiydgaisygdiyasgdiyasgdygasyidgiyagsiydgay", "galway", "Country"
//Expected output: "Home address is too long"
public void testvalidateHomeAddress024() {
  Invoice invoice = new Invoice();
  String address = "dasdasdasdjasgvdgusavdugasguydgaysgdyiagsiydgiasgdyigaisgdiyasgdgyiasgiydgaisygdiyasgdiyasgdygasyidgiyagsiydgay";
  String city = "galway";
  String country = "Country";
  String expectedMessage = "Home address is too long";
  try {
      invoice.validateHomeAddress(address, city, country);
      fail();
  } catch (NewsagentExceptionHandler e) {
      assertEquals(e.getMessage(), expectedMessage);
  }
}

//Test#: 025
//Test Objective: Verify invalid home address
//Test inputs: "athlone", "dasdasdasdjasgvdgusavdugasguydgaysgdyiagsiydgiasgdyigaisgdiyasgdgyiasgiydgaisygdiyasgdiyasgdygasyidgiyagsiydgay", "Country"
//Expected output: "City address is too long"
public void testvalidateHomeAddress025() {
  Invoice invoice = new Invoice();
  String address = "athlone";
  String city = "dasdasdasdjasgvdgusavdugasguydgaysgdyiagsiydgiasgdyigaisgdiyasgdgyiasgiydgaisygdiyasgdiyasgdygasyidgiyagsiydgay";
  String country = "Country";
  String expectedMessage = "City address is too long";
  try {
      invoice.validateHomeAddress(address, city, country);
      fail();
  } catch (NewsagentExceptionHandler e) {
      assertEquals(e.getMessage(), expectedMessage);
  }
}

//Test#: 026
//Test Objective: Verify invalid home address
//Test inputs: "123 auburn", "Dublin", "dasdasdasdjasgvdgusavdugasguydgaysgdyiagsiydgiasgdyigaisgdiyasgdgyiasgiydgaisygdiyasgdiyasgdygasyidgiyagsiydgay"
//Expected output: "Country address is too long"
public void testvalidateHomeAddress026() {
  Invoice invoice = new Invoice();
  String address = "123 auburn";
  String city = "Dublin";
  String country = "dasdasdasdjasgvdgusavdugasguydgaysgdyiagsiydgiasgdyigaisgdiyasgdgyiasgiydgaisygdiyasgdiyasgdygasyidgiyagsiydgay";
  String expectedMessage = "Country address is too long";
  try {
      invoice.validateHomeAddress(address, city, country);
      fail();
  } catch (NewsagentExceptionHandler e) {
      assertEquals(e.getMessage(), expectedMessage);
  } 
}
//Test#: 027
//Test Objective: Verify visibility of newsagent name on the invoice
//Test inputs:Athlone Newsagent
//Expected output: true
public void testvalidateNewsagentNameVisibility027() {
 Invoice invoice = new Invoice();
 String newsagentName = "Athlone Newsagent";
 invoice.setNewsagentName(newsagentName);

 try {
     boolean result = invoice.isNewsagentNameVisible();
     assertEquals(true, result);
 } catch (NewsagentExceptionHandler e) {
     fail("Something went wrong");
 }
}
//Test#: 028
//Test Objective: Verify visibility of newsagent name on the invoice (empty name)
//Test inputs:""
//Expected output: "Newsagent name cannot be empty"
public void testvalidateNewsagentNameVisibility028() {
 Invoice invoice = new Invoice();
 String newsagentName = "";  
 invoice.setNewsagentName(newsagentName);

 try {
     invoice.isNewsagentNameVisible();
     fail();
 } catch (NewsagentExceptionHandler e) {
     assertEquals("Newsagent name cannot be empty", e.getMessage());
 }
}

 // Test#: 029
 // Test Objective: Validate a valid date
 // Test inputs: {2023, 11, 16}
 // Expected output: true
 public void testvalidateDate029() {
     Invoice invoice = new Invoice();

     try {
         int[] input = {2023, 11, 16};
         boolean result = invoice.validateDate(input);
         assertEquals(true, result);
     } catch (NewsagentExceptionHandler e) {
         fail("Something went wrong");
     }
 }

 // Test#: 030
 // Test Objective: Validate an invalid date (month out of range)
 // Test inputs: {2023, 13, 16}
 // Expected output: "Invalid month"
 public void testvalidateDate030() {
     Invoice invoice = new Invoice();
     String expected = "Invalid month";

     try {
         int[] input = {2023, 13, 16};
         boolean result = invoice.validateDate(input);
         assertFalse(result);
     } catch (NewsagentExceptionHandler e) {
         assertEquals(e.getMessage(), expected);
     }
 }

 // Test#: 031
 // Test Objective: Validate an invalid date (day out of range)
 // Test inputs: {2023, 11, 32}
 // Expected output: "Invalid day"
 public void testvalidateDate031() {
     Invoice invoice = new Invoice();
     String expected = "Invalid day";

     try {
         int[] input = {2023, 11, 32};
         boolean result = invoice.validateDate(input);
         assertFalse(result);
     } catch (NewsagentExceptionHandler e) {
         assertEquals(e.getMessage(), expected);
     }
 }

 // Test#: 032
 // Test Objective: Validate an invalid date (year out of range)
 // Test inputs: {10000, 11, 16}
 // Expected output: "Invalid year"
 public void testvalidateDate032() {
     Invoice invoice = new Invoice();
     String expected = "Invalid year";

     try {
         int[] input = {10000, 11, 16};
         boolean result = invoice.validateDate(input);
         assertFalse(result);
     } catch (NewsagentExceptionHandler e) {
         assertEquals(e.getMessage(), expected);
     }
 }

 // Test#: 033
 // Test Objective: Validate a valid time
 // Test inputs: {12, 30}
 // Expected output: true
 public void testvalidateTime033() {
     Invoice invoice = new Invoice();

     try {
         int[] input = {12, 30};
         boolean result = invoice.validateTime(input);
         assertEquals(true, result);
     } catch (NewsagentExceptionHandler e) {
         fail("Something went wrong");
     }
 }

 // Test#: 034
 // Test Objective: Validate an invalid time (hour out of range)
 // Test inputs: {25, 30}
 // Expected output: "Invalid hour"
 public void testvalidateTime034() {
     Invoice invoice = new Invoice();
     String expected = "Invalid hour";

     try {
         int[] input = {25, 30};
         boolean result = invoice.validateTime(input);
         assertFalse(result);
     } catch (NewsagentExceptionHandler e) {
         assertEquals(e.getMessage(), expected);
     }
 }

 // Test#: 035
 // Test Objective: Validate an invalid time (minute out of range)
 // Test inputs: {12, 60}
 // Expected output: "Invalid minute"
 public void testvalidateTime035() {
     Invoice invoice = new Invoice();
     String expected = "Invalid minute";

     try {
         int[] input = {12, 60};
         boolean result = invoice.validateTime(input);
         assertFalse(result);
     } catch (NewsagentExceptionHandler e) {
         assertEquals(e.getMessage(), expected);
     }
 }

 // Test#: 036
 // Test Objective: Validate an invalid time (negative hour)
 // Test inputs: {-1, 30}
 // Expected output: "Invalid hour"
 public void testvalidateTime036() {
     Invoice invoice = new Invoice();
     String expected = "Invalid hour";

     try {
         int[] input = {-1, 30};
         boolean result = invoice.validateTime(input);
         assertFalse(result);
     } catch (NewsagentExceptionHandler e) {
         assertEquals(e.getMessage(), expected);
     }
 }


  // Test#: 037
  // Test Objective: Validate a valid total amount
  // Test inputs: 100.50
  // Expected output: true
  public void testvalidateTotalAmount037() {
      Invoice invoice = new Invoice();

      try {
          double input = 100.50;
          boolean result = invoice.validateTotalAmount(input);
          assertEquals(true, result);
      } catch (NewsagentExceptionHandler e) {
          fail("Something went wrong");
      }
  }

  // Test#: 038
  // Test Objective: Validate an invalid total amount (negative amount)
  // Test inputs: -50.75
  // Expected output: "Total amount cannot be negative"
  public void testvalidateTotalAmount038() {
      Invoice invoice = new Invoice();
      String expected = "Total amount cannot be negative";

      try {
          double input = -50.75;
          boolean result = invoice.validateTotalAmount(input);
          assertFalse(result);
      } catch (NewsagentExceptionHandler e) {
          assertEquals(e.getMessage(), expected);
      }
  }

  // Test#: 039
  // Test Objective: Validate an invalid total amount (zero amount)
  // Test inputs: 0.0
  // Expected output: "Total amount must be greater than zero"
  public void testvalidateTotalAmount039() {
      Invoice invoice = new Invoice();
      String expected = "Total amount must be greater than zero";

      try {
          double input = 0.0;
          boolean result = invoice.validateTotalAmount(input);
          assertFalse(result);
      } catch (NewsagentExceptionHandler e) {
          assertEquals(e.getMessage(), expected);
      }
  }

  // Test#: 040
  // Test Objective: Validate a valid total amount (large amount)
  // Test inputs: 999999.99
  // Expected output: true
  public void testvalidateTotalAmount040() {
      Invoice invoice = new Invoice();

      try {
          double input = 999999.99;
          boolean result = invoice.validateTotalAmount(input);
          assertEquals(true, result);
      } catch (NewsagentExceptionHandler e) {
          fail("Something went wrong");
      }
  }

  // Test#: 041
  // Test Objective: Validate an invalid total amount (excessive amount)
  // Test inputs: 1000000000.0
  // Expected output: "Total amount is too large"
  public void testvalidateTotalAmount041() {
      Invoice invoice = new Invoice();
      String expected = "Total amount is too large";

      try {
          double input = 1000000000.0;
          boolean result = invoice.validateTotalAmount(input);
          assertFalse(result);
      } catch (NewsagentExceptionHandler e) {
          assertEquals(e.getMessage(), expected);
      }
  }


//Test#: 042
//Test Objective: Verify visibility of newspaper name and number
//Test inputs: "The Daily News", 5
//Expected output: true
public void testvalidateNewspaperVisibility042() {
   Invoice invoice = new Invoice();
   String newspaperName = "The Daily News";
   int newspaperNumber = 5;

   try {
       invoice.setNewspaperDetails(newspaperName, newspaperNumber);
       boolean result = invoice.areNewspaperDetailsVisible();
       assertEquals(true, result);
   } catch (NewsagentExceptionHandler e) {
       fail("Something went wrong");
   }
}

   // Test#: 043
   // Test Objective: Verify visibility of newspaper name and number (empty name)
   // Test inputs: "", 3
   // Expected output: "Newspaper name cannot be empty"
   public void testvalidateNewspaperVisibility043() {
       Invoice invoice = new Invoice();
       String newspaperName = "";
       int newspaperNumber = 3;

       try {
           invoice.setNewspaperDetails(newspaperName, newspaperNumber);
           fail();
       } catch (NewsagentExceptionHandler e) {
           assertEquals("Newspaper name cannot be empty", e.getMessage());
       }
   }

// Test#: 044
// Test Objective: Verify visibility of newspaper name and number (negative number)
// Test inputs: "The Evening Gazette", -2
// Expected output: "Newspaper number must be greater than zero"
public void testvalidateNewspaperVisibility044() {
    Invoice invoice = new Invoice();
    String newspaperName = "The Evening Gazette";
    int newspaperNumber = -2;

    try {
        invoice.setNewspaperDetails(newspaperName, newspaperNumber);
        fail("Expected an exception to be thrown");
    } catch (NewsagentExceptionHandler e) {
        assertEquals("Newspaper number must be greater than zero", e.getMessage());
    }
}


   // Test#: 045
   // Test Objective: Verify visibility of newspaper name and number (zero number)
   // Test inputs: "The Morning Herald", 0
   // Expected output: "Newspaper number must be greater than zero"
   public void testvalidateNewspaperVisibility045() {
       Invoice invoice = new Invoice();
       String newspaperName = "The Morning Herald";
       int newspaperNumber = 0;

       try {
           invoice.setNewspaperDetails(newspaperName, newspaperNumber);
           fail();
       } catch (NewsagentExceptionHandler e) {
           assertEquals("Newspaper number must be greater than zero", e.getMessage());
       }
   }

// Test#: 046
// Test Objective: Verify that successful tick box is visible
// Expected output: true
public void testvalidateSuccessfulTickBoxVisibility046() {
    Invoice invoice = new Invoice();
    
    invoice.setSuccessfulTickBox(true);

    try {
        boolean result = invoice.isSuccessfulTickBoxVisible();
        assertEquals(true, result);
    } catch (NewsagentExceptionHandler e) {
        fail("Something went wrong");
    }
}

// Test#: 047
// Test Objective: Verify that unsuccessful tick box is visible
// Expected output: true
public void testvalidateUnsuccessfulTickBoxVisibility047() {
    Invoice invoice = new Invoice();

    invoice.setUnsuccessfulTickBox(true);

    try {
        boolean result = invoice.isUnsuccessfulTickBoxVisible();
        assertEquals(true, result);
    } catch (NewsagentExceptionHandler e) {
        fail("Something went wrong");
    }
}





}









 

 


