package Newsagent;

import junit.framework.TestCase;

public class DeliveryDriverTest extends TestCase {

    // Test#: 001
    // Test Objective: Verify valid ID number
    // Test Input = 12345
    // Expected output: true
    public void testvalidateValidIdNumber001() throws NewsagentExceptionHandler {
        DeliveryDriver deliveryDriver = new DeliveryDriver();

        try {
            int input = 12345;
            boolean result = deliveryDriver.verifyIdNumber(input);
            assertEquals(true, result);
        } catch (NewsagentExceptionHandler e) {
            fail("Something went wrong");
        }
    }

    // Test#: 002
    // Test Objective: Verify invalid ID number rejected
    // Test Input = -123
    // Expected output: "Invalid ID number"
    public void testvalidateInvalidIdNumber002() throws NewsagentExceptionHandler {
        DeliveryDriver deliveryDriver = new DeliveryDriver();
        String expected = "Invalid ID number";

        try {
            int input = -123;
            deliveryDriver.verifyIdNumber(input);
            fail();
        } catch (NewsagentExceptionHandler e) {
            assertEquals(expected, e.getMessage());
        }
    }

    // Test#: 003
    // Test Objective: Verify valid PIN number
    // Test Input = 1234
    // Expected output: true
    public void testvalidateValidPinNumber003() throws NewsagentExceptionHandler {
        DeliveryDriver deliveryDriver = new DeliveryDriver();

        try {
            int input = 1234;
            boolean result = deliveryDriver.verifyPinNumber(input);
            assertEquals(true, result);
        } catch (NewsagentExceptionHandler e) {
            fail("Something went wrong");
        }
    }

    // Test#: 004
    // Test Objective: Verify invalid PIN number rejected
    // Test Input = 98765
    // Expected output: "Invalid PIN number"
    public void testvalidateInvalidPinNumber004() throws NewsagentExceptionHandler {
        DeliveryDriver deliveryDriver = new DeliveryDriver();
        String expected = "Invalid PIN number";

        try {
            int input = 98765;
            deliveryDriver.verifyPinNumber(input);
            fail();
        } catch (NewsagentExceptionHandler e) {
            assertEquals(expected, e.getMessage());
        }
    }

    // Test#: 005
    // Test Objective: Verify that user gets another attempt
    // Test Input =
    // Expected output: true
    public void testvalidateAnotherAttempt005() throws NewsagentExceptionHandler {
        DeliveryDriver deliveryDriver = new DeliveryDriver();

        try {
            boolean result = deliveryDriver.anotherAttempt();
            assertEquals(true, result);
        } catch (NewsagentExceptionHandler e) {
            fail("Something went wrong");
        }
    }

    // Test#: 006
    // Test Objective: Verify that the user gets access/display
    // Test Input =
    // Expected output: true
    public void testvalidateUserAccess006() throws NewsagentExceptionHandler {
        DeliveryDriver deliveryDriver = new DeliveryDriver();

        try {
            boolean result = deliveryDriver.getUserAccess();
            assertEquals(true, result);
        } catch (NewsagentExceptionHandler e) {
            fail("Something went wrong");
        }
    }

//    // Test#: 007
//    // Test Objective: Verify reset my PIN option is visible
//    // Test Input =
//    // Expected output: true
//    public void testvalidateResetPinOptionVisibility007() throws NewsagentExceptionHandler {
//        DeliveryDriver deliveryDriver = new DeliveryDriver();
//
//        try {
//            boolean result = deliveryDriver.isResetPinOptionVisible();
//            assertEquals(true, result);
//        } catch (NewsagentExceptionHandler e) {
//            fail("Something went wrong");
//        }
//    }

    // Test#: 008
    // Test Objective: Verify valid ID number (second attempt)
    // Test Input = 67890
    // Expected output: true
    public void testvalidateValidIdNumberSecondAttempt008() throws NewsagentExceptionHandler {
        DeliveryDriver deliveryDriver = new DeliveryDriver();

        try {
            int input = 67890;
            boolean result = deliveryDriver.verifyIdNumberSecondAttempt(input);
            assertEquals(true, result);
        } catch (NewsagentExceptionHandler e) {
            fail("Something went wrong");
        }
    }

