import java.io.Closeable;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.InputMismatchException;
import java.util.Scanner;


public class Menu {
	
	private final static int  NUMBER_OF_STARS = 60;
	private String symbol = "*-";
	private String title;
	LocalDate localDate;
	private CustomerController dbAccess;
	private boolean exit = false;
	private Scanner sc = new Scanner(System.in);
	private Invoice invoice = new Invoice();
	
	
	
	
	public Menu(String title) {
		super();
		this.title = title;

			try {
				dbAccess = new MySQLAccess();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			


	}
	
	void generateDeliveryDocketMenu() throws NewsagentExceptionHandler {
	    
	    boolean exit = false;
	    
	    while (!exit) {
	        System.out.println("\nYou are in Delivery Docket:\n");
	        System.out.println("\t1. Create Delivery Docket");
	        System.out.println("\t2. Update Delivery Docket");
	        System.out.println("\t3. Read Delivery Docket");
	        System.out.println("\t4. Delete Delivery Docket");
	        System.out.println("\t5. Back\n");

	        Scanner scanner = new Scanner(System.in);
	        DeliveryDocketController docketController = null;
	        
	        try {
	            docketController = new MySQLAccess();
	        } catch (SQLException e1) {
	            e1.printStackTrace();
	        }

	        System.out.print("Enter your choice: ");
	        int choice = scanner.nextInt();
	        switch (choice) {
	            case 1:
	                System.out.println("You selected Create Delivery Docket.");
	                boolean createNewDocket = true;
	                while (createNewDocket) {
	                    try {
	                        System.out.print("Do you want to create a new Delivery Docket (Y/N): ");
	                        String userInput = scanner.next().toLowerCase();

	                        if (userInput.equals("y") || userInput.equals("yes")) {
	                            System.out.println("Enter details for the new Delivery Docket:");

	                            System.out.print("Enter Docket ID: ");
	                            int docketID = scanner.nextInt();

	                            // Repeat the above steps for each attribute
	                            System.out.print("Enter Driver ID: ");
	                            int driverID = scanner.nextInt();

	                            System.out.print("Enter Customer Name: ");
	                            String customerName = scanner.next();

	                            System.out.print("Enter Customer ID: ");
	                            int customerID = scanner.nextInt();

	                            System.out.print("Enter Price: ");
	                            int price = scanner.nextInt();

	                            System.out.print("Enter Date (Day): ");
	                            int dateDay = scanner.nextInt();

	                            System.out.print("Enter Date (Month): ");
	                            int dateMonth = scanner.nextInt();

	                            System.out.print("Enter Date (Year): ");
	                            int dateYear = scanner.nextInt();

	                            System.out.print("Enter Time (Hour): ");
	                            int timeHour = scanner.nextInt();

	                            System.out.print("Enter Time (Minute): ");
	                            int timeMinute = scanner.nextInt();

	                            System.out.print("Enter State Number: ");
	                            int stateNumber = scanner.nextInt();

	                            System.out.print("Enter Customer Home Address: ");
	                            String customerHomeAddress = scanner.next();

	                            System.out.print("Enter Customer Balance: ");
	                            int customerBalance = scanner.nextInt();

	                            System.out.print("Enter Status of Success (true/false): ");
	                            boolean statusOfSuccess = scanner.nextBoolean();

	                            System.out.print("Enter Status of Returned (true/false): ");
	                            boolean statusOfReturned = scanner.nextBoolean();

	                            System.out.print("Enter Publication Name: ");
	                            String publicationName = scanner.next();

	                            // Create a new DeliveryDocket object with the collected attributes
	                            DeliveryDocket newDocket = new DeliveryDocket(
	                                    docketID, driverID, customerName, customerID, price,
	                                    new int[]{dateDay, dateMonth, dateYear},
	                                    new int[]{timeHour, timeMinute}, stateNumber,
	                                    customerHomeAddress, customerBalance, statusOfSuccess,
	                                    statusOfReturned, publicationName
	                            );

	                            // Insert the new docket details into the database
	                            docketController.insertDeliveryDocketDetails(newDocket);

	                            System.out.println("Delivery Docket created successfully.");
	                        } else {
	                            createNewDocket = false;
	                        }
	                    } catch (InputMismatchException e) {
	                        System.out.println("Invalid input. Please enter a valid number.");
	                        scanner.nextLine(); // Consume the invalid input
	                    } catch (Exception e) {
	                        e.printStackTrace();
	                    }
	                }
	                break;
	            case 2:
	                System.out.println("You selected Update Delivery Docket.");

	                System.out.print("Enter the ID of the Delivery Docket to update: ");
	                int docketIdToUpdate = scanner.nextInt();

	                DeliveryDocket existingDocket = docketController.findDocketById(docketIdToUpdate);

	                if (existingDocket != null) {
	                    System.out.println("Existing Details:");
	                    System.out.println(existingDocket);

	                    // Gather updated information from the user
	                    System.out.print("Enter new Driver ID: ");
	                    int newDriverId = scanner.nextInt();

	                    System.out.print("Enter new Customer Name: ");
	                    String newCustomerName = scanner.next();

	                    System.out.print("Enter new Customer ID: ");
	                    int newCustomerID = scanner.nextInt();

	                    // Create an updated DeliveryDocket object
	                    System.out.print("Enter new Price: ");
	                    int newPrice = scanner.nextInt();

	                    System.out.print("Enter new Date (Day): ");
	                    int newDateDay = scanner.nextInt();

	                    System.out.print("Enter new Date (Month): ");
	                    int newDateMonth = scanner.nextInt();

	                    System.out.print("Enter new Date (Year): ");
	                    int newDateYear = scanner.nextInt();

	                    System.out.print("Enter new Time (Hour): ");
	                    int newTimeHour = scanner.nextInt();

	                    System.out.print("Enter new Time (Minute): ");
	                    int newTimeMinute = scanner.nextInt();

	                    System.out.print("Enter new State Number: ");
	                    int newStateNumber = scanner.nextInt();

	                    System.out.print("Enter new Customer Home Address: ");
	                    String newCustomerHomeAddress = scanner.next();

	                    System.out.print("Enter new Customer Balance: ");
	                    int newCustomerBalance = scanner.nextInt();

	                    System.out.print("Enter new Status of Success (true/false): ");
	                    boolean newStatusOfSuccess = scanner.nextBoolean();

	                    System.out.print("Enter new Status of Returned (true/false): ");
	                    boolean newStatusOfReturned = scanner.nextBoolean();

	                    System.out.print("Enter new Publication Name: ");
	                    String newPublicationName = scanner.next();

	                    // Create an updated DeliveryDocket object
	                    DeliveryDocket updatedDocket = new DeliveryDocket(
	                            docketIdToUpdate, newDriverId, newCustomerName, newCustomerID, newPrice,
	                            new int[]{newDateDay, newDateMonth, newDateYear},
	                            new int[]{newTimeHour, newTimeMinute}, newStateNumber,
	                            newCustomerHomeAddress, newCustomerBalance, newStatusOfSuccess,
	                            newStatusOfReturned, newPublicationName
	                    );

	                    // Call the method to update Delivery Docket details
	                    boolean updateSuccess = docketController.updateDeliveryDocketDetails(updatedDocket);

	                    if (updateSuccess) {
	                        System.out.println("Delivery Docket updated successfully.");
	                    } else {
	                        System.out.println("Failed to update Delivery Docket.");
	                    }
	                } else {
	                    System.out.println("Delivery Docket with ID " + docketIdToUpdate + " not found.");
	                }
	                break;
	            case 3:
	                System.out.println("You selected Read Delivery Docket.");

	                System.out.print("Enter the ID of the Delivery Docket to read: ");
	                int docketIdToRead = scanner.nextInt();

	                DeliveryDocket readDocket = docketController.findDocketById(docketIdToRead);

	                if (readDocket != null) {
	                    System.out.println("Read Delivery Docket Details:");
	                    System.out.println(readDocket);
	                } else {
	                    System.out.println("Delivery Docket with ID " + docketIdToRead + " not found.");
	                }
	                break;
	            case 4:
	                System.out.println("You selected delete Delivery Docket.");

	                System.out.print("Enter the ID of the Delivery Docket to delete: ");
	                int docketIdToDelete = scanner.nextInt();

	                boolean deleteSuccess = docketController.deleteDeliveryDocket(docketIdToDelete);

	                if (deleteSuccess) {
	                    System.out.println("Delivery Docket deleted successfully.");
	                } else {
	                    System.out.println("Failed to delete Delivery Docket.");
	                }
	                break;
	            case 5:
	                System.out.println("Back.");
	                exit = true;
	                generateNewsagentMenu();
	                break;
	            default:
	                System.out.println("Invalid choice. Please try again.");
	        }
	    }
	}



	// This method is to decorate a title to suit the system 
    // args:(str)
    // returns: void
    public void decorateTitle() 
    {

    	//System.out.println("\n");
    	decorateLines(symbol, NUMBER_OF_STARS);
    	System.out.println("\n");
        System.out.println("\t\t\t\t\t    " + "╔════════════════════════════════════════════════════╗");
        System.out.println("\t\t\t\t\t\t"+"  "+symbol + symbol+ "<" + " " +this.title.toUpperCase() + " " +">"+"-" + symbol + symbol.replace("-", "") );
        System.out.println("\n\t\t\t\t\t\t\t  "+ symbol + symbol+ "<" + " " +localDate.now() + " " +">"+"-" + symbol + symbol.replace("-", "") );
        System.out.println("\t\t\t\t\t" + "    ╚════════════════════════════════════════════════════╝");
        System.out.println("\n");
        decorateLines(symbol, NUMBER_OF_STARS);
       
    }
    // method Obj: to generates lines as a helper method to the decorateTitle
    // args:(str,int)
    // returns: void
    private void decorateLines(String decorate,int count) 
    {
    	  for(int i= 0; i < count ; i++)
    	  {
    		  System.out.print(decorate);
    	  }
    	  System.out.println("\n");
    } 
    
    public boolean generateLoginWindow() 
    {
        String username = null;
        int pin = 0;
        String username2 = null;
        int pin2 = 0;

        
        DeliveryDriver d = null;
		try {
			d = new DeliveryDriver();
		} catch (NewsagentExceptionHandler e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		
		
        Newsagent n = new Newsagent();
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n");
        System.out.println("╔════════════════╗");
        System.out.println("║ Please log in  ║");
        System.out.println("╚════════════════╝");
        System.out.println("\n");
        System.out.println("\t\t\t" + "╔═════════════════════════╗");
        System.out.println("\t\t\t" + "║ 1. Sign-in as Newsagent ║");
        System.out.println("\t\t\t" + "║ 2. Sign-in as Driver    ║");
        System.out.println("\t\t\t" + "║ 3. Sign-in as an Admin  ║");
        System.out.println("\t\t\t" + "╚═════════════════════════╝");
        System.out.println("\n");
        System.out.print("Enter your choice:");

        int choice = scanner.nextInt();
        System.out.println();

        
        try {
        switch (choice) {
        case 1:
            System.out.println("You entered Sign-in as Newsagent");

            int maxLoginAttempts = 3;
            int loginAttempts = 0;
            boolean signInSuccessful = false;

            while (loginAttempts < maxLoginAttempts && !signInSuccessful) {
                
                boolean validUsername2 = false;
                
                
                while (!validUsername2) {
                    try {
                        System.out.print("\tUsername: ");
                        username2 = scanner.next();
                        n.validateName(username2);
                        validUsername2 = true;
                    } 
                  catch (NewsagentExceptionHandler err) 
                  {
                      System.out.println("Invalid PIN: " + err.getMessage());
                      scanner.nextLine();
                  }
                    catch (Exception e) {
                    	//scanner.nextLine();
                        e.printStackTrace();
                    }
                }

                // Prompt for a valid PIN
                boolean validPin2 = false;
                while (!validPin2) 
                {
                    try 
                    {
                        System.out.print("\tEnter your 4 digits PIN: ");
                        pin2 = scanner.nextInt();
                        try {
                            n.validatePinNumber(pin2);
                            validPin2 = true;
                            simulateLoading("Loading", 3, 600);
                        }
                      catch (NewsagentExceptionHandler err) 
                      {
                          System.out.println("Invalid PIN: " + err.getMessage());
                          scanner.nextLine();
                      }
                        catch (Exception eer)
                        {
                            System.out.println("Invalid Pin: " );
                        }
                    }
                    catch (InputMismatchException e) {
                        System.out.println("Invalid PIN: " + e.getMessage());
                        scanner.nextLine(); 
                    }
//                    catch (NewsagentExceptionHandler err) 
//                    {
//                        System.out.println("Invalid PIN: " + err.getMessage());
//                        scanner.nextLine();
//                    }
                }
                signInSuccessful = signInNewsagetn(username2, pin2);

                if (!signInSuccessful) {
                    loginAttempts++;
                    System.out.println("Sign In failed! Attempts left: " + (maxLoginAttempts - loginAttempts));

                    if (loginAttempts == maxLoginAttempts) {
                    	System.out.println("Exceeded maximum sign-in attempts. Exiting the application.");
                        System.out.println("Waiting for 5 minutes before the next attempt...");
                        try {
                            Thread.sleep(300000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    } 
                }
            }
            
        case 2:
            System.out.println("You entered Sign-in as Driver");

            int maxLoginAttempts1 = 3;
            boolean signInSuccessful1 = false;
            int loginAttempts1 = 0; 
            

            while(loginAttempts1 < maxLoginAttempts1 && !signInSuccessful1) {
                // Prompt for a valid username
                boolean validUsername = false;
                while (!validUsername) {
                    System.out.print("\tUsername: ");
                    username = scanner.next();

                    try {
                        d.verifyName(username);
                        validUsername = true;
                    } catch (NewsagentExceptionHandler e) {
                        System.out.println("Invalid username: " + e.getMessage());
                    }
                }
                boolean validPin = false;

                while (!validPin) 
                {
                    try {
                    	System.out.print("\tEnter your 4 digits PIN: ");
                        pin = scanner.nextInt();
                        scanner.nextLine(); // Consume the newline character
                        validPin = d.verifyPinNumber(pin); // Update this line
                        simulateLoading("Loading", 3, 600);
                        if (!validPin) {
                            System.out.println("Sign In failed! Attempts left: " + (maxLoginAttempts1 - loginAttempts1));
                        }
                    } 
                    catch (InputMismatchException e1) 
                    {
                        System.out.println("Invalid PIN: Please enter a valid integer." );
                        scanner.nextLine(); // Consume the invalid input
                    } 
                    catch (NewsagentExceptionHandler e) 
                    {
                        System.out.println("Invalid PIN: " + e.getMessage());
                        scanner.nextLine(); // Consume the invalid input
                    }
                }
                signInSuccessful1 = signInDeliveryDriver(username, pin);
                if (!signInSuccessful1) 
                {
                	loginAttempts1++;
                	System.out.println("Sign In failed! Attempts left: " + (maxLoginAttempts1 - loginAttempts1));

                    if (loginAttempts1 == maxLoginAttempts1) {
                    	System.out.println("Exceeded maximum sign-in attempts. Exiting the application.");
                        System.out.println("Waiting for 5 minutes before the next attempt...");
                        try {
                            // Sleep for 5 minutes (300,000 milliseconds)
                            Thread.sleep(300000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        case 3:
        	Admin a = new Admin();
            System.out.println("You entered Sign-in as Admin");

            int maxLoginAttempts2 = 3;
            boolean signInSuccessful2 = false;
            int loginAttempts2 = 0; 
            

            for (; loginAttempts2 < maxLoginAttempts2 && !signInSuccessful2; loginAttempts2++) {
                // Prompt for a valid username
                boolean validUsername = false;
                while (!validUsername) {
                    System.out.print("\tUsername: ");
                    username = scanner.next();

                    try {
                        a.validateUsername(username);
                        validUsername = true;
                    } catch (NewsagentExceptionHandler e) {
                        System.out.println("Invalid username: " + e.getMessage());
                    }
                }

                // Prompt for a valid PIN
                boolean validPin = false;

                while (!validPin) {
                    try {
                        System.out.print("\tEnter your PIN: ");
                        pin = scanner.nextInt();
                        scanner.nextLine(); // Consume the newline character
                        validPin = a.validatePassword(pin); // Update this line
                        if(validPin) {
                        	simulateLoading("Loading", 3, 600);
                        }
                        if (!validPin) {
                            System.out.println("Sign In failed! Attempts left: " + (maxLoginAttempts2 - loginAttempts2));

       
                        }
                    } catch (InputMismatchException e1) {
                        System.out.println("Invalid PIN: " + e1.getMessage());
                        scanner.nextLine(); // Consume the invalid input
                    } catch (NewsagentExceptionHandler e) {
                        System.out.println("Invalid PIN: " + e.getMessage());
                        scanner.nextLine(); // Consume the invalid input
                    }
                }

                // Attempt to sign in
                signInSuccessful1 = signInAdmin(username, pin);
            
            }
            if (!signInSuccessful2) {
                System.out.println("Exceeded maximum sign-in attempts. Exiting the application.");
                if (loginAttempts2 < maxLoginAttempts2) {
                    System.out.println("Waiting for 5 minutes before the next attempt...");
                    try {
                        // Sleep for 5 minutes (300,000 milliseconds)
                        Thread.sleep(300000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
            
            default:
                System.out.println("Invalid choice. Please try again.\n");
                return generateLoginWindow();
        }
        }
        
        catch (InputMismatchException e1) 
        {
            System.out.println("Invalid PIN: Please enter a valid integer." );
            
            scanner.nextLine(); // Consume the invalid input
        
            return generateLoginWindow();
            } 
    }

    
    // method Obj: 
    // args:()
    // returns: bool
    public boolean signInDeliveryDriver(String username, int enteredPin)
    {
        DeliveryDriverController authentication;
        boolean authenticated = false;
            // Call authenticate method
            try {
                authentication = new MySQLAccess();
                authenticated = authentication.authenticate(username, enteredPin);

                if (authenticated) {
                    System.out.println("\nSign In successful!\n\n");
                    this.generateMenuForDriver();
                } else {
                    System.out.println("Sign In failed!");
                }
                return authenticated;
            }
            catch (NewsagentExceptionHandler e) {
                System.out.println("Error during authentication: " + e.getMessage());
                return false;
            } catch (SQLException e) {
                e.printStackTrace();
            }
        return authenticated;
    }
    
    public boolean signInAdmin(String username, int enteredPin)
    {
        boolean authenticatedAdmin = false;
            // Call authenticate method
            try {
                AdminSQLInterface authenticationAdmin = new MySQLAccess();
                
                authenticatedAdmin = authenticationAdmin.authenticateAdmin(username, enteredPin);
                  if (authenticatedAdmin) {
                    System.out.println("\nAdmin Sign-In successful!\n\n");
                    this.generateAdminMenu();
                  
                }
                else
                {
                    System.out.println("Sign In failed!");
                }
                return false;
            }
            catch (NewsagentExceptionHandler e) {
                System.out.println("Error during authentication: " + e.getMessage());
                return false;
            } catch (SQLException e) {
                e.printStackTrace();
            }
        return authenticatedAdmin ;
    }
    
	private void generateDriverMenuForAdmin() {
		boolean exit = false;
        while (!exit) {
            System.out.println("\nYou are in Delivery Driver menu\n");
            System.out.println("\t1. Create Delivery Driver");
            System.out.println("\t2. Update Delivery Driver");
            System.out.println("\t3. Read Delivery Driver");
            System.out.println("\t4. delete Delivery Driver");
            System.out.println("\t5. Back\n");

            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("You selected Create Delivery Driver.");
                    // Call a method to handle creating delivery area
                    break;
                case 2:
                    System.out.println("You selected Update Delivery Driver.");
                    // Call a method to handle updating delivery area
                    break;
                case 3:
                    System.out.println("You selected Update Delivery Driver.");
                    // Call a method to handle updating delivery area
                    break;
                case 4:
                    System.out.println("You selected delete Delivery Driver.");
                    // Call a method to handle updating delivery area
                    break;
                case 5:
                    exit = true;
                    generateAdminMenu();
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
	}
	private void generateNewsagentMenuForAdmin() {
		boolean exit = false;
        while (!exit) {
            System.out.println("\nYou are in Newsagent menu\n");
            System.out.println("\t1. Create Newsagent");
            System.out.println("\t2. Update Newsagent");
            System.out.println("\t3. Read Newsagent");
            System.out.println("\t4. delete Newsagent");
            System.out.println("\t5. Back\n");

            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("You selected Create Newsagent.");
                    // Call a method to handle creating delivery area
                    break;
                case 2:
                    System.out.println("You selected Update Newsagent.");
                    // Call a method to handle updating delivery area
                    break;
                case 3:
                    System.out.println("You selected Update Newsagent.");
                    // Call a method to handle updating delivery area
                    break;
                case 4:
                    System.out.println("You selected delete Newsagent.");
                    // Call a method to handle updating delivery area
                    break;
                case 5:
                    exit = true;
                    generateAdminMenu();
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
	}
	private void generateAdminMenuForAdmin() {
		boolean exit = false;
		//boolean readResult = false;
        while (!exit) {
            System.out.println("\nYou are in Admin menu\n");
            System.out.println("\t1. Create Admin");
            System.out.println("\t2. Update Admin");
            System.out.println("\t3. Read Admin");
            System.out.println("\t4. delete Admin");
            System.out.println("\t5. Back\n");
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("You selected Create Admin.");
                    Admin admin  = new Admin();
				try {
					admin.createAdmin();
				} catch (NewsagentExceptionHandler e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
                    // Call a method to handle creating delivery area
                    break;
                case 2:
                    System.out.println("You selected Update Admin.");
                    // Call a method to handle updating delivery area
                    break;
                case 3:
                	generateReadAdmin();
                	break;
                case 4:
                    System.out.println("You selected delete Admin.");
                    // Call a method to handle updating delivery area
                    break;
                case 5:
                    exit = true;
                    generateAdminMenu();
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
	}
	private void generateAdminMenu() {
		boolean exit = false;
        while (!exit) {
            System.out.println("\nYou are in Admin menu\n");
            System.out.println("\t1. Admin");
            System.out.println("\t2. Newsagent");
            System.out.println("\t3. Delivery Driver");
            System.out.println("\t4. Log-Out\n");

            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("You selected Admin.");
                    generateAdminMenuForAdmin();
                    // Call a method to handle creating delivery area
                    break;
                case 2:
                    System.out.println("You selected Newsagent.");
                    generateNewsagentMenuForAdmin();
                    // Call a method to handle updating delivery area
                    break;
                case 3:
                    System.out.println("You selected Delivery Driver.");
                    generateDriverMenuForAdmin();
                    // Call a method to handle updating delivery area
                    break;
                case 4:
                    exit = true;
                    simulateLoading("Log out", 3, 600);
                    generateLoginWindow();
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
	}

	private void generateReadAdmin() {
		Admin admin  = new Admin();
		boolean exit = false;
        while (!exit) {
            System.out.println("\nYou are in Admin menu\n");
            System.out.println("\t1. Read Admin by id");
            System.out.println("\t2. Read all Admin");
            System.out.println("\t3. Back\n");

            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("You selected Read Admin by id.");
				try {
					System.out.println("Enter the ID number: ");
					int res = scanner.nextInt();
					admin.readAdmin(res);
				} 
				catch (NewsagentExceptionHandler e) {

					System.out.println(e);
				}
                    //generateAdminMenuForAdmin();
                    // Call a method to handle creating delivery area
                    break;
                case 2:
                    System.out.println("You selected Read all Admin.");
				admin.readAllAdmin();
                    
                    //generateNewsagentMenuForAdmin();
                    // Call a method to handle updating delivery area
                    break;
                case 3:
                    exit = true;
                    generateAdminMenuForAdmin();
                    //generateLoginWindow();
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
	}

               
        
	
    public boolean signInNewsagetn(String username, int enteredPin)
    {
        boolean authenticatedNewsagent = false;
            // Call authenticate method
            try {
                NewsagentSQLInterface authenticationNewsagent = new MySQLAccess();
                
                authenticatedNewsagent = authenticationNewsagent.authenticateNewsagent(username, enteredPin);
                if (authenticatedNewsagent) {
                    System.out.println("\nNewsagentSign In successful!\n\n");
                    this.generateNewsagentMenu();
                    
                }
                else
                {
                    System.out.println("Sign In failed!");
                }
                return false;
            }
            catch (NewsagentExceptionHandler e) {
                System.out.println("Error during authentication: " + e.getMessage());
                return false;
            } catch (SQLException e) {
                e.printStackTrace();
            }
        return authenticatedNewsagent ;
    }
    public void generateMenuForDriver() throws NewsagentExceptionHandler {
        boolean exit = false;
        Scanner scanner = new Scanner(System.in);

        while (!exit) {
            System.out.println("\nNewsagent Menu:");
            System.out.println("\t1. Update Delivery Docket");
            System.out.println("\t2. Print Receipt");
            System.out.println("\t3. Sign Out\n");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            DeliveryDocketController docketController = null;
            try {
				docketController = new MySQLAccess();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}


            switch (choice) {
                case 1:
                    System.out.println("You selected Update Delivery Docket.");
				try {
					docketController = new MySQLAccess();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
                    docketController.printAllDockets();
                    System.out.print("Enter the ID of the Delivery Docket to update: ");
                    int docketIdToUpdate = scanner.nextInt();
                    DeliveryDocket existingDocket = docketController.findDocketById(docketIdToUpdate);

                    if (existingDocket != null) {
                        
                        // Print all dockets
                        docketController.printAllDockets();
                        System.out.println("Existing Details:");
                        System.out.println(existingDocket);
                        System.out.print("Update Status of Success (true/false): ");
                        boolean newStatusOfSuccess = scanner.nextBoolean();

                        System.out.print("Update Status of Returned (true/false): ");
                        boolean newStatusOfReturned = scanner.nextBoolean();
                        existingDocket.setStatusOfSuccess(newStatusOfSuccess);
                        existingDocket.setStatusOfReturned(newStatusOfReturned);
                        boolean updateSuccess = docketController.updateDeliveryDocketDetails(existingDocket);

                        if (updateSuccess) {
                            System.out.println("Delivery Docket updated successfully.");
                        } else {
                            System.out.println("Failed to update Delivery Docket.");
                        }
                    } else {
                        System.out.println("Delivery Docket with ID " + docketIdToUpdate + " not found.");
                    }
                    case 3:
                    	this.simulateLoading("Signing-In", 3, 500);
                        exit = true;
                        generateAdminMenuForAdmin();
                        //generateLoginWindow();
                        break;
                    default:
                        System.out.println("Invalid choice. Please try again.");
            }
        }}
            
//    public void generateMenuForDeliveryDriver() 
//    {
//        boolean exit = false;
//        while (!exit) 
//        {
//            System.out.println("\nNewsagent Menu:");
//            System.out.println("\t1. Update Delivery Docket");
//            System.out.println("\t2. Print Receipt");
//            System.out.println("\t3. Sign Out\n");
//            Scanner scanner = new Scanner(System.in);
//            System.out.print("Enter your choice: ");
//            int choice = scanner.nextInt();
//            switch (choice) 
//            {
//                case 1:
//                    System.out.println("You selected Update Delivery Docket.");
//                    generateDeliveryDriverMenu();
//                    break;
//                case 2:
//                    System.out.println("You selected Print Receipt.");
//				try {
//					//generateCustomerMenu();
//					generateMenuForDriver();
//				} catch (NewsagentExceptionHandler e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//                    break;
//                case 3:
//                	simulateLoading("Signing Out", 3, 600);
//                    //System.out.println("Exiting the application.");
//                	generateLoginWindow();
//                    //exit = true;
//                    
//                    break;
//                default:
//                    System.out.println("Invalid choice. Please try again.");
//            }
//        }
//    }
    // method Obj: 
    // args:(str,int,int)
    // returns: bool
    public void simulateLoading(String word, int dots, int delayMillis) 
    {
        System.out.print(word);

        try {
            for (int i = 0; i < dots; i++) {
                Thread.sleep(delayMillis);
                System.out.print(".");
            }
            System.out.println("");
        } 
        catch(InterruptedException e) 
        {
            Thread.currentThread().interrupt();
        }
    }
    
    public void generateDeliveryDocketMenu2023() // to update ----------------------------
    {
    	boolean exit = false;
		//boolean readResult = false;
        while (!exit) {
            System.out.println("\nYou are in Admin menu\n");
            System.out.println("\t1. Create Delivery Docket");
            System.out.println("\t2. Update Delivery Docket");
            System.out.println("\t3. Read Delivery Docket");
            System.out.println("\t4. delete Delivery Docket");
            System.out.println("\t5. Back\n");
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("You selected Create Delivery Docket.");
                    Admin admin  = new Admin();
				try {
					admin.createAdmin();
				} catch (NewsagentExceptionHandler e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
                    // Call a method to handle creating delivery area
                    break;
                case 2:
                    System.out.println("You selected Update Delivery Docket.");
                    // Call a method to handle updating delivery area
                    break;
                case 3:
                	generateReadAdmin();
                	break;
                case 4:
                    System.out.println("You selected delete Delivery Docket.");
                    // Call a method to handle updating delivery area
                    break;
                case 5:
                    exit = true;
                    generateAdminMenu();
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
    // newsagent
    public void generateNewsagentMenu() 
    {
        boolean exit = false;
        while (true) 
        {
            System.out.println("\nNewsagent Menu:");
            System.out.println("\t1. Delivery Driver");
            System.out.println("\t2. Receipt");
            System.out.println("\t3. Delivery Docket");
            System.out.println("\t4. Delivery Area");
            System.out.println("\t5. Order Book");
            System.out.println("\t6. Customer Book");
            System.out.println("\t7. Publication");
            System.out.println("\t8. Invoices");
            System.out.println("\t9. Receipt");
            System.out.println("\t10. Publication");
            System.out.println("\t11. Customer");
            System.out.println("\t12. Sign Out\n");

            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) 
            {
                case 1:
                    System.out.println("You selected Delivery Driver.");
                    generateDeliveryDriverMenu();
                    break;
                case 2:
                    System.out.println("You selected Customer.");

					generateReceiptMenu();

                    break;
                case 3:
                    System.out.println("You Delivery Docket.");
				try {
					generateDeliveryDocketMenu();
				} catch (NewsagentExceptionHandler e3) {
					// TODO Auto-generated catch block
					e3.printStackTrace();
				}

                    break;
                case 4:
                    System.out.println("You selected Delivery Area.");
                    generateDeliveryAreaMenu();
                    break;
                case 5:
                    System.out.println("You selected Order Book.");
                    generateOrderBookMenu();
                    break;
                case 6:
                    System.out.println("You selected Customer Book.");
				try {
					generateCustomerBookMenu();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (NewsagentExceptionHandler e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
                    break;
                case 7:
                    System.out.println("You selected Publication.");
				try {    //// ----------------------------------------------------------------------------------
					generatePublicationMenu();
				} catch (NewsagentExceptionHandler e2) {
					// TODO Auto-generated catch block
					e2.printStackTrace();
				}
                    break;
                case 8:
                    System.out.println("You selected Invoices.");
				try {
					generateInvoiceMenu();
				} catch (NewsagentExceptionHandler e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
                    break;
                case 9:
                    System.out.println("You selected Receipt.");
                    generateReceiptMenu();
                    break;
                case 10:
	                    System.out.println("You selected Publication.");
					try {
						generatePublicationMenu();
					} catch (NewsagentExceptionHandler e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
                    break;
                case 11:
                    System.out.println("You selected Customer.");
				try
				{
					generateCustomerMenu();
				} catch (NewsagentExceptionHandler e) 
				{
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
                    break;
                case 12:
                    //System.out.println("Exiting the application.");
                	simulateLoading("Signing Out", 3, 600);
                    generateLoginWindow();
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
    private void generateDeliveryAreaMenu() {
        boolean exit = false;
        DeliveryAreaController areaController = null; 

        try {
            areaController = new MySQLAccess();
        } catch (SQLException e1) {
            e1.printStackTrace();
        }

        while (!exit) {
            System.out.println("\nYou are in Delivery Area:\n");
            System.out.println("\t1. Create Delivery Area");
            System.out.println("\t2. Update Delivery Area");
            System.out.println("\t3. Read Delivery Area");
            System.out.println("\t4. Delete Delivery Area");
            System.out.println("\t5. Back\n");

            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("You selected Create Delivery Area.");
                    boolean createNewArea = true;

                    while (createNewArea) {
                        try {
                            System.out.print("Do you want to create a new Delivery Area (Y/N): ");
                            String userInput = scanner.next().toLowerCase();

                            if (userInput.equals("y") || userInput.equals("yes")) {
                                if (areaController != null) { 
                                    System.out.println("Enter details for the new Delivery Area:");

                                    System.out.print("Enter Area ID: ");
                                    int areaId = scanner.nextInt();

                                    System.out.print("Enter Area Name: ");
                                    String areaName = scanner.next();

                                    System.out.print("Enter Number of Customers: ");
                                    int numberOfCustomers = scanner.nextInt();

                                    DeliveryArea newArea = new DeliveryArea(areaId, areaName, numberOfCustomers);

                                    areaController.insertDeliveryAreaDetails(newArea);

                                    System.out.println("Delivery Area created successfully.");
                                } else {
                                    System.out.println("Error: areaController not initialized.");
                                    createNewArea = false;
                                }
                            } else {
                                createNewArea = false;
                            }
                        } catch (InputMismatchException e) {
                            System.out.println("Invalid input. Please enter a valid number.");
                            scanner.nextLine(); 
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                    break;
            case 2:
                System.out.println("You selected Update Delivery Area.");

                System.out.print("Enter the ID of the Delivery Area to update: ");
                int areaIdToUpdate = scanner.nextInt();

                DeliveryArea existingArea = areaController.findDeliveryAreaById(areaIdToUpdate);

                if (existingArea != null) {
                    System.out.println("Existing Details:");
                    System.out.println(existingArea);

                    System.out.print("Enter new Area Name: ");
                    String newAreaName = scanner.next();

                    System.out.print("Enter new Number of Customers: ");
                    int newNumberOfCustomers = scanner.nextInt();

                    DeliveryArea updatedArea = new DeliveryArea(areaIdToUpdate, newAreaName, newNumberOfCustomers);

                    boolean updateSuccess = areaController.updateDeliveryAreaDetails(updatedArea);

                    if (updateSuccess) {
                        System.out.println("Delivery Area updated successfully.");
                    } else {
                        System.out.println("Failed to update Delivery Area.");
                    }
                } else {
                    System.out.println("Delivery Area with ID " + areaIdToUpdate + " not found.");
                }
                break;

            case 3:
                System.out.println("You selected Read Delivery Area.");

                System.out.print("Enter the ID of the Delivery Area to read: ");
                int areaIdToRead = scanner.nextInt();

                DeliveryArea readArea = areaController.findDeliveryAreaById(areaIdToRead);

                if (readArea != null) {
                    System.out.println("Delivery Area Details:");
                    System.out.println(readArea);
                } else {
                    System.out.println("Delivery Area with ID " + areaIdToRead + " not found.");
                }
                break;

            case 4:
                System.out.println("You selected Delete Delivery Area.");

                System.out.print("Enter the ID of the Delivery Area to delete: ");
                int areaIdToDelete = scanner.nextInt();

                if (areaController.isDeliveryAreaIdExists(areaIdToDelete)) {
                    System.out.print("Are you sure you want to delete this Delivery Area? (Y/N): ");
                    String confirmation = scanner.next().toLowerCase();

                    if (confirmation.equals("y") || confirmation.equals("yes")) {
                        boolean deleteSuccess = areaController.deleteDeliveryAreaById(areaIdToDelete);

                        if (deleteSuccess) {
                            System.out.println("Delivery Area deleted successfully.");
                        } else {
                            System.out.println("Failed to delete Delivery Area.");
                        }
                    } else {
                        System.out.println("Deletion canceled.");
                    }
                } else {
                    System.out.println("Delivery Area with ID " + areaIdToDelete + " does not exist.");
                }
                break;

                case 5:
                    System.out.println("Back.");
                    exit = true;
                    generateNewsagentMenu();
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
	}
	void generateInvoiceMenu() throws NewsagentExceptionHandler {
	    while (!exit) {
	        System.out.println("\nYou are in Invoice:\n");
	        System.out.println("\t1. Create Invoice");
	        System.out.println("\t2. Update Invoice");
	        System.out.println("\t3. Read Invoice");
	        System.out.println("\t4. Delete Invoice");
	        System.out.println("\t5. Back\n");
	        while (!exit) {
	            try {
	                System.out.print("Enter your choice: ");
	                int choice = sc.nextInt();

	                switch (choice) {
	                    case 1:
	                        System.out.println("You selected Create Invoice.");
	                        boolean createNewInvoice = true;
	                        while (createNewInvoice) {
	                            try {
	                                System.out.print("Do you want to create a new Invoice (Y/N): ");
	                                String userInput2 = sc.next().toLowerCase();

	                                if (userInput2.equals("y") || userInput2.equals("yes")) {
	                                    InvoiceController invoiceController = new MySQLAccess(); 
	                                    String name;
	                                    do {
	                                        System.out.print("Enter your name: ");
	                                        name = sc.next();

	                                        try {
	                                            invoice.validateCustomerName(name);
	                                            break;  
	                                        } catch (NewsagentExceptionHandler e) {
	                                            System.out.println("Error: " + e.getMessage());
	                                        }
	                                    } while (true);

	                                    int invoiceId;
	                                    boolean validInvoiceId;

	                                    do {
	                                        invoiceId = getValidIntInput("Invoice ID", sc);
	                                        validInvoiceId = true;  

	                                        try {
	                                            invoice.validateId(invoiceId);

	                                            if (invoiceController.getInvoiceById(invoiceId) != null) {
	                                                System.out.println("Invoice ID already exists.");
	                                                System.out.print("Do you want to continue (Y/N)? ");
	                                                String retryChoice = sc.next().toLowerCase();

	                                                if (!retryChoice.equals("y")) {
	                                                    createNewInvoice = false;
	                                                    validInvoiceId = false;  
	                                                }
	                                            }
	                                        } catch (NewsagentExceptionHandler e) {
	                                            System.out.println("Error: " + e.getMessage());
	                                            validInvoiceId = false;  
	                                        }
	                                    } while (!validInvoiceId);
	                                    int dateYear;
	                                    int dateMonth;
	                                    int dateDay;
	                                    int timeHour;
	                                    int timeMinute;

	                                    do {
	                                        dateYear = getValidIntInput("Date (Year)", sc);
	                                        if (dateYear < 1 || dateYear > 9999) {
	                                            System.out.println("Error: Invalid year. Please enter a value between 1 and 9999.");
	                                        }
	                                    } while (dateYear < 1 || dateYear > 9999);

	                                    do {
	                                        dateMonth = getValidIntInput("Date (Month)", sc);
	                                        if (dateMonth < 1 || dateMonth > 12) {
	                                            System.out.println("Error: Invalid month. Please enter a value between 1 and 12.");
	                                        }
	                                    } while (dateMonth < 1 || dateMonth > 12);

	                                    do {
	                                        dateDay = getValidIntInput("Date (Day)", sc);
	                                        if (dateDay < 1 || dateDay > 31) {
	                                            System.out.println("Error: Invalid day. Please enter a value between 1 and 31.");
	                                        }
	                                    } while (dateDay < 1 || dateDay > 31);

	                                    do {
	                                        timeHour = getValidIntInput("Time (Hour)", sc);
	                                        if (timeHour < 0 || timeHour > 23) {
	                                            System.out.println("Error: Invalid hour. Please enter a value between 0 and 23.");
	                                        }
	                                    } while (timeHour < 0 || timeHour > 23);

	                                    do {
	                                        timeMinute = getValidIntInput("Time (Minute)", sc);
	                                        if (timeMinute < 0 || timeMinute > 59) {
	                                            System.out.println("Error: Invalid minute. Please enter a value between 0 and 59.");
	                                        }
	                                    } while (timeMinute < 0 || timeMinute > 59);
	                                    sc.nextLine();  
	                                    String homeAddress, city, country;
	                                    do {
	                                        System.out.print("Enter Home Address: ");
	                                        homeAddress = sc.nextLine();  
	                                        System.out.print("Enter City: ");
	                                        city = sc.nextLine();
	                                        System.out.print("Enter Country: ");
	                                        country = sc.nextLine();
	                                        try {
	                                            invoice.validateHomeAddress(homeAddress, city, country);
	                                            invoice.setHome_address(homeAddress);
	                                            invoice.setCity(city);
	                                            invoice.setCountry(country);
	                                        } catch (NewsagentExceptionHandler e) {
	                                            System.out.println("Error: " + e.getMessage());
	                                            sc.nextLine();
	                                            continue;
	                                        }
	                                        break;
	                                    } while (true);
	                                    System.out.print("Enter Balance: ");
	                                    double balance;
	                                    do {
	                                        try {
	                                            balance = sc.nextDouble();
	                                            break;
	                                        } catch (InputMismatchException e) {
	                                            System.out.println("Invalid input. Please enter a valid number.");
	                                            sc.nextLine(); 
	                                        }
	                                    } while (true);
	                                    System.out.print("Enter Newspaper Name: ");
	                                    String newspaperName;
	                                    do {
	                                        try {
	                                        	newspaperName = sc.next();
	                                            break;
	                                        } catch (InputMismatchException e) {
	                                            System.out.println("Invalid input. Please enter a valid input(No Numbers).");
	                                            sc.nextLine(); 
	                                        }
	                                    } while (true);
	                                    int newspaperNumber;
	                                    do {
	                                        try {
	                                        	 System.out.print("Enter Newspaper Number: ");
	                                            if (sc.hasNextInt()) {
	                                                newspaperNumber = sc.nextInt();
	                                                break;
	                                            } else {
	                                                System.out.println("Invalid input. Please enter a valid number.");
	                                                sc.next();
	                                            }
	                                        } catch (InputMismatchException e) {
	                                            System.out.println("Invalid input. Please enter a valid number.");
	                                            sc.next();
	                                        }
	                                    } while (true);
	                                    System.out.print("Enter Newsagent Name: ");
	                                    String newsagentName ;
	                                    do {
	                                        try {
	                                        	newsagentName = sc.next();
	                                            break;
	                                        } catch (InputMismatchException e) {
	                                            System.out.println("Invalid input. Please enter a valid input(No Numbers).");
	                                            sc.nextLine(); 
	                                        }
	                                    } while (true);
	                                    boolean successfulTickBox;
	                                    System.out.print("Is Successful Tick Box Visible? (true/false): ");

	                                    do {
	                                        try {
	                                            successfulTickBox = sc.nextBoolean();
	                                            break;
	                                        } catch (InputMismatchException e) {
	                                            System.out.println("Invalid input. Please enter true or false.");
	                                            sc.nextLine(); 
	                                        }
	                                    } while (true);
	                                    System.out.print("Is Unsuccessful Tick Box Visible? (true/false): ");
	                                    boolean unsuccessfulTickBox;
	                                    do {
	                                        try {

	                                            unsuccessfulTickBox = sc.nextBoolean();
	                                            break;
	                                        } catch (InputMismatchException e) {
	                                            System.out.println("Invalid input. Please enter true or false.");
	                                            sc.nextLine(); 
	                                        }
	                                    } while (true);
	                                    System.out.print("Is Returned Tick Box Visible? (true/false): ");

	                                    boolean returnedTickBox;
	                                    do {
	                                        try {
	                                            returnedTickBox = sc.nextBoolean();
	                                            break;
	                                        } catch (InputMismatchException e) {
	                                            System.out.println("Invalid input. Please enter true or false.");
	                                            sc.nextLine(); 
	                                        }
	                                    } while (true);
	                                    System.out.print("Is Customer Paid? (true/false): ");
	                                    boolean customerPaid;
	                                    do {
	                                        try {
	                                            customerPaid = sc.nextBoolean();
	                                            break;
	                                        } catch (InputMismatchException e) {
	                                            System.out.println("Invalid input. Please enter true or false.");
	                                            sc.nextLine(); 
	                                        }
	                                    } while (true);
	                                    System.out.print("Enter Total Amount: ");
	                                    double totalAmount;
	                                    do {
	                                        try {
	                                            totalAmount = sc.nextDouble();
	                                            invoice.validateTotalAmount(totalAmount);
	                                            break;
	                                        } catch (InputMismatchException e) {
	                                            System.out.println("Invalid input. Please enter a valid number.");
	                                            sc.nextLine(); 
	                                        } catch (NewsagentExceptionHandler e) {
	                                            System.out.println("Error: " + e.getMessage());
	                                        }
	                                    } while (true);
	                                    try {
	                                        invoice.validateDate(new int[]{dateYear, dateMonth, dateDay});
	                                        invoice.validateTime(new int[]{timeHour, timeMinute});
	                                        invoice.setNewspaperDetails(newspaperName, newspaperNumber);
	                                    } catch (NewsagentExceptionHandler e) {
	                                        System.out.println("Error: " + e.getMessage());
	                                        continue;
	                                    }
	                                    String str = homeAddress + " " + city+" "+ country;
	                                    Invoice newInvoice = new Invoice(
	                                            invoiceId, str, name, new int[]{dateYear, dateMonth, dateDay},
	                                            new int[]{timeHour, timeMinute}, balance, newspaperName,
	                                            newspaperNumber, newsagentName, successfulTickBox,
	                                            unsuccessfulTickBox, returnedTickBox, customerPaid, totalAmount
	                                    );
	                                    invoiceController.insertInvoice(newInvoice);
	                                    System.out.println("Invoice created successfully.");
	                                    generateInvoiceMenu();
	                                    createNewInvoice = false;
	                                    break;
	                                } else {
	                                    createNewInvoice = false;
	                                }
	                            } catch (InputMismatchException e) {
	                                System.out.println("Invalid input. Please enter a valid number.");
	                                sc.nextLine(); 
	                            } catch (SQLException e) {
	                                e.printStackTrace();
	                            } catch (Exception e) {
	                                e.printStackTrace();
	                            }
	                        }
	                        break;
	                    case 2:
	                        System.out.println("You selected Update Invoice.");
	                        boolean validID2 = false;
	                        while (!validID2) {
	                            try {
	                                System.out.print("Enter a Valid Invoice ID: ");
	                                int userInput = sc.nextInt();
	                                if (invoice.validateId(userInput)) {
	                                    InvoiceController invoiceController = new MySQLAccess();
	                                    Invoice existingInvoice = invoiceController.getInvoiceById(userInput);
	                                    if (existingInvoice != null) {
	                                        Invoice updatedInvoice = new Invoice();
	                                        updatedInvoice.setId(existingInvoice.getId());
	                                        System.out.print("Enter Updated Home Address: ");
	                                        sc.nextLine();  
	                                        String updatedHomeAddress = sc.nextLine(); 
	                                        System.out.print("Enter Updated City: ");
	                                        String updatedCity = sc.nextLine();
	                                        System.out.print("Enter Updated Country: ");
	                                        String updatedCountry = sc.nextLine();
	                                        try {
	                                            invoice.validateHomeAddress(updatedHomeAddress, updatedCity, updatedCountry);
	                                            existingInvoice.setHome_address(updatedHomeAddress);
	                                            existingInvoice.setCity(updatedCity);
	                                            existingInvoice.setCountry(updatedCountry);
	                                        } catch (NewsagentExceptionHandler e) {
	                                            System.out.println("Error: " + e.getMessage());
	                                            continue;
	                                        }
	                                        System.out.print("Enter Updated Customer Name: ");
	                                        try {
	                                            String updatedName = sc.next();
	                                            sc.nextLine(); 
	                                            invoice.validateCustomerName(updatedName);
	                                            updatedInvoice.setName(updatedName);
	                                        } catch (NewsagentExceptionHandler e) {
	                                            System.out.println("Error: " + e.getMessage());
	                                            sc.nextLine(); 
	                                            continue;
	                                        }
	                                        System.out.print("Enter Updated Date (Year): ");
	                                        int updatedDateYear = sc.nextInt();
	                                        System.out.print("Enter Updated Date (Month): ");
	                                        int updatedDateMonth = sc.nextInt();
	                                        System.out.print("Enter Updated Date (Day): ");
	                                        int updatedDateDay = sc.nextInt();
	                                        try {
	                                            invoice.validateDate(new int[]{updatedDateYear, updatedDateMonth, updatedDateDay});
	                                            updatedInvoice.setDate(new int[]{updatedDateYear, updatedDateMonth, updatedDateDay});
	                                        } catch (NewsagentExceptionHandler e) {
	                                            System.out.println("Error: " + e.getMessage());
	                                            continue;
	                                        }
	                                        System.out.print("Enter Updated Time (Hour): ");
	                                        int updatedTimeHour = sc.nextInt();
	                                        System.out.print("Enter Updated Time (Minute): ");
	                                        int updatedTimeMinute = sc.nextInt();
	                                        try {
	                                            invoice.validateTime(new int[]{updatedTimeHour, updatedTimeMinute});
	                                            updatedInvoice.setTime(new int[]{updatedTimeHour, updatedTimeMinute});
	                                        } catch (NewsagentExceptionHandler e) {
	                                            System.out.println("Error: " + e.getMessage());
	                                            continue;
	                                        }
	                                        System.out.print("Enter Updated Balance: ");
	                                        double updatedBalance = sc.nextDouble();
	                                        updatedInvoice.setBalance(updatedBalance);
	                                        System.out.print("Enter Updated Newspaper Name: ");
	                                        String updatedNewspaperName = sc.next();
	                                        updatedInvoice.setNewspaperName(updatedNewspaperName);
	                                        System.out.print("Enter Updated Newspaper Number: ");
	                                        int updatedNewspaperNumber = sc.nextInt();
	                                        updatedInvoice.setNewspaperNumber(updatedNewspaperNumber);
	                                        System.out.print("Enter Updated Newsagent Name: ");
	                                        String updatedNewsagentName = sc.next();
	                                        updatedInvoice.setNewsagentName(updatedNewsagentName);
	                                        System.out.print("Is Successful Tick Box Visible? (true/false): ");
	                                        boolean updatedSuccessfulTickBox = sc.nextBoolean();
	                                        updatedInvoice.setSuccessfulTickBox(updatedSuccessfulTickBox);
	                                        System.out.print("Is Unsuccessful Tick Box Visible? (true/false): ");
	                                        boolean updatedUnsuccessfulTickBox = sc.nextBoolean();
	                                        updatedInvoice.setUnsuccessfulTickBox(updatedUnsuccessfulTickBox);
	                                        System.out.print("Is Returned Tick Box Visible? (true/false): ");
	                                        boolean updatedReturnedTickBox = sc.nextBoolean();
	                                        updatedInvoice.setReturnedTickBox(updatedReturnedTickBox);
	                                        System.out.print("Is Customer Paid? (true/false): ");
	                                        boolean updatedCustomerPaid = sc.nextBoolean();
	                                        updatedInvoice.setCustomerPaid(updatedCustomerPaid);
	                                        System.out.print("Enter Updated Total Amount: ");
	                                        double updatedTotalAmount = sc.nextDouble();
	                                        try {
	                                            invoice.validateTotalAmount(updatedTotalAmount);
	                                            updatedInvoice.setTotal_amount(updatedTotalAmount);
	                                        } catch (NewsagentExceptionHandler e) {
	                                            System.out.println("Error: " + e.getMessage());
	                                            continue;
	                                        }
	                                        boolean updateSuccessful = invoiceController.updateInvoiceDetails(updatedInvoice);

	                                        if (updateSuccessful) {
	                                            System.out.println("Invoice with ID " + userInput + " updated successfully.");
	                                        } else {
	                                            System.out.println("Error updating invoice. Please try again.");
	                                        }
	                                        validID2 = true;  
	                                    } else {
	                                        System.out.println("Invoice not found.");
	                                        System.out.print("Do you want to enter another ID? (y/n): ");
	                                        String retryChoice = sc.next().toLowerCase();
	                                        if (!retryChoice.equals("y")) {
	                                            validID2 = true;  // Exit the loop
	                                        }
	                                    }
	                                } else {
	                                    System.out.println("Invalid input. Please enter a valid number.");
	                                    sc.nextLine(); 
	                                    System.out.print("Do you want to enter another ID? (y/n): ");
	                                    String retryChoice = sc.next().toLowerCase();
	                                    if (!retryChoice.equals("y")) {
	                                        validID2 = true;  
	                                    }
	                                }
	                            } catch (InputMismatchException e) {
	                                System.out.println("Invalid input. Please enter a number.");
	                                sc.nextLine(); 
	                                System.out.print("Do you want to enter another ID? (y/n): ");
	                                String retryChoice = sc.next().toLowerCase();

	                                if (!retryChoice.equals("y")) {
	                                    validID2 = true;  
	                                }
	                            } catch (SQLException e) {
	                                e.printStackTrace();  
	                            } catch (Exception e) {
	                                e.printStackTrace();  
	                            }
	                        }
	                        break;
                    case 3:
                        System.out.println("You selected Read Invoice.");
                        boolean validID3 = false;

                        while (!validID3) {
                            try {
                                System.out.print("Enter a Valid Invoice ID: ");
                                int userInput = sc.nextInt();
                                if (invoice.validateId(userInput)) {
                                    InvoiceController invoiceController = new MySQLAccess();
                                    Invoice existingInvoice = invoiceController.getInvoiceById(userInput);
                                    if (existingInvoice != null) {
                                        System.out.println("Invoice Details:\n" + existingInvoice);
	                                    generateInvoiceMenu();
                                        validID3 = true;
                                    } else 
                                    {
                                        System.out.println("Invoice not found.");
                                        System.out.print("Do you want to enter another ID? (y/n): ");
                                        String retryChoice = sc.next().toLowerCase();
                                        if (!retryChoice.equals("y")) {
                                            validID3 = true;
                                        }
                                    }
                                } else {
                                    System.out.println("Invalid input. Please enter a valid number.");
                                    sc.nextLine(); 
                                    System.out.print("Do you want to enter another ID? (y/n): ");
                                    String retryChoice = sc.next().toLowerCase();

                                    if (!retryChoice.equals("y")) {
                                        validID3 = true;
                                    }
                                }
                            } catch (InputMismatchException e) {
                                System.out.println("Invalid input. Please enter a number.");
                                sc.nextLine(); 
                                System.out.print("Do you want to enter another ID? (y/n): ");
                                String retryChoice = sc.next().toLowerCase();

                                if (!retryChoice.equals("y")) {
                                    validID3 = true;
                                }
                            } catch (SQLException e) {
                                e.printStackTrace();
                            } catch (NewsagentExceptionHandler e) {
                                System.out.println("Error: " + e.getMessage());
                                System.out.print("Do you want to enter another ID? (y/n): ");
                                String retryChoice = sc.next().toLowerCase();

                                if (!retryChoice.equals("y")) {
                                    validID3 = true;
                                }
                            } catch (Exception e  ) {
                                e.printStackTrace();
                            }
                        }
                        break;

                    case 4:
                        System.out.println("You selected Delete Invoice.");
                        boolean validID = false;

                        while (!validID) {
                            try {
                                System.out.print("Enter a Valid Invoice ID: ");
                                int userInput = sc.nextInt();
                                if (invoice.validateId(userInput)) {
                                    InvoiceController invoiceController = new MySQLAccess();
                                    if (invoiceController.getInvoiceById(userInput) != null) {
                                    	invoiceController.deleteInvoice(userInput);
                                        System.out.println("Invoice deleted successfully.");
	                                    generateInvoiceMenu();
                                        validID = true;
                                    } else {
                                        System.out.println("Invoice not found.");
                                        System.out.print("Do you want to enter another ID? (y/n): ");
                                        String retryChoice = sc.next().toLowerCase();

                                        if (!retryChoice.equals("y")) {
                                            validID = true;
                                        }
                                    }
                                }
                            } catch (InputMismatchException e) {
                                System.out.println("Invalid input. Please enter a number.");
                                sc.nextLine(); 
                            } catch (SQLException e) {
                                e.printStackTrace();
                            } catch (NewsagentExceptionHandler e) {
                                System.out.println("Error: " + e.getMessage());
                                System.out.print("Do you want to enter another ID? (y/n): ");
                                String retryChoice = sc.next().toLowerCase();
                                if (!retryChoice.equals("y")) {
                                    validID = true;
                                }
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        }
                        break;
                    case 5:
                        System.out.println("Back.");
                        generateNewsagentMenu();
                        exit = true;
                        break;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a number.");
                sc.nextLine(); 
            }
        }
	    }
    }
    private static int getValidIntInput(String fieldName, Scanner sc) {
        int userInput = 0;
        boolean validInput = false;
        while (!validInput) {
            try {
                System.out.print("Enter " + fieldName + ": ");
                userInput = sc.nextInt();
                validInput = true;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid number.");
                sc.nextLine(); // Consume the invalid input
            }
        }
        return userInput;
    }
	private void generateOrderBookMenu() {
		boolean exit = false;
        while (!exit) {
            System.out.println("\nYou are in Order Book:\n");
            System.out.println("\t1. Create Order Book");
            System.out.println("\t2. Update Order Book");
            System.out.println("\t3. Read Order Book");
            System.out.println("\t4. Delete Order Book");
            System.out.println("\t5. Back\n");

            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("You selected Create Order Book.");
                    // Call a method to handle creating delivery area
                    break;
                case 2:
                    System.out.println("You selected Update Order Book.");
                    // Call a method to handle updating delivery area
                    break;
                case 3:
                    System.out.println("You selected Read Order Book.");
                    // Call a method to handle reading delivery area
                    break;
                case 4:
                    System.out.println("You selected Order Book.");
                    // Call a method to handle deleting delivery area
                    break;
                case 5:
                    System.out.println("Back.");
                    exit = true;
                    generateNewsagentMenu();
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
	}
	private void generateCustomerBookMenu() throws SQLException, NewsagentExceptionHandler {
		CustomerBookController dbAccess  = new MySQLAccess();
		   boolean exit = false;
		   while (!exit) {
		       System.out.println("\nYou are in Customer Book:\n");
		       System.out.println("\t1. Create Customer Book");
		       System.out.println("\t2. Update Customer Book");
		       System.out.println("\t3. Read Customer Book");
		       System.out.println("\t4. Delete Customer Book");
		       System.out.println("\t5. Back\n");

		       Scanner scanner = new Scanner(System.in);
		       System.out.print("Enter your choice: ");
		       int choice = scanner.nextInt();

		       switch (choice) {
		           case 1:
		               System.out.println("You selected Create Customer Book.");
		               CustomerBook newBook = new CustomerBook();
		               try {
		                   simulateLoading("Loading", 3, 100);
		                   boolean created = newBook.createCustomerBook();
		                   if (created) {
		                       // 将新创建的 CustomerBook 对象插入到数据库中
		                       boolean inserted = dbAccess.insertCustomerBookDetails(newBook);
		                       if (inserted) {
		                           System.out.println("Customer Book created and added to the database successfully!");
		                       } else {
		                           System.out.println("Failed to add customer book to the database. Please try again.");
		                       }
		                   } else {
		                       System.out.println("Failed to create customer book. Please try again.");
		                   }
		               } catch (Exception e) {
		                   System.out.println("Error creating customer book: " + e.getMessage());
		               }
		               break;
		           case 2:
		               System.out.println("You selected Update Customer Book.");
		               System.out.println("Enter the Customer ID associated with the book you want to update:");
		               int updateCustomerBookId = scanner.nextInt();
		               scanner.nextLine(); // Consume the newline character

		               try {
		                   // Check if the customer with the specified ID exists
		                   CustomerBook existingBook = dbAccess.findCustomerBookById(updateCustomerBookId);

		                   if (existingBook != null) {
		                       // Display the existing book details
		                       System.out.println("Existing Customer Book Details:");
		                       System.out.println(existingBook);

		                       // Collect and validate updated book name, surname, home address, and balance
		                       System.out.print("Enter updated book name: ");
		                       String updatedName = scanner.nextLine();

		                       System.out.print("Enter updated book surname: ");
		                       String updatedSurname = scanner.nextLine();

		                       System.out.print("Enter updated book home address: ");
		                       String updatedHomeAddress = scanner.nextLine();

		                       System.out.print("Enter updated book balance: ");
		                       double updatedBalance = scanner.nextDouble();

		                       // TODO: 进行任何必要的验证（例如检查名称是否为空等）

		                       // 更新现有图书的详细信息
		                       existingBook.setName(updatedName);
		                       existingBook.setSurname(updatedSurname);
		                       existingBook.setHomeAddress(updatedHomeAddress);
		                       existingBook.setBalance(updatedBalance);

		                       boolean updateSuccessful = dbAccess.updateCustomerBook(existingBook);

		                       if (updateSuccessful) {
		                           System.out.println("Customer Book updated successfully!");
		                       } else {
		                           System.out.println("Failed to update customer book. Please try again.");
		                       }
		                   }
		               } catch (Exception e) {
		                   System.out.println("Error updating customer book: " + e.getMessage());
		               }
		               break;
		           case 3:
		               System.out.println("You selected Read Customer Book.");
		               // 调用数据库方法读取现有的顾客图书信息
		               dbAccess.printAllCustomerBookDetails();
		               break;
		           case 4:
		               System.out.println("You selected Delete Customer Book.");

		               // Prompt user for the Customer ID associated with the book to delete
		               System.out.println("Enter the Customer ID associated with the book you want to delete:");
		               int deleteCustomerBookId = scanner.nextInt();
		               scanner.nextLine(); // Consume the newline character
		               // Check if the book with the specified Customer ID exists
		               CustomerBook bookToDelete = dbAccess.findCustomerBookById(deleteCustomerBookId);
		               if (bookToDelete != null) {
		                   // Display the book details before deletion
		                   System.out.println("Customer Book Details to Delete:");
		                   System.out.println(bookToDelete);

		                   // Confirm deletion with the user
		                   System.out.print("Are you sure you want to delete this customer book? (yes/no): ");
		                   String confirmation = scanner.nextLine().toLowerCase();
		                   if (confirmation.equals("yes")) {
		                    simulateLoading("Loding", 3, 500);
		                       boolean deleteSuccessful = dbAccess.deleteCustomerBookById(bookToDelete.getCustomerID());

							if (deleteSuccessful) {
							   System.out.println("Customer Book deleted successfully!");
							} else {
							   System.out.println("Failed to delete customer book. Please try again.");
							}
		                   } else {
		                       System.out.println("Deletion canceled.");
		                   }

		               } else {
		                   System.out.println("Customer Book with Customer ID " + deleteCustomerBookId + " does not exist.");
		               }
		               break;
	                case 5:
	                    System.out.println("Back.");
	                    exit = true;
	                    scanner.nextLine();
	                    generateNewsagentMenu();
	                    break;
	                default:
	                    System.out.println("Invalid choice. Please try again.");
		       }
		   }
		}
	
//	void generatePublicationMenu3() throws NewsagentExceptionHandler {
//	    Publication newPublication = new Publication();
//	    PublicationInterface in = null;
//	    try {
//	        in = new MySQLAccess();
//	    } catch (SQLException e1) {
//	        e1.printStackTrace();
//	        // Handle the exception or exit the method
//	        return;
//	    }
//	    boolean exit = false;
//	    Scanner scanner = new Scanner(System.in);
//
//	    while (!exit) {
//	        System.out.println("\nYou are in Publication:\n");
//	        System.out.println("\t1. Create Publication");
//	        System.out.println("\t2. Update Publication");
//	        System.out.println("\t3. Read Publication");
//	        System.out.println("\t4. Delete Publication");
//	        System.out.println("\t5. Back\n");
//
//	        System.out.print("Enter your choice: ");
//	        int choice = scanner.nextInt();
//
//	        switch (choice) {
//	        
//	            case 1:
//	            	newPublication.createPublication(newPublication);
//	                break;
//	            case 2:
//	            	newPublication.updatePublication(newPublication, scanner);
//	                break;
//	            case 3:
//	            	newPublication.readPublication(newPublication);
//	                break;
//	            case 4:
//	            	newPublication.deletePublication(newPublication);
//	                break;
//	            case 5:
//	                System.out.println("Back.");
//	                exit = true;
//	                generateNewsagentMenu();
//	                break;
//	            default:
//	                System.out.println("Invalid choice. Please try again.");
//	        }
//	    }
//	}
	void generatePublicationMenu() throws NewsagentExceptionHandler {
		Publication newPublication = new Publication();
		PublicationInterface in = null;
		try {
			in = new MySQLAccess();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		boolean exit = false;
        while (!exit) {
            System.out.println("\nYou are in Publication:\n");
            System.out.println("\t1. Create Publication");
            System.out.println("\t2. Update Publication");
            System.out.println("\t3. Read Publication");
            System.out.println("\t4. Delete Publication");
            System.out.println("\t5. Back\n");

            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
            
            
            case 1:
                System.out.println("You selected Create Publication.");
                Scanner scannerCreation = new Scanner(System.in);
                boolean res = false;
                while (!res) {
                    try {
                    	
                        System.out.println("Enter ID number:");
                        int id = scannerCreation.nextInt();
                        newPublication.validateIDNumber(id);
                        newPublication.setIdNumber(id);
                        scannerCreation.nextLine();  // Consume the newline character
                        
                        if(!in.isPublicationIdExists(id))
                        {
                            System.out.println("Enter title:");
                            String titleInput = scannerCreation.nextLine();
                            newPublication.validateTitle(titleInput);
                            newPublication.setTitle(titleInput);



                            System.out.println("Enter price:");
                            double price = scannerCreation.nextDouble();
                            newPublication.validatePrice(price);
                            newPublication.setPrice(price);
                            scannerCreation.nextLine();  // Consume the newline character

                            System.out.println("Enter author:");
                            String author = scannerCreation.nextLine();
                            newPublication.validateAuthor(author);
                            newPublication.setAuthor(author);

                            System.out.println("Enter frequency:");
                            String frequency = scannerCreation.nextLine();
                            newPublication.validateFrequency(frequency);
                            newPublication.setFrequency(frequency);
                        }
                        if (newPublication.createPublication(newPublication)) {
                            System.out.println("Publication created successfully.");
                        } 
                        else {
                            System.out.println("Failed to create the publication.");
                        }
                        res = true;  // Exit the loop if createPublication is successful

                    } catch (InputMismatchException e) {
                        System.out.println("Invalid input. Please enter valid information.");
                        scannerCreation.nextLine();  // Consume the invalid input to avoid an infinite loop
                    } catch (NewsagentExceptionHandler e) {
                        System.out.println("Error: " + e.getMessage());
                        System.out.println("Please enter valid information.");
                        scannerCreation.nextLine();  // Consume the newline character
                    } catch (Exception e) {
                        System.out.println("An unexpected error occurred. Please try again.");
                        scannerCreation.nextLine();  // Consume the invalid input to avoid an infinite loop
                    }
                }
                break;


                case 2:
                    System.out.println("You selected Update Publication.");
                    Scanner scannerUpdate= new Scanner(System.in);
				try {
					newPublication.updatePublication(newPublication, scannerUpdate);
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
                    break;
                case 3:
     
				try {
					newPublication.readPublication();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
                    break;
                case 4:
      
                    System.out.println("You selected delete Publication.");
				try {
            	    System.out.println("Enter a valid existing ID: ");
            	    int id = scanner.nextInt();
					newPublication.deletePublication(newPublication,id);
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
                    break;
                case 5:
                    System.out.println("Back.");
                    exit = true;
                    generateNewsagentMenu();
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }		
	}

   // private static final int MAX_ID_NUMBER = 300;

	void generateReceiptMenu() {
		Receipt r = new Receipt();
	    boolean exit = false;
	    Scanner sc = new Scanner(System.in);
	    Receipt receipt = new Receipt();

	    while (!exit) {
	        System.out.println("\nYou are in Receipt:\n");
	        System.out.println("\t1. Create Receipt");
	        System.out.println("\t2. Update Receipt");
	        System.out.println("\t3. Read Receipt");
	        System.out.println("\t4. Delete Receipt");
	        System.out.println("\t5. Back\n");

	        System.out.print("Enter your choice: ");
	        int choice = sc.nextInt();
	        try {
	            switch (choice) {
	            case 1:
	                System.out.println("You selected Create Receipt.");
	                try {
						r.createReceipt();
					} catch (NewsagentExceptionHandler e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
	                break;


	            case 2:
	                System.out.println("You selected Update Receipt.");
	                try {
						r.updateReceiptDetails();
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
	                break;

                case 3:
                	Scanner in2 = new Scanner(System.in);
                    System.out.println("You selected Read Receipt.");
                    System.out.println("Please Enter a valid id between 1-300: ");
                    int id3 = in2.nextInt();
                    r.readReceipt(id3);
                    break;

	                
	            case 4:
	            	Scanner in = new Scanner(System.in);
	                System.out.println("You selected Delete Receipt.");
	                System.out.println("Please enter a valid id.");
	                int id = in.nextInt();
	                
	                
	                try {
						r.deleteReceiptByID(id);
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
	                break;

	                case 5:
	                    System.out.println("Back.");
	                    exit = true;
	                    generateNewsagentMenu();
	                    break;

	                default:
	                    System.out.println("Invalid choice. Please try again.");
	            }
	        } catch (InputMismatchException e) {
	            System.out.println("Invalid input. Please enter a number.");
	            sc.nextLine(); // Consume the invalid input
	        }
	    }
	}

	private void generateCustomerMenu() throws NewsagentExceptionHandler {
	    try (Scanner scanner = new Scanner(System.in)) {
	    	
	        boolean exit = false;

	        while (!exit) {
	            System.out.println("\nYou are in Customer:\n");
	            System.out.println("\t1. Create Customer");
	            System.out.println("\t2. Update Customer");
	            System.out.println("\t3. Read Customer");
	            System.out.println("\t4. Delete Customer");
	            System.out.println("\t5. Back\n");

	            System.out.print("Enter your choice: ");

	            if (scanner.hasNextInt()) {
	                int choice = scanner.nextInt();
	                scanner.nextLine(); // Consume the newline character

	                switch (choice) {
	                    case 1:
	                        System.out.println("You selected Create Customer.");
	                        Customer newCustomer = new Customer();
	                        try {
	                            simulateLoading("Loading", 3, 100);
	                            boolean created = newCustomer.createCustomer();
	                            if (created) {
	                                // 将新创建的 Customer 对象插入到数据库中
	                                boolean inserted = dbAccess.insertCustomerDetailsAccount(newCustomer);
	                                if (inserted) {
	                                    System.out.println("Customer created and added to the database successfully!");
	                                } else {
	                                    System.out.println("Failed to add customer to the database. Please try again.");
	                                }
	                            } else {
	                                System.out.println("Failed to create customer. Please try again.");
	                            }
	                        } catch (Exception e) {
	                            System.out.println("Error creating customer: " + e.getMessage());
	                        }
	                        break;
	                    case 2:
	                        System.out.println("You selected Update Customer.");
	                        System.out.println("Enter the ID of the customer you want to update:");
	                        int updateCustomerId = scanner.nextInt();
	                        scanner.nextLine(); // Consume the newline character

	                        try {
	                            // Check if the customer with the specified ID exists
	                            Customer existingCustomer = dbAccess.findCustomerById(updateCustomerId);

	                            if (existingCustomer != null) {
	                                // Display the existing customer details
	                                System.out.println("Existing Customer Details:");
	                                System.out.println(existingCustomer);

	                                // Collect and validate updated customer name, address, and phone number
	                                System.out.print("Enter updated customer name: ");
	                                String updatedName = scanner.nextLine();

	                                System.out.print("Enter updated customer address: ");
	                                String updatedAddress = scanner.nextLine();

	                                System.out.print("Enter updated customer phone number: ");
	                                String updatedPhoneNumber = scanner.nextLine();

	                                // TODO: 进行任何必要的验证（例如检查名称是否为空等）

	                                // 更新现有客户的详细信息
	                                existingCustomer.setName(updatedName);
	                                existingCustomer.setAddress(updatedAddress);
	                                existingCustomer.setPhoneNumber(updatedPhoneNumber);

	                                boolean updateSuccessful = dbAccess.updateCustomer(existingCustomer);

	                                if (updateSuccessful) {
	                                    System.out.println("Customer updated successfully!");
	                                } else {
	                                    System.out.println("Failed to update customer. Please try again.");
	                                }
	                            }
	                        } catch (Exception e) {
	                            System.out.println("Error updating customer: " + e.getMessage());
	                        }
	                        break;
	                    case 3:
	                        System.out.println("You selected Read Customer.");
	                        // 调用数据库方法读取现有的顾客信息
	                        dbAccess.printAllCustomerDetails();
	                        break;
	                    case 4:
	                    	deleteCustomer(dbAccess, scanner);
//	                        System.out.println("You selected Delete Customer.");
//
//	                        // Prompt user for the customer ID to delete
//	                        System.out.println("Enter the ID of the customer you want to delete:");
//	                        int deleteCustomerId = scanner.nextInt();
//	                        scanner.nextLine(); // Consume the newline character
//
//	                        // Check if the customer with the specified ID exists
//	                        Customer customerToDelete = dbAccess.findCustomerById(deleteCustomerId);
//	                        if (customerToDelete != null) {
//	                            // Display the customer details before deletion
//	                            System.out.println("Customer Details to Delete:");
//	                            System.out.println(customerToDelete);
//
//	                            // Confirm deletion with the user
//	                            System.out.print("Are you sure you want to delete this customer? (yes/no): ");
//	                            String confirmation = scanner.nextLine().toLowerCase();
//	                            if (confirmation.equals("yes")) {
//	                                // Delete the customer from the database
//	                                try {
//	                                    boolean deleteSuccessful = dbAccess.deleteCustomer(customerToDelete.getId());
//
//	                                    if (deleteSuccessful) {
//	                                        System.out.println("Customer deleted successfully!");
//	                                    } else {
//	                                        System.out.println("Failed to delete customer. Please try again.");
//	                                    }
//	                                } catch (SQLException e) {
//	                                    System.out.println("Error deleting customer: " + e.getMessage());
//	                                }
//	                            } else {
//	                                System.out.println("Deletion canceled.");
//	                            }
//
//	                        } else {
//	                            System.out.println("Customer with ID " + deleteCustomerId + " does not exist.");
//	                        }
	                        break;
	                    case 5:
	                        System.out.println("Back.");
	                        exit = true;
	                        break;
	                    default:
	                        System.out.println("Invalid choice. Please try again.");
	                }
	            } else {
	                System.out.println("Invalid input. Please enter a number.");
	                scanner.nextLine(); // Consume the invalid input
	            }
	        }
	    } catch (Exception e) {
	        e.printStackTrace();
	    } finally {
	        // 在这里关闭数据库连接
	        // 这样确保在方法执行完毕后关闭连接
	        // 注意: 由于 try-with-resources 已经关闭了 Scanner，所以这里只需关闭 dbAccess
	        try {
	            ((Closeable) dbAccess).close();
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }
	}
	
	private static void deleteCustomer(CustomerController dbAccess, Scanner scanner) {
	    System.out.println("You selected Delete Customer.");

	    // Prompt user for the customer ID to delete
	    System.out.println("Enter the ID of the customer you want to delete:");
	    int deleteCustomerId = scanner.nextInt();
	    scanner.nextLine(); // Consume the newline character

	    try {
	        // Check if the customer with the specified ID exists
	        Customer customerToDelete = dbAccess.findCustomerById(deleteCustomerId);

	        if (customerToDelete != null && customerToDelete.getPhoneNumber() != null) {
	            // Display the customer details before deletion
	            System.out.println("Customer Details to Delete:");
	            System.out.println(customerToDelete);

	            // Confirm deletion with the user
	            System.out.print("Are you sure you want to delete this customer? (yes/no): ");
	            String confirmation = scanner.nextLine().toLowerCase();
	            if (confirmation.equals("yes")) {
	                // Delete the customer from the database
	                try {
	                    boolean deleteSuccessful = dbAccess.deleteCustomer(customerToDelete.getId());

	                    if (deleteSuccessful) {
	                        System.out.println("Customer deleted successfully!");
	                    } else {
	                        System.out.println("Failed to delete customer. Please try again.");
	                    }
	                } catch (SQLException e) {
	                    System.out.println("Error deleting customer: " + e.getMessage());
	                }
	            } else {
	                System.out.println("Deletion canceled.");
	            }

	        } else {
	            System.out.println("Customer with ID " + deleteCustomerId + " does not exist or PhoneNumber is not specified.");
	        }
	    } catch (Exception e) {
	        System.out.println("Error finding/deleting customer: " + e.getMessage());
	    }
	}

	private DeliveryDriver deliveryDriver ;

	void generateDeliveryDriverMenu()  {
	    while (!exit) {
	        System.out.println("\nYou are in Delivery Driver:\n");
	        System.out.println("\t1. Create Delivery Driver");
	        System.out.println("\t2. Update Delivery Driver");
	        System.out.println("\t3. Read Delivery Driver");
	        System.out.println("\t4. Delete Delivery Driver");
	        System.out.println("\t5. Back\n");

	        while (!exit) {
	            try {
	                System.out.print("Enter your choice: ");
	                int choice = sc.nextInt();

	                switch (choice) {
	                    case 1:
	                        System.out.println("You selected Create Delivery Driver.");
	                        boolean createNewDriver = true;

	                        while (createNewDriver) {
	                            try {
	                                System.out.print("Do you want to create a new Delivery Driver (Y/N): ");
	                                String userInput2 = sc.next().toLowerCase();

	                                if (userInput2.equals("y") || userInput2.equals("yes")) {
	                                    DeliveryDriverController driverController = new MySQLAccess(); 

	                                    System.out.println("Enter details for the new Delivery Driver:");

	                                    System.out.print("Enter Driver Name: ");
	                                    String driverName = sc.next();
	                                    try {
	                                        deliveryDriver.verifyName(driverName);
	                                    } catch (NewsagentExceptionHandler e) {
	                                        System.out.println("Error: " + e.getMessage());
	                                        continue;
	                                    }

	                                    System.out.print("Enter Driver Surname: ");
	                                    String driverSurname = sc.next();
	                                    try {
	                                        deliveryDriver.verifySurname(driverSurname);
	                                    } catch (NewsagentExceptionHandler e) {
	                                        System.out.println("Error: " + e.getMessage());
	                                        continue;
	                                    }

	                                    System.out.print("Enter Driver Phone Number: ");
	                                    String driverPhoneNumber = sc.next();
	                                    sc.nextLine();

	                                    if (driverPhoneNumber.length() == 10) {
	                                        try {
	                                            deliveryDriver.verifyPhoneNumber(driverPhoneNumber);
	                                        } catch (NewsagentExceptionHandler e) {
	                                            System.out.println("Error: " + e.getMessage());
	                                        }
	                                    } else {
	                                        System.out.println("Error: Phone number must be 10 digits. Please try again.");
	                                        continue;
	                                    }
	                                    try {
	                                        deliveryDriver.verifyPhoneNumber(driverPhoneNumber);
	                                    } catch (NewsagentExceptionHandler e) {
	                                        System.out.println("Error: " + e.getMessage());
	                                        continue;
	                                    }
	                                    System.out.print("Enter Driver Address: ");
	                                    String driverAddress = sc.nextLine();
	                                    try {
	                                        deliveryDriver.verifyAddress(driverAddress);
	                                    } catch (NewsagentExceptionHandler e) {
	                                        System.out.println("Error: " + e.getMessage());
	                                        continue;
	                                    }
	                                    int driverId;
	                                    boolean validDriverId;
	                                    while (true) {
	                                        driverId = getValidIntInputDeliveryDriver("Driver ID", sc);

	                                        try {
	                                            invoice.validateId(driverId);
	                                            DeliveryDriver existingDriver = driverController.findDeliveryDriverById(driverId);

	                                            if (existingDriver != null) {
	                                                System.out.println("Driver ID already exists.");
	                                                System.out.print("Do you want to continue (Y/N)? ");
	                                                String retryChoice = sc.next().toLowerCase();
	                                                if (!retryChoice.equals("y")) {
	                                                    createNewDriver = false;
	                                                    break;
	                                                }
	                                            } else {
	                                                break;  
	                                            }
	                                        } catch (NewsagentExceptionHandler e) {
	                                            System.out.println("Error: " + e.getMessage());
	                                        }
	                                    }


	                                    int driverPin;
	                                    boolean validPin;

	                                    do {
	                                        driverPin = getValidIntInputDeliveryDriver("Driver PIN", sc);

	                                        try {
	                                            deliveryDriver.verifyPinNumber(driverPin);
	                                            validPin = true;
	                                        } catch (NewsagentExceptionHandler e) {
	                                            System.out.println("Error: " + e.getMessage());

	                                            System.out.print("Do you want to continue (Y/N)? ");
	                                            String retryChoice = sc.next().toLowerCase();
	                                            if (!retryChoice.equals("y")) {
	                                                createNewDriver = false;
	                                                break;
	                                            }

	                                            validPin = false;
	                                        }
	                                    } while (!validPin);

	                                    DeliveryDriver newDriver = new DeliveryDriver(driverId, driverName, driverSurname, driverPhoneNumber, driverAddress, driverPin, false);


	                                    driverController.insertDeliveryDriverDetails(newDriver);

	                                    System.out.println("Delivery Driver created successfully.");
	                                    generateDeliveryDriverMenu();
	                                    createNewDriver = false;
	                                } else {
	                                    createNewDriver = false;
	                                }
	                            } catch (InputMismatchException e) {
	                                System.out.println("Invalid input. Please enter a valid number.");
	                                sc.nextLine(); 
	                            } catch (SQLException e) {
	                                e.printStackTrace();
	                            } catch (Exception e) {
	                                e.printStackTrace();
	                            }
	                        }
	                        break;
	                    case 2:
	                        System.out.println("You selected Update Delivery Driver.");
	                        boolean validID2 = false;

	                        while (!validID2) {
	                            try {
	                                System.out.print("Enter a Valid Driver ID: ");
	                                int userInput = sc.nextInt();

	                                if (deliveryDriver.verifyIdNumber(userInput)) {
	                                    DeliveryDriverController driverController = new MySQLAccess();

	                                    DeliveryDriver existingDriver = driverController.findDeliveryDriverById(userInput);
	                                    if (existingDriver != null) {

	                                        System.out.print("Enter Updated Driver Name: ");
	                                        String updatedName = sc.next();
	                                        try {
	                                            existingDriver.verifyName(updatedName);
	                                        } catch (NewsagentExceptionHandler e) {
	                                            System.out.println("Error: " + e.getMessage());
	                                            continue;
	                                        }
	                                        existingDriver.setName(updatedName);

	                                        System.out.print("Enter Updated Driver Surname: ");
	                                        String updatedSurname = sc.next();
	                                        try {
	                                            existingDriver.verifySurname(updatedSurname);
	                                        } catch (NewsagentExceptionHandler e) {
	                                            System.out.println("Error: " + e.getMessage());
	                                            continue;
	                                        }
	                                        existingDriver.setSurname(updatedSurname);

	                                        System.out.print("Enter Updated Driver Phone Number: ");
	                                        String updatedPhoneNumber = sc.next();
	                                        sc.nextLine();

	                                        try {
	                                            existingDriver.verifyPhoneNumber(updatedPhoneNumber);
	                                        } catch (NewsagentExceptionHandler e) {
	                                            System.out.println("Error: " + e.getMessage());
	                                            continue;
	                                        }
	                                        existingDriver.setPhoneNumber(updatedPhoneNumber);

	                                        System.out.print("Enter Updated Driver Address: ");
	                                        String updatedAddress = sc.nextLine();
	                                        try {
	                                            existingDriver.verifyAddress(updatedAddress);
	                                        } catch (NewsagentExceptionHandler e) {
	                                            System.out.println("Error: " + e.getMessage());
	                                            continue;
	                                        }
	                                        existingDriver.setAddress(updatedAddress);


	                                        try {
	                                            boolean updateSuccessful = driverController.updateDeliveryDriverDetails(existingDriver);

	                                            if (updateSuccessful) {
	                                                System.out.println("Driver with ID " + userInput + " updated successfully.");
	                                                generateDeliveryDriverMenu();
	                                            } else {
	                                                System.out.println("Error updating driver. Please try again.");
	                                            }

	                                            validID2 = true;  // Exit the loop
	                                        } catch (NewsagentExceptionHandler e) {
	                                            System.out.println("Error: " + e.getMessage());
	                                        }
	                                    } else {
	                                        System.out.println("Driver not found.");
	                                        System.out.print("Do you want to enter another ID? (y/n): ");
	                                        String retryChoice = sc.next().toLowerCase();

	                                        if (!retryChoice.equals("y")) {
	                                            validID2 = true;  
	                                        }
	                                    }
	                                } else {
	                                    System.out.println("Invalid input. Please enter a valid number.");
	                                    sc.nextLine(); 
	                                    System.out.print("Do you want to enter another ID? (y/n): ");
	                                    String retryChoice = sc.next().toLowerCase();

	                                    if (!retryChoice.equals("y")) {
	                                        validID2 = true;  
	                                    }
	                                }
	                            } catch (InputMismatchException e) {
	                                System.out.println("Invalid input. Please enter a number.");
	                                sc.nextLine(); 
	                                System.out.print("Do you want to enter another ID? (y/n): ");
	                                String retryChoice = sc.next().toLowerCase();

	                                if (!retryChoice.equals("y")) {
	                                    validID2 = true;
	                                }
	                            } catch (SQLException e) {
	                                e.printStackTrace(); 
	                            } catch (Exception e) {
	                                e.printStackTrace();  
	                            }
	                        }
	                        break;


	                    case 3:
	                        System.out.println("You selected Read Delivery Driver.");
	                        boolean validID3 = false;

	                        while (!validID3) {
	                            try {
	                                System.out.print("Enter a Valid Driver ID: ");
	                                int userInput = sc.nextInt();

	                                if (deliveryDriver.verifyIdNumber(userInput)) {
	                                    DeliveryDriverController driverController = new MySQLAccess();
	                                    DeliveryDriver existingDriver = driverController.findDeliveryDriverById(userInput);

	                                    if (existingDriver != null) {
	                                        System.out.println("Driver Details:\n" + existingDriver);
                                            generateDeliveryDriverMenu();

	                                        validID3 = true;
	                                    } else {
	                                        System.out.println("Driver not found.");
	                                        System.out.print("Do you want to enter another ID? (y/n): ");
	                                        String retryChoice = sc.next().toLowerCase();

	                                        if (!retryChoice.equals("y")) {
	                                            validID3 = true;
	                                        }
	                                    }
	                                } else {
	                                    System.out.println("Invalid input. Please enter a valid number.");
	                                    sc.nextLine(); 
	                                    System.out.print("Do you want to enter another ID? (y/n): ");
	                                    String retryChoice = sc.next().toLowerCase();

	                                    if (!retryChoice.equals("y")) {
	                                        validID3 = true;
	                                    }
	                                }
	                            } catch (InputMismatchException e) {
	                                System.out.println("Invalid input. Please enter a number.");
	                                sc.nextLine(); 
	                                System.out.print("Do you want to enter another ID? (y/n): ");
	                                String retryChoice = sc.next().toLowerCase();

	                                if (!retryChoice.equals("y")) {
	                                    validID3 = true;
	                                }
	                            } catch (SQLException e) {
	                                e.printStackTrace();
	                            } catch (NewsagentExceptionHandler e) {
	                                System.out.println("Error: " + e.getMessage());
	                                System.out.print("Do you want to enter another ID? (y/n): ");
	                                String retryChoice = sc.next().toLowerCase();
//	    	                        generateNewsagentMenu();


	                                if (!retryChoice.equals("y")) {
	                                    validID3 = true;
	                                }
	                            } catch (Exception e) {
	                                e.printStackTrace();
	                            }
	                        }
	                        break;

	                    case 4:
	                        System.out.println("You selected Delete Delivery Driver.");
	                        boolean validID = false;

	                        while (!validID) {
	                            try {
	                                System.out.print("Enter a Valid Driver ID: ");
	                                int userInput = sc.nextInt();

	                                if (deliveryDriver.verifyIdNumber(userInput)) {
	                                    DeliveryDriverController driverController = new MySQLAccess();

	                                    if (driverController.findDeliveryDriverById(userInput) != null) {
	                                    	driverController.deleteDeliveryDriverById(userInput);

	                                        System.out.println("Driver deleted successfully.");
                                            generateDeliveryDriverMenu();

	                                        validID = true;
	                                    } else {
	                                        System.out.println("Driver not found.");
	                                        System.out.print("Do you want to enter another ID? (y/n): ");
	                                        String retryChoice = sc.next().toLowerCase();

	                                        if (!retryChoice.equals("y")) {
	                                            validID = true;
	                                        }
	                                    }
	                                }
	                            } catch (InputMismatchException e) {
	                                System.out.println("Invalid input. Please enter a number.");
	                                
	                                sc.nextLine(); 
	                            } catch (SQLException e) {
	                                e.printStackTrace();
	                            } catch (NewsagentExceptionHandler e) {
	                                System.out.println("Error: " + e.getMessage());
	                                System.out.print("Do you want to enter another ID? (y/n): ");
	                                String retryChoice = sc.next().toLowerCase();

	                                if (!retryChoice.equals("y")) {
	                                    validID = true;
	                                }
	                            } catch (Exception e) {
	                                e.printStackTrace();
	                            }
	                        }
	                        break;

	                    case 5:
	                        System.out.println("Back.");
	                        generateNewsagentMenu();
	                        exit = true;

	                        break;
	                    default:
	                        System.out.println("Invalid choice. Please try again.");
	                }
	            } catch (InputMismatchException e) {
	                System.out.println("Invalid input. Please enter a number.");
	                sc.nextLine(); 
	            }
	        }
	    }
	}

	private static int getValidIntInputDeliveryDriver(String fieldName, Scanner sc) {
	    int userInput = 0;
	    boolean validInput = false;

	    while (!validInput) {
	        try {
	            System.out.print("Enter " + fieldName + ": ");
	            userInput = sc.nextInt();
	            validInput = true;
	        } catch (InputMismatchException e) {
	            System.out.println("Invalid input. Please enter a valid number.");
	            sc.nextLine(); 
	        }
	    }

	    return userInput;
	}
	{

	try {
	    deliveryDriver = new DeliveryDriver();
	} catch (NewsagentExceptionHandler e) {
	    e.printStackTrace();  
	}
}
}
