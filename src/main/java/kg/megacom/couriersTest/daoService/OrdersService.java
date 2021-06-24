package kg.megacom.couriersTest.daoService;

import kg.megacom.couriersTest.models.Orders;

import java.util.List;

public interface OrdersService {
    List<Orders> findAll();
    void saveOrder(Orders order);
}