    // Test#: 009
    // Test Objective: Verify invalid ID number rejected (second attempt)
    // Test Input = -456
    // Expected output: "Invalid ID number"
    public void testvalidateInvalidIdNumberSecondAttempt009() throws NewsagentExceptionHandler {
        DeliveryDriver deliveryDriver = new DeliveryDriver();
        String expected = "Invalid ID number";

        try {
            int input = -456;
            deliveryDriver.verifyIdNumberSecondAttempt(input);
            fail();
        } catch (NewsagentExceptionHandler e) {
            assertEquals(expected, e.getMessage());
        }
    }

    // Test#: 010
    // Test Objective: Verify valid PIN number (second attempt)
    // Test Input = 4321
    // Expected output: true
    public void testvalidateValidPinNumberSecondAttempt010() throws NewsagentExceptionHandler {
        DeliveryDriver deliveryDriver = new DeliveryDriver();

        try {
            int input = 4321;
            boolean result = deliveryDriver.verifyPinNumberSecondAttempt(input);
            assertEquals(true, result);
        } catch (NewsagentExceptionHandler e) {
            fail("Something went wrong");
        }
    }

    // Test#: 011
    // Test Objective: Verify invalid PIN number rejected (second attempt)
    // Test Input = 87654
    // Expected output: "Invalid PIN number"
    public void testvalidateInvalidPinNumberSecondAttempt011() throws NewsagentExceptionHandler {
        DeliveryDriver deliveryDriver = new DeliveryDriver();
        String expected = "Invalid PIN number";

        try {
            int input = 87654;
            deliveryDriver.verifyPinNumberSecondAttempt(input);
            fail();
        } catch (NewsagentExceptionHandler e) {
            assertEquals(expected, e.getMessage());
        }
    }

    // Test#: 012
    // Test Objective: Verify that user gets another attempt (second attempt)
    // Test Input =
    // Expected output: true
    public void testvalidateAnotherAttemptSecondAttempt012() throws NewsagentExceptionHandler {
        DeliveryDriver deliveryDriver = new DeliveryDriver();

        try {
            boolean result = deliveryDriver.anotherAttemptSecondAttempt();
            assertEquals(true, result);
        } catch (NewsagentExceptionHandler e) {
            fail("Something went wrong");
        }
    }

    // Test#: 013
    // Test Objective: Verify that the user gets access/display (second attempt)
    // Test Input =
    // Expected output: true
    public void testvalidateUserAccessSecondAttempt013() throws NewsagentExceptionHandler {
        DeliveryDriver deliveryDriver = new DeliveryDriver();

        try {
            boolean result = deliveryDriver.getUserAccessSecondAttempt();
            assertEquals(true, result);
        } catch (NewsagentExceptionHandler e) {
            fail("Something went wrong");
        }
    }

//    // Test#: 014
//    // Test Objective: Verify reset my PIN option is visible (second attempt)
//    // Test Input =
//    // Expected output: true
//    public void testvalidateResetPinOptionVisibilitySecondAttempt014() throws NewsagentExceptionHandler {
//        DeliveryDriver deliveryDriver = new DeliveryDriver();
//
//        try {
//            boolean result = deliveryDriver.isResetPinOptionVisibleSecondAttempt();
//            assertEquals(true, result);
//        } catch (NewsagentExceptionHandler e) {
//            fail("Something went wrong");
//        }
//    }

    // Test#: 015
    // Test Objective: Verify valid ID number (third attempt)
    // Test Input = 24680
    // Expected output: true
    public void testvalidateValidIdNumberThirdAttempt015() throws NewsagentExceptionHandler {
        DeliveryDriver deliveryDriver = new DeliveryDriver();

        try {
            int input = 24680;
            boolean result = deliveryDriver.verifyIdNumberThirdAttempt(input);
            assertEquals(true, result);
        } catch (NewsagentExceptionHandler e) {
            fail("Something went wrong");
        }
    }

