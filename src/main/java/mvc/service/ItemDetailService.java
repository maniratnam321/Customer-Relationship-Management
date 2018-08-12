package mvc.service;

import mvc.entity.Item;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class ItemDetailService {

    public Item getDetails(Integer id) {
        String url = "https://www.divine-pride.net/api/database/Item/%s?apiKey=777a6659cb2bbb96a88243d5ea85a1b2";
        RestTemplate restTemplate = new RestTemplate();
        Item item = restTemplate.getForObject(String.format(url, id.toString()), Item.class);
        return item;
    }

}
