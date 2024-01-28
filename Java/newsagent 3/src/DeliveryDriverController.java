
public interface DeliveryDriverController {
	
	boolean insertDeliveryDriverDetails(DeliveryDriver driver);
	DeliveryDriver findDeliveryDriverById(int driverId);
	void retrieveAndPrintAllDeliveryDrivers();
	boolean updateDeliveryDriverDetails(DeliveryDriver driver) throws NewsagentExceptionHandler ;
	boolean deleteDeliveryDriverById(int driverId) ;
	boolean authenticate(String username, int enteredPin) throws NewsagentExceptionHandler;

	
}
