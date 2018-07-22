package mvc.controller;


import mvc.entity.Customer;
import mvc.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping(path = "/db")
public class DatabaseController {

    @Autowired
    private CustomerRepository customerRepository;

    @GetMapping(path = "/add")
    public @ResponseBody String addNewCustomer(@RequestParam String firstName,
                                               @RequestParam String lastName,
                                               @RequestParam String email,
                                               @RequestParam String city,
                                               @RequestParam String state,
                                               @RequestParam Integer zip) {
        Customer customer = new Customer(firstName, lastName, email, city, state, zip);
        customerRepository.save(customer);
        return "Save Complete";
    }

    @GetMapping(path = "/list")
    public String getAllCustomers(Model model) {
        List<Customer> allCustomers = new ArrayList<>();
        for (Customer tempCustomer : customerRepository.findAll())
            allCustomers.add(tempCustomer);
        model.addAttribute("allCustomers", allCustomers);
        return "List";
    }

}
