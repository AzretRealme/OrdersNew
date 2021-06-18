package kg.megacom.couriersTest.dao;


import kg.megacom.couriersTest.models.Couriers;
import kg.megacom.couriersTest.models.Orders;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrdersRepo extends JpaRepository<Orders, Long> {

}
