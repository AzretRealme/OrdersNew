package kg.megacom.couriersTest.daoService;

import kg.megacom.couriersTest.models.Addresses;
import kg.megacom.couriersTest.models.Order_statuses;

import java.util.List;

public interface Order_statusesService {
    List<Order_statuses> findAll();
}
