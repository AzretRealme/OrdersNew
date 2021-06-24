package kg.megacom.couriersTest.controllers;


import kg.megacom.couriersTest.daoService.OrdersService;
import kg.megacom.couriersTest.models.Couriers;
import kg.megacom.couriersTest.models.Orders;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/orders")
public class OrdersController {

    @Autowired
    private OrdersService orderService;


//    @GetMapping("/addOrder")
//    public String getOrderForm(Orders order){
//        return "addOrder";
//    }

    @GetMapping("/addOrder")
    public String getOrderForm(Model model){
        model.addAttribute("order", new Orders());
        return "addOrder";
    }

    @GetMapping("/all")
    public String getOrders(Model model){
//        List<Orders> orders = orderService.findAll();
//        model.addAttribute("orders", orders);

        model.addAttribute("title", "All orders");
        model.addAttribute("orders", orderService.findAll());
        return "orders";
    }


    @PostMapping("/addOrder")
    public String makeOrder(@ModelAttribute("orders") Orders order, Model model){

        model.addAttribute("title", "All Orders");
//        model.addAttribute(order);
        orderService.saveOrder(order);

//        System.out.println(order.getComment());
        return "redirect:/orders/all";



    }
//    @PostMapping("/addOrder")
//    public String create(@ModelAttribute("orders") Orders orders){
//        orderService.saveOrder(orders);
//        return "redirect:/orders/all";
//    }

//
//    @PostMapping("/addorder")
//    public String addOrder(@ModelAttribute Orders order, Model model) {
//        model.addAttribute("title", "All Orders");
//
//        orderService.saveOrder(order);
//        return "redirect:/orders/all";
//    }
}
