package kg.megacom.couriersTest.controllers;


import kg.megacom.couriersTest.daoService.OrdersService;
import kg.megacom.couriersTest.models.Orders;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/orders")
public class OrdersController {

    @Autowired
    private OrdersService orderService;

    @GetMapping("/addOrder")
    public String getOrderForm(Orders order){
        return "addOrder";
    }

    @GetMapping("/all")
    public String getOrders(Model model){
        List<Orders> orders = orderService.findAll();
        model.addAttribute("orders", orders);
        return "orders";
    }

    @PostMapping("/")
    public String makeOrder(@ModelAttribute("order") Orders order, Model model){
        model.addAttribute(order);
        System.out.println(order.getComment());
        return "redirect:/orders/all";
    }
}
