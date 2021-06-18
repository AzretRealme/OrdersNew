package kg.megacom.couriersTest.daoService.impl;

import kg.megacom.couriersTest.dao.OrdersRepo;
import kg.megacom.couriersTest.daoService.OrdersService;
import kg.megacom.couriersTest.models.Orders;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class OrdersServiceImpl implements OrdersService {
    @Autowired
    private OrdersRepo ordersRepo;

    @Override
    public List<Orders> findAll() {
        return ordersRepo.findAll();
    }
}