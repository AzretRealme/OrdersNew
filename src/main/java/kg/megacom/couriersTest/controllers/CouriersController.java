package kg.megacom.couriersTest.controllers;

import kg.megacom.couriersTest.dao.CouriersRepo;
import kg.megacom.couriersTest.dao.Couriers_statusesRepo;
import kg.megacom.couriersTest.daoService.CouriersService;
import kg.megacom.couriersTest.models.Couriers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/couriers")
public class CouriersController {


    private final CouriersRepo couriersRepo;

    public CouriersController(CouriersRepo couriersRepo) {
        this.couriersRepo = couriersRepo;
    }

    @Autowired
    private CouriersService couriersService;

    @Autowired
    private Couriers_statusesRepo couriers_statusesRepo;

    @GetMapping()
    public String index(Model model){
        model.addAttribute("couriers", couriersService.findAll());
        return "couriers/index";
    }

    @GetMapping("/backToOrders")
    public String backToOrders(){
        return "redirect:/orders/all";
    }

    @GetMapping("/new")
    public String newCourier(@ModelAttribute("courier") Couriers courier, Model model){
        model.addAttribute("courierStatus", couriers_statusesRepo.findAll());
        return "couriers/new";
    }

    @PostMapping()
    public String create(@ModelAttribute("courier") Couriers courier){
        couriersService.saveCourier(courier);
        return "redirect:/couriers";
    }

    @GetMapping("/{id}/edit")
    public String edit(Model model, @PathVariable("id") long id){
        model.addAttribute("courier", couriersRepo.findById(id).get());
        return "couriers/edit";
    }

    @PatchMapping("/{id}")
    public String update(@ModelAttribute("courier") Couriers courier, @PathVariable("id") long id){
        couriersService.updateCourier(id, courier);
        return "redirect:/couriers";
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable("id") long id){
        couriersService.deleteCourier(id);
        return "redirect:/couriers";
    }
}
