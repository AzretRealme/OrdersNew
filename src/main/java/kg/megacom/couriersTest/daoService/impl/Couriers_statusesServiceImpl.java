package kg.megacom.couriersTest.daoService.impl;

import kg.megacom.couriersTest.dao.Couriers_statusesRepo;
import kg.megacom.couriersTest.daoService.Couriers_statusesService;
import kg.megacom.couriersTest.models.Couriers_statuses;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor
public class Couriers_statusesServiceImpl implements Couriers_statusesService {
    @Autowired
    Couriers_statusesRepo courierStatusRepo;
}
