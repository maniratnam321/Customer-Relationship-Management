package mvc.controller;


import mvc.entity.Customer;
import mvc.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

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

    @GetMapping(path = "/view/{id}")
    public String getCustomerDetails( Model model, @PathVariable Integer id) {
        Optional<Customer> customerOptional = customerRepository.findById(id);
        Customer customer = customerOptional.get();
        model.addAttribute("customer", customer);
        return "Detail";
    }

    @GetMapping(path = "/addItems/{id}")
    public String addItems( Model model, @PathVariable Integer id) {
        Optional<Customer> customerOptional = customerRepository.findById(id);
        Customer customer = customerOptional.get();
        model.addAttribute("customer", customer);
        return "AddItemPage";
    }

}