    // Test#: 016
    // Test Objective: Verify invalid ID number rejected (third attempt)
    // Test Input = -1357
    // Expected output: "Invalid ID number"
    public void testvalidateInvalidIdNumberThirdAttempt016() throws NewsagentExceptionHandler {
        DeliveryDriver deliveryDriver = new DeliveryDriver();
        String expected = "Invalid ID number";

        try {
            int input = -1357;
            deliveryDriver.verifyIdNumberThirdAttempt(input);
            fail();
        } catch (NewsagentExceptionHandler e) {
            assertEquals(expected, e.getMessage());
        }
    }

    // Test#: 017
    // Test Objective: Verify valid PIN number (third attempt)
    // Test Input = 8642
    // Expected output: true
    public void testvalidateValidPinNumberThirdAttempt017() throws NewsagentExceptionHandler {
        DeliveryDriver deliveryDriver = new DeliveryDriver();

        try {
            int input = 8642;
            boolean result = deliveryDriver.verifyPinNumberThirdAttempt(input);
            assertEquals(true, result);
        } catch (NewsagentExceptionHandler e) {
            fail("Something went wrong");
        }
    }

    // Test#: 018
    // Test Objective: Verify invalid PIN number rejected (third attempt)
    // Test Input = 97531
    // Expected output: "Invalid PIN number"
    public void testvalidateInvalidPinNumberThirdAttempt018() throws NewsagentExceptionHandler {
        DeliveryDriver deliveryDriver = new DeliveryDriver();
        String expected = "Invalid PIN number";

        try {
            int input = 97531;
            deliveryDriver.verifyPinNumberThirdAttempt(input);
            fail();
        } catch (NewsagentExceptionHandler e) {
            assertEquals(expected, e.getMessage());
        }
    }
 // Test#: 019
 // Test Objective: Verify that user gets another attempt (third attempt)
 // Test Input =
 // Expected output: true
 public void testvalidateAnotherAttemptThirdAttempt019() throws NewsagentExceptionHandler {
     DeliveryDriver deliveryDriver = new DeliveryDriver();

     try {
         boolean result = deliveryDriver.anotherAttemptThirdAttempt();
         assertEquals(true, result);
     } catch (NewsagentExceptionHandler e) {
         fail("Something went wrong");
     }
 }

//        // Test#: 020
//        // Test Objective: Verify reset my PIN option is visible
//        // Expected output: true
//        public void testvalidateResetPinOptionVisible020() throws NewsagentExceptionHandler {
//            DeliveryDriver deliveryDriver = new DeliveryDriver();
//
//            try {
//                boolean result = deliveryDriver.isResetPinOptionVisible();
//                assertEquals(true, result);
//            } catch (NewsagentExceptionHandler e) {
//                fail("Something went wrong");
//            }
//        }

        // Test#: 021
        // Test Objective: Verify reset my PIN option is not visible
        // Expected output: false
        public void testvalidateResetPinOptionNotVisible021() throws NewsagentExceptionHandler {
            DeliveryDriver deliveryDriver = new DeliveryDriver();

            try {
                boolean result = deliveryDriver.isResetPinOptionVisible();
                assertEquals(false, result);
            } catch (NewsagentExceptionHandler e) {
                fail("Something went wrong");
            }
        }

        // Test#: 022
        // Test Objective: Verify reset my PIN option visibility after successful reset
        // Expected output: false
        public void testvalidateResetPinOptionNotVisibleAfterReset022() throws NewsagentExceptionHandler {
            DeliveryDriver deliveryDriver = new DeliveryDriver();

            deliveryDriver.resetPin();

            try {
                boolean result = deliveryDriver.isResetPinOptionVisible();
                assertEquals(false, result);
            } catch (NewsagentExceptionHandler e) {
                fail("Something went wrong");
            }
        }

        // Test#: 023
        // Test Objective: Verify reset my PIN option visibility after unsuccessful reset
        // Expected output: true
        public void testvalidateResetPinOptionVisibleAfterUnsuccessfulReset023() throws NewsagentExceptionHandler {
            DeliveryDriver deliveryDriver = new DeliveryDriver();

            deliveryDriver.unsuccessfulResetPin();

            try {
                boolean result = deliveryDriver.isResetPinOptionVisible();
                assertEquals(true, result);
            } catch (NewsagentExceptionHandler e) {
                fail("Something went wrong");
            }
        }

