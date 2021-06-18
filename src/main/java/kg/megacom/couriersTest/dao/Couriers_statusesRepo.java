package kg.megacom.couriersTest.dao;


import kg.megacom.couriersTest.models.Couriers;
import kg.megacom.couriersTest.models.Couriers_statuses;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Couriers_statusesRepo extends JpaRepository<Couriers_statuses, Long> {
}
