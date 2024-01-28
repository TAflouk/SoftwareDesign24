import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public interface PublicationInterface {
	public boolean deletePublicationById(int id) ;
	
	public void retrieveAndPrintAllPublications();

	public boolean insertPublicationDetails(Publication p) ;

	boolean isPublicationIdExists(int id) throws SQLException ;
	
	public boolean updatePublicationDetails(Publication p) ;
	
	public ResultSet retrieveAllPublications();
	Publication findPublicationById(int publicationId);

	
}
