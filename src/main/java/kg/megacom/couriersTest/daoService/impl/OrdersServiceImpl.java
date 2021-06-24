package kg.megacom.couriersTest.daoService.impl;

import kg.megacom.couriersTest.dao.OrdersRepo;
import kg.megacom.couriersTest.daoService.OrdersService;
import kg.megacom.couriersTest.models.Orders;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class OrdersServiceImpl implements OrdersService {
    @Autowired
    private OrdersRepo ordersRepo;

    @Override
    public List<Orders> findAll() {
        return ordersRepo.findAll();
    }

    @Override
    public void saveOrder(Orders order) {
        ordersRepo.save(order);
    }
}