        // Test#: 024
        // Test Objective: Verify reset my PIN option visibility after multiple unsuccessful attempts
        // Expected output: false
        public void testvalidateResetPinOptionNotVisibleAfterMultipleUnsuccessfulAttempts024() throws NewsagentExceptionHandler {
            DeliveryDriver deliveryDriver = new DeliveryDriver();

            deliveryDriver.multipleUnsuccessfulAttempts();

            try {
                boolean result = deliveryDriver.isResetPinOptionVisible();
                assertEquals(false, result);
            } catch (NewsagentExceptionHandler e) {
                fail("Something went wrong");
            }
        }

        // Test#: 025
        // Test Objective: Verify reset my PIN option visibility after successful reset following multiple unsuccessful attempts
        // Expected output: false
        public void testvalidateResetPinOptionNotVisibleAfterSuccessfulResetFollowingMultipleUnsuccessfulAttempts025() throws NewsagentExceptionHandler {
            DeliveryDriver deliveryDriver = new DeliveryDriver();

            deliveryDriver.multipleUnsuccessfulAttempts();

            deliveryDriver.resetPin();

            try {
                boolean result = deliveryDriver.isResetPinOptionVisible();
                assertEquals(false, result);
            } catch (NewsagentExceptionHandler e) {
                fail("Something went wrong");
            }
        }
        // Test#: 026
        // Test Objective: Verify that Log-in window displayed
        // Expected output: true
        public void testvalidateLoginWindowDisplayed026() throws NewsagentExceptionHandler {
            DeliveryDriver deliveryDriver = new DeliveryDriver();

            try {
                boolean result = deliveryDriver.isLoginWindowDisplayed();
                assertEquals(true, result);
            } catch (NewsagentExceptionHandler e) {
                fail("Something went wrong");
            }
        }
        public void testValidateValidName027() throws NewsagentExceptionHandler {
            DeliveryDriver deliveryDriver = new DeliveryDriver();

            try {
                String input = "John";
                boolean result = deliveryDriver.verifyName(input);
                assertTrue(result);
            } catch (NewsagentExceptionHandler e) {
                fail("Something went wrong");
            }
        }

        // Test#: 028
        // Test Objective: Verify invalid name (contains digits)
        // Test Input = "John123"
        // Expected output: "Invalid name"
        public void testValidateInvalidName028() throws NewsagentExceptionHandler {
            DeliveryDriver deliveryDriver = new DeliveryDriver();
            String expected = "Invalid name";

            try {
                String input = "John123";
                deliveryDriver.verifyName(input);
                fail();
            } catch (NewsagentExceptionHandler e) {
                assertEquals(expected, e.getMessage());
            }
        }
     // Test#: 029
     // Test Objective: Verify valid name (contains space)
     // Test Input = "John Doe"
     // Expected output: true
     public void testValidateValidName029() throws NewsagentExceptionHandler {
         DeliveryDriver deliveryDriver = new DeliveryDriver();

         try {
             String input = "John Doe";
             boolean result = deliveryDriver.verifyName(input);
             assertTrue(result);
         } catch (NewsagentExceptionHandler e) {
             fail("Something went wrong");
         }
     }
        // Test#: 030
        // Test Objective: Verify invalid name (contains special characters)
        // Test Input = "John@Doe"
        // Expected output: "Invalid name"
        public void testValidateInvalidName030() throws NewsagentExceptionHandler {
            DeliveryDriver deliveryDriver = new DeliveryDriver();
            String expected = "Invalid name";

            try {
                String input = "John@Doe";
                deliveryDriver.verifyName(input);
                fail();
            } catch (NewsagentExceptionHandler e) {
                assertEquals(expected, e.getMessage());
            }
        }

     // Test#: 031
     // Test Objective: Verify valid name (empty)
     // Test Input = ""
     // Expected output: true
     public void testValidateValidName031() throws NewsagentExceptionHandler {
         DeliveryDriver deliveryDriver = new DeliveryDriver();

         try {
             String input = "";
             boolean result = deliveryDriver.verifyName(input);
             assertTrue(result);
         } catch (NewsagentExceptionHandler e) {
             fail("Something went wrong");
         }
     }
     

