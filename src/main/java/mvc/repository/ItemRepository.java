package mvc.repository;

import mvc.entity.Item;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

@Component
public interface ItemRepository extends CrudRepository<Item, Integer> {
}
