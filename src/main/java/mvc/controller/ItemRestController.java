package mvc.controller;

import mvc.entity.Item;
import mvc.repository.ItemRepository;
import mvc.service.ItemDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ItemRestController {

    @Autowired
    private ItemRepository itemRepository;

    @GetMapping("/getInfo")
    public Item getItem(@RequestParam(value = "id") Integer id) {
        ItemDetailService itemDetailService = new ItemDetailService();
        return itemDetailService.getDetails(id);
    }
}
