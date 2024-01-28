import java.sql.SQLException;

public interface InvoiceController {
	void insertInvoice(Invoice invoice);
	void printAllInvoices();
	boolean updateInvoiceDetails(Invoice invoice)throws SQLException;
	boolean deleteInvoice(int invoiceId);
    Invoice getInvoiceById(int invoiceId) throws SQLException;

}