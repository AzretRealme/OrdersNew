package kg.megacom.couriersTest.daoService.impl;

import kg.megacom.couriersTest.dao.CouriersRepo;
import kg.megacom.couriersTest.daoService.CouriersService;
import kg.megacom.couriersTest.models.Couriers;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class CouriersServiceImpl implements CouriersService {

    @Autowired
    private CouriersRepo couriersRepo;


    @Override
    public List<Couriers> findAll() {
        return couriersRepo.findAll();
    }

    @Override
    public void saveCourier(Couriers courier) {
        couriersRepo.save(courier);
    }

    @Override
    public void updateCourier(long id, Couriers updatedCourier) {
        Couriers courierToBeUpdated = couriersRepo.findById(id).get();
        courierToBeUpdated.setFio(updatedCourier.getFio());
        courierToBeUpdated.setPhone(updatedCourier.getPhone());
        courierToBeUpdated.setCouriers_statuses(updatedCourier.getCouriers_statuses());
        couriersRepo.save(courierToBeUpdated);
    }

    @Override
    public void deleteCourier(long id) {
        couriersRepo.deleteById(id);
    }

//    @Override
//    public Couriers show(long id) {
//        return null;
//    }
}
