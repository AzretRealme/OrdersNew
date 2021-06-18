package kg.megacom.couriersTest.daoService.impl;

import kg.megacom.couriersTest.daoService.AddressesService;
import kg.megacom.couriersTest.models.Addresses;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor
public class AddressesServiceImpl implements AddressesService {
    @Override
    public List<Addresses> findAll() {
        return null;
    }
}
