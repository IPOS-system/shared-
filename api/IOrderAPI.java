
package api;

import java.util.List;
import model.OrderDTO;

public interface IOrderAPI {

    OrderDTO createOrder(OrderDTO order);

    OrderDTO getOrderById(int orderId);

    List<OrderDTO> getOrdersByMerchantId(int merchantId);

    boolean updateOrderStatus(int orderId, String newStatus);

    boolean cancelOrder(int orderId);
}