        // Test#: 032
        // Test Objective: Verify invalid name (null)
        // Test Input = null
        // Expected output: "Invalid name"
        public void testValidateInvalidName032() throws NewsagentExceptionHandler {
            DeliveryDriver deliveryDriver = new DeliveryDriver();
            String expected = "Invalid name";

            try {
                String input = null;
                deliveryDriver.verifyName(input);
                fail();
            } catch (NewsagentExceptionHandler e) {
                assertEquals(expected, e.getMessage());
            }
        }
     // Test#: 033
        // Test Objective: Verify valid surname
        // Test Input = "Smith"
        // Expected output: true
        public void testValidateValidSurname033() throws NewsagentExceptionHandler {
            DeliveryDriver deliveryDriver = new DeliveryDriver();

            try {
                String input = "Smith";
                boolean result = deliveryDriver.verifySurname(input);
                assertTrue(result);
            } catch (NewsagentExceptionHandler e) {
                fail("Something went wrong");
            }
        }

        // Test#: 034
        // Test Objective: Verify invalid surname (contains digits)
        // Test Input = "Smith123"
        // Expected output: "Invalid surname"
        public void testValidateInvalidSurname034() throws NewsagentExceptionHandler {
            DeliveryDriver deliveryDriver = new DeliveryDriver();
            String expected = "Invalid surname";

            try {
                String input = "Smith123";
                deliveryDriver.verifySurname(input);
                fail();
            } catch (NewsagentExceptionHandler e) {
                assertEquals(expected, e.getMessage());
            }
        }
     // Test#: 035
     // Test Objective: Verify valid surname (contains space)
     // Test Input = "Johnson Doe"
     // Expected output: true
     public void testValidateValidSurname035() throws NewsagentExceptionHandler {
         DeliveryDriver deliveryDriver = new DeliveryDriver();

         try {
             String input = "Johnson Doe";
             boolean result = deliveryDriver.verifySurname(input);
             assertTrue(result);
         } catch (NewsagentExceptionHandler e) {
             fail("Something went wrong");
         }
     }

        // Test#: 036
        // Test Objective: Verify invalid surname (contains special characters)
        // Test Input = "Brown@Doe"
        // Expected output: "Invalid surname"
        public void testValidateInvalidSurname036() throws NewsagentExceptionHandler {
            DeliveryDriver deliveryDriver = new DeliveryDriver();
            String expected = "Invalid surname";

            try {
                String input = "Brown@Doe";
                deliveryDriver.verifySurname(input);
                fail();
            } catch (NewsagentExceptionHandler e) {
                assertEquals(expected, e.getMessage());
            }
        }

     // Test#: 037
     // Test Objective: Verify valid surname (empty)
     // Test Input = ""
     // Expected output: true
     public void testValidateValidSurname037() throws NewsagentExceptionHandler {
         DeliveryDriver deliveryDriver = new DeliveryDriver();

         try {
             String input = "";
             boolean result = deliveryDriver.verifySurname(input);
             assertTrue(result);
         } catch (NewsagentExceptionHandler e) {
             fail("Something went wrong");
         }
     }

        // Test#: 038
        // Test Objective: Verify invalid surname (null)
        // Test Input = null
        // Expected output: "Invalid surname"
        public void testValidateInvalidSurname038() throws NewsagentExceptionHandler {
            DeliveryDriver deliveryDriver = new DeliveryDriver();
            String expected = "Invalid surname";

            try {
                String input = null;
                deliveryDriver.verifySurname(input);
                fail();
            } catch (NewsagentExceptionHandler e) {
                assertEquals(expected, e.getMessage());
            }
        }
        

     // Test#: 039
     // Test Objective: Verify valid address
     // Test Input = "123 Main St, City, Country"
     // Expected output: true
     public void testValidateValidAddress039() throws NewsagentExceptionHandler {
         DeliveryDriver deliveryDriver = new DeliveryDriver();

         try {
             String input = "123 Main St, City, Country";
             boolean result = deliveryDriver.verifyAddress(input);
             assertTrue(result);
         } catch (NewsagentExceptionHandler e) {
             fail("Something went wrong");
         }
     }

