package kg.megacom.couriersTest.daoService;

import kg.megacom.couriersTest.models.Couriers;

import java.util.List;

public interface CouriersService {
    List<Couriers> findAll();
    void saveCourier(Couriers couriers);
    void updateCourier(long id, Couriers updatedCourier);
    void deleteCourier(long id);
    //Couriers show(long id);
}
