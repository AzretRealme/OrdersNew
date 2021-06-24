package kg.megacom.couriersTest.controllers;

import kg.megacom.couriersTest.dao.CouriersRepo;
import kg.megacom.couriersTest.dao.Couriers_statusesRepo;
import kg.megacom.couriersTest.daoService.CouriersService;
import kg.megacom.couriersTest.models.Couriers;
import kg.megacom.couriersTest.models.Couriers_statuses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
public class CouriersController {


    private final CouriersRepo couriersRepo;

    public CouriersController(CouriersRepo couriersRepo) {
        this.couriersRepo = couriersRepo;
    }

    @Autowired
    private CouriersService couriersService;

    @Autowired
    private Couriers_statusesRepo couriers_statusesRepo;

    @GetMapping("/index")
    public String index(Model model){
        model.addAttribute("couriers", couriersService.findAll());
        return "index";
    }

    @GetMapping("/backToOrders")
    public String backToOrders(){
        return "redirect:/orders/all";
    }

    @GetMapping("/new")
    public String newCourier(Model model){
        /*model.addAttribute(new Couriers());
        model.addAttribute("courierStatus", couriers_statusesRepo.findAll());*/
        model.addAttribute("courier", new Couriers());
        return "../templates/courier-new";
    }


    @PostMapping("/new")
    public String create(@ModelAttribute("courier") Couriers courier){
        couriersService.saveCourier(courier);
        return "redirect:/index";
    }


    @GetMapping("/edit/{id}")
    public String edit(Model model, @PathVariable("id") long id){
        System.out.println(id);
        Optional<Couriers> couriers= couriersRepo.findById(id);
        Couriers couriers1 = null;
        if (couriers.isPresent()){
            couriers1 = couriers.get();
        }
        System.out.println("cour: "+couriers1);
        model.addAttribute("courier", couriers1);
        return "../templates/edit";
    }


    @PostMapping("/update/{id}")
    public String update(@ModelAttribute("courier") Couriers courier, @PathVariable("id") long id){
        couriersService.updateCourier(id, courier);
        return "redirect:/index";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable("id") long id){
        System.out.println(id);
        couriersService.deleteCourier(id);
        return "redirect:/index";
    }
}
