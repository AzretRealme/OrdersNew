package kg.megacom.couriersTest.dao;


import kg.megacom.couriersTest.models.Couriers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CouriersRepo extends JpaRepository<Couriers, Long> {
}
