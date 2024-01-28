
public interface DeliveryAreaController {

    boolean insertDeliveryAreaDetails(DeliveryArea area);
    DeliveryArea findDeliveryAreaById(int areaId);
    void retrieveAndPrintAllDeliveryAreas();
    boolean updateDeliveryAreaDetails(DeliveryArea area);
    boolean deleteDeliveryAreaById(int areaId);
    boolean isDeliveryAreaIdExists(int areaId);

}