     // Test#: 040
     // Test Objective: Verify invalid address (empty)
     // Test Input = ""
     // Expected output: "Invalid address"
     public void testValidateInvalidAddress040() throws NewsagentExceptionHandler {
         DeliveryDriver deliveryDriver = new DeliveryDriver();
         String expected = "Invalid address";

         try {
             String input = "";
             deliveryDriver.verifyAddress(input);
             fail();
         } catch (NewsagentExceptionHandler e) {
             assertEquals(expected, e.getMessage());
         }
     }

     // Test#: 041
     // Test Objective: Verify invalid address (null)
     // Test Input = null
     // Expected output: "Invalid address"
     public void testValidateInvalidAddress041() throws NewsagentExceptionHandler {
         DeliveryDriver deliveryDriver = new DeliveryDriver();
         String expected = "Invalid address";

         try {
             String input = null;
             deliveryDriver.verifyAddress(input);
             fail();
         } catch (NewsagentExceptionHandler e) {
             assertEquals(expected, e.getMessage());
         }
     }

     // Test#: 042
     // Test Objective: Verify valid address with special characters
     // Test Input = "789 Avenue & Blvd, Town, Country"
     // Expected output: true
     public void testValidateValidAddressWithSpecialChars042() throws NewsagentExceptionHandler {
         DeliveryDriver deliveryDriver = new DeliveryDriver();

         try {
             String input = "789 Avenue & Blvd, Town, Country";
             boolean result = deliveryDriver.verifyAddress(input);
             assertTrue(result);
         } catch (NewsagentExceptionHandler e) {
             fail("Something went wrong");
         }
     }

     // Test#: 043
     // Test Objective: Verify valid address with hyphen
     // Test Input = "101 Maple St-Apt 3, City, Country"
     // Expected output: true
     public void testValidateValidAddressWithHyphen043() throws NewsagentExceptionHandler {
         DeliveryDriver deliveryDriver = new DeliveryDriver();

         try {
             String input = "101 Maple St-Apt 3, City, Country";
             boolean result = deliveryDriver.verifyAddress(input);
             assertTrue(result);
         } catch (NewsagentExceptionHandler e) {
             fail("Something went wrong");
         }
     }

     // Test#: 044
     // Test Objective: Verify invalid address (contains special characters)
     // Test Input = "456 $%& St, Town, Country"
     // Expected output: "Invalid address"
     public void testValidateInvalidAddress044() throws NewsagentExceptionHandler {
         DeliveryDriver deliveryDriver = new DeliveryDriver();
         String expected = "Invalid address";

         try {
             String input = "456 $%& St, Town, Country";
             deliveryDriver.verifyAddress(input);
             fail();
         } catch (NewsagentExceptionHandler e) {
             assertEquals(expected, e.getMessage());
         }
     }
     
     // Test#: 044
     // Test Objective: Verify invalid address (contains special characters)
     // Test Input = "456 $%& St, Town, Country"
     // Expected output: "Invalid address"
     public void testverifyPinNumber045() throws NewsagentExceptionHandler 
     {
         DeliveryDriver deliveryDriver = new DeliveryDriver();
         String expected = "Invalid PIN number";

         try {
             int input = 12;
             deliveryDriver.verifyPinNumber(input);
             fail();
         } catch (NewsagentExceptionHandler e) {
             assertEquals(expected, e.getMessage());
         }
     }
     
     // Test#: 044
     // Test Objective: Verify invalid address (contains special characters)
     // Test Input = "456 $%& St, Town, Country"
     // Expected output: "Invalid address"
     public void testverifyPinNumber046() throws NewsagentExceptionHandler 
     {
         DeliveryDriver deliveryDriver = new DeliveryDriver();
         String expected = "Invalid PIN number";

         try {
             int input = 12222;
             deliveryDriver.verifyPinNumber(input);
             fail();
         } catch (NewsagentExceptionHandler e) {
             assertEquals(expected, e.getMessage());
         }
     }
}