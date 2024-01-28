import java.sql.ResultSet;
import java.sql.SQLException;
public interface DeliveryDocketController {
    boolean insertDeliveryDocketDetails(DeliveryDocket docket);
    void retrieveAndPrintAllDockets();
    boolean updateDeliveryDocketDetails(DeliveryDocket docket);
    boolean isDocketIdExists(int id) throws SQLException;
    boolean deleteDeliveryDocket(int docketIDNumber);
    DeliveryDocket findDocketById(int docketIDNumber);
    ResultSet retrieveAllDockets();
    void printAllDockets();
    boolean docketExists(int docketID);
    boolean updateDocket(DeliveryDocket updatedDocket) throws SQLException;
}
