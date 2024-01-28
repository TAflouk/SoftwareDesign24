
import java.sql.ResultSet;
import java.sql.SQLException;

public interface ReceiptUpdater  {
    boolean insertReceiptDetailsAccount(Receipt r);

    boolean isReceiptIdExists(int idNumber) throws SQLException;

    void retrieveAndPrintAllReceipts();

    boolean updateReceiptDetails(Receipt r);

    ResultSet retrieveAllReceipts();

    boolean deleteReceiptById(int idNumber);
    //boolean isReceiptIdExists(int id) throws SQLException ;

    public Receipt findReceiptById(int receiptId);
    String toString();

	